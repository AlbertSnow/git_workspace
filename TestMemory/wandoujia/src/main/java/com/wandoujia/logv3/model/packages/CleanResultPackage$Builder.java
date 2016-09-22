package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class CleanResultPackage$Builder extends Message.Builder<CleanResultPackage>
{
  public String clean_id;
  public String content_id;
  public String path;
  public Integer read_day;
  public Integer recommend;
  public Long size;
  public String title;
  public String type;

  public CleanResultPackage$Builder()
  {
  }

  public CleanResultPackage$Builder(CleanResultPackage paramCleanResultPackage)
  {
    super(paramCleanResultPackage);
    if (paramCleanResultPackage == null)
      return;
    this.clean_id = paramCleanResultPackage.clean_id;
    this.type = paramCleanResultPackage.type;
    this.size = paramCleanResultPackage.size;
    this.content_id = paramCleanResultPackage.content_id;
    this.title = paramCleanResultPackage.title;
    this.recommend = paramCleanResultPackage.recommend;
    this.read_day = paramCleanResultPackage.read_day;
    this.path = paramCleanResultPackage.path;
  }

  public final CleanResultPackage build()
  {
    return new CleanResultPackage(this, null);
  }

  public final Builder clean_id(String paramString)
  {
    this.clean_id = paramString;
    return this;
  }

  public final Builder content_id(String paramString)
  {
    this.content_id = paramString;
    return this;
  }

  public final Builder path(String paramString)
  {
    this.path = paramString;
    return this;
  }

  public final Builder read_day(Integer paramInteger)
  {
    this.read_day = paramInteger;
    return this;
  }

  public final Builder recommend(Integer paramInteger)
  {
    this.recommend = paramInteger;
    return this;
  }

  public final Builder size(Long paramLong)
  {
    this.size = paramLong;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }

  public final Builder type(String paramString)
  {
    this.type = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.CleanResultPackage.Builder
 * JD-Core Version:    0.6.0
 */