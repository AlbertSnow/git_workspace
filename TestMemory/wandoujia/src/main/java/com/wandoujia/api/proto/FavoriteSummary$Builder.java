package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class FavoriteSummary$Builder extends Message.Builder<FavoriteSummary>
{
  public Boolean favorited;
  public List<String> friends_avatar;
  public Long next_version;
  public Integer total_count;
  public Long update_time;
  public Long version;

  public FavoriteSummary$Builder()
  {
  }

  public FavoriteSummary$Builder(FavoriteSummary paramFavoriteSummary)
  {
    super(paramFavoriteSummary);
    if (paramFavoriteSummary == null)
      return;
    this.friends_avatar = FavoriteSummary.access$000(paramFavoriteSummary.friends_avatar);
    this.total_count = paramFavoriteSummary.total_count;
    this.favorited = paramFavoriteSummary.favorited;
    this.version = paramFavoriteSummary.version;
    this.next_version = paramFavoriteSummary.next_version;
    this.update_time = paramFavoriteSummary.update_time;
  }

  public final FavoriteSummary build()
  {
    checkRequiredFields();
    return new FavoriteSummary(this, null);
  }

  public final Builder favorited(Boolean paramBoolean)
  {
    this.favorited = paramBoolean;
    return this;
  }

  public final Builder friends_avatar(List<String> paramList)
  {
    this.friends_avatar = checkForNulls(paramList);
    return this;
  }

  public final Builder next_version(Long paramLong)
  {
    this.next_version = paramLong;
    return this;
  }

  public final Builder total_count(Integer paramInteger)
  {
    this.total_count = paramInteger;
    return this;
  }

  public final Builder update_time(Long paramLong)
  {
    this.update_time = paramLong;
    return this;
  }

  public final Builder version(Long paramLong)
  {
    this.version = paramLong;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.FavoriteSummary.Builder
 * JD-Core Version:    0.6.0
 */