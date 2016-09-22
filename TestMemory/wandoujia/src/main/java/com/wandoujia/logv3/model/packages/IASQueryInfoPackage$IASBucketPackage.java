package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class IASQueryInfoPackage$IASBucketPackage extends Message
{
  public static final Integer DEFAULT_SESSION_BUICKET_ID;
  public static final Integer DEFAULT_USER_BUCKET_ID = Integer.valueOf(0);

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer session_buicket_id;

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer user_bucket_id;

  static
  {
    DEFAULT_SESSION_BUICKET_ID = Integer.valueOf(0);
  }

  private IASQueryInfoPackage$IASBucketPackage(IASQueryInfoPackage.IASBucketPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.user_bucket_id = paramBuilder.user_bucket_id;
    this.session_buicket_id = paramBuilder.session_buicket_id;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    IASBucketPackage localIASBucketPackage;
    do
    {
      return true;
      if (!(paramObject instanceof IASBucketPackage))
        return false;
      localIASBucketPackage = (IASBucketPackage)paramObject;
    }
    while ((equals(this.user_bucket_id, localIASBucketPackage.user_bucket_id)) && (equals(this.session_buicket_id, localIASBucketPackage.session_buicket_id)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.user_bucket_id == null)
        break label64;
    label64: for (int j = this.user_bucket_id.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Integer localInteger = this.session_buicket_id;
      int m = 0;
      if (localInteger != null)
        m = this.session_buicket_id.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASQueryInfoPackage.IASBucketPackage
 * JD-Core Version:    0.6.0
 */