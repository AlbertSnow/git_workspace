package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum TaskEvent$Action
  implements ProtoEnum
{
  private final int value;

  static
  {
    CONNECT = new Action("CONNECT", 1, 1);
    PAY = new Action("PAY", 2, 2);
    TRANSFER = new Action("TRANSFER", 3, 3);
    PLAY = new Action("PLAY", 4, 4);
    READ = new Action("READ", 5, 5);
    OPEN = new Action("OPEN", 6, 6);
    SEARCH = new Action("SEARCH", 7, 7);
    LOGIN_IN = new Action("LOGIN_IN", 8, 8);
    SIGN_UP = new Action("SIGN_UP", 9, 9);
    CLEAR = new Action("CLEAR", 10, 10);
    UPGRADE = new Action("UPGRADE", 11, 11);
    SYNC = new Action("SYNC", 12, 12);
    SHARE = new Action("SHARE", 13, 13);
    SELF_UPGRADE = new Action("SELF_UPGRADE", 14, 14);
    ORDER = new Action("ORDER", 15, 15);
    UPDATE_DEVICE_STATUS = new Action("UPDATE_DEVICE_STATUS", 16, 16);
    CONNECTION_SCAN_ADB = new Action("CONNECTION_SCAN_ADB", 17, 18);
    CONNECTION_GET_DEVICE_INFO = new Action("CONNECTION_GET_DEVICE_INFO", 18, 19);
    CONNECTION_DOWNLOAD_DRIVER = new Action("CONNECTION_DOWNLOAD_DRIVER", 19, 20);
    CONNECTION_INSTALL_DRIVER = new Action("CONNECTION_INSTALL_DRIVER", 20, 21);
    CONNECTION_ADB_IS_ONLINE = new Action("CONNECTION_ADB_IS_ONLINE", 21, 22);
    CONNECTION_GET_UDID = new Action("CONNECTION_GET_UDID", 22, 23);
    CONNECTION_CHECK_PROXY = new Action("CONNECTION_CHECK_PROXY", 23, 24);
    CONNECTION_INSTALL_PROXY = new Action("CONNECTION_INSTALL_PROXY", 24, 25);
    CONNECTION_UPGRADE_PROXY = new Action("CONNECTION_UPGRADE_PROXY", 25, 26);
    CONNECTION_FORWARD = new Action("CONNECTION_FORWARD", 26, 27);
    SET_AS_WALLPAPER = new Action("SET_AS_WALLPAPER", 27, 28);
    CONNECTION_OPEN_DEBUG_VIEW = new Action("CONNECTION_OPEN_DEBUG_VIEW", 28, 29);
    INSTALL = new Action("INSTALL", 29, 30);
    UNINSTALL = new Action("UNINSTALL", 30, 31);
    BACKGROUND_DOWNLOAD = new Action("BACKGROUND_DOWNLOAD", 31, 32);
    PUSH = new Action("PUSH", 32, 33);
    PREFETCH_BOX = new Action("PREFETCH_BOX", 33, 34);
    PREFETCH_VIDEO = new Action("PREFETCH_VIDEO", 34, 35);
    MATCH_APPS = new Action("MATCH_APPS", 35, 36);
    VIEW_EVENT = new Action("VIEW_EVENT", 36, 37);
    TRIGGER_EVENT = new Action("TRIGGER_EVENT", 37, 38);
    STORY = new Action("STORY", 38, 39);
    SUGGESTION = new Action("SUGGESTION", 39, 40);
    SUGGESTION_NOTIFICATION = new Action("SUGGESTION_NOTIFICATION", 40, 41);
    NOTIFICATION_CLICK = new Action("NOTIFICATION_CLICK", 41, 42);
    LOCK = new Action("LOCK", 42, 43);
    UNLOCK = new Action("UNLOCK", 43, 44);
    LAUNCH = new Action("LAUNCH", 44, 45);
    USER_STAT = new Action("USER_STAT", 45, 46);
    SSO = new Action("SSO", 46, 47);
    SNAPLOCK_SETTINGS = new Action("SNAPLOCK_SETTINGS", 47, 48);
    SETTING_PASSWORD = new Action("SETTING_PASSWORD", 48, 49);
    ERROR_REPORT = new Action("ERROR_REPORT", 49, 50);
    INTENT_EXECUTE = new Action("INTENT_EXECUTE", 50, 51);
    STORY_LIFECYCLE = new Action("STORY_LIFECYCLE", 51, 52);
    ACCESS_ADDITION_EXECUTE = new Action("ACCESS_ADDITION_EXECUTE", 52, 53);
    RESET = new Action("RESET", 53, 54);
    AUTO_INSTALL_CLICK = new Action("AUTO_INSTALL_CLICK", 54, 55);
    AUTO_INSTALL_BIND = new Action("AUTO_INSTALL_BIND", 55, 56);
    AUTO_INSTALL_UNBIND = new Action("AUTO_INSTALL_UNBIND", 56, 57);
    APPLY_AUTH = new Action("APPLY_AUTH", 57, 58);
    LOG_TRACK = new Action("LOG_TRACK", 58, 59);
    ACCESSIBILITY_BIND = new Action("ACCESSIBILITY_BIND", 59, 60);
    ACCESSIBILITY_UNBIND = new Action("ACCESSIBILITY_UNBIND", 60, 61);
    TOAST = new Action("TOAST", 61, 62);
    HIBERNATION = new Action("HIBERNATION", 62, 63);
    LUCKY_MONEY = new Action("LUCKY_MONEY", 63, 64);
    HIBERNATION_CLICK = new Action("HIBERNATION_CLICK", 64, 65);
    SHORTCUT = new Action("SHORTCUT", 65, 66);
    Action[] arrayOfAction = new Action[66];
    arrayOfAction[0] = DOWNLOAD;
    arrayOfAction[1] = CONNECT;
    arrayOfAction[2] = PAY;
    arrayOfAction[3] = TRANSFER;
    arrayOfAction[4] = PLAY;
    arrayOfAction[5] = READ;
    arrayOfAction[6] = OPEN;
    arrayOfAction[7] = SEARCH;
    arrayOfAction[8] = LOGIN_IN;
    arrayOfAction[9] = SIGN_UP;
    arrayOfAction[10] = CLEAR;
    arrayOfAction[11] = UPGRADE;
    arrayOfAction[12] = SYNC;
    arrayOfAction[13] = SHARE;
    arrayOfAction[14] = SELF_UPGRADE;
    arrayOfAction[15] = ORDER;
    arrayOfAction[16] = UPDATE_DEVICE_STATUS;
    arrayOfAction[17] = CONNECTION_SCAN_ADB;
    arrayOfAction[18] = CONNECTION_GET_DEVICE_INFO;
    arrayOfAction[19] = CONNECTION_DOWNLOAD_DRIVER;
    arrayOfAction[20] = CONNECTION_INSTALL_DRIVER;
    arrayOfAction[21] = CONNECTION_ADB_IS_ONLINE;
    arrayOfAction[22] = CONNECTION_GET_UDID;
    arrayOfAction[23] = CONNECTION_CHECK_PROXY;
    arrayOfAction[24] = CONNECTION_INSTALL_PROXY;
    arrayOfAction[25] = CONNECTION_UPGRADE_PROXY;
    arrayOfAction[26] = CONNECTION_FORWARD;
    arrayOfAction[27] = SET_AS_WALLPAPER;
    arrayOfAction[28] = CONNECTION_OPEN_DEBUG_VIEW;
    arrayOfAction[29] = INSTALL;
    arrayOfAction[30] = UNINSTALL;
    arrayOfAction[31] = BACKGROUND_DOWNLOAD;
    arrayOfAction[32] = PUSH;
    arrayOfAction[33] = PREFETCH_BOX;
    arrayOfAction[34] = PREFETCH_VIDEO;
    arrayOfAction[35] = MATCH_APPS;
    arrayOfAction[36] = VIEW_EVENT;
    arrayOfAction[37] = TRIGGER_EVENT;
    arrayOfAction[38] = STORY;
    arrayOfAction[39] = SUGGESTION;
    arrayOfAction[40] = SUGGESTION_NOTIFICATION;
    arrayOfAction[41] = NOTIFICATION_CLICK;
    arrayOfAction[42] = LOCK;
    arrayOfAction[43] = UNLOCK;
    arrayOfAction[44] = LAUNCH;
    arrayOfAction[45] = USER_STAT;
    arrayOfAction[46] = SSO;
    arrayOfAction[47] = SNAPLOCK_SETTINGS;
    arrayOfAction[48] = SETTING_PASSWORD;
    arrayOfAction[49] = ERROR_REPORT;
    arrayOfAction[50] = INTENT_EXECUTE;
    arrayOfAction[51] = STORY_LIFECYCLE;
    arrayOfAction[52] = ACCESS_ADDITION_EXECUTE;
    arrayOfAction[53] = RESET;
    arrayOfAction[54] = AUTO_INSTALL_CLICK;
    arrayOfAction[55] = AUTO_INSTALL_BIND;
    arrayOfAction[56] = AUTO_INSTALL_UNBIND;
    arrayOfAction[57] = APPLY_AUTH;
    arrayOfAction[58] = LOG_TRACK;
    arrayOfAction[59] = ACCESSIBILITY_BIND;
    arrayOfAction[60] = ACCESSIBILITY_UNBIND;
    arrayOfAction[61] = TOAST;
    arrayOfAction[62] = HIBERNATION;
    arrayOfAction[63] = LUCKY_MONEY;
    arrayOfAction[64] = HIBERNATION_CLICK;
    arrayOfAction[65] = SHORTCUT;
    $VALUES = arrayOfAction;
  }

  private TaskEvent$Action(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TaskEvent.Action
 * JD-Core Version:    0.6.0
 */