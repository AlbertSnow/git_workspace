package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message.Builder;

public final class Upload$Ack$Builder extends Message.Builder<Upload.Ack>
{
  public Long id;

  public Upload$Ack$Builder()
  {
  }

  public Upload$Ack$Builder(Upload.Ack paramAck)
  {
    super(paramAck);
    if (paramAck == null)
      return;
    this.id = paramAck.id;
  }

  public final Upload.Ack build()
  {
    checkRequiredFields();
    return new Upload.Ack(this, null);
  }

  public final Builder id(Long paramLong)
  {
    this.id = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Upload.Ack.Builder
 * JD-Core Version:    0.6.0
 */