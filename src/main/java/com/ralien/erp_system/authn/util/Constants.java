package com.ralien.erp_system.authn.util;

import java.text.SimpleDateFormat;

public class Constants {
    public static final int MIN_PASSWORD_LENGTH = 8;
    public static final int MAX_PASSWORD_LENGTH = 20;
    public static final String INVALID_PASSWORD_LENGTH_MESSAGE = "password length allowed in between " + MIN_PASSWORD_LENGTH + "-" + MAX_PASSWORD_LENGTH;
    public static final SimpleDateFormat UNIX_DT_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
}
