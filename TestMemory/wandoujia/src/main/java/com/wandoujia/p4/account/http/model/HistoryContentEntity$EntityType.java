package com.wandoujia.p4.account.http.model;

public enum HistoryContentEntity$EntityType
{
  private final String name;

  static
  {
    EntityType[] arrayOfEntityType = new EntityType[3];
    arrayOfEntityType[0] = APP;
    arrayOfEntityType[1] = GAME;
    arrayOfEntityType[2] = VIDEO;
    $VALUES = arrayOfEntityType;
  }

  private HistoryContentEntity$EntityType(String paramString)
  {
    this.name = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.http.model.HistoryContentEntity.EntityType
 * JD-Core Version:    0.6.0
 */