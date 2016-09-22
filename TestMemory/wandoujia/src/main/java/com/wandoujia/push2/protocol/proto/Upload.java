package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Upload extends Message
{

  @ProtoField(tag=1)
  public final Upload.Ack ack;

  @ProtoField(tag=2)
  public final Upload.Req req;

  private Upload(Upload.Builder paramBuilder)
  {
    super(paramBuilder);
    this.ack = paramBuilder.ack;
    this.req = paramBuilder.req;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Upload localUpload;
    do
    {
      return true;
      if (!(paramObject instanceof Upload))
        return false;
      localUpload = (Upload)paramObject;
    }
    while ((equals(this.ack, localUpload.ack)) && (equals(this.req, localUpload.req)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.ack == null)
        break label64;
    label64: for (int j = this.ack.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Upload.Req localReq = this.req;
      int m = 0;
      if (localReq != null)
        m = this.req.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Upload
 * JD-Core Version:    0.6.0
 */