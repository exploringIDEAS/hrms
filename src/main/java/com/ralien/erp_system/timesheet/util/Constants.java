package com.ralien.erp_system.timesheet.util;

import java.text.SimpleDateFormat;

public class Constants {
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final SimpleDateFormat UNIX_DT_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat UNIX_DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT);
}
