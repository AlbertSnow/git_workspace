package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class SubscribeSubsetPackage$Builder extends Message.Builder<SubscribeSubsetPackage>
{
  public String itemlistType;
  public SubscribePublisherPackage publisher;
  public String subset_createTime;
  public String subset_id;
  public String subset_title;
  public String subset_type;
  public String subset_updateTime;

  public SubscribeSubsetPackage$Builder()
  {
  }

  public SubscribeSubsetPackage$Builder(SubscribeSubsetPackage paramSubscribeSubsetPackage)
  {
    super(paramSubscribeSubsetPackage);
    if (paramSubscribeSubsetPackage == null)
      return;
    this.itemlistType = paramSubscribeSubsetPackage.itemlistType;
    this.subset_title = paramSubscribeSubsetPackage.subset_title;
    this.subset_type = paramSubscribeSubsetPackage.subset_type;
    this.subset_id = paramSubscribeSubsetPackage.subset_id;
    this.subset_createTime = paramSubscribeSubsetPackage.subset_createTime;
    this.subset_updateTime = paramSubscribeSubsetPackage.subset_updateTime;
    this.publisher = paramSubscribeSubsetPackage.publisher;
  }

  public final SubscribeSubsetPackage build()
  {
    return new SubscribeSubsetPackage(this, null);
  }

  public final Builder itemlistType(String paramString)
  {
    this.itemlistType = paramString;
    return this;
  }

  public final Builder publisher(SubscribePublisherPackage paramSubscribePublisherPackage)
  {
    this.publisher = paramSubscribePublisherPackage;
    return this;
  }

  public final Builder subset_createTime(String paramString)
  {
    this.subset_createTime = paramString;
    return this;
  }

  public final Builder subset_id(String paramString)
  {
    this.subset_id = paramString;
    return this;
  }

  public final Builder subset_title(String paramString)
  {
    this.subset_title = paramString;
    return this;
  }

  public final Builder subset_type(String paramString)
  {
    this.subset_type = paramString;
    return this;
  }

  public final Builder subset_updateTime(String paramString)
  {
    this.subset_updateTime = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.SubscribeSubsetPackage.Builder
 * JD-Core Version:    0.6.0
 */