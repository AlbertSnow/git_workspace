package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class IASQueryInfoPackage$Builder extends Message.Builder<IASQueryInfoPackage>
{
  public IASQueryInfoPackage.IASBucketPackage ias_bucket_package;
  public ContentPackage ias_request_content_package;

  public IASQueryInfoPackage$Builder()
  {
  }

  public IASQueryInfoPackage$Builder(IASQueryInfoPackage paramIASQueryInfoPackage)
  {
    super(paramIASQueryInfoPackage);
    if (paramIASQueryInfoPackage == null)
      return;
    this.ias_bucket_package = paramIASQueryInfoPackage.ias_bucket_package;
    this.ias_request_content_package = paramIASQueryInfoPackage.ias_request_content_package;
  }

  public final IASQueryInfoPackage build()
  {
    return new IASQueryInfoPackage(this, null);
  }

  public final Builder ias_bucket_package(IASQueryInfoPackage.IASBucketPackage paramIASBucketPackage)
  {
    this.ias_bucket_package = paramIASBucketPackage;
    return this;
  }

  public final Builder ias_request_content_package(ContentPackage paramContentPackage)
  {
    this.ias_request_content_package = paramContentPackage;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASQueryInfoPackage.Builder
 * JD-Core Version:    0.6.0
 */