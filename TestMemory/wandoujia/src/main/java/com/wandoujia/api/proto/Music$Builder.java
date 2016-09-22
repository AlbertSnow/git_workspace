package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class Music$Builder extends Message.Builder<Music>
{
  public List<String> cover;
  public Integer duration;
  public String url;

  public Music$Builder()
  {
  }

  public Music$Builder(Music paramMusic)
  {
    super(paramMusic);
    if (paramMusic == null)
      return;
    this.url = paramMusic.url;
    this.cover = Music.access$000(paramMusic.cover);
    this.duration = paramMusic.duration;
  }

  public final Music build()
  {
    return new Music(this, null);
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

  public final Builder url(String paramString)
  {
    this.url = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Music.Builder
 * JD-Core Version:    0.6.0
 */