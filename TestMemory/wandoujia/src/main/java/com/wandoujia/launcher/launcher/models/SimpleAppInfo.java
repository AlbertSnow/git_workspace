package com.wandoujia.launcher.launcher.models;

import java.io.Serializable;

public class SimpleAppInfo
  implements Serializable, Comparable<SimpleAppInfo>
{
  private String appType;
  private SimpleAppInfo.Icon icons;
  private String packageName;
  private String pinyinName;
  private int startCount;
  private String title;

  public int compareTo(SimpleAppInfo paramSimpleAppInfo)
  {
    if ((this.pinyinName == null) && (paramSimpleAppInfo.getPinyinName() == null))
      return 0;
    if (this.pinyinName == null)
      return 1;
    if (paramSimpleAppInfo.getPinyinName() == null)
      return -1;
    return this.pinyinName.compareTo(paramSimpleAppInfo.getPinyinName());
  }

  public String getAppType()
  {
    return this.appType;
  }

  public SimpleAppInfo.Icon getIcons()
  {
    return this.icons;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getPinyinName()
  {
    return this.pinyinName;
  }

  public int getStartCount()
  {
    return this.startCount;
  }

  public String getTitle()
  {
    return this.title;
  }

  public void setAppType(String paramString)
  {
    this.appType = paramString;
  }

  public void setIcons(SimpleAppInfo.Icon paramIcon)
  {
    this.icons = paramIcon;
  }

  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }

  public void setPinyinName(String paramString)
  {
    this.pinyinName = paramString;
  }

  public void setStartCount(int paramInt)
  {
    this.startCount = paramInt;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.models.SimpleAppInfo
 * JD-Core Version:    0.6.0
 */