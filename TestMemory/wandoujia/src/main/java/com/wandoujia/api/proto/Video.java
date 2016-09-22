package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Video extends Message
{
  public static final List<String> DEFAULT_COVER = Collections.emptyList();
  public static final Integer DEFAULT_DURATION = Integer.valueOf(0);
  public static final Integer DEFAULT_HEIGHT;
  public static final String DEFAULT_URL = "";
  public static final Integer DEFAULT_WIDTH = Integer.valueOf(0);

  @ProtoField(label=Message.Label.REPEATED, tag=2, type=Message.Datatype.STRING)
  public final List<String> cover;

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer duration;

  @ProtoField(tag=5, type=Message.Datatype.INT32)
  public final Integer height;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String url;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer width;

  static
  {
    DEFAULT_HEIGHT = Integer.valueOf(0);
  }

  private Video(Video.Builder paramBuilder)
  {
    super(paramBuilder);
    this.url = paramBuilder.url;
    this.cover = immutableCopyOf(paramBuilder.cover);
    this.duration = paramBuilder.duration;
    this.width = paramBuilder.width;
    this.height = paramBuilder.height;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Video localVideo;
    do
    {
      return true;
      if (!(paramObject instanceof Video))
        return false;
      localVideo = (Video)paramObject;
    }
    while ((equals(this.url, localVideo.url)) && (equals(this.cover, localVideo.cover)) && (equals(this.duration, localVideo.duration)) && (equals(this.width, localVideo.width)) && (equals(this.height, localVideo.height)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label47: int i1;
    label72: int i2;
    if (i == 0)
    {
      if (this.url == null)
        break label144;
      j = this.url.hashCode();
      int k = j * 37;
      if (this.cover == null)
        break label149;
      m = this.cover.hashCode();
      int n = 37 * (m + k);
      if (this.duration == null)
        break label155;
      i1 = this.duration.hashCode();
      i2 = 37 * (i1 + n);
      if (this.width == null)
        break label161;
    }
    label144: label149: label155: label161: for (int i3 = this.width.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      Integer localInteger = this.height;
      int i5 = 0;
      if (localInteger != null)
        i5 = this.height.hashCode();
      i = i4 + i5;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 1;
      break label47;
      i1 = 0;
      break label72;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Video
 * JD-Core Version:    0.6.0
 */