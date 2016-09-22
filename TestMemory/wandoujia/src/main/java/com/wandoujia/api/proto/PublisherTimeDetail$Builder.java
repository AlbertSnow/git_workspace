package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class PublisherTimeDetail$Builder extends Message.Builder<PublisherTimeDetail>
{
  public Long create_time;

  public PublisherTimeDetail$Builder()
  {
  }

  public PublisherTimeDetail$Builder(PublisherTimeDetail paramPublisherTimeDetail)
  {
    super(paramPublisherTimeDetail);
    if (paramPublisherTimeDetail == null)
      return;
    this.create_time = paramPublisherTimeDetail.create_time;
  }

  public final PublisherTimeDetail build()
  {
    return new PublisherTimeDetail(this, null);
  }

  public final Builder create_time(Long paramLong)
  {
    this.create_time = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PublisherTimeDetail.Builder
 * JD-Core Version:    0.6.0
 */