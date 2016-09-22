package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class AdDetail extends Message
{
  public static final Long DEFAULT_END_TIME;
  public static final Long DEFAULT_START_TIME = Long.valueOf(0L);

  @ProtoField(tag=2, type=Message.Datatype.INT64)
  public final Long end_time;

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long start_time;

  static
  {
    DEFAULT_END_TIME = Long.valueOf(0L);
  }

  private AdDetail(AdDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.start_time = paramBuilder.start_time;
    this.end_time = paramBuilder.end_time;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    AdDetail localAdDetail;
    do
    {
      return true;
      if (!(paramObject instanceof AdDetail))
        return false;
      localAdDetail = (AdDetail)paramObject;
    }
    while ((equals(this.start_time, localAdDetail.start_time)) && (equals(this.end_time, localAdDetail.end_time)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.start_time == null)
        break label64;
    label64: for (int j = this.start_time.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Long localLong = this.end_time;
      int m = 0;
      if (localLong != null)
        m = this.end_time.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AdDetail
 * JD-Core Version:    0.6.0
 */