package com.wandoujia.p4.model.suffix;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class AppDownload
  implements Serializable
{
  public static final String DOWNLOAD_BY_PACKAGE_NAME = "download_by_package_name";
  public static final String DOWNLOAD_BY_URL = "download_by_url";
  public String downloadType;
  public String downloadUrl;
  public String iconUrl;
  public String packageName;
  public String title;

  public void setTitle(String paramString)
  {
    try
    {
      this.title = URLDecoder.decode(paramString, "utf-8");
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
  }

  public String toString()
  {
    return "AppDownload{title='" + this.title + '\'' + ", packageName='" + this.packageName + '\'' + ", iconUrl='" + this.iconUrl + '\'' + ", downloadUrl='" + this.downloadUrl + '\'' + ", downloadType='" + this.downloadType + '\'' + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.model.suffix.AppDownload
 * JD-Core Version:    0.6.0
 */