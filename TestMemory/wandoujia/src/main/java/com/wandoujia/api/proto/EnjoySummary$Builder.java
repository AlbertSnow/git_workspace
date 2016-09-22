package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class EnjoySummary$Builder extends Message.Builder<EnjoySummary>
{
  public Integer dislikeCount;
  public Integer likeCount;
  public String target;

  public EnjoySummary$Builder()
  {
  }

  public EnjoySummary$Builder(EnjoySummary paramEnjoySummary)
  {
    super(paramEnjoySummary);
    if (paramEnjoySummary == null)
      return;
    this.target = paramEnjoySummary.target;
    this.likeCount = paramEnjoySummary.likeCount;
    this.dislikeCount = paramEnjoySummary.dislikeCount;
  }

  public final EnjoySummary build()
  {
    return new EnjoySummary(this, null);
  }

  public final Builder dislikeCount(Integer paramInteger)
  {
    this.dislikeCount = paramInteger;
    return this;
  }

  public final Builder likeCount(Integer paramInteger)
  {
    this.likeCount = paramInteger;
    return this;
  }

  public final Builder target(String paramString)
  {
    this.target = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.EnjoySummary.Builder
 * JD-Core Version:    0.6.0
 */