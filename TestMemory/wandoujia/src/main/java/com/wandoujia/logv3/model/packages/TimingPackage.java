package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class TimingPackage extends Message
{
  public static final Long DEFAULT_DURATION;
  public static final Long DEFAULT_END;
  public static final Long DEFAULT_START = Long.valueOf(0L);

  @ProtoField(tag=3, type=Message.Datatype.INT64)
  public final Long duration;

  @ProtoField(tag=2, type=Message.Datatype.INT64)
  public final Long end;

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long start;

  static
  {
    DEFAULT_END = Long.valueOf(0L);
    DEFAULT_DURATION = Long.valueOf(0L);
  }

  private TimingPackage(TimingPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.start = paramBuilder.start;
    this.end = paramBuilder.end;
    this.duration = paramBuilder.duration;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    TimingPackage localTimingPackage;
    do
    {
      return true;
      if (!(paramObject instanceof TimingPackage))
        return false;
      localTimingPackage = (TimingPackage)paramObject;
    }
    while ((equals(this.start, localTimingPackage.start)) && (equals(this.end, localTimingPackage.end)) && (equals(this.duration, localTimingPackage.duration)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.start == null)
        break label90;
      j = this.start.hashCode();
      k = j * 37;
      if (this.end == null)
        break label95;
    }
    label90: label95: for (int m = this.end.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      Long localLong = this.duration;
      int i1 = 0;
      if (localLong != null)
        i1 = this.duration.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TimingPackage
 * JD-Core Version:    0.6.0
 */