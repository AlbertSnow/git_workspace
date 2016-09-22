package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IASQueryInfoPackage extends Message
{

  @ProtoField(tag=1)
  public final IASQueryInfoPackage.IASBucketPackage ias_bucket_package;

  @ProtoField(tag=2)
  public final ContentPackage ias_request_content_package;

  private IASQueryInfoPackage(IASQueryInfoPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.ias_bucket_package = paramBuilder.ias_bucket_package;
    this.ias_request_content_package = paramBuilder.ias_request_content_package;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    IASQueryInfoPackage localIASQueryInfoPackage;
    do
    {
      return true;
      if (!(paramObject instanceof IASQueryInfoPackage))
        return false;
      localIASQueryInfoPackage = (IASQueryInfoPackage)paramObject;
    }
    while ((equals(this.ias_bucket_package, localIASQueryInfoPackage.ias_bucket_package)) && (equals(this.ias_request_content_package, localIASQueryInfoPackage.ias_request_content_package)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.ias_bucket_package == null)
        break label64;
    label64: for (int j = this.ias_bucket_package.hashCode(); ; j = 0)
    {
      int k = j * 37;
      ContentPackage localContentPackage = this.ias_request_content_package;
      int m = 0;
      if (localContentPackage != null)
        m = this.ias_request_content_package.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASQueryInfoPackage
 * JD-Core Version:    0.6.0
 */