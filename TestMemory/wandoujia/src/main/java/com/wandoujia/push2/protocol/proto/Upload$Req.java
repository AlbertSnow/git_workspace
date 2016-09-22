package com.wandoujia.push2.protocol.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class Upload$Req extends Message
{
  public static final Long DEFAULT_LASTID = Long.valueOf(0L);
  public static final String DEFAULT_UDID = "";

  @ProtoField(tag=2, type=Message.Datatype.INT64)
  public final Long lastId;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.STRING)
  public final String udid;

  private Upload$Req(Upload.Req.Builder paramBuilder)
  {
    super(paramBuilder);
    this.udid = paramBuilder.udid;
    this.lastId = paramBuilder.lastId;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Req localReq;
    do
    {
      return true;
      if (!(paramObject instanceof Req))
        return false;
      localReq = (Req)paramObject;
    }
    while ((equals(this.udid, localReq.udid)) && (equals(this.lastId, localReq.lastId)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
      if (this.udid == null)
        break label64;
    label64: for (int j = this.udid.hashCode(); ; j = 0)
    {
      int k = j * 37;
      Long localLong = this.lastId;
      int m = 0;
      if (localLong != null)
        m = this.lastId.hashCode();
      i = k + m;
      this.hashCode = i;
      return i;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.proto.Upload.Req
 * JD-Core Version:    0.6.0
 */