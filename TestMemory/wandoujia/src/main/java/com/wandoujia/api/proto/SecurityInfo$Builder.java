package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class SecurityInfo$Builder extends Message.Builder<SecurityInfo>
{
  public String failed_info;
  public String provider;
  public String status;

  public SecurityInfo$Builder()
  {
  }

  public SecurityInfo$Builder(SecurityInfo paramSecurityInfo)
  {
    super(paramSecurityInfo);
    if (paramSecurityInfo == null)
      return;
    this.failed_info = paramSecurityInfo.failed_info;
    this.provider = paramSecurityInfo.provider;
    this.status = paramSecurityInfo.status;
  }

  public final SecurityInfo build()
  {
    return new SecurityInfo(this, null);
  }

  public final Builder failed_info(String paramString)
  {
    this.failed_info = paramString;
    return this;
  }

  public final Builder provider(String paramString)
  {
    this.provider = paramString;
    return this;
  }

  public final Builder status(String paramString)
  {
    this.status = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SecurityInfo.Builder
 * JD-Core Version:    0.6.0
 */