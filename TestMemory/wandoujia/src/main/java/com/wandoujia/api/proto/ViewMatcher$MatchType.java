package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum ViewMatcher$MatchType
  implements ProtoEnum
{
  private final int value;

  static
  {
    CONTENT_DESCRIPTION = new MatchType("CONTENT_DESCRIPTION", 2, 2);
    INDEX = new MatchType("INDEX", 3, 3);
    LIST_ITEM_BY_TEXT = new MatchType("LIST_ITEM_BY_TEXT", 4, 4);
    CLASS_NAME = new MatchType("CLASS_NAME", 5, 5);
    CHILD_CLASS_NAME = new MatchType("CHILD_CLASS_NAME", 6, 6);
    RESULT_INDEX = new MatchType("RESULT_INDEX", 7, 7);
    MatchType[] arrayOfMatchType = new MatchType[8];
    arrayOfMatchType[0] = TEXT;
    arrayOfMatchType[1] = VIEWID;
    arrayOfMatchType[2] = CONTENT_DESCRIPTION;
    arrayOfMatchType[3] = INDEX;
    arrayOfMatchType[4] = LIST_ITEM_BY_TEXT;
    arrayOfMatchType[5] = CLASS_NAME;
    arrayOfMatchType[6] = CHILD_CLASS_NAME;
    arrayOfMatchType[7] = RESULT_INDEX;
    $VALUES = arrayOfMatchType;
  }

  private ViewMatcher$MatchType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ViewMatcher.MatchType
 * JD-Core Version:    0.6.0
 */