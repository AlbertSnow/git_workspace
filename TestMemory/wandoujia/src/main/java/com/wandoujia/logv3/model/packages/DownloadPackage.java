package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.ProtoField;

public final class DownloadPackage extends Message
{
  public static final String DEFAULT_CLIENT_NAME = "";
  public static final String DEFAULT_COOKIES = "";
  public static final Long DEFAULT_DOWNLOAD_SIZE;
  public static final Long DEFAULT_DURATION;
  public static final Integer DEFAULT_ERROR_CODE;
  public static final String DEFAULT_FILE_PATH = "";
  public static final String DEFAULT_REFER = "";
  public static final DownloadPackage.Status DEFAULT_STATUS;
  public static final Long DEFAULT_TOTAL_SIZE;
  public static final String DEFAULT_TRACK_INFO = "";
  public static final DownloadPackage.Type DEFAULT_TYPE = DownloadPackage.Type.COMMON;
  public static final String DEFAULT_URL = "";
  public static final String DEFAULT_VERIFY_DIGEST = "";
  public static final DownloadPackage.VerifyType DEFAULT_VERIFY_TYPE = DownloadPackage.VerifyType.NONE;

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String client_name;

  @ProtoField(tag=4, type=Message.Datatype.STRING)
  public final String cookies;

  @ProtoField(tag=11, type=Message.Datatype.INT64)
  public final Long download_size;

  @ProtoField(tag=12, type=Message.Datatype.INT64)
  public final Long duration;

  @ProtoField(tag=9, type=Message.Datatype.INT32)
  public final Integer error_code;

  @ProtoField(tag=6, type=Message.Datatype.STRING)
  public final String file_path;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String refer;

  @ProtoField(tag=14, type=Message.Datatype.ENUM)
  public final DownloadPackage.Status status;

  @ProtoField(tag=10, type=Message.Datatype.INT64)
  public final Long total_size;

  @ProtoField(tag=13, type=Message.Datatype.STRING)
  public final String track_info;

  @ProtoField(tag=3, type=Message.Datatype.ENUM)
  public final DownloadPackage.Type type;

  @ProtoField(tag=2, type=Message.Datatype.STRING)
  public final String url;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String verify_digest;

  @ProtoField(tag=7, type=Message.Datatype.ENUM)
  public final DownloadPackage.VerifyType verify_type;

  static
  {
    DEFAULT_ERROR_CODE = Integer.valueOf(0);
    DEFAULT_TOTAL_SIZE = Long.valueOf(0L);
    DEFAULT_DOWNLOAD_SIZE = Long.valueOf(0L);
    DEFAULT_DURATION = Long.valueOf(0L);
    DEFAULT_STATUS = DownloadPackage.Status.PENDING;
  }

  private DownloadPackage(DownloadPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.client_name = paramBuilder.client_name;
    this.url = paramBuilder.url;
    this.type = paramBuilder.type;
    this.cookies = paramBuilder.cookies;
    this.refer = paramBuilder.refer;
    this.file_path = paramBuilder.file_path;
    this.verify_type = paramBuilder.verify_type;
    this.verify_digest = paramBuilder.verify_digest;
    this.error_code = paramBuilder.error_code;
    this.total_size = paramBuilder.total_size;
    this.download_size = paramBuilder.download_size;
    this.duration = paramBuilder.duration;
    this.track_info = paramBuilder.track_info;
    this.status = paramBuilder.status;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    DownloadPackage localDownloadPackage;
    do
    {
      return true;
      if (!(paramObject instanceof DownloadPackage))
        return false;
      localDownloadPackage = (DownloadPackage)paramObject;
    }
    while ((equals(this.client_name, localDownloadPackage.client_name)) && (equals(this.url, localDownloadPackage.url)) && (equals(this.type, localDownloadPackage.type)) && (equals(this.cookies, localDownloadPackage.cookies)) && (equals(this.refer, localDownloadPackage.refer)) && (equals(this.file_path, localDownloadPackage.file_path)) && (equals(this.verify_type, localDownloadPackage.verify_type)) && (equals(this.verify_digest, localDownloadPackage.verify_digest)) && (equals(this.error_code, localDownloadPackage.error_code)) && (equals(this.total_size, localDownloadPackage.total_size)) && (equals(this.download_size, localDownloadPackage.download_size)) && (equals(this.duration, localDownloadPackage.duration)) && (equals(this.track_info, localDownloadPackage.track_info)) && (equals(this.status, localDownloadPackage.status)));
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
    label148: int i9;
    label174: int i11;
    label200: int i13;
    label226: int i15;
    label252: int i17;
    label278: int i19;
    label304: int i20;
    if (i == 0)
    {
      if (this.client_name == null)
        break label376;
      j = this.client_name.hashCode();
      int k = j * 37;
      if (this.url == null)
        break label381;
      m = this.url.hashCode();
      int n = 37 * (m + k);
      if (this.type == null)
        break label387;
      i1 = this.type.hashCode();
      int i2 = 37 * (i1 + n);
      if (this.cookies == null)
        break label393;
      i3 = this.cookies.hashCode();
      int i4 = 37 * (i3 + i2);
      if (this.refer == null)
        break label399;
      i5 = this.refer.hashCode();
      int i6 = 37 * (i5 + i4);
      if (this.file_path == null)
        break label405;
      i7 = this.file_path.hashCode();
      int i8 = 37 * (i7 + i6);
      if (this.verify_type == null)
        break label411;
      i9 = this.verify_type.hashCode();
      int i10 = 37 * (i9 + i8);
      if (this.verify_digest == null)
        break label417;
      i11 = this.verify_digest.hashCode();
      int i12 = 37 * (i11 + i10);
      if (this.error_code == null)
        break label423;
      i13 = this.error_code.hashCode();
      int i14 = 37 * (i13 + i12);
      if (this.total_size == null)
        break label429;
      i15 = this.total_size.hashCode();
      int i16 = 37 * (i15 + i14);
      if (this.download_size == null)
        break label435;
      i17 = this.download_size.hashCode();
      int i18 = 37 * (i17 + i16);
      if (this.duration == null)
        break label441;
      i19 = this.duration.hashCode();
      i20 = 37 * (i19 + i18);
      if (this.track_info == null)
        break label447;
    }
    label387: label393: label399: label405: label411: label417: label423: label429: label435: label441: label447: for (int i21 = this.track_info.hashCode(); ; i21 = 0)
    {
      int i22 = 37 * (i21 + i20);
      DownloadPackage.Status localStatus = this.status;
      int i23 = 0;
      if (localStatus != null)
        i23 = this.status.hashCode();
      i = i22 + i23;
      this.hashCode = i;
      return i;
      label376: j = 0;
      break;
      label381: m = 0;
      break label45;
      i1 = 0;
      break label70;
      i3 = 0;
      break label96;
      i5 = 0;
      break label122;
      i7 = 0;
      break label148;
      i9 = 0;
      break label174;
      i11 = 0;
      break label200;
      i13 = 0;
      break label226;
      i15 = 0;
      break label252;
      i17 = 0;
      break label278;
      i19 = 0;
      break label304;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DownloadPackage
 * JD-Core Version:    0.6.0
 */