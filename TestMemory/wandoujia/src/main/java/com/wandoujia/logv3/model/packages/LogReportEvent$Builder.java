package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class LogReportEvent$Builder extends Message.Builder<LogReportEvent>
{
  public CommonPackage common_package;
  public EventPackage event_package;
  public ExtraPackage extra_package;
  public Long local_increment_id;
  public String proto_version;
  public Boolean real_time;

  public LogReportEvent$Builder()
  {
  }

  public LogReportEvent$Builder(LogReportEvent paramLogReportEvent)
  {
    super(paramLogReportEvent);
    if (paramLogReportEvent == null)
      return;
    this.local_increment_id = paramLogReportEvent.local_increment_id;
    this.real_time = paramLogReportEvent.real_time;
    this.proto_version = paramLogReportEvent.proto_version;
    this.common_package = paramLogReportEvent.common_package;
    this.event_package = paramLogReportEvent.event_package;
    this.extra_package = paramLogReportEvent.extra_package;
  }

  public final LogReportEvent build()
  {
    checkRequiredFields();
    return new LogReportEvent(this, null);
  }

  public final Builder common_package(CommonPackage paramCommonPackage)
  {
    this.common_package = paramCommonPackage;
    return this;
  }

  public final Builder event_package(EventPackage paramEventPackage)
  {
    this.event_package = paramEventPackage;
    return this;
  }

  public final Builder extra_package(ExtraPackage paramExtraPackage)
  {
    this.extra_package = paramExtraPackage;
    return this;
  }

  public final Builder local_increment_id(Long paramLong)
  {
    this.local_increment_id = paramLong;
    return this;
  }

  public final Builder proto_version(String paramString)
  {
    this.proto_version = paramString;
    return this;
  }

  public final Builder real_time(Boolean paramBoolean)
  {
    this.real_time = paramBoolean;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.LogReportEvent.Builder
 * JD-Core Version:    0.6.0
 */