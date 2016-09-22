package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class Image extends Message
{
  public static final Boolean DEFAULT_HAS_MASK;
  public static final Integer DEFAULT_HEIGHT;
  public static final Integer DEFAULT_RGBS = Integer.valueOf(0);
  public static final String DEFAULT_URL = "";
  public static final Integer DEFAULT_WIDTH = Integer.valueOf(0);

  @ProtoField(tag=5, type=Message.Datatype.BOOL)
  public final Boolean has_mask;

  @ProtoField(tag=4, type=Message.Datatype.INT32)
  public final Integer height;

  @ProtoField(tag=2, type=Message.Datatype.INT32)
  public final Integer rgbs;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String url;

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer width;

  static
  {
    DEFAULT_HEIGHT = Integer.valueOf(0);
    DEFAULT_HAS_MASK = Boolean.valueOf(false);
  }

  private Image(Image.Builder paramBuilder)
  {
    super(paramBuilder);
    this.url = paramBuilder.url;
    this.rgbs = paramBuilder.rgbs;
    this.width = paramBuilder.width;
    this.height = paramBuilder.height;
    this.has_mask = paramBuilder.has_mask;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    Image localImage;
    do
    {
      return true;
      if (!(paramObject instanceof Image))
        return false;
      localImage = (Image)paramObject;
    }
    while ((equals(this.url, localImage.url)) && (equals(this.rgbs, localImage.rgbs)) && (equals(this.width, localImage.width)) && (equals(this.height, localImage.height)) && (equals(this.has_mask, localImage.has_mask)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i2;
    if (i == 0)
    {
      if (this.url == null)
        break label142;
      j = this.url.hashCode();
      int k = j * 37;
      if (this.rgbs == null)
        break label147;
      m = this.rgbs.hashCode();
      int n = 37 * (m + k);
      if (this.width == null)
        break label153;
      i1 = this.width.hashCode();
      i2 = 37 * (i1 + n);
      if (this.height == null)
        break label159;
    }
    label142: label147: label153: label159: for (int i3 = this.height.hashCode(); ; i3 = 0)
    {
      int i4 = 37 * (i3 + i2);
      Boolean localBoolean = this.has_mask;
      int i5 = 0;
      if (localBoolean != null)
        i5 = this.has_mask.hashCode();
      i = i4 + i5;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Image
 * JD-Core Version:    0.6.0
 */