package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Music extends Message
{
  public static final List<String> DEFAULT_COVER = Collections.emptyList();
  public static final Integer DEFAULT_DURATION = Integer.valueOf(0);
  public static final String DEFAULT_URL = "";

  @ProtoField(label=Message.Label.REPEATED, tag=2, type=Message.Datatype.STRING)
  public final List<String> cover;

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer duration;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String url;

  private Music(Music.Builder paramBuilder)
  {
    super(paramBuilder);
    this.url = paramBuilder.url;
    this.cover = immutableCopyOf(paramBuilder.cover);
    this.duration = paramBuilder.duration;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Music localMusic;
    do
    {
      return true;
      if (!(paramObject instanceof Music))
        return false;
      localMusic = (Music)paramObject;
    }
    while ((equals(this.url, localMusic.url)) && (equals(this.cover, localMusic.cover)) && (equals(this.duration, localMusic.duration)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.url == null)
        break label92;
      j = this.url.hashCode();
      k = j * 37;
      if (this.cover == null)
        break label97;
    }
    label92: label97: for (int m = this.cover.hashCode(); ; m = 1)
    {
      int n = 37 * (m + k);
      Integer localInteger = this.duration;
      int i1 = 0;
      if (localInteger != null)
        i1 = this.duration.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Music
 * JD-Core Version:    0.6.0
 */