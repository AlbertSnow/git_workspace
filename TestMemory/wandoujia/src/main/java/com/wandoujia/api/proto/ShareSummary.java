package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class ShareSummary extends Message
{
  public static final Long DEFAULT_TOTAL_COUNT = Long.valueOf(0L);

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT64)
  public final Long total_count;

  private ShareSummary(ShareSummary.Builder paramBuilder)
  {
    super(paramBuilder);
    this.total_count = paramBuilder.total_count;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof ShareSummary))
      return false;
    return equals(this.total_count, ((ShareSummary)paramObject).total_count);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.total_count != null);
    for (int j = this.total_count.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ShareSummary
 * JD-Core Version:    0.6.0
 */