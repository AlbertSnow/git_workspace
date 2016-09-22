package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class EnjoySummary extends Message
{
  public static final Integer DEFAULT_DISLIKECOUNT;
  public static final Integer DEFAULT_LIKECOUNT = Integer.valueOf(0);
  public static final String DEFAULT_TARGET = "";

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer dislikeCount;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer likeCount;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String target;

  static
  {
    DEFAULT_DISLIKECOUNT = Integer.valueOf(0);
  }

  private EnjoySummary(EnjoySummary.Builder paramBuilder)
  {
    super(paramBuilder);
    this.target = paramBuilder.target;
    this.likeCount = paramBuilder.likeCount;
    this.dislikeCount = paramBuilder.dislikeCount;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    EnjoySummary localEnjoySummary;
    do
    {
      return true;
      if (!(paramObject instanceof EnjoySummary))
        return false;
      localEnjoySummary = (EnjoySummary)paramObject;
    }
    while ((equals(this.target, localEnjoySummary.target)) && (equals(this.likeCount, localEnjoySummary.likeCount)) && (equals(this.dislikeCount, localEnjoySummary.dislikeCount)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.target == null)
        break label90;
      j = this.target.hashCode();
      k = j * 37;
      if (this.likeCount == null)
        break label95;
    }
    label90: label95: for (int m = this.likeCount.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      Integer localInteger = this.dislikeCount;
      int i1 = 0;
      if (localInteger != null)
        i1 = this.dislikeCount.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.EnjoySummary
 * JD-Core Version:    0.6.0
 */