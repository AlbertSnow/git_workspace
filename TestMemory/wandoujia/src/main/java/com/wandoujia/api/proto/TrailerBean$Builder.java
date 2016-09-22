package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class TrailerBean$Builder extends Message.Builder<TrailerBean>
{
  public String cover_url;
  public String description;
  public Integer duration;
  public Boolean is_portrait;
  public Integer trailer_id;
  public String trailer_name;
  public String trailer_url;

  public TrailerBean$Builder()
  {
  }

  public TrailerBean$Builder(TrailerBean paramTrailerBean)
  {
    super(paramTrailerBean);
    if (paramTrailerBean == null)
      return;
    this.trailer_id = paramTrailerBean.trailer_id;
    this.trailer_name = paramTrailerBean.trailer_name;
    this.description = paramTrailerBean.description;
    this.duration = paramTrailerBean.duration;
    this.is_portrait = paramTrailerBean.is_portrait;
    this.cover_url = paramTrailerBean.cover_url;
    this.trailer_url = paramTrailerBean.trailer_url;
  }

  public final TrailerBean build()
  {
    return new TrailerBean(this, null);
  }

  public final Builder cover_url(String paramString)
  {
    this.cover_url = paramString;
    return this;
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder duration(Integer paramInteger)
  {
    this.duration = paramInteger;
    return this;
  }

  public final Builder is_portrait(Boolean paramBoolean)
  {
    this.is_portrait = paramBoolean;
    return this;
  }

  public final Builder trailer_id(Integer paramInteger)
  {
    this.trailer_id = paramInteger;
    return this;
  }

  public final Builder trailer_name(String paramString)
  {
    this.trailer_name = paramString;
    return this;
  }

  public final Builder trailer_url(String paramString)
  {
    this.trailer_url = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.TrailerBean.Builder
 * JD-Core Version:    0.6.0
 */