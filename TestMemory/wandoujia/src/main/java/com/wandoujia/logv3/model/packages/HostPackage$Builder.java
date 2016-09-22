package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class HostPackage$Builder extends Message.Builder<HostPackage>
{
  public String appkeyid;
  public Integer host_version_code;
  public String host_version_name;
  public String package_name;

  public HostPackage$Builder()
  {
  }

  public HostPackage$Builder(HostPackage paramHostPackage)
  {
    super(paramHostPackage);
    if (paramHostPackage == null)
      return;
    this.appkeyid = paramHostPackage.appkeyid;
    this.package_name = paramHostPackage.package_name;
    this.host_version_name = paramHostPackage.host_version_name;
    this.host_version_code = paramHostPackage.host_version_code;
  }

  public final Builder appkeyid(String paramString)
  {
    this.appkeyid = paramString;
    return this;
  }

  public final HostPackage build()
  {
    return new HostPackage(this, null);
  }

  public final Builder host_version_code(Integer paramInteger)
  {
    this.host_version_code = paramInteger;
    return this;
  }

  public final Builder host_version_name(String paramString)
  {
    this.host_version_name = paramString;
    return this;
  }

  public final Builder package_name(String paramString)
  {
    this.package_name = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.HostPackage.Builder
 * JD-Core Version:    0.6.0
 */