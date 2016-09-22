package com.wandoujia.p4.tips;

import android.content.Context;

public enum TipsType
{
  private int layoutRes;

  static
  {
    NO_FEEDBACK = new TipsType("NO_FEEDBACK", 2, 2130903090);
    LOADING = new TipsType.1("LOADING", 3);
    EMPTY = new TipsType("EMPTY", 4, 2130903499);
    NO_NETWORK = new TipsType.2("NO_NETWORK", 5);
    NO_NETWORK_FLOATING = new TipsType.3("NO_NETWORK_FLOATING", 6);
    NO_FLOW_TIPS_FLOATING = new TipsType.4("NO_FLOW_TIPS_FLOATING", 7);
    NO_GIFT_RESULT = new TipsType.5("NO_GIFT_RESULT", 8);
    NO_GAME_RESULT = new TipsType.6("NO_GAME_RESULT", 9);
    FETCH_FAILED_FLOATING = new TipsType.7("FETCH_FAILED_FLOATING", 10);
    COMMUNITY_NO_MESSAGE = new TipsType.8("COMMUNITY_NO_MESSAGE", 11);
    COMMUNITY_NO_RANKING = new TipsType.9("COMMUNITY_NO_RANKING", 12);
    COMMUNITY_NO_GROUP = new TipsType.10("COMMUNITY_NO_GROUP", 13);
    COMMUNITY_NO_TOPIC_FEED = new TipsType.11("COMMUNITY_NO_TOPIC_FEED", 14);
    COMMUNITY_NO_PUBLISHED_TOPIC = new TipsType.12("COMMUNITY_NO_PUBLISHED_TOPIC", 15);
    COMMUNITY_NO_REPLIED_TOPIC = new TipsType.13("COMMUNITY_NO_REPLIED_TOPIC", 16);
    COMMUNITY_NO_TOPIC = new TipsType.14("COMMUNITY_NO_TOPIC", 17);
    COMMUNITY_NO_FEATURE_TOPIC = new TipsType.15("COMMUNITY_NO_FEATURE_TOPIC", 18);
    COMMUNITY_NEED_LOGIN = new TipsType.16("COMMUNITY_NEED_LOGIN", 19);
    LOADING_TOP = new TipsType.17("LOADING_TOP", 20);
    COMMUNITY_NO_MEMBER = new TipsType.18("COMMUNITY_NO_MEMBER", 21);
    TipsType[] arrayOfTipsType = new TipsType[22];
    arrayOfTipsType[0] = NO_COMMENTS;
    arrayOfTipsType[1] = NO_IMAGES;
    arrayOfTipsType[2] = NO_FEEDBACK;
    arrayOfTipsType[3] = LOADING;
    arrayOfTipsType[4] = EMPTY;
    arrayOfTipsType[5] = NO_NETWORK;
    arrayOfTipsType[6] = NO_NETWORK_FLOATING;
    arrayOfTipsType[7] = NO_FLOW_TIPS_FLOATING;
    arrayOfTipsType[8] = NO_GIFT_RESULT;
    arrayOfTipsType[9] = NO_GAME_RESULT;
    arrayOfTipsType[10] = FETCH_FAILED_FLOATING;
    arrayOfTipsType[11] = COMMUNITY_NO_MESSAGE;
    arrayOfTipsType[12] = COMMUNITY_NO_RANKING;
    arrayOfTipsType[13] = COMMUNITY_NO_GROUP;
    arrayOfTipsType[14] = COMMUNITY_NO_TOPIC_FEED;
    arrayOfTipsType[15] = COMMUNITY_NO_PUBLISHED_TOPIC;
    arrayOfTipsType[16] = COMMUNITY_NO_REPLIED_TOPIC;
    arrayOfTipsType[17] = COMMUNITY_NO_TOPIC;
    arrayOfTipsType[18] = COMMUNITY_NO_FEATURE_TOPIC;
    arrayOfTipsType[19] = COMMUNITY_NEED_LOGIN;
    arrayOfTipsType[20] = LOADING_TOP;
    arrayOfTipsType[21] = COMMUNITY_NO_MEMBER;
    $VALUES = arrayOfTipsType;
  }

  private TipsType()
  {
  }

  private TipsType(int paramInt)
  {
    this.layoutRes = paramInt;
  }

  protected a createTips(Context paramContext)
  {
    return new a(paramContext, this.layoutRes);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.tips.TipsType
 * JD-Core Version:    0.6.0
 */