package com.wandoujia.p4.app.detail.model;

import java.io.Serializable;

public class UserCenterInfo
  implements Serializable
{
  private boolean activeSina;
  private String avatar;
  private String uid;
  private String username;

  public UserCenterInfo()
  {
  }

  public UserCenterInfo(String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    this.uid = paramString1;
    this.username = paramString2;
    this.activeSina = paramBoolean;
    this.avatar = paramString3;
  }

  public String getAvatar()
  {
    return this.avatar;
  }

  public String getUid()
  {
    return this.uid;
  }

  public String getUsername()
  {
    return this.username;
  }

  public boolean isActiveSina()
  {
    return this.activeSina;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.model.UserCenterInfo
 * JD-Core Version:    0.6.0
 */