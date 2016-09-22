package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class CountDownPoint$Builder extends Message.Builder<CountDownPoint>
{
  public Long end_time;
  public String template;

  public CountDownPoint$Builder()
  {
  }

  public CountDownPoint$Builder(CountDownPoint paramCountDownPoint)
  {
    super(paramCountDownPoint);
    if (paramCountDownPoint == null)
      return;
    this.template = paramCountDownPoint.template;
    this.end_time = paramCountDownPoint.end_time;
  }

  public final CountDownPoint build()
  {
    checkRequiredFields();
    return new CountDownPoint(this, null);
  }

  public final Builder end_time(Long paramLong)
  {
    this.end_time = paramLong;
    return this;
  }

  public final Builder template(String paramString)
  {
    this.template = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.CountDownPoint.Builder
 * JD-Core Version:    0.6.0
 */