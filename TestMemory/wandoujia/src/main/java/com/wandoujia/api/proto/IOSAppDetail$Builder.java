package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class IOSAppDetail$Builder extends Message.Builder<IOSAppDetail>
{
  public String icon;
  public String ios_schema;
  public String itunes_download_url;
  public String title;

  public IOSAppDetail$Builder()
  {
  }

  public IOSAppDetail$Builder(IOSAppDetail paramIOSAppDetail)
  {
    super(paramIOSAppDetail);
    if (paramIOSAppDetail == null)
      return;
    this.ios_schema = paramIOSAppDetail.ios_schema;
    this.itunes_download_url = paramIOSAppDetail.itunes_download_url;
    this.icon = paramIOSAppDetail.icon;
    this.title = paramIOSAppDetail.title;
  }

  public final IOSAppDetail build()
  {
    return new IOSAppDetail(this, null);
  }

  public final Builder icon(String paramString)
  {
    this.icon = paramString;
    return this;
  }

  public final Builder ios_schema(String paramString)
  {
    this.ios_schema = paramString;
    return this;
  }

  public final Builder itunes_download_url(String paramString)
  {
    this.itunes_download_url = paramString;
    return this;
  }

  public final Builder title(String paramString)
  {
    this.title = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.IOSAppDetail.Builder
 * JD-Core Version:    0.6.0
 */