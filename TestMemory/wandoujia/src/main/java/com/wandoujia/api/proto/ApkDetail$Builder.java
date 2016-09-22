package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class ApkDetail$Builder extends Message.Builder<ApkDetail>
{
  public String ads_type;
  public Boolean beta;
  public Integer bytes_;
  public Integer compatible;
  public Long creation;
  public List<String> dangerous_permission;
  public DownloadUrl download_url;
  public List<String> incompatible_detail;
  public String md5;
  public String paid_type;
  public List<String> permission;
  public String permission_group;
  public String permission_level;
  public List<String> resolution;
  public List<SecurityInfo> security_detail;
  public String security_status;
  public String size;
  public Integer superior;
  public Integer verified;
  public Integer version_code;
  public String version_name;

  public ApkDetail$Builder()
  {
  }

  public ApkDetail$Builder(ApkDetail paramApkDetail)
  {
    super(paramApkDetail);
    if (paramApkDetail == null)
      return;
    this.ads_type = paramApkDetail.ads_type;
    this.beta = paramApkDetail.beta;
    this.bytes_ = paramApkDetail.bytes_;
    this.download_url = paramApkDetail.download_url;
    this.size = paramApkDetail.size;
    this.version_code = paramApkDetail.version_code;
    this.version_name = paramApkDetail.version_name;
    this.security_status = paramApkDetail.security_status;
    this.md5 = paramApkDetail.md5;
    this.security_detail = ApkDetail.access$000(paramApkDetail.security_detail);
    this.resolution = ApkDetail.access$100(paramApkDetail.resolution);
    this.dangerous_permission = ApkDetail.access$200(paramApkDetail.dangerous_permission);
    this.permission = ApkDetail.access$300(paramApkDetail.permission);
    this.permission_level = paramApkDetail.permission_level;
    this.verified = paramApkDetail.verified;
    this.superior = paramApkDetail.superior;
    this.compatible = paramApkDetail.compatible;
    this.incompatible_detail = ApkDetail.access$400(paramApkDetail.incompatible_detail);
    this.paid_type = paramApkDetail.paid_type;
    this.creation = paramApkDetail.creation;
    this.permission_group = paramApkDetail.permission_group;
  }

  public final Builder ads_type(String paramString)
  {
    this.ads_type = paramString;
    return this;
  }

  public final Builder beta(Boolean paramBoolean)
  {
    this.beta = paramBoolean;
    return this;
  }

  public final ApkDetail build()
  {
    return new ApkDetail(this, null);
  }

  public final Builder bytes_(Integer paramInteger)
  {
    this.bytes_ = paramInteger;
    return this;
  }

  public final Builder compatible(Integer paramInteger)
  {
    this.compatible = paramInteger;
    return this;
  }

  public final Builder creation(Long paramLong)
  {
    this.creation = paramLong;
    return this;
  }

  public final Builder dangerous_permission(List<String> paramList)
  {
    this.dangerous_permission = checkForNulls(paramList);
    return this;
  }

  public final Builder download_url(DownloadUrl paramDownloadUrl)
  {
    this.download_url = paramDownloadUrl;
    return this;
  }

  public final Builder incompatible_detail(List<String> paramList)
  {
    this.incompatible_detail = checkForNulls(paramList);
    return this;
  }

  public final Builder md5(String paramString)
  {
    this.md5 = paramString;
    return this;
  }

  public final Builder paid_type(String paramString)
  {
    this.paid_type = paramString;
    return this;
  }

  public final Builder permission(List<String> paramList)
  {
    this.permission = checkForNulls(paramList);
    return this;
  }

  public final Builder permission_group(String paramString)
  {
    this.permission_group = paramString;
    return this;
  }

  public final Builder permission_level(String paramString)
  {
    this.permission_level = paramString;
    return this;
  }

  public final Builder resolution(List<String> paramList)
  {
    this.resolution = checkForNulls(paramList);
    return this;
  }

  public final Builder security_detail(List<SecurityInfo> paramList)
  {
    this.security_detail = checkForNulls(paramList);
    return this;
  }

  public final Builder security_status(String paramString)
  {
    this.security_status = paramString;
    return this;
  }

  public final Builder size(String paramString)
  {
    this.size = paramString;
    return this;
  }

  public final Builder superior(Integer paramInteger)
  {
    this.superior = paramInteger;
    return this;
  }

  public final Builder verified(Integer paramInteger)
  {
    this.verified = paramInteger;
    return this;
  }

  public final Builder version_code(Integer paramInteger)
  {
    this.version_code = paramInteger;
    return this;
  }

  public final Builder version_name(String paramString)
  {
    this.version_name = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ApkDetail.Builder
 * JD-Core Version:    0.6.0
 */