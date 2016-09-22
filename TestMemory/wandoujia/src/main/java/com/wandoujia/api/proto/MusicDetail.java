package com.wandoujia.api.proto;

import com.squareup.wire.Message;

public final class MusicDetail extends Message
{
  private MusicDetail(MusicDetail.Builder paramBuilder)
  {
    super(paramBuilder);
  }

  public final boolean equals(Object paramObject)
  {
    return paramObject instanceof MusicDetail;
  }

  public final int hashCode()
  {
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MusicDetail
 * JD-Core Version:    0.6.0
 */