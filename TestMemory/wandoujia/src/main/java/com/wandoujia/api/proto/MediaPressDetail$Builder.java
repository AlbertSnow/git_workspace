package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class MediaPressDetail$Builder extends Message.Builder<MediaPressDetail>
{
  public String app;
  public String icon;
  public String package_name;
  public String title;

  public MediaPressDetail$Builder()
  {
  }

  public MediaPressDetail$Builder(MediaPressDetail paramMediaPressDetail)
  {
    super(paramMediaPressDetail);
    if (paramMediaPressDetail == null)
      return;
    this.icon = paramMediaPressDetail.icon;
    this.title = paramMediaPressDetail.title;
    this.app = paramMediaPressDetail.app;
    this.package_name = paramMediaPressDetail.package_name;
  }

  public final Builder app(String paramString)
  {
    this.app = paramString;
    return this;
  }

  public final MediaPressDetail build()
  {
    return new MediaPressDetail(this, null);
  }

  public final Builder icon(String paramString)
  {
    this.icon = paramString;
    return this;
  }

  public final Builder package_name(String paramString)
  {
    this.package_name = paramString;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MediaPressDetail.Builder
 * JD-Core Version:    0.6.0
 */