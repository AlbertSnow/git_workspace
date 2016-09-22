package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class PublisherTimeDetail extends Message
{
  public static final Long DEFAULT_CREATE_TIME = Long.valueOf(0L);

  @ProtoField(tag=1, type=Message.Datatype.INT64)
  public final Long create_time;

  private PublisherTimeDetail(PublisherTimeDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.create_time = paramBuilder.create_time;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof PublisherTimeDetail))
      return false;
    return equals(this.create_time, ((PublisherTimeDetail)paramObject).create_time);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.create_time != null);
    for (int j = this.create_time.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.PublisherTimeDetail
 * JD-Core Version:    0.6.0
 */