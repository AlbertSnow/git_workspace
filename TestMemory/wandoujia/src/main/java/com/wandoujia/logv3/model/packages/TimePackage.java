package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class TimePackage extends Message
{
  public static final Long DEFAULT_LOCAL_ELAPSED_TIME = Long.valueOf(0L);
  public static final Long DEFAULT_LOCAL_TIMESTAMP = Long.valueOf(0L);
  public static final Integer DEFAULT_LOCAL_TIMEZONE;
  public static final Long DEFAULT_SERVER_TIMESTAMP = Long.valueOf(0L);

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long local_elapsed_time;

  @ProtoField(tag=2, type=Message.Datatype.INT64)
  public final Long local_timestamp;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer local_timezone;

  @ProtoField(tag=3, type=Message.Datatype.INT64)
  public final Long server_timestamp;

  static
  {
    DEFAULT_LOCAL_TIMEZONE = Integer.valueOf(0);
  }

  private TimePackage(TimePackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.local_elapsed_time = paramBuilder.local_elapsed_time;
    this.local_timestamp = paramBuilder.local_timestamp;
    this.server_timestamp = paramBuilder.server_timestamp;
    this.local_timezone = paramBuilder.local_timezone;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    TimePackage localTimePackage;
    do
    {
      return true;
      if (!(paramObject instanceof TimePackage))
        return false;
      localTimePackage = (TimePackage)paramObject;
    }
    while ((equals(this.local_elapsed_time, localTimePackage.local_elapsed_time)) && (equals(this.local_timestamp, localTimePackage.local_timestamp)) && (equals(this.server_timestamp, localTimePackage.server_timestamp)) && (equals(this.local_timezone, localTimePackage.local_timezone)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.local_elapsed_time == null)
        break label116;
      j = this.local_elapsed_time.hashCode();
      int k = j * 37;
      if (this.local_timestamp == null)
        break label121;
      m = this.local_timestamp.hashCode();
      n = 37 * (m + k);
      if (this.server_timestamp == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.server_timestamp.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      Integer localInteger = this.local_timezone;
      int i3 = 0;
      if (localInteger != null)
        i3 = this.local_timezone.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TimePackage
 * JD-Core Version:    0.6.0
 */