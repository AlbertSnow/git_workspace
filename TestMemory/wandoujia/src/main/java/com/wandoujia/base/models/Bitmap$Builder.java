package com.wandoujia.base.models;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message.Builder;

public final class Bitmap$Builder extends Message.Builder<Bitmap>
{
  public ByteString content;

  public Bitmap$Builder()
  {
  }

  public Bitmap$Builder(Bitmap paramBitmap)
  {
    super(paramBitmap);
    if (paramBitmap == null)
      return;
    this.content = paramBitmap.content;
  }

  public final Bitmap build()
  {
    checkRequiredFields();
    return new Bitmap(this, null);
  }

  public final Builder content(ByteString paramByteString)
  {
    this.content = paramByteString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.Bitmap.Builder
 * JD-Core Version:    0.6.0
 */