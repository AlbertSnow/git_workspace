package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message.Builder;

public final class DownloadPackage$Builder extends Message.Builder<DownloadPackage>
{
  public String client_name;
  public String cookies;
  public Long download_size;
  public Long duration;
  public Integer error_code;
  public String file_path;
  public String refer;
  public DownloadPackage.Status status;
  public Long total_size;
  public String track_info;
  public DownloadPackage.Type type;
  public String url;
  public String verify_digest;
  public DownloadPackage.VerifyType verify_type;

  public DownloadPackage$Builder()
  {
  }

  public DownloadPackage$Builder(DownloadPackage paramDownloadPackage)
  {
    super(paramDownloadPackage);
    if (paramDownloadPackage == null)
      return;
    this.client_name = paramDownloadPackage.client_name;
    this.url = paramDownloadPackage.url;
    this.type = paramDownloadPackage.type;
    this.cookies = paramDownloadPackage.cookies;
    this.refer = paramDownloadPackage.refer;
    this.file_path = paramDownloadPackage.file_path;
    this.verify_type = paramDownloadPackage.verify_type;
    this.verify_digest = paramDownloadPackage.verify_digest;
    this.error_code = paramDownloadPackage.error_code;
    this.total_size = paramDownloadPackage.total_size;
    this.download_size = paramDownloadPackage.download_size;
    this.duration = paramDownloadPackage.duration;
    this.track_info = paramDownloadPackage.track_info;
    this.status = paramDownloadPackage.status;
  }

  public final DownloadPackage build()
  {
    return new DownloadPackage(this, null);
  }

  public final Builder client_name(String paramString)
  {
    this.client_name = paramString;
    return this;
  }

  public final Builder cookies(String paramString)
  {
    this.cookies = paramString;
    return this;
  }

  public final Builder download_size(Long paramLong)
  {
    this.download_size = paramLong;
    return this;
  }

  public final Builder duration(Long paramLong)
  {
    this.duration = paramLong;
    return this;
  }

  public final Builder error_code(Integer paramInteger)
  {
    this.error_code = paramInteger;
    return this;
  }

  public final Builder file_path(String paramString)
  {
    this.file_path = paramString;
    return this;
  }

  public final Builder refer(String paramString)
  {
    this.refer = paramString;
    return this;
  }

  public final Builder status(DownloadPackage.Status paramStatus)
  {
    this.status = paramStatus;
    return this;
  }

  public final Builder total_size(Long paramLong)
  {
    this.total_size = paramLong;
    return this;
  }

  public final Builder track_info(String paramString)
  {
    this.track_info = paramString;
    return this;
  }

  public final Builder type(DownloadPackage.Type paramType)
  {
    this.type = paramType;
    return this;
  }

  public final Builder url(String paramString)
  {
    this.url = paramString;
    return this;
  }

  public final Builder verify_digest(String paramString)
  {
    this.verify_digest = paramString;
    return this;
  }

  public final Builder verify_type(DownloadPackage.VerifyType paramVerifyType)
  {
    this.verify_type = paramVerifyType;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DownloadPackage.Builder
 * JD-Core Version:    0.6.0
 */