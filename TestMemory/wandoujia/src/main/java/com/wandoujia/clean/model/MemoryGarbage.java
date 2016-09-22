package com.wandoujia.clean.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.image.ImageUri;
import com.wandoujia.image.ImageUri.ImageUriType;

public class MemoryGarbage
  implements Garbage
{
  private final String alertInfo;
  private final String appName;
  private final ImageUri iconUrl;
  private final String packageName;
  private final long size;
  private final String title;

  public MemoryGarbage(String paramString, long paramLong)
  {
    Context localContext = GlobalConfig.getAppContext();
    this.packageName = paramString;
    this.iconUrl = new ImageUri(this.packageName, ImageUri.ImageUriType.APP_ICON);
    this.size = paramLong;
    LocalAppInfo localLocalAppInfo = AppManager.a().f(paramString);
    if (localLocalAppInfo != null)
      this.appName = localLocalAppInfo.getTitle();
    while (true)
    {
      this.title = "";
      this.alertInfo = "";
      return;
      PackageInfo localPackageInfo = AppManager.a(localContext, paramString, 0);
      if (localPackageInfo != null)
      {
        this.appName = localContext.getPackageManager().getApplicationLabel(localPackageInfo.applicationInfo).toString();
        continue;
      }
      this.appName = paramString;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof MemoryGarbage));
    do
      return false;
    while (((MemoryGarbage)paramObject).getId() != getId());
    return true;
  }

  public String getAlertInfo()
  {
    return this.alertInfo;
  }

  public int getContentTypeId()
  {
    return 87;
  }

  public String getDescription()
  {
    return null;
  }

  public long getGarbageSize()
  {
    return this.size;
  }

  public GarbageType getGarbageType()
  {
    return GarbageType.MEMORY;
  }

  public ImageUri getIconURI()
  {
    return this.iconUrl;
  }

  public long getId()
  {
    return this.packageName.hashCode();
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getRelativeFilePath()
  {
    return this.packageName;
  }

  public String getSubTitle()
  {
    return null;
  }

  public String getTitle()
  {
    return this.title;
  }

  public int hashCode()
  {
    return (int)getId();
  }

  public boolean showAction()
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.model.MemoryGarbage
 * JD-Core Version:    0.6.0
 */