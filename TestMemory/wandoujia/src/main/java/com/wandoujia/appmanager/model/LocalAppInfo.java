package com.wandoujia.appmanager.model;

import java.io.Serializable;

public class LocalAppInfo
  implements Serializable
{
  private String cerStrMd5 = null;
  private String fileMd5 = null;
  private String packageName = null;
  private String title = null;
  private String versionCode = null;
  private String versionName = null;

  public LocalAppInfo()
  {
  }

  public LocalAppInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.packageName = paramString1;
    this.versionCode = paramString2;
    this.title = paramString3;
    this.cerStrMd5 = paramString4;
    this.fileMd5 = paramString5;
    this.versionName = paramString6;
  }

  public String getCerStrMd5()
  {
    return this.cerStrMd5;
  }

  public String getFileMd5()
  {
    return this.fileMd5;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getVersionCode()
  {
    return this.versionCode;
  }

  public void setCerStrMd5(String paramString)
  {
    this.cerStrMd5 = paramString;
  }

  public void setFileMd5(String paramString)
  {
    this.fileMd5 = paramString;
  }

  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setVersionCode(String paramString)
  {
    this.versionCode = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.model.LocalAppInfo
 * JD-Core Version:    0.6.0
 */