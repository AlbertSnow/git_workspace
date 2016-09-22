package com.wandoujia.p4.account.http.model;

import java.io.Serializable;

public class DeleteEntity
  implements Serializable
{
  private boolean hiddenStatus;
  private String packageName;

  public DeleteEntity(String paramString)
  {
    this.packageName = paramString;
    this.hiddenStatus = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.http.model.DeleteEntity
 * JD-Core Version:    0.6.0
 */