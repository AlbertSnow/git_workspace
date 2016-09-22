package com.wandoujia.p4.community.http.model;

import java.io.Serializable;

public class CommunityResponseInfo
  implements Serializable
{
  public static final int CODE_STICK_OVERFLOW = 1019;
  public static final int CODE_SUGGESS = 0;
  private static final long serialVersionUID = -4913587187412596923L;
  private int code;
  private String msg;

  public int getCode()
  {
    return this.code;
  }

  public String getMsg()
  {
    return this.msg;
  }

  public boolean isDataValid()
  {
    return this.code == 0;
  }

  public boolean isStickOverflow()
  {
    return this.code == 1019;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityResponseInfo
 * JD-Core Version:    0.6.0
 */