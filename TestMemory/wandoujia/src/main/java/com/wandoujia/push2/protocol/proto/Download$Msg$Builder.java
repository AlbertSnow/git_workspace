package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.ByteString;
import com.squareup.wire.Message.Builder;

public final class Download$Msg$Builder extends Message.Builder<Download.Msg>
{
  public ByteString body;
  public Long id;

  public Download$Msg$Builder()
  {
  }

  public Download$Msg$Builder(Download.Msg paramMsg)
  {
    super(paramMsg);
    if (paramMsg == null)
      return;
    this.id = paramMsg.id;
    this.body = paramMsg.body;
  }

  public final Builder body(ByteString paramByteString)
  {
    this.body = paramByteString;
    return this;
  }

  public final Download.Msg build()
  {
    checkRequiredFields();
    return new Download.Msg(this, null);
  }

  public final Builder id(Long paramLong)
  {
    this.id = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Download.Msg.Builder
 * JD-Core Version:    0.6.0
 */