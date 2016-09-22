package com.wandoujia.base.models;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class JPEG extends Message
{
  public static final ByteString DEFAULT_CONTENT = ByteString.EMPTY;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.BYTES)
  public final ByteString content;

  private JPEG(JPEG.Builder paramBuilder)
  {
    super(paramBuilder);
    this.content = paramBuilder.content;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof JPEG))
      return false;
    return equals(this.content, ((JPEG)paramObject).content);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.content != null);
    for (int j = this.content.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.models.JPEG
 * JD-Core Version:    0.6.0
 */