package com.senior.timeapp.domain;

import lombok.Data;


import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserInfo {
    private String userId;
    private Date workday;
    private Date commutingTime;
    private Date leave_time;
    private BigDecimal breakTime;
    private String memo;

    public UserInfo(String userId, Date workday, Date commutingTime, Date leave_time, BigDecimal breakTime, String memo) {
        this.userId = userId;
        this.workday = workday;
        this.commutingTime = commutingTime;
        this.leave_time = leave_time;
        this.breakTime = breakTime;
        this.memo = memo;
    }
}
