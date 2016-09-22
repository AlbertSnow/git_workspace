package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class AdDetail$Builder extends Message.Builder<AdDetail>
{
  public Long end_time;
  public Long start_time;

  public AdDetail$Builder()
  {
  }

  public AdDetail$Builder(AdDetail paramAdDetail)
  {
    super(paramAdDetail);
    if (paramAdDetail == null)
      return;
    this.start_time = paramAdDetail.start_time;
    this.end_time = paramAdDetail.end_time;
  }

  public final AdDetail build()
  {
    return new AdDetail(this, null);
  }

  public final Builder end_time(Long paramLong)
  {
    this.end_time = paramLong;
    return this;
  }

  public final Builder start_time(Long paramLong)
  {
    this.start_time = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AdDetail.Builder
 * JD-Core Version:    0.6.0
 */