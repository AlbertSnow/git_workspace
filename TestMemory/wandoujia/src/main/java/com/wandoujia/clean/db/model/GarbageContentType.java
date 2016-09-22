package com.wandoujia.clean.db.model;

import java.io.Serializable;

public class GarbageContentType
  implements Serializable
{
  public static final int ADVICE_LEVEL_RECOMMEND = 0;
  public static final int ADVICE_LEVEL_UNRECOMMEND = 1;
  private static final long serialVersionUID = 2498457585403257724L;
  public int adviceLevel;
  public String alertInfo;
  public String desc;
  public int id;
  public int labelId;
  public int orderType;
  public int rank;
  public String title;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.db.model.GarbageContentType
 * JD-Core Version:    0.6.0
 */