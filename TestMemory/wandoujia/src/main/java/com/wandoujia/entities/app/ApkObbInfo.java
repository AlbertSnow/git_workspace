package com.wandoujia.entities.app;

import java.io.Serializable;
import java.util.List;

public class ApkObbInfo
  implements Serializable
{
  public static final String TYPE_DPK = "DPK";
  public static final String TYPE_GPK = "GPK";
  private String apkMd5;
  private int cpuType;
  private String description;
  private List<DownloadUrl> downloadUrls;
  private String dstPath;
  private String humanSize;
  boolean matched;
  private String md5;
  private String pf5;
  private long size;
  private String srcPath;
  private List<String> supportedCpuTypes;
  private String type;
  private String versionCode;

  public int getCpuType()
  {
    return this.cpuType;
  }

  public String getDescription()
  {
    return this.description;
  }

  public List<DownloadUrl> getDownloadUrls()
  {
    return this.downloadUrls;
  }

  public String getDstPath()
  {
    return this.dstPath;
  }

  public String getHumanSize()
  {
    return this.humanSize;
  }

  public boolean getMatched()
  {
    return this.matched;
  }

  public String getMd5()
  {
    return this.md5;
  }

  public String getPf5()
  {
    return this.pf5;
  }

  public long getSize()
  {
    return this.size;
  }

  public String getSrcPath()
  {
    return this.srcPath;
  }

  public List<String> getSupportedCpuTypes()
  {
    return this.supportedCpuTypes;
  }

  public String getType()
  {
    return this.type;
  }

  public String getVersionCode()
  {
    return this.versionCode;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.ApkObbInfo
 * JD-Core Version:    0.6.0
 */