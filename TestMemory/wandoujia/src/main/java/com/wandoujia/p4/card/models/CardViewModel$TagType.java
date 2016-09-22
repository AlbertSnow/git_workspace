package com.wandoujia.p4.card.models;

public enum CardViewModel$TagType
{
  static
  {
    TAG = new TagType("TAG", 1);
    NONE = new TagType("NONE", 2);
    CUSTOM = new TagType("CUSTOM", 3);
    TagType[] arrayOfTagType = new TagType[4];
    arrayOfTagType[0] = VERTICAL;
    arrayOfTagType[1] = TAG;
    arrayOfTagType[2] = NONE;
    arrayOfTagType[3] = CUSTOM;
    $VALUES = arrayOfTagType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.card.models.CardViewModel.TagType
 * JD-Core Version:    0.6.0
 */