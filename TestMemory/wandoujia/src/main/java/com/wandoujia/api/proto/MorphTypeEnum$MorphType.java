package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum MorphTypeEnum$MorphType
  implements ProtoEnum
{
  private final int value;

  static
  {
    EXPLORE_SINGLE_REVIEW = new MorphType("EXPLORE_SINGLE_REVIEW", 1, 0);
    EXPLORE_SINGLE_REVIEW_DETAIL = new MorphType("EXPLORE_SINGLE_REVIEW_DETAIL", 2, 1);
    EXPLORE_TOPIC_REVIEW = new MorphType("EXPLORE_TOPIC_REVIEW", 3, 2);
    EXPLORE_TOPIC_REVIEW_DETAIL = new MorphType("EXPLORE_TOPIC_REVIEW_DETAIL", 4, 3);
    EXPLORE_TOPIC_REVIEW_DETAIL_APP = new MorphType("EXPLORE_TOPIC_REVIEW_DETAIL_APP", 5, 4);
    MorphType[] arrayOfMorphType = new MorphType[6];
    arrayOfMorphType[0] = NOT_SUPPORT;
    arrayOfMorphType[1] = EXPLORE_SINGLE_REVIEW;
    arrayOfMorphType[2] = EXPLORE_SINGLE_REVIEW_DETAIL;
    arrayOfMorphType[3] = EXPLORE_TOPIC_REVIEW;
    arrayOfMorphType[4] = EXPLORE_TOPIC_REVIEW_DETAIL;
    arrayOfMorphType[5] = EXPLORE_TOPIC_REVIEW_DETAIL_APP;
    $VALUES = arrayOfMorphType;
  }

  private MorphTypeEnum$MorphType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MorphTypeEnum.MorphType
 * JD-Core Version:    0.6.0
 */