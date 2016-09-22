package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class FavorLog$Builder extends Message.Builder<FavorLog>
{
  public Long commit_version;
  public Boolean favor;
  public Long feed_id;
  public Long timestamp;

  public FavorLog$Builder()
  {
  }

  public FavorLog$Builder(FavorLog paramFavorLog)
  {
    super(paramFavorLog);
    if (paramFavorLog == null)
      return;
    this.feed_id = paramFavorLog.feed_id;
    this.favor = paramFavorLog.favor;
    this.commit_version = paramFavorLog.commit_version;
    this.timestamp = paramFavorLog.timestamp;
  }

  public final FavorLog build()
  {
    checkRequiredFields();
    return new FavorLog(this, null);
  }

  public final Builder commit_version(Long paramLong)
  {
    this.commit_version = paramLong;
    return this;
  }

  public final Builder favor(Boolean paramBoolean)
  {
    this.favor = paramBoolean;
    return this;
  }

  public final Builder feed_id(Long paramLong)
  {
    this.feed_id = paramLong;
    return this;
  }

  public final Builder timestamp(Long paramLong)
  {
    this.timestamp = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.FavorLog.Builder
 * JD-Core Version:    0.6.0
 */