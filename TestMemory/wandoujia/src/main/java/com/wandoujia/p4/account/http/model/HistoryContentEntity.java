package com.wandoujia.p4.account.http.model;

import java.io.Serializable;

public class HistoryContentEntity
  implements Serializable
{
  private String k;
  private String t;
  private String ts;
  private String udid;

  public HistoryContentEntity(HistoryContentEntity.EntityType paramEntityType, long paramLong1, long paramLong2, String paramString)
  {
    this.t = HistoryContentEntity.EntityType.access$000(paramEntityType);
    this.k = Long.toString(paramLong1);
    this.ts = Long.toString(paramLong2);
    this.udid = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.http.model.HistoryContentEntity
 * JD-Core Version:    0.6.0
 */