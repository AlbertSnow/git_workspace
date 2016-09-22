package com.wandoujia.base.models;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message.Builder;

public final class PNG$Builder extends Message.Builder<PNG>
{
  public ByteString content;

  public PNG$Builder()
  {
  }

  public PNG$Builder(PNG paramPNG)
  {
    super(paramPNG);
    if (paramPNG == null)
      return;
    this.content = paramPNG.content;
  }

  public final PNG build()
  {
    checkRequiredFields();
    return new PNG(this, null);
  }

  public final Builder content(ByteString paramByteString)
  {
    this.content = paramByteString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.PNG.Builder
 * JD-Core Version:    0.6.0
 */