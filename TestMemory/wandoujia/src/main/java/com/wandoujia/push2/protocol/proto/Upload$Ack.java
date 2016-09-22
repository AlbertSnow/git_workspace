package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class Upload$Ack extends Message
{
  public static final Long DEFAULT_ID = Long.valueOf(0L);

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT64)
  public final Long id;

  private Upload$Ack(Upload.Ack.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id = paramBuilder.id;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof Ack))
      return false;
    return equals(this.id, ((Ack)paramObject).id);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.id != null);
    for (int j = this.id.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Upload.Ack
 * JD-Core Version:    0.6.0
 */