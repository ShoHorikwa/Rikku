package com.senior.timeapp.util;

import lombok.SneakyThrows;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public  enum DATE_FORMAT {
        YYYYMMDD("yyyy-MM-dd"),
        YYYYMMDDHHmmss("yyyy-MM-dd HH:mm:ss"),
        YYYYMMDDHHmm("yyyy-MM-dd'T'hh:mm"),;

        String param;
        DATE_FORMAT(String para) {
            this.param = para;
        }
        public String getParam() {
            return param;
        }
    }

    @SneakyThrows
    public static String formatter(String format, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        if (null == date) {
            if (DATE_FORMAT.YYYYMMDDHHmm.getParam().equals(format)) {
                System.out.println("チェック入った");
                date = simpleDateFormat.parse("00000-00-00T00:00");
            } else {
                date = simpleDateFormat.parse("0000-00-00 00:00:00");
            }
        }
        return simpleDateFormat.format(date);
    }


    @SneakyThrows
    public static Date parse(String format, String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date parsedDate = simpleDateFormat.parse(date);
        return  parsedDate;
    }
}
