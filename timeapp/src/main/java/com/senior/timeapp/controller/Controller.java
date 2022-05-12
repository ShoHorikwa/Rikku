package com.senior.timeapp.controller;

import com.senior.timeapp.domain.LoginInfo;
import com.senior.timeapp.usecase.LoginUsecase;
import com.senior.timeapp.usecase.UserUsecase;
import com.senior.timeapp.validator.UserValidator;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UserUsecase userUsecase;
    @Autowired
    private LoginUsecase loginUsecase;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login/err")
    public String loginErr(Model model) {
        model.addAttribute("err_message", MESSAGE.LOGIN_FAIL.getValue());
        return "login";
    }

    @RequestMapping("/signUp")
    public String signUp(Model model) {
        model.addAttribute("RequestInsertLoginInfoDto", new RequestInsertLoginInfoDto());
        return  "sign_up";
    }

    @PostMapping("/user/create")
    public  String createLoginInfo(@ModelAttribute RequestInsertLoginInfoDto requestInsertLoginInfoDto, Model model) {
        try {
            if(loginUsecase.checkLogignInfo(requestInsertLoginInfoDto)) {
                throw  new Exception();
            } else {
                loginUsecase.createLoginInfo(requestInsertLoginInfoDto);
                model.addAttribute("message", MESSAGE.CREATE_USER.getValue());

            }
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("err_message", MESSAGE.CREATE_FAIL.getValue());
        }
        return  "login";
    }

    @RequestMapping("/user/info")
    public String selectUserInfo(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginInfo loginInfo = (LoginInfo) authentication.getPrincipal();
        return this.home(model, loginInfo.getUserId());
    }

    @RequestMapping("/user/commute")
    public String insertCommute(@RequestParam("user_id") String id, Model model) {
        try {
            List<UserInfoDto> currencyUserInfos = userUsecase.select(id);
            if(!currencyUserInfos.isEmpty()) {
                userUsecase.makeCommuteTime(
                        UserValidator.isCurrency(currencyUserInfos.get(0)),
                        id,
                        currencyUserInfos.get(0).getWorkday());

            } else {
                userUsecase.makeCommuteTime(
                        false,
                        id,
                        null
                );
            }
            model.addAttribute("message", MESSAGE.INSERT_COMMUTE.getValue());
        } catch (SQLIntegrityConstraintViolationException | DuplicateKeyException sqlex) {
            /* 一意制約は握り潰す */
            model.addAttribute("message", MESSAGE.COMMUTE_END.getValue());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return this.home(model, id);
    }

    @RequestMapping("/user/leave")
    public String insertLeave(@RequestParam("user_id") String id, Model model) {
        try {
            List<UserInfoDto> currencyUserInfos = userUsecase.select(id);
            if (!currencyUserInfos.isEmpty()) {
                userUsecase.makeLeaveTime(
                        UserValidator.isCurrency(currencyUserInfos.get(0)),
                        id,
                        currencyUserInfos.get(0).getWorkday());
            } else {
                userUsecase.makeLeaveTime(
                        false,
                        id,
                        null
                );

            }
            model.addAttribute("message", MESSAGE.INSERT_LEAVE.getValue());
        } catch (SQLIntegrityConstraintViolationException | DuplicateKeyException sqlex) {
            model.addAttribute("message", MESSAGE.LEAVE_END.getValue());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return this.home(model, id);
    }

    @RequestMapping("/user/edit")
    public String editUserInfo(@RequestParam("user_id") String id, @RequestParam("workday") String workday, Model model) throws Exception {
        RequestUpdateUserInfoDto requestUpdateUserInfoDto = userUsecase.selectByIdAndWorkday(id, workday);
        model.addAttribute("RequestUpdateUserInfoDto", requestUpdateUserInfoDto);
        model.addAttribute("title", TITLE.EDIT.getValue());
        return "user_edit";
    }

    @RequestMapping("/user/update")
    public String editUserInfo(@ModelAttribute RequestUpdateUserInfoDto requestUpdateUserInfoDto, Model model) {
        userUsecase.updateUserInfo(requestUpdateUserInfoDto);
        model.addAttribute("message", MESSAGE.UPDATE_END.getValue());
        return this.home(model, requestUpdateUserInfoDto.getUserId());
    }

    private String home(Model model, String id) {
        model.addAttribute("user_id", id);
        model.addAttribute("user_info", userUsecase.select(id));
        model.addAttribute("title", TITLE.HOME.getValue());
        return "user_home";
    }

    private enum MESSAGE {
        INSERT_COMMUTE("出勤しました"),
        COMMUTE_END("本日分はすでに出勤しています！"),
        INSERT_LEAVE("退勤しました"),
        LEAVE_END("本日分はすでに退勤しています！"),
        UPDATE_END("更新が完了しました！"),
        LOGIN_FAIL("ユーザ名またはパスワードが違います"),
        CREATE_USER("新規でユーザを作成しました"),
        CREATE_FAIL("ユーザ作成が失敗しました。もう一度試してください。");
        String value;

        MESSAGE(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    private enum TITLE {
        HOME("ユーザ情報"),
        EDIT("出勤情報の編集");
        String value;

        TITLE(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    @Data
    public static class LoginInfoDto {
        private String userId;
        private String accountName;
        private String password;
    }

    @Data
    public static class RequestInsertLoginInfoDto {
        private String accountName;
        private String password;
    }

    @Data
    public static class UserInfoDto {
        private String userId;
        private String workday;
        private String commutingTime;
        private String leaveTime;
        private String breakTime;
        private String memo;
    }

    @Data
    public static class RequestUpdateUserInfoDto {
        private String userId;
        private String workday;
        private String commutingTime;
        private String leaveTime;
        private BigDecimal breakTime;
        private String memo;

    }

}
