package com.example.fastandroidchat.utils;

import com.cometchat.pro.core.AppSettings;

public class Constants {
    public static final String APP_ID = "26721c7b6fe9eda";
    public static final String API_KEY =  "bc6b379f4eca71a5cd758f8524a79a2df98dbdde";
    public static final String region = "EU";
    public static final AppSettings APP_Settings=new AppSettings.AppSettingsBuilder().subscribePresenceForAllUsers().setRegion(region).build();

    public static final String GROUP_ID = "group_id";
}
