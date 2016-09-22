package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class CountDownPoint extends Message
{
  public static final Long DEFAULT_END_TIME = Long.valueOf(0L);
  public static final String DEFAULT_TEMPLATE = "";

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.INT64)
  public final Long end_time;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String template;

  private CountDownPoint(CountDownPoint.Builder paramBuilder)
  {
    super(paramBuilder);
    this.template = paramBuilder.template;
    this.end_time = paramBuilder.end_time;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    CountDownPoint localCountDownPoint;
    do
    {
      return true;
      if (!(paramObject instanceof CountDownPoint))
        return false;
      localCountDownPoint = (CountDownPoint)paramObject;
    }
    while ((equals(this.template, localCountDownPoint.template)) && (equals(this.end_time, localCountDownPoint.end_time)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.template == null)
        break label64;
    label64: for (int j = this.template.hashCode(); ; j = 0)
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
 * Qualified Name:     com.wandoujia.api.proto.CountDownPoint
 * JD-Core Version:    0.6.0
 */