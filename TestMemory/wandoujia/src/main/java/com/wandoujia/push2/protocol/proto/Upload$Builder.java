package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message.Builder;

public final class Upload$Builder extends Message.Builder<Upload>
{
  public Upload.Ack ack;
  public Upload.Req req;

  public Upload$Builder()
  {
  }

  public Upload$Builder(Upload paramUpload)
  {
    super(paramUpload);
    if (paramUpload == null)
      return;
    this.ack = paramUpload.ack;
    this.req = paramUpload.req;
  }

  public final Builder ack(Upload.Ack paramAck)
  {
    this.ack = paramAck;
    return this;
  }

  public final Upload build()
  {
    return new Upload(this, null);
  }

  public final Builder req(Upload.Req paramReq)
  {
    this.req = paramReq;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Upload.Builder
 * JD-Core Version:    0.6.0
 */