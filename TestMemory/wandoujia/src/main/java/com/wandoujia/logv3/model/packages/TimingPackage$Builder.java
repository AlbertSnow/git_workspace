package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class TimingPackage$Builder extends Message.Builder<TimingPackage>
{
  public Long duration;
  public Long end;
  public Long start;

  public TimingPackage$Builder()
  {
  }

  public TimingPackage$Builder(TimingPackage paramTimingPackage)
  {
    super(paramTimingPackage);
    if (paramTimingPackage == null)
      return;
    this.start = paramTimingPackage.start;
    this.end = paramTimingPackage.end;
    this.duration = paramTimingPackage.duration;
  }

  public final TimingPackage build()
  {
    return new TimingPackage(this, null);
  }

  public final Builder duration(Long paramLong)
  {
    this.duration = paramLong;
    return this;
  }

  public final Builder end(Long paramLong)
  {
    this.end = paramLong;
    return this;
  }

  public final Builder start(Long paramLong)
  {
    this.start = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TimingPackage.Builder
 * JD-Core Version:    0.6.0
 */