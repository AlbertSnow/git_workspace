package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ViewLogPackage$Action
  implements ProtoEnum
{
  private final int value;

  static
  {
    EXPAND = new Action("EXPAND", 1, 2);
    SEARCH = new Action("SEARCH", 2, 3);
    CLEAR_SEARCH_HISTORY = new Action("CLEAR_SEARCH_HISTORY", 3, 4);
    POPUP = new Action("POPUP", 4, 5);
    SUBSCRIBE = new Action("SUBSCRIBE", 5, 6);
    UNSUBSCRIBE = new Action("UNSUBSCRIBE", 6, 7);
    DOWNLOAD_ALL = new Action("DOWNLOAD_ALL", 7, 8);
    UPGRADE_ALL = new Action("UPGRADE_ALL", 8, 9);
    OPEN_URL = new Action("OPEN_URL", 9, 10);
    PAUSE = new Action("PAUSE", 10, 11);
    RESUME = new Action("RESUME", 11, 12);
    REMOVE = new Action("REMOVE", 12, 13);
    SET_WALLPAPER = new Action("SET_WALLPAPER", 13, 14);
    RETRY = new Action("RETRY", 14, 15);
    SHARE = new Action("SHARE", 15, 16);
    INFORMATION = new Action("INFORMATION", 16, 17);
    ZOOM = new Action("ZOOM", 17, 18);
    CLEAR = new Action("CLEAR", 18, 19);
    FOCUS = new Action("FOCUS", 19, 20);
    DRAG = new Action("DRAG", 20, 21);
    SET = new Action("SET", 21, 22);
    OPEN = new Action("OPEN", 22, 23);
    DOWNLOAD = new Action("DOWNLOAD", 23, 24);
    CLOSE = new Action("CLOSE", 24, 25);
    SELECT = new Action("SELECT", 25, 26);
    UNSELECT = new Action("UNSELECT", 26, 27);
    REFRESH = new Action("REFRESH", 27, 28);
    ADD_APP = new Action("ADD_APP", 28, 29);
    REMOVE_APP = new Action("REMOVE_APP", 29, 30);
    MARK_FAVORITE = new Action("MARK_FAVORITE", 30, 31);
    UNMARK_FAVORITE = new Action("UNMARK_FAVORITE", 31, 32);
    TOGGLE = new Action("TOGGLE", 32, 33);
    WIPE = new Action("WIPE", 33, 34);
    PLAY = new Action("PLAY", 34, 35);
    CHECK_UPGRADE = new Action("CHECK_UPGRADE", 35, 36);
    SUBMIT = new Action("SUBMIT", 36, 37);
    RATE = new Action("RATE", 37, 38);
    ENTER = new Action("ENTER", 38, 39);
    OPEN_IN_BROWSER = new Action("OPEN_IN_BROWSER", 39, 40);
    OPEN_IN_APP = new Action("OPEN_IN_APP", 40, 41);
    OPEN_APPS = new Action("OPEN_APPS", 41, 42);
    CLOSE_APPS = new Action("CLOSE_APPS", 42, 43);
    CLOSE_DETAIL = new Action("CLOSE_DETAIL", 43, 44);
    UPGRADE = new Action("UPGRADE", 44, 45);
    UNINSTALL = new Action("UNINSTALL", 45, 46);
    IGNORE_UPGRADE = new Action("IGNORE_UPGRADE", 46, 47);
    RESUME_UPGRADE = new Action("RESUME_UPGRADE", 47, 48);
    SWIPE_LEFT = new Action("SWIPE_LEFT", 48, 49);
    SWIPE_RIGHT = new Action("SWIPE_RIGHT", 49, 50);
    PROMOTE_SIGNUP = new Action("PROMOTE_SIGNUP", 50, 51);
    SWITCH = new Action("SWITCH", 51, 52);
    RECEIVE = new Action("RECEIVE", 52, 53);
    REUSE = new Action("REUSE", 53, 54);
    COPY = new Action("COPY", 54, 55);
    ADD_FAVORITE_APP = new Action("ADD_FAVORITE_APP", 55, 56);
    REMOVE_FAVORITE_APP = new Action("REMOVE_FAVORITE_APP", 56, 57);
    ADD_STICKER = new Action("ADD_STICKER", 57, 58);
    Action[] arrayOfAction = new Action[58];
    arrayOfAction[0] = REDIRECT;
    arrayOfAction[1] = EXPAND;
    arrayOfAction[2] = SEARCH;
    arrayOfAction[3] = CLEAR_SEARCH_HISTORY;
    arrayOfAction[4] = POPUP;
    arrayOfAction[5] = SUBSCRIBE;
    arrayOfAction[6] = UNSUBSCRIBE;
    arrayOfAction[7] = DOWNLOAD_ALL;
    arrayOfAction[8] = UPGRADE_ALL;
    arrayOfAction[9] = OPEN_URL;
    arrayOfAction[10] = PAUSE;
    arrayOfAction[11] = RESUME;
    arrayOfAction[12] = REMOVE;
    arrayOfAction[13] = SET_WALLPAPER;
    arrayOfAction[14] = RETRY;
    arrayOfAction[15] = SHARE;
    arrayOfAction[16] = INFORMATION;
    arrayOfAction[17] = ZOOM;
    arrayOfAction[18] = CLEAR;
    arrayOfAction[19] = FOCUS;
    arrayOfAction[20] = DRAG;
    arrayOfAction[21] = SET;
    arrayOfAction[22] = OPEN;
    arrayOfAction[23] = DOWNLOAD;
    arrayOfAction[24] = CLOSE;
    arrayOfAction[25] = SELECT;
    arrayOfAction[26] = UNSELECT;
    arrayOfAction[27] = REFRESH;
    arrayOfAction[28] = ADD_APP;
    arrayOfAction[29] = REMOVE_APP;
    arrayOfAction[30] = MARK_FAVORITE;
    arrayOfAction[31] = UNMARK_FAVORITE;
    arrayOfAction[32] = TOGGLE;
    arrayOfAction[33] = WIPE;
    arrayOfAction[34] = PLAY;
    arrayOfAction[35] = CHECK_UPGRADE;
    arrayOfAction[36] = SUBMIT;
    arrayOfAction[37] = RATE;
    arrayOfAction[38] = ENTER;
    arrayOfAction[39] = OPEN_IN_BROWSER;
    arrayOfAction[40] = OPEN_IN_APP;
    arrayOfAction[41] = OPEN_APPS;
    arrayOfAction[42] = CLOSE_APPS;
    arrayOfAction[43] = CLOSE_DETAIL;
    arrayOfAction[44] = UPGRADE;
    arrayOfAction[45] = UNINSTALL;
    arrayOfAction[46] = IGNORE_UPGRADE;
    arrayOfAction[47] = RESUME_UPGRADE;
    arrayOfAction[48] = SWIPE_LEFT;
    arrayOfAction[49] = SWIPE_RIGHT;
    arrayOfAction[50] = PROMOTE_SIGNUP;
    arrayOfAction[51] = SWITCH;
    arrayOfAction[52] = RECEIVE;
    arrayOfAction[53] = REUSE;
    arrayOfAction[54] = COPY;
    arrayOfAction[55] = ADD_FAVORITE_APP;
    arrayOfAction[56] = REMOVE_FAVORITE_APP;
    arrayOfAction[57] = ADD_STICKER;
    $VALUES = arrayOfAction;
  }

  private ViewLogPackage$Action(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ViewLogPackage.Action
 * JD-Core Version:    0.6.0
 */