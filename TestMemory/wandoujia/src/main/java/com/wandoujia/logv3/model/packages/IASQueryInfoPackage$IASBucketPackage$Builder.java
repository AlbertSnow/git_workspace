package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class IASQueryInfoPackage$IASBucketPackage$Builder extends Message.Builder<IASQueryInfoPackage.IASBucketPackage>
{
  public Integer session_buicket_id;
  public Integer user_bucket_id;

  public IASQueryInfoPackage$IASBucketPackage$Builder()
  {
  }

  public IASQueryInfoPackage$IASBucketPackage$Builder(IASQueryInfoPackage.IASBucketPackage paramIASBucketPackage)
  {
    super(paramIASBucketPackage);
    if (paramIASBucketPackage == null)
      return;
    this.user_bucket_id = paramIASBucketPackage.user_bucket_id;
    this.session_buicket_id = paramIASBucketPackage.session_buicket_id;
  }

  public final IASQueryInfoPackage.IASBucketPackage build()
  {
    return new IASQueryInfoPackage.IASBucketPackage(this, null);
  }

  public final Builder session_buicket_id(Integer paramInteger)
  {
    this.session_buicket_id = paramInteger;
    return this;
  }

  public final Builder user_bucket_id(Integer paramInteger)
  {
    this.user_bucket_id = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASQueryInfoPackage.IASBucketPackage.Builder
 * JD-Core Version:    0.6.0
 */