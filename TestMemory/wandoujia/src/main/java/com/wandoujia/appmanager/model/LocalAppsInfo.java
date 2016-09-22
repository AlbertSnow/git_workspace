package com.wandoujia.appmanager.model;

import java.io.Serializable;
import java.util.List;

public class LocalAppsInfo
  implements Serializable
{
  private String cpuFamily;
  private String cpuFeatures;
  private int sdkVersion;
  private List<UpgradeLocalAppInfo> sysApps;
  private List<UpgradeLocalAppInfo> userApps;

  public String getCpuFamily()
  {
    return this.cpuFamily;
  }

  public String getCpuFeatures()
  {
    return this.cpuFeatures;
  }

  public int getSdkVersion()
  {
    return this.sdkVersion;
  }

  public List<UpgradeLocalAppInfo> getSysApps()
  {
    return this.sysApps;
  }

  public List<UpgradeLocalAppInfo> getUserApps()
  {
    return this.userApps;
  }

  public void setCpuFamily(String paramString)
  {
    this.cpuFamily = paramString;
  }

  public void setCpuFeatures(String paramString)
  {
    this.cpuFeatures = paramString;
  }

  public void setSdkVersion(int paramInt)
  {
    this.sdkVersion = paramInt;
  }

  public void setSysApps(List<UpgradeLocalAppInfo> paramList)
  {
    this.sysApps = paramList;
  }

  public void setUserApps(List<UpgradeLocalAppInfo> paramList)
  {
    this.userApps = paramList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.model.LocalAppsInfo
 * JD-Core Version:    0.6.0
 */