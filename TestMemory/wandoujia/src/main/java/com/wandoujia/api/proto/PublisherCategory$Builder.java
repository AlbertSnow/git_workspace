package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class PublisherCategory$Builder extends Message.Builder<PublisherCategory>
{
  public String description;
  public Integer id;
  public String name;
  public Integer rank;

  public PublisherCategory$Builder()
  {
  }

  public PublisherCategory$Builder(PublisherCategory paramPublisherCategory)
  {
    super(paramPublisherCategory);
    if (paramPublisherCategory == null)
      return;
    this.id = paramPublisherCategory.id;
    this.name = paramPublisherCategory.name;
    this.description = paramPublisherCategory.description;
    this.rank = paramPublisherCategory.rank;
  }

  public final PublisherCategory build()
  {
    return new PublisherCategory(this, null);
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder id(Integer paramInteger)
  {
    this.id = paramInteger;
    return this;
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder rank(Integer paramInteger)
  {
    this.rank = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PublisherCategory.Builder
 * JD-Core Version:    0.6.0
 */