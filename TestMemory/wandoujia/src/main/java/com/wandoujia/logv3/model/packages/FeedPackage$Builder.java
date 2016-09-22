package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class FeedPackage$Builder extends Message.Builder<FeedPackage>
{
  public String detail;
  public String identity;
  public String name;
  public String template;

  public FeedPackage$Builder()
  {
  }

  public FeedPackage$Builder(FeedPackage paramFeedPackage)
  {
    super(paramFeedPackage);
    if (paramFeedPackage == null)
      return;
    this.identity = paramFeedPackage.identity;
    this.name = paramFeedPackage.name;
    this.template = paramFeedPackage.template;
    this.detail = paramFeedPackage.detail;
  }

  public final FeedPackage build()
  {
    return new FeedPackage(this, null);
  }

  public final Builder detail(String paramString)
  {
    this.detail = paramString;
    return this;
  }

  public final Builder identity(String paramString)
  {
    this.identity = paramString;
    return this;
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder template(String paramString)
  {
    this.template = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.FeedPackage.Builder
 * JD-Core Version:    0.6.0
 */