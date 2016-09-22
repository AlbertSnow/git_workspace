package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class Image$Builder extends Message.Builder<Image>
{
  public Boolean has_mask;
  public Integer height;
  public Integer rgbs;
  public String url;
  public Integer width;

  public Image$Builder()
  {
  }

  public Image$Builder(Image paramImage)
  {
    super(paramImage);
    if (paramImage == null)
      return;
    this.url = paramImage.url;
    this.rgbs = paramImage.rgbs;
    this.width = paramImage.width;
    this.height = paramImage.height;
    this.has_mask = paramImage.has_mask;
  }

  public final Image build()
  {
    return new Image(this, null);
  }

  public final Builder has_mask(Boolean paramBoolean)
  {
    this.has_mask = paramBoolean;
    return this;
  }

  public final Builder height(Integer paramInteger)
  {
    this.height = paramInteger;
    return this;
  }

  public final Builder rgbs(Integer paramInteger)
  {
    this.rgbs = paramInteger;
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
 * Qualified Name:     com.wandoujia.api.proto.Image.Builder
 * JD-Core Version:    0.6.0
 */