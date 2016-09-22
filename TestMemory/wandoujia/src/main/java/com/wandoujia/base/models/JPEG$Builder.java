package com.wandoujia.base.models;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message.Builder;

public final class JPEG$Builder extends Message.Builder<JPEG>
{
  public ByteString content;

  public JPEG$Builder()
  {
  }

  public JPEG$Builder(JPEG paramJPEG)
  {
    super(paramJPEG);
    if (paramJPEG == null)
      return;
    this.content = paramJPEG.content;
  }

  public final JPEG build()
  {
    checkRequiredFields();
    return new JPEG(this, null);
  }

  public final Builder content(ByteString paramByteString)
  {
    this.content = paramByteString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.JPEG.Builder
 * JD-Core Version:    0.6.0
 */