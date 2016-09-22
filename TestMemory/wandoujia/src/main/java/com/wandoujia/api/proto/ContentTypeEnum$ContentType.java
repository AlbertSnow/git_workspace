package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum ContentTypeEnum$ContentType
  implements ProtoEnum
{
  private final int value;

  static
  {
    APP = new ContentType("APP", 1, 0);
    GAME = new ContentType("GAME", 2, 1);
    VIDEO = new ContentType("VIDEO", 3, 2);
    MUSIC = new ContentType("MUSIC", 4, 3);
    FEED = new ContentType("FEED", 5, 4);
    BAR = new ContentType("BAR", 6, 5);
    SECTION = new ContentType("SECTION", 7, 6);
    BANNER = new ContentType("BANNER", 8, 7);
    CONTAINER = new ContentType("CONTAINER", 9, 8);
    CATEGORY = new ContentType("CATEGORY", 10, 9);
    TAB = new ContentType("TAB", 11, 10);
    CHANNEL = new ContentType("CHANNEL", 12, 11);
    TODAY = new ContentType("TODAY", 13, 12);
    APP_DIVERSION = new ContentType("APP_DIVERSION", 14, 13);
    APP_RECOMMEND = new ContentType("APP_RECOMMEND", 15, 14);
    APP_COMMENT = new ContentType("APP_COMMENT", 16, 15);
    SELF_UPDATE = new ContentType("SELF_UPDATE", 17, 16);
    KEYWORD = new ContentType("KEYWORD", 18, 17);
    GIFT = new ContentType("GIFT", 19, 18);
    RANKING = new ContentType("RANKING", 20, 19);
    FILTER = new ContentType("FILTER", 21, 20);
    SORTER = new ContentType("SORTER", 22, 21);
    BUTTON = new ContentType("BUTTON", 23, 22);
    HISTORY = new ContentType("HISTORY", 24, 23);
    SUGGESTION = new ContentType("SUGGESTION", 25, 24);
    SEARCH_DIRECT = new ContentType("SEARCH_DIRECT", 26, 25);
    SEARCH_HINT = new ContentType("SEARCH_HINT", 27, 26);
    DOWNLOAD_INFO = new ContentType("DOWNLOAD_INFO", 28, 27);
    PUBLISHER = new ContentType("PUBLISHER", 29, 28);
    PUBLISHSER_BUNDLE = new ContentType("PUBLISHSER_BUNDLE", 30, 29);
    IMAGE = new ContentType("IMAGE", 31, 30);
    PATCH = new ContentType("PATCH", 32, 31);
    SHARE = new ContentType("SHARE", 33, 32);
    SCENE = new ContentType("SCENE", 34, 33);
    SCENE_SUGGESTION = new ContentType("SCENE_SUGGESTION", 35, 34);
    SUGGESTION_ACTION_GROUP = new ContentType("SUGGESTION_ACTION_GROUP", 36, 35);
    SUGGESTION_ACTION = new ContentType("SUGGESTION_ACTION", 37, 36);
    FAVORITE_CATEGORY = new ContentType("FAVORITE_CATEGORY", 38, 37);
    IMMUTABLE_CATEGORY = new ContentType("IMMUTABLE_CATEGORY", 39, 38);
    SHOPPING = new ContentType("SHOPPING", 40, 39);
    REVIEW_SINGLE = new ContentType("REVIEW_SINGLE", 41, 40);
    REVIEW_LIST = new ContentType("REVIEW_LIST", 42, 41);
    ContentType[] arrayOfContentType = new ContentType[43];
    arrayOfContentType[0] = NOT_SUPPORT;
    arrayOfContentType[1] = APP;
    arrayOfContentType[2] = GAME;
    arrayOfContentType[3] = VIDEO;
    arrayOfContentType[4] = MUSIC;
    arrayOfContentType[5] = FEED;
    arrayOfContentType[6] = BAR;
    arrayOfContentType[7] = SECTION;
    arrayOfContentType[8] = BANNER;
    arrayOfContentType[9] = CONTAINER;
    arrayOfContentType[10] = CATEGORY;
    arrayOfContentType[11] = TAB;
    arrayOfContentType[12] = CHANNEL;
    arrayOfContentType[13] = TODAY;
    arrayOfContentType[14] = APP_DIVERSION;
    arrayOfContentType[15] = APP_RECOMMEND;
    arrayOfContentType[16] = APP_COMMENT;
    arrayOfContentType[17] = SELF_UPDATE;
    arrayOfContentType[18] = KEYWORD;
    arrayOfContentType[19] = GIFT;
    arrayOfContentType[20] = RANKING;
    arrayOfContentType[21] = FILTER;
    arrayOfContentType[22] = SORTER;
    arrayOfContentType[23] = BUTTON;
    arrayOfContentType[24] = HISTORY;
    arrayOfContentType[25] = SUGGESTION;
    arrayOfContentType[26] = SEARCH_DIRECT;
    arrayOfContentType[27] = SEARCH_HINT;
    arrayOfContentType[28] = DOWNLOAD_INFO;
    arrayOfContentType[29] = PUBLISHER;
    arrayOfContentType[30] = PUBLISHSER_BUNDLE;
    arrayOfContentType[31] = IMAGE;
    arrayOfContentType[32] = PATCH;
    arrayOfContentType[33] = SHARE;
    arrayOfContentType[34] = SCENE;
    arrayOfContentType[35] = SCENE_SUGGESTION;
    arrayOfContentType[36] = SUGGESTION_ACTION_GROUP;
    arrayOfContentType[37] = SUGGESTION_ACTION;
    arrayOfContentType[38] = FAVORITE_CATEGORY;
    arrayOfContentType[39] = IMMUTABLE_CATEGORY;
    arrayOfContentType[40] = SHOPPING;
    arrayOfContentType[41] = REVIEW_SINGLE;
    arrayOfContentType[42] = REVIEW_LIST;
    $VALUES = arrayOfContentType;
  }

  private ContentTypeEnum$ContentType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ContentTypeEnum.ContentType
 * JD-Core Version:    0.6.0
 */