package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class Download$Msg extends Message
{
  public static final ByteString DEFAULT_BODY;
  public static final Long DEFAULT_ID = Long.valueOf(0L);

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.BYTES)
  public final ByteString body;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT64)
  public final Long id;

  static
  {
    DEFAULT_BODY = ByteString.EMPTY;
  }

  private Download$Msg(Download.Msg.Builder paramBuilder)
  {
    super(paramBuilder);
    this.id = paramBuilder.id;
    this.body = paramBuilder.body;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Msg localMsg;
    do
    {
      return true;
      if (!(paramObject instanceof Msg))
        return false;
      localMsg = (Msg)paramObject;
    }
    while ((equals(this.id, localMsg.id)) && (equals(this.body, localMsg.body)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.id == null)
        break label64;
    label64: for (int j = this.id.hashCode(); ; j = 0)
    {
      int k = j * 37;
      ByteString localByteString = this.body;
      int m = 0;
      if (localByteString != null)
        m = this.body.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Download.Msg
 * JD-Core Version:    0.6.0
 */