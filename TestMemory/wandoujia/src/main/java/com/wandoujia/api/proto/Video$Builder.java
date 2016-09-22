package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class Video$Builder extends Message.Builder<Video>
{
  public List<String> cover;
  public Integer duration;
  public Integer height;
  public String url;
  public Integer width;

  public Video$Builder()
  {
  }

  public Video$Builder(Video paramVideo)
  {
    super(paramVideo);
    if (paramVideo == null)
      return;
    this.url = paramVideo.url;
    this.cover = Video.access$000(paramVideo.cover);
    this.duration = paramVideo.duration;
    this.width = paramVideo.width;
    this.height = paramVideo.height;
  }

  public final Video build()
  {
    return new Video(this, null);
  }

  public final Builder cover(List<String> paramList)
  {
    this.cover = checkForNulls(paramList);
    return this;
  }

  public final Builder duration(Integer paramInteger)
  {
    this.duration = paramInteger;
    return this;
  }

  public final Builder height(Integer paramInteger)
  {
    this.height = paramInteger;
    return this;
  }

  public final Builder url(String paramString)
  {
    this.url = paramString;
    return this;
  }

  public final Builder width(Integer paramInteger)
  {
    this.width = paramInteger;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Video.Builder
 * JD-Core Version:    0.6.0
 */