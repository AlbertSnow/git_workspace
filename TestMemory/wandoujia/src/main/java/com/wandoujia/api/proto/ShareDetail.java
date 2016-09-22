package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;

public final class ShareDetail extends Message
{
  public static final String DEFAULT_DESCRIPTION = "";
  public static final String DEFAULT_LINK = "";
  public static final ShareContentTypeEnum.ShareContentType DEFAULT_SHARE_CONTENT_TYPE;
  public static final SharePlatformEnum.SharePlatform DEFAULT_SHARE_PLATFORM;
  public static final ShareTypeEnum.ShareType DEFAULT_SHARE_TYPE = ShareTypeEnum.ShareType.ITEM;
  public static final String DEFAULT_TEXT = "";
  public static final ThumbImageEnum.ThumbImage DEFAULT_THUMB_IMAGE;
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String description;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String link;

  @ProtoField(tag=8, type=Message.Datatype.ENUM)
  public final ShareContentTypeEnum.ShareContentType share_content_type;

  @ProtoField(label=Message.Label.REQUIRED, tag=2, type=Message.Datatype.ENUM)
  public final SharePlatformEnum.SharePlatform share_platform;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.ENUM)
  public final ShareTypeEnum.ShareType share_type;

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String text;

  @ProtoField(tag=6, type=Message.Datatype.ENUM)
  public final ThumbImageEnum.ThumbImage thumb_image;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String title;

  static
  {
    DEFAULT_SHARE_PLATFORM = SharePlatformEnum.SharePlatform.WECHAT_MOMENT;
    DEFAULT_THUMB_IMAGE = ThumbImageEnum.ThumbImage.ICON;
    DEFAULT_SHARE_CONTENT_TYPE = ShareContentTypeEnum.ShareContentType.TEXT;
  }

  private ShareDetail(ShareDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.share_type = paramBuilder.share_type;
    this.share_platform = paramBuilder.share_platform;
    this.text = paramBuilder.text;
    this.title = paramBuilder.title;
    this.description = paramBuilder.description;
    this.thumb_image = paramBuilder.thumb_image;
    this.link = paramBuilder.link;
    this.share_content_type = paramBuilder.share_content_type;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ShareDetail localShareDetail;
    do
    {
      return true;
      if (!(paramObject instanceof ShareDetail))
        return false;
      localShareDetail = (ShareDetail)paramObject;
    }
    while ((equals(this.share_type, localShareDetail.share_type)) && (equals(this.share_platform, localShareDetail.share_platform)) && (equals(this.text, localShareDetail.text)) && (equals(this.title, localShareDetail.title)) && (equals(this.description, localShareDetail.description)) && (equals(this.thumb_image, localShareDetail.thumb_image)) && (equals(this.link, localShareDetail.link)) && (equals(this.share_content_type, localShareDetail.share_content_type)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int i1;
    label70: int i3;
    label96: int i5;
    label122: int i7;
    label148: int i8;
    if (i == 0)
    {
      if (this.share_type == null)
        break label220;
      j = this.share_type.hashCode();
      int k = j * 37;
      if (this.share_platform == null)
        break label225;
      m = this.share_platform.hashCode();
      int n = 37 * (m + k);
      if (this.text == null)
        break label231;
      i1 = this.text.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.title == null)
        break label237;
      i3 = this.title.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.description == null)
        break label243;
      i5 = this.description.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.thumb_image == null)
        break label249;
      i7 = this.thumb_image.hashCode();
      i8 = 37 * (i7 + i6);
      if (this.link == null)
        break label255;
    }
    label220: label225: label231: label237: label243: label249: label255: for (int i9 = this.link.hashCode(); ; i9 = 0)
    {
      int i10 = 37 * (i9 + i8);
      ShareContentTypeEnum.ShareContentType localShareContentType = this.share_content_type;
      int i11 = 0;
      if (localShareContentType != null)
        i11 = this.share_content_type.hashCode();
      i = i10 + i11;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
      i7 = 0;
      break label148;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ShareDetail
 * JD-Core Version:    0.6.0
 */