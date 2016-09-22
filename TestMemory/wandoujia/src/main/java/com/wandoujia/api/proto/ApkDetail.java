package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ApkDetail extends Message
{
  public static final String DEFAULT_ADS_TYPE = "";
  public static final Boolean DEFAULT_BETA = Boolean.valueOf(false);
  public static final Integer DEFAULT_BYTES_ = Integer.valueOf(0);
  public static final Integer DEFAULT_COMPATIBLE;
  public static final Long DEFAULT_CREATION;
  public static final List<String> DEFAULT_DANGEROUS_PERMISSION;
  public static final List<String> DEFAULT_INCOMPATIBLE_DETAIL;
  public static final String DEFAULT_MD5 = "";
  public static final String DEFAULT_PAID_TYPE = "";
  public static final List<String> DEFAULT_PERMISSION;
  public static final String DEFAULT_PERMISSION_GROUP = "";
  public static final String DEFAULT_PERMISSION_LEVEL = "";
  public static final List<String> DEFAULT_RESOLUTION;
  public static final List<SecurityInfo> DEFAULT_SECURITY_DETAIL;
  public static final String DEFAULT_SECURITY_STATUS = "";
  public static final String DEFAULT_SIZE = "";
  public static final Integer DEFAULT_SUPERIOR;
  public static final Integer DEFAULT_VERIFIED;
  public static final Integer DEFAULT_VERSION_CODE = Integer.valueOf(0);
  public static final String DEFAULT_VERSION_NAME = "";

  @ProtoField(tag=1, type=Message.Datatype.STRING)
  public final String ads_type;

  @ProtoField(tag=2, type=Message.Datatype.BOOL)
  public final Boolean beta;

  @ProtoField(tag=3, type=Message.Datatype.INT32)
  public final Integer bytes_;

  @ProtoField(tag=17, type=Message.Datatype.INT32)
  public final Integer compatible;

  @ProtoField(tag=20, type=Message.Datatype.INT64)
  public final Long creation;

  @ProtoField(label=Message.Label.REPEATED, tag=12, type=Message.Datatype.STRING)
  public final List<String> dangerous_permission;

  @ProtoField(tag=4)
  public final DownloadUrl download_url;

  @ProtoField(label=Message.Label.REPEATED, tag=18, type=Message.Datatype.STRING)
  public final List<String> incompatible_detail;

  @ProtoField(tag=9, type=Message.Datatype.STRING)
  public final String md5;

  @ProtoField(tag=19, type=Message.Datatype.STRING)
  public final String paid_type;

  @ProtoField(label=Message.Label.REPEATED, tag=13, type=Message.Datatype.STRING)
  public final List<String> permission;

  @ProtoField(tag=21, type=Message.Datatype.STRING)
  public final String permission_group;

  @ProtoField(tag=14, type=Message.Datatype.STRING)
  public final String permission_level;

  @ProtoField(label=Message.Label.REPEATED, tag=11, type=Message.Datatype.STRING)
  public final List<String> resolution;

  @ProtoField(label=Message.Label.REPEATED, tag=10)
  public final List<SecurityInfo> security_detail;

  @ProtoField(tag=8, type=Message.Datatype.STRING)
  public final String security_status;

  @ProtoField(tag=5, type=Message.Datatype.STRING)
  public final String size;

  @ProtoField(tag=16, type=Message.Datatype.INT32)
  public final Integer superior;

  @ProtoField(tag=15, type=Message.Datatype.INT32)
  public final Integer verified;

  @ProtoField(tag=6, type=Message.Datatype.INT32)
  public final Integer version_code;

  @ProtoField(tag=7, type=Message.Datatype.STRING)
  public final String version_name;

  static
  {
    DEFAULT_SECURITY_DETAIL = Collections.emptyList();
    DEFAULT_RESOLUTION = Collections.emptyList();
    DEFAULT_DANGEROUS_PERMISSION = Collections.emptyList();
    DEFAULT_PERMISSION = Collections.emptyList();
    DEFAULT_VERIFIED = Integer.valueOf(0);
    DEFAULT_SUPERIOR = Integer.valueOf(0);
    DEFAULT_COMPATIBLE = Integer.valueOf(0);
    DEFAULT_INCOMPATIBLE_DETAIL = Collections.emptyList();
    DEFAULT_CREATION = Long.valueOf(0L);
  }

  private ApkDetail(ApkDetail.Builder paramBuilder)
  {
    super(paramBuilder);
    this.ads_type = paramBuilder.ads_type;
    this.beta = paramBuilder.beta;
    this.bytes_ = paramBuilder.bytes_;
    this.download_url = paramBuilder.download_url;
    this.size = paramBuilder.size;
    this.version_code = paramBuilder.version_code;
    this.version_name = paramBuilder.version_name;
    this.security_status = paramBuilder.security_status;
    this.md5 = paramBuilder.md5;
    this.security_detail = immutableCopyOf(paramBuilder.security_detail);
    this.resolution = immutableCopyOf(paramBuilder.resolution);
    this.dangerous_permission = immutableCopyOf(paramBuilder.dangerous_permission);
    this.permission = immutableCopyOf(paramBuilder.permission);
    this.permission_level = paramBuilder.permission_level;
    this.verified = paramBuilder.verified;
    this.superior = paramBuilder.superior;
    this.compatible = paramBuilder.compatible;
    this.incompatible_detail = immutableCopyOf(paramBuilder.incompatible_detail);
    this.paid_type = paramBuilder.paid_type;
    this.creation = paramBuilder.creation;
    this.permission_group = paramBuilder.permission_group;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ApkDetail localApkDetail;
    do
    {
      return true;
      if (!(paramObject instanceof ApkDetail))
        return false;
      localApkDetail = (ApkDetail)paramObject;
    }
    while ((equals(this.ads_type, localApkDetail.ads_type)) && (equals(this.beta, localApkDetail.beta)) && (equals(this.bytes_, localApkDetail.bytes_)) && (equals(this.download_url, localApkDetail.download_url)) && (equals(this.size, localApkDetail.size)) && (equals(this.version_code, localApkDetail.version_code)) && (equals(this.version_name, localApkDetail.version_name)) && (equals(this.security_status, localApkDetail.security_status)) && (equals(this.md5, localApkDetail.md5)) && (equals(this.security_detail, localApkDetail.security_detail)) && (equals(this.resolution, localApkDetail.resolution)) && (equals(this.dangerous_permission, localApkDetail.dangerous_permission)) && (equals(this.permission, localApkDetail.permission)) && (equals(this.permission_level, localApkDetail.permission_level)) && (equals(this.verified, localApkDetail.verified)) && (equals(this.superior, localApkDetail.superior)) && (equals(this.compatible, localApkDetail.compatible)) && (equals(this.incompatible_detail, localApkDetail.incompatible_detail)) && (equals(this.paid_type, localApkDetail.paid_type)) && (equals(this.creation, localApkDetail.creation)) && (equals(this.permission_group, localApkDetail.permission_group)));
    return false;
  }

  public final int hashCode()
  {
    int i = 1;
    int j = this.hashCode;
    int k;
    int n;
    label48: int i2;
    label74: int i4;
    label100: int i6;
    label126: int i8;
    label152: int i10;
    label178: int i12;
    label204: int i14;
    label230: int i16;
    label258: int i18;
    label286: int i20;
    label314: int i22;
    label342: int i24;
    label368: int i26;
    label394: int i28;
    label420: int i30;
    label446: int i33;
    label498: int i34;
    if (j == 0)
    {
      if (this.ads_type == null)
        break label570;
      k = this.ads_type.hashCode();
      int m = k * 37;
      if (this.beta == null)
        break label575;
      n = this.beta.hashCode();
      int i1 = 37 * (n + m);
      if (this.bytes_ == null)
        break label581;
      i2 = this.bytes_.hashCode();
      int i3 = 37 * (i2 + i1);
      if (this.download_url == null)
        break label587;
      i4 = this.download_url.hashCode();
      int i5 = 37 * (i4 + i3);
      if (this.size == null)
        break label593;
      i6 = this.size.hashCode();
      int i7 = 37 * (i6 + i5);
      if (this.version_code == null)
        break label599;
      i8 = this.version_code.hashCode();
      int i9 = 37 * (i8 + i7);
      if (this.version_name == null)
        break label605;
      i10 = this.version_name.hashCode();
      int i11 = 37 * (i10 + i9);
      if (this.security_status == null)
        break label611;
      i12 = this.security_status.hashCode();
      int i13 = 37 * (i12 + i11);
      if (this.md5 == null)
        break label617;
      i14 = this.md5.hashCode();
      int i15 = 37 * (i14 + i13);
      if (this.security_detail == null)
        break label623;
      i16 = this.security_detail.hashCode();
      int i17 = 37 * (i16 + i15);
      if (this.resolution == null)
        break label629;
      i18 = this.resolution.hashCode();
      int i19 = 37 * (i18 + i17);
      if (this.dangerous_permission == null)
        break label635;
      i20 = this.dangerous_permission.hashCode();
      int i21 = 37 * (i20 + i19);
      if (this.permission == null)
        break label641;
      i22 = this.permission.hashCode();
      int i23 = 37 * (i22 + i21);
      if (this.permission_level == null)
        break label647;
      i24 = this.permission_level.hashCode();
      int i25 = 37 * (i24 + i23);
      if (this.verified == null)
        break label653;
      i26 = this.verified.hashCode();
      int i27 = 37 * (i26 + i25);
      if (this.superior == null)
        break label659;
      i28 = this.superior.hashCode();
      int i29 = 37 * (i28 + i27);
      if (this.compatible == null)
        break label665;
      i30 = this.compatible.hashCode();
      int i31 = 37 * (i30 + i29);
      if (this.incompatible_detail != null)
        i = this.incompatible_detail.hashCode();
      int i32 = 37 * (i31 + i);
      if (this.paid_type == null)
        break label671;
      i33 = this.paid_type.hashCode();
      i34 = 37 * (i33 + i32);
      if (this.creation == null)
        break label677;
    }
    label641: label647: label653: label659: label665: label671: label677: for (int i35 = this.creation.hashCode(); ; i35 = 0)
    {
      int i36 = 37 * (i35 + i34);
      String str = this.permission_group;
      int i37 = 0;
      if (str != null)
        i37 = this.permission_group.hashCode();
      j = i36 + i37;
      this.hashCode = j;
      return j;
      label570: k = 0;
      break;
      label575: n = 0;
      break label48;
      label581: i2 = 0;
      break label74;
      label587: i4 = 0;
      break label100;
      label593: i6 = 0;
      break label126;
      label599: i8 = 0;
      break label152;
      label605: i10 = 0;
      break label178;
      label611: i12 = 0;
      break label204;
      label617: i14 = 0;
      break label230;
      label623: i16 = i;
      break label258;
      label629: i18 = i;
      break label286;
      label635: i20 = i;
      break label314;
      i22 = i;
      break label342;
      i24 = 0;
      break label368;
      i26 = 0;
      break label394;
      i28 = 0;
      break label420;
      i30 = 0;
      break label446;
      i33 = 0;
      break label498;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ApkDetail
 * JD-Core Version:    0.6.0
 */