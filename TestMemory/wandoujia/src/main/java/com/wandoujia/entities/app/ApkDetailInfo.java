package com.wandoujia.entities.app;

import java.io.Serializable;
import java.util.List;

public class ApkDetailInfo
  implements Serializable
{
  private static final long serialVersionUID = -4677550047045976358L;
  private String adsType;
  private boolean beta;
  private int bytes;
  private int compatible = 1;
  private Long creation;
  private List<String> dangerousPermissions;
  private DownloadUrl downloadUrl;
  private List<String> incompatibleDetail;
  private String md5;
  private String paidType;
  private String permissionGroups;
  private String permissionLevel;
  private List<String> permissions;
  private List<String> resolution;
  private List<SecurityInfo> securityDetail;
  private String securityStatus;
  private String size;
  private int superior;
  private int verified;
  private int versionCode;
  private String versionName;

  public int getBytes()
  {
    return this.bytes;
  }

  public int getCompatible()
  {
    return this.compatible;
  }

  public DownloadUrl getDownloadUrl()
  {
    return this.downloadUrl;
  }

  public List<String> getIncompatibleDetail()
  {
    return this.incompatibleDetail;
  }

  public String getMd5()
  {
    return this.md5;
  }

  public String getPaidType()
  {
    return this.paidType;
  }

  public List<String> getPermissions()
  {
    return this.permissions;
  }

  public String getSize()
  {
    return this.size;
  }

  public int getVerified()
  {
    return this.verified;
  }

  public int getVersionCode()
  {
    return this.versionCode;
  }

  public String getVersionName()
  {
    return this.versionName;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.ApkDetailInfo
 * JD-Core Version:    0.6.0
 */