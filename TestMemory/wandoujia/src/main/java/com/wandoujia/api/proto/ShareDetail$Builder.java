package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class ShareDetail$Builder extends Message.Builder<ShareDetail>
{
  public String description;
  public String link;
  public ShareContentTypeEnum.ShareContentType share_content_type;
  public SharePlatformEnum.SharePlatform share_platform;
  public ShareTypeEnum.ShareType share_type;
  public String text;
  public ThumbImageEnum.ThumbImage thumb_image;
  public String title;

  public ShareDetail$Builder()
  {
  }

  public ShareDetail$Builder(ShareDetail paramShareDetail)
  {
    super(paramShareDetail);
    if (paramShareDetail == null)
      return;
    this.share_type = paramShareDetail.share_type;
    this.share_platform = paramShareDetail.share_platform;
    this.text = paramShareDetail.text;
    this.title = paramShareDetail.title;
    this.description = paramShareDetail.description;
    this.thumb_image = paramShareDetail.thumb_image;
    this.link = paramShareDetail.link;
    this.share_content_type = paramShareDetail.share_content_type;
  }

  public final ShareDetail build()
  {
    checkRequiredFields();
    return new ShareDetail(this, null);
  }

  public final Builder description(String paramString)
  {
    this.description = paramString;
    return this;
  }

  public final Builder link(String paramString)
  {
    this.link = paramString;
    return this;
  }

  public final Builder share_content_type(ShareContentTypeEnum.ShareContentType paramShareContentType)
  {
    this.share_content_type = paramShareContentType;
    return this;
  }

  public final Builder share_platform(SharePlatformEnum.SharePlatform paramSharePlatform)
  {
    this.share_platform = paramSharePlatform;
    return this;
  }

  public final Builder share_type(ShareTypeEnum.ShareType paramShareType)
  {
    this.share_type = paramShareType;
    return this;
  }

  public final Builder text(String paramString)
  {
    this.text = paramString;
    return this;
  }

  public final Builder thumb_image(ThumbImageEnum.ThumbImage paramThumbImage)
  {
    this.thumb_image = paramThumbImage;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ShareDetail.Builder
 * JD-Core Version:    0.6.0
 */