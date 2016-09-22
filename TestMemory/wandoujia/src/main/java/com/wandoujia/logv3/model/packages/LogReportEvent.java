package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class LogReportEvent extends Message
{
  public static final Long DEFAULT_LOCAL_INCREMENT_ID = Long.valueOf(0L);
  public static final String DEFAULT_PROTO_VERSION = "1.1.1";
  public static final Boolean DEFAULT_REAL_TIME = Boolean.valueOf(false);

  @ProtoField(label=Message.Label.REQUIRED, tag=4)
  public final CommonPackage common_package;

  @ProtoField(tag=5)
  public final EventPackage event_package;

  @ProtoField(tag=6)
  public final ExtraPackage extra_package;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.UINT64)
  public final Long local_increment_id;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String proto_version;

  @ProtoField(tag=2, type=Message.Datatype.BOOL)
  public final Boolean real_time;

  private LogReportEvent(LogReportEvent.Builder paramBuilder)
  {
    super(paramBuilder);
    this.local_increment_id = paramBuilder.local_increment_id;
    this.real_time = paramBuilder.real_time;
    this.proto_version = paramBuilder.proto_version;
    this.common_package = paramBuilder.common_package;
    this.event_package = paramBuilder.event_package;
    this.extra_package = paramBuilder.extra_package;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    LogReportEvent localLogReportEvent;
    do
    {
      return true;
      if (!(paramObject instanceof LogReportEvent))
        return false;
      localLogReportEvent = (LogReportEvent)paramObject;
    }
    while ((equals(this.local_increment_id, localLogReportEvent.local_increment_id)) && (equals(this.real_time, localLogReportEvent.real_time)) && (equals(this.proto_version, localLogReportEvent.proto_version)) && (equals(this.common_package, localLogReportEvent.common_package)) && (equals(this.event_package, localLogReportEvent.event_package)) && (equals(this.extra_package, localLogReportEvent.extra_package)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i4;
    if (i == 0)
    {
      if (this.local_increment_id == null)
        break label168;
      j = this.local_increment_id.hashCode();
      int k = j * 37;
      if (this.real_time == null)
        break label173;
      m = this.real_time.hashCode();
      int n = 37 * (m + k);
      if (this.proto_version == null)
        break label179;
      i1 = this.proto_version.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.common_package == null)
        break label185;
      i3 = this.common_package.hashCode();
      i4 = 37 * (i3 + i2);
      if (this.event_package == null)
        break label191;
    }
    label168: label173: label179: label185: label191: for (int i5 = this.event_package.hashCode(); ; i5 = 0)
    {
      int i6 = 37 * (i5 + i4);
      ExtraPackage localExtraPackage = this.extra_package;
      int i7 = 0;
      if (localExtraPackage != null)
        i7 = this.extra_package.hashCode();
      i = i6 + i7;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.LogReportEvent
 * JD-Core Version:    0.6.0
 */