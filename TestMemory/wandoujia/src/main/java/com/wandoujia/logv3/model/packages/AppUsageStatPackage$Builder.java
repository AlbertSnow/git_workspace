package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class AppUsageStatPackage$Builder extends Message.Builder<AppUsageStatPackage>
{
  public Long end_time;
  public Integer is_system;
  public String package_name;
  public Integer sample_frequency;
  public Long start_time;
  public Integer version_code;
  public String version_name;

  public AppUsageStatPackage$Builder()
  {
  }

  public AppUsageStatPackage$Builder(AppUsageStatPackage paramAppUsageStatPackage)
  {
    super(paramAppUsageStatPackage);
    if (paramAppUsageStatPackage == null)
      return;
    this.package_name = paramAppUsageStatPackage.package_name;
    this.version_code = paramAppUsageStatPackage.version_code;
    this.version_name = paramAppUsageStatPackage.version_name;
    this.is_system = paramAppUsageStatPackage.is_system;
    this.sample_frequency = paramAppUsageStatPackage.sample_frequency;
    this.start_time = paramAppUsageStatPackage.start_time;
    this.end_time = paramAppUsageStatPackage.end_time;
  }

  public final AppUsageStatPackage build()
  {
    checkRequiredFields();
    return new AppUsageStatPackage(this, null);
  }

  public final Builder end_time(Long paramLong)
  {
    this.end_time = paramLong;
    return this;
  }

  public final Builder is_system(Integer paramInteger)
  {
    this.is_system = paramInteger;
    return this;
  }

  public final Builder package_name(String paramString)
  {
    this.package_name = paramString;
    return this;
  }

  public final Builder sample_frequency(Integer paramInteger)
  {
    this.sample_frequency = paramInteger;
    return this;
  }

  public final Builder start_time(Long paramLong)
  {
    this.start_time = paramLong;
    return this;
  }

  public final Builder version_code(Integer paramInteger)
  {
    this.version_code = paramInteger;
    return this;
  }

  public final Builder version_name(String paramString)
  {
    this.version_name = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.AppUsageStatPackage.Builder
 * JD-Core Version:    0.6.0
 */