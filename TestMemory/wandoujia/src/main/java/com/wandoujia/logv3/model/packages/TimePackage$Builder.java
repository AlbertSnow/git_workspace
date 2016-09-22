package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class TimePackage$Builder extends Message.Builder<TimePackage>
{
  public Long local_elapsed_time;
  public Long local_timestamp;
  public Integer local_timezone;
  public Long server_timestamp;

  public TimePackage$Builder()
  {
  }

  public TimePackage$Builder(TimePackage paramTimePackage)
  {
    super(paramTimePackage);
    if (paramTimePackage == null)
      return;
    this.local_elapsed_time = paramTimePackage.local_elapsed_time;
    this.local_timestamp = paramTimePackage.local_timestamp;
    this.server_timestamp = paramTimePackage.server_timestamp;
    this.local_timezone = paramTimePackage.local_timezone;
  }

  public final TimePackage build()
  {
    return new TimePackage(this, null);
  }

  public final Builder local_elapsed_time(Long paramLong)
  {
    this.local_elapsed_time = paramLong;
    return this;
  }

  public final Builder local_timestamp(Long paramLong)
  {
    this.local_timestamp = paramLong;
    return this;
  }

  public final Builder local_timezone(Integer paramInteger)
  {
    this.local_timezone = paramInteger;
    return this;
  }

  public final Builder server_timestamp(Long paramLong)
  {
    this.server_timestamp = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TimePackage.Builder
 * JD-Core Version:    0.6.0
 */