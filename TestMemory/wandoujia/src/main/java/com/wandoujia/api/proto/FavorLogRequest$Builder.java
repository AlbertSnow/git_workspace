package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class FavorLogRequest$Builder extends Message.Builder<FavorLogRequest>
{
  public List<FavorLog> log;
  public Integer pb_version;

  public FavorLogRequest$Builder()
  {
  }

  public FavorLogRequest$Builder(FavorLogRequest paramFavorLogRequest)
  {
    super(paramFavorLogRequest);
    if (paramFavorLogRequest == null)
      return;
    this.pb_version = paramFavorLogRequest.pb_version;
    this.log = FavorLogRequest.access$000(paramFavorLogRequest.log);
  }

  public final FavorLogRequest build()
  {
    checkRequiredFields();
    return new FavorLogRequest(this, null);
  }

  public final Builder log(List<FavorLog> paramList)
  {
    this.log = checkForNulls(paramList);
    return this;
  }

  public final Builder pb_version(Integer paramInteger)
  {
    this.pb_version = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.FavorLogRequest.Builder
 * JD-Core Version:    0.6.0
 */