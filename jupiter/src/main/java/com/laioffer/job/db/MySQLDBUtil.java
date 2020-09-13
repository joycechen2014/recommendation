package com.laioffer.job.db;

public class MySQLDBUtil {
    private static final String INSTANCE = "YOUR INSTANCE IP ADDRESS";
    private static final String PORT_NUM = "PORT";
    public static final String DB_NAME = "NAME";
    private static final String USERNAME = "USERNAME";
    private static final String PASSWORD = "PASSWORD";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";
}
