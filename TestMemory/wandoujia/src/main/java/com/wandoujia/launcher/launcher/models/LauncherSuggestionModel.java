package com.wandoujia.launcher.launcher.models;

import com.wandoujia.entities.app.AppLiteInfo;
import java.io.Serializable;

public class LauncherSuggestionModel
  implements Serializable
{
  private AppLiteInfo appLiteInfo;
  private String packageName;
  private String reason;

  public AppLiteInfo getAppLiteInfo()
  {
    return this.appLiteInfo;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getReason()
  {
    return this.reason;
  }

  public void setAppLiteInfo(AppLiteInfo paramAppLiteInfo)
  {
    this.appLiteInfo = paramAppLiteInfo;
  }

  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }

  public void setReason(String paramString)
  {
    this.reason = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.models.LauncherSuggestionModel
 * JD-Core Version:    0.6.0
 */