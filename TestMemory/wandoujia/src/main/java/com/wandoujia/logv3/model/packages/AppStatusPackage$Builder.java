package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class AppStatusPackage$Builder extends Message.Builder<AppStatusPackage>
{
  public Integer app_version_code;
  public String app_version_name;
  public Boolean is_installed;
  public Boolean is_predownload;
  public AppStatusPackage.Pattern pattern;

  public AppStatusPackage$Builder()
  {
  }

  public AppStatusPackage$Builder(AppStatusPackage paramAppStatusPackage)
  {
    super(paramAppStatusPackage);
    if (paramAppStatusPackage == null)
      return;
    this.is_predownload = paramAppStatusPackage.is_predownload;
    this.is_installed = paramAppStatusPackage.is_installed;
    this.app_version_name = paramAppStatusPackage.app_version_name;
    this.app_version_code = paramAppStatusPackage.app_version_code;
    this.pattern = paramAppStatusPackage.pattern;
  }

  public final Builder app_version_code(Integer paramInteger)
  {
    this.app_version_code = paramInteger;
    return this;
  }

  public final Builder app_version_name(String paramString)
  {
    this.app_version_name = paramString;
    return this;
  }

  public final AppStatusPackage build()
  {
    return new AppStatusPackage(this, null);
  }

  public final Builder is_installed(Boolean paramBoolean)
  {
    this.is_installed = paramBoolean;
    return this;
  }

  public final Builder is_predownload(Boolean paramBoolean)
  {
    this.is_predownload = paramBoolean;
    return this;
  }

  public final Builder pattern(AppStatusPackage.Pattern paramPattern)
  {
    this.pattern = paramPattern;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.AppStatusPackage.Builder
 * JD-Core Version:    0.6.0
 */