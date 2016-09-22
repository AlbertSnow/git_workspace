package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message.Builder;

public final class Upload$Req$Builder extends Message.Builder<Upload.Req>
{
  public Long lastId;
  public String udid;

  public Upload$Req$Builder()
  {
  }

  public Upload$Req$Builder(Upload.Req paramReq)
  {
    super(paramReq);
    if (paramReq == null)
      return;
    this.udid = paramReq.udid;
    this.lastId = paramReq.lastId;
  }

  public final Upload.Req build()
  {
    checkRequiredFields();
    return new Upload.Req(this, null);
  }

  public final Builder lastId(Long paramLong)
  {
    this.lastId = paramLong;
    return this;
  }

  public final Builder udid(String paramString)
  {
    this.udid = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Upload.Req.Builder
 * JD-Core Version:    0.6.0
 */