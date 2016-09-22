package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class Download$Conf extends Message
{
  public static final Integer DEFAULT_TIMEOUT = Integer.valueOf(0);

  @ProtoField(tag=1, type=Message.Datatype.INT32)
  public final Integer timeout;

  private Download$Conf(Download.Conf.Builder paramBuilder)
  {
    super(paramBuilder);
    this.timeout = paramBuilder.timeout;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof Conf))
      return false;
    return equals(this.timeout, ((Conf)paramObject).timeout);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.timeout != null);
    for (int j = this.timeout.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Download.Conf
 * JD-Core Version:    0.6.0
 */