package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class UserCenterInfo$Builder extends Message.Builder<UserCenterInfo>
{
  public Boolean activeSina;
  public String avatar;
  public String uid;
  public String username;

  public UserCenterInfo$Builder()
  {
  }

  public UserCenterInfo$Builder(UserCenterInfo paramUserCenterInfo)
  {
    super(paramUserCenterInfo);
    if (paramUserCenterInfo == null)
      return;
    this.uid = paramUserCenterInfo.uid;
    this.username = paramUserCenterInfo.username;
    this.activeSina = paramUserCenterInfo.activeSina;
    this.avatar = paramUserCenterInfo.avatar;
  }

  public final Builder activeSina(Boolean paramBoolean)
  {
    this.activeSina = paramBoolean;
    return this;
  }

  public final Builder avatar(String paramString)
  {
    this.avatar = paramString;
    return this;
  }

  public final UserCenterInfo build()
  {
    return new UserCenterInfo(this, null);
  }

  public final Builder uid(String paramString)
  {
    this.uid = paramString;
    return this;
  }

  public final Builder username(String paramString)
  {
    this.username = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.UserCenterInfo.Builder
 * JD-Core Version:    0.6.0
 */