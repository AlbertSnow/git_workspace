package com.wandoujia.p4.community.eventbus;

public enum CommunityEvent$Type
{
  static
  {
    DELETE_TOPIC = new Type("DELETE_TOPIC", 3);
    DELETE_REPLY = new Type("DELETE_REPLY", 4);
    FEATURE_TOPIC = new Type("FEATURE_TOPIC", 5);
    POST_REPLY = new Type("POST_REPLY", 6);
    POST_TOPIC = new Type("POST_TOPIC", 7);
    STICK_TOPIC = new Type("STICK_TOPIC", 8);
    LIKE_TOPIC = new Type("LIKE_TOPIC", 9);
    JOIN_GROUP = new Type("JOIN_GROUP", 10);
    QUIT_GROUP = new Type("QUIT_GROUP", 11);
    RESIGN_ADMIN = new Type("RESIGN_ADMIN", 12);
    BACK_PRESS = new Type("BACK_PRESS", 13);
    SELECT_TAB = new Type("SELECT_TAB", 14);
    UPDATE_TITLE = new Type("UPDATE_TITLE", 15);
    Type[] arrayOfType = new Type[16];
    arrayOfType[0] = BALLOT;
    arrayOfType[1] = BALLOT_NEW;
    arrayOfType[2] = LOGIN;
    arrayOfType[3] = DELETE_TOPIC;
    arrayOfType[4] = DELETE_REPLY;
    arrayOfType[5] = FEATURE_TOPIC;
    arrayOfType[6] = POST_REPLY;
    arrayOfType[7] = POST_TOPIC;
    arrayOfType[8] = STICK_TOPIC;
    arrayOfType[9] = LIKE_TOPIC;
    arrayOfType[10] = JOIN_GROUP;
    arrayOfType[11] = QUIT_GROUP;
    arrayOfType[12] = RESIGN_ADMIN;
    arrayOfType[13] = BACK_PRESS;
    arrayOfType[14] = SELECT_TAB;
    arrayOfType[15] = UPDATE_TITLE;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.eventbus.CommunityEvent.Type
 * JD-Core Version:    0.6.0
 */