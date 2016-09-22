package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class PublisherBundleDetail$Builder extends Message.Builder<PublisherBundleDetail>
{
  public String cover;
  public Long createdTime;
  public Boolean defaultSelected;
  public String description;
  public String id;
  public Integer rank;
  public String title;

  public PublisherBundleDetail$Builder()
  {
  }

  public PublisherBundleDetail$Builder(PublisherBundleDetail paramPublisherBundleDetail)
  {
    super(paramPublisherBundleDetail);
    if (paramPublisherBundleDetail == null)
      return;
    this.id = paramPublisherBundleDetail.id;
    this.title = paramPublisherBundleDetail.title;
    this.description = paramPublisherBundleDetail.description;
    this.cover = paramPublisherBundleDetail.cover;
    this.rank = paramPublisherBundleDetail.rank;
    this.defaultSelected = paramPublisherBundleDetail.defaultSelected;
    this.createdTime = paramPublisherBundleDetail.createdTime;
  }

  public final PublisherBundleDetail build()
  {
    return new PublisherBundleDetail(this, null);
  }

  public final Builder cover(String paramString)
  {
    this.cover = paramString;
    return this;
  }

  public final Builder createdTime(Long paramLong)
  {
    this.createdTime = paramLong;
    return this;
  }

  public final Builder defaultSelected(Boolean paramBoolean)
  {
    this.defaultSelected = paramBoolean;
    return this;
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder id(String paramString)
  {
    this.id = paramString;
    return this;
  }

  public final Builder rank(Integer paramInteger)
  {
    this.rank = paramInteger;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PublisherBundleDetail.Builder
 * JD-Core Version:    0.6.0
 */