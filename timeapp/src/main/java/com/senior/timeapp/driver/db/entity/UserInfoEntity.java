package com.senior.timeapp.driver.db.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserInfoEntity {
    private String user_id;
    private Date workday;
    private Date commuting_time;
    private Date leave_time;
    private BigDecimal break_time;
    private String memo;

    public UserInfoEntity(String user_id, Date workday, Date commuting_time, Date leave_time, BigDecimal break_time, String memo) {
        this.user_id = user_id;
        this.workday = workday;
        this.commuting_time = commuting_time;
        this.leave_time = leave_time;
        this.break_time = break_time;
        this.memo = memo;
    }
}
