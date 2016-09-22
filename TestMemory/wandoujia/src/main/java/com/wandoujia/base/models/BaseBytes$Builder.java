package com.wandoujia.base.models;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message.Builder;

public final class BaseBytes$Builder extends Message.Builder<BaseBytes>
{
  public ByteString val;

  public BaseBytes$Builder()
  {
  }

  public BaseBytes$Builder(BaseBytes paramBaseBytes)
  {
    super(paramBaseBytes);
    if (paramBaseBytes == null)
      return;
    this.val = paramBaseBytes.val;
  }

  public final BaseBytes build()
  {
    return new BaseBytes(this, null);
  }

  public final Builder val(ByteString paramByteString)
  {
    this.val = paramByteString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.BaseBytes.Builder
 * JD-Core Version:    0.6.0
 */