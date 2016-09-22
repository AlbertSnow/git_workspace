package com.wandoujia.jupiter.search.utils;

public enum SearchConst$InAppCardType
{
  static
  {
    HORIZONTAL = new InAppCardType("HORIZONTAL", 1);
    VERTICAL_MINI = new InAppCardType("VERTICAL_MINI", 2);
    HORIZONTAL_MINI = new InAppCardType("HORIZONTAL_MINI", 3);
    WEATHER = new InAppCardType("WEATHER", 4);
    InAppCardType[] arrayOfInAppCardType = new InAppCardType[5];
    arrayOfInAppCardType[0] = VERTICAL;
    arrayOfInAppCardType[1] = HORIZONTAL;
    arrayOfInAppCardType[2] = VERTICAL_MINI;
    arrayOfInAppCardType[3] = HORIZONTAL_MINI;
    arrayOfInAppCardType[4] = WEATHER;
    $VALUES = arrayOfInAppCardType;
  }

  public static InAppCardType getCardType(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < values().length))
      return values()[paramInt];
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.utils.SearchConst.InAppCardType
 * JD-Core Version:    0.6.0
 */