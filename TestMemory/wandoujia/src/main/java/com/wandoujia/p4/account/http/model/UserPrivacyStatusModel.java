package com.wandoujia.p4.account.http.model;

import java.io.Serializable;

public class UserPrivacyStatusModel
  implements Serializable
{
  private boolean privacyStatus = true;

  public boolean isPrivacyStatus()
  {
    return this.privacyStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.http.model.UserPrivacyStatusModel
 * JD-Core Version:    0.6.0
 */