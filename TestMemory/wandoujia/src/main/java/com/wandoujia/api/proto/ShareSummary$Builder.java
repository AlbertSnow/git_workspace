package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class ShareSummary$Builder extends Message.Builder<ShareSummary>
{
  public Long total_count;

  public ShareSummary$Builder()
  {
  }

  public ShareSummary$Builder(ShareSummary paramShareSummary)
  {
    super(paramShareSummary);
    if (paramShareSummary == null)
      return;
    this.total_count = paramShareSummary.total_count;
  }

  public final ShareSummary build()
  {
    checkRequiredFields();
    return new ShareSummary(this, null);
  }

  public final Builder total_count(Long paramLong)
  {
    this.total_count = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ShareSummary.Builder
 * JD-Core Version:    0.6.0
 */