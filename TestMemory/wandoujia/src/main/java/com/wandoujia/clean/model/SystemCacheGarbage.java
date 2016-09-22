package com.wandoujia.clean.model;

import android.text.TextUtils;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.clean.db.model.GarbageBean;
import com.wandoujia.image.ImageUri;
import com.wandoujia.image.ImageUri.ImageUriType;

public class SystemCacheGarbage
  implements Garbage
{
  private static final long serialVersionUID = 2838253874079850198L;
  private String alertInfo;
  private final LocalAppInfo appInfo;
  private String description;
  private final String filePath;
  private long id;
  private ImageUri imageUri;
  private final long size;
  private String title;

  public SystemCacheGarbage(LocalAppInfo paramLocalAppInfo, long paramLong)
  {
    this.appInfo = paramLocalAppInfo;
    this.filePath = getRelativeExternalCacheDir(paramLocalAppInfo.getPackageName());
    this.size = paramLong;
    this.id = paramLocalAppInfo.getPackageName().hashCode();
    this.imageUri = new ImageUri(paramLocalAppInfo.getPackageName(), ImageUri.ImageUriType.APP_ICON);
  }

  private static String getRelativeExternalCacheDir(String paramString)
  {
    return "/Android/data/" + paramString + "/cache";
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof SystemCacheGarbage));
    do
      return false;
    while (((SystemCacheGarbage)paramObject).getId() != getId());
    return true;
  }

  public String getAlertInfo()
  {
    return this.alertInfo;
  }

  public LocalAppInfo getAppInfo()
  {
    return this.appInfo;
  }

  public int getContentTypeId()
  {
    return 1;
  }

  public String getDescription()
  {
    return this.description;
  }

  public long getGarbageSize()
  {
    return this.size;
  }

  public GarbageType getGarbageType()
  {
    return GarbageType.SYSTEM_CACHE;
  }

  public ImageUri getIconURI()
  {
    return this.imageUri;
  }

  public long getId()
  {
    return this.id;
  }

  public String getRelativeFilePath()
  {
    return this.filePath;
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

  public void setGarbageBean(GarbageBean paramGarbageBean)
  {
    this.id = paramGarbageBean.id;
    if (!TextUtils.isEmpty(paramGarbageBean.title))
      this.title = paramGarbageBean.title;
    if (!TextUtils.isEmpty(paramGarbageBean.alertInfo))
      this.alertInfo = paramGarbageBean.alertInfo;
    if (!TextUtils.isEmpty(paramGarbageBean.desc))
      this.description = paramGarbageBean.desc;
  }

  public boolean showAction()
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.model.SystemCacheGarbage
 * JD-Core Version:    0.6.0
 */