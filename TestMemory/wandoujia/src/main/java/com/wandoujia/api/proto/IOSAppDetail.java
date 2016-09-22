package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class IOSAppDetail extends Message
{
  public static final String DEFAULT_ICON = "";
  public static final String DEFAULT_IOS_SCHEMA = "";
  public static final String DEFAULT_ITUNES_DOWNLOAD_URL = "";
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String icon;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String ios_schema;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String itunes_download_url;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String title;

  private IOSAppDetail(IOSAppDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.ios_schema = paramBuilder.ios_schema;
    this.itunes_download_url = paramBuilder.itunes_download_url;
    this.icon = paramBuilder.icon;
    this.title = paramBuilder.title;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    IOSAppDetail localIOSAppDetail;
    do
    {
      return true;
      if (!(paramObject instanceof IOSAppDetail))
        return false;
      localIOSAppDetail = (IOSAppDetail)paramObject;
    }
    while ((equals(this.ios_schema, localIOSAppDetail.ios_schema)) && (equals(this.itunes_download_url, localIOSAppDetail.itunes_download_url)) && (equals(this.icon, localIOSAppDetail.icon)) && (equals(this.title, localIOSAppDetail.title)));
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
      if (this.ios_schema == null)
        break label116;
      j = this.ios_schema.hashCode();
      int k = j * 37;
      if (this.itunes_download_url == null)
        break label121;
      m = this.itunes_download_url.hashCode();
      n = 37 * (m + k);
      if (this.icon == null)
        break label127;
    }
    label116: label121: label127: for (int i1 = this.icon.hashCode(); ; i1 = 0)
    {
      int i2 = 37 * (i1 + n);
      String str = this.title;
      int i3 = 0;
      if (str != null)
        i3 = this.title.hashCode();
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
 * Qualified Name:     com.wandoujia.api.proto.IOSAppDetail
 * JD-Core Version:    0.6.0
 */