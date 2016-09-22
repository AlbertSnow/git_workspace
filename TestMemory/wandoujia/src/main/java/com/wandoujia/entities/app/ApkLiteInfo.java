package com.wandoujia.entities.app;

import java.io.Serializable;
import java.util.List;

public class ApkLiteInfo
  implements Serializable
{
  private int bytes;
  private int compatible = 1;
  private long creation;
  private DownloadUrl downloadUrl;
  private List<String> incompatibleDetail;
  private String md5;
  private String packageName;
  private String paidType;
  private String securityStatus;
  private int superior;
  private int verifeid;
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

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getPaidType()
  {
    return this.paidType;
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
 * Qualified Name:     com.wandoujia.entities.app.ApkLiteInfo
 * JD-Core Version:    0.6.0
 */