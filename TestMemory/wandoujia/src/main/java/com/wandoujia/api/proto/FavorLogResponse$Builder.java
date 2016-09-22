package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class FavorLogResponse$Builder extends Message.Builder<FavorLogResponse>
{
  public Long head;
  public Long next_head;
  public Boolean nothing_commit;
  public Integer pb_version;
  public Integer status;

  public FavorLogResponse$Builder()
  {
  }

  public FavorLogResponse$Builder(FavorLogResponse paramFavorLogResponse)
  {
    super(paramFavorLogResponse);
    if (paramFavorLogResponse == null)
      return;
    this.pb_version = paramFavorLogResponse.pb_version;
    this.head = paramFavorLogResponse.head;
    this.next_head = paramFavorLogResponse.next_head;
    this.status = paramFavorLogResponse.status;
    this.nothing_commit = paramFavorLogResponse.nothing_commit;
  }

  public final FavorLogResponse build()
  {
    checkRequiredFields();
    return new FavorLogResponse(this, null);
  }

  public final Builder head(Long paramLong)
  {
    this.head = paramLong;
    return this;
  }

  public final Builder next_head(Long paramLong)
  {
    this.next_head = paramLong;
    return this;
  }

  public final Builder nothing_commit(Boolean paramBoolean)
  {
    this.nothing_commit = paramBoolean;
    return this;
  }

  public final Builder pb_version(Integer paramInteger)
  {
    this.pb_version = paramInteger;
    return this;
  }

  public final Builder status(Integer paramInteger)
  {
    this.status = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.FavorLogResponse.Builder
 * JD-Core Version:    0.6.0
 */