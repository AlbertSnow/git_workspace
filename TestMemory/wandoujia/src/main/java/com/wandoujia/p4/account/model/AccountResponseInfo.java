package com.wandoujia.p4.account.model;

import java.io.Serializable;

public class AccountResponseInfo
  implements Serializable
{
  private int error;
  private String msg;

  public int getError()
  {
    return this.error;
  }

  public String getMsg()
  {
    return this.msg;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.model.AccountResponseInfo
 * JD-Core Version:    0.6.0
 */