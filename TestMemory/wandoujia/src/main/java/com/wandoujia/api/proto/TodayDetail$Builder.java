package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class TodayDetail$Builder extends Message.Builder<TodayDetail>
{
  public Long generate_time;
  public Boolean need_prefetch;
  public Long next_time;
  public Long notify_time;
  public String title;
  public Integer update_count;
  public Integer update_provider_count;

  public TodayDetail$Builder()
  {
  }

  public TodayDetail$Builder(TodayDetail paramTodayDetail)
  {
    super(paramTodayDetail);
    if (paramTodayDetail == null)
      return;
    this.generate_time = paramTodayDetail.generate_time;
    this.next_time = paramTodayDetail.next_time;
    this.notify_time = paramTodayDetail.notify_time;
    this.update_count = paramTodayDetail.update_count;
    this.title = paramTodayDetail.title;
    this.need_prefetch = paramTodayDetail.need_prefetch;
    this.update_provider_count = paramTodayDetail.update_provider_count;
  }

  public final TodayDetail build()
  {
    return new TodayDetail(this, null);
  }

  public final Builder generate_time(Long paramLong)
  {
    this.generate_time = paramLong;
    return this;
  }

  public final Builder need_prefetch(Boolean paramBoolean)
  {
    this.need_prefetch = paramBoolean;
    return this;
  }

  @Deprecated
  public final Builder next_time(Long paramLong)
  {
    this.next_time = paramLong;
    return this;
  }

  @Deprecated
  public final Builder notify_time(Long paramLong)
  {
    this.notify_time = paramLong;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }

  public final Builder update_count(Integer paramInteger)
  {
    this.update_count = paramInteger;
    return this;
  }

  public final Builder update_provider_count(Integer paramInteger)
  {
    this.update_provider_count = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.TodayDetail.Builder
 * JD-Core Version:    0.6.0
 */