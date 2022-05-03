package com.middle.app.util;

import java.sql.Date;

public class DateUtil {

    public static Date stringToDate(String birthday) {
        Date format_date = Date.valueOf(birthday);
        return format_date;
    }
}
