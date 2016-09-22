package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class LogTrackPackage$Builder extends Message.Builder<LogTrackPackage>
{
  public Long completed;
  public Long database;
  public Long discard;
  public Long prepare;

  public LogTrackPackage$Builder()
  {
  }

  public LogTrackPackage$Builder(LogTrackPackage paramLogTrackPackage)
  {
    super(paramLogTrackPackage);
    if (paramLogTrackPackage == null)
      return;
    this.prepare = paramLogTrackPackage.prepare;
    this.database = paramLogTrackPackage.database;
    this.completed = paramLogTrackPackage.completed;
    this.discard = paramLogTrackPackage.discard;
  }

  public final LogTrackPackage build()
  {
    return new LogTrackPackage(this, null);
  }

  public final Builder completed(Long paramLong)
  {
    this.completed = paramLong;
    return this;
  }

  public final Builder database(Long paramLong)
  {
    this.database = paramLong;
    return this;
  }

  public final Builder discard(Long paramLong)
  {
    this.discard = paramLong;
    return this;
  }

  public final Builder prepare(Long paramLong)
  {
    this.prepare = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.LogTrackPackage.Builder
 * JD-Core Version:    0.6.0
 */