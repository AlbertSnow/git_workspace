package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class MediaPressDetail extends Message
{
  public static final String DEFAULT_APP = "";
  public static final String DEFAULT_ICON = "";
  public static final String DEFAULT_PACKAGE_NAME = "";
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String app;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String icon;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String package_name;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String title;

  private MediaPressDetail(MediaPressDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.icon = paramBuilder.icon;
    this.title = paramBuilder.title;
    this.app = paramBuilder.app;
    this.package_name = paramBuilder.package_name;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    MediaPressDetail localMediaPressDetail;
    do
    {
      return true;
      if (!(paramObject instanceof MediaPressDetail))
        return false;
      localMediaPressDetail = (MediaPressDetail)paramObject;
    }
    while ((equals(this.icon, localMediaPressDetail.icon)) && (equals(this.title, localMediaPressDetail.title)) && (equals(this.app, localMediaPressDetail.app)) && (equals(this.package_name, localMediaPressDetail.package_name)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int m;
    label45: int n;
    if (i == 0)
    {
      if (this.icon == null)
        break label116;
      j = this.icon.hashCode();
      int k = j * 37;
      if (this.title == null)
        break label121;
      m = this.title.hashCode();
      n = 37 * (m + k);
      if (this.app == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.app.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      String str = this.package_name;
      int i3 = 0;
      if (str != null)
        i3 = this.package_name.hashCode();
      i = i2 + i3;
      this.hashCode = i;
      return i;
      j = 0;
      break;
      m = 0;
      break label45;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.MediaPressDetail
 * JD-Core Version:    0.6.0
 */