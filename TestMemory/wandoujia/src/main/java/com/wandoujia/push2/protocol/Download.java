package com.wandoujia.push2.protocol;

import com.wandoujia.gson.a.a;
import java.io.Serializable;

public class Download
  implements Serializable
{
  public static final int FLAG_ALLOW_IN_MOBILE = 2;
  public static final int FLAG_AUTO_INSTALL = 4;
  public static final int FLAG_PRE_DOWNLOAD = 1;

  @a(a="detail")
  private String detail;

  @a(a="flag")
  private int flag;

  @a(a="icon")
  private String icon;

  @a(a="package_name")
  private String packageName;

  @a(a="title")
  private String title;

  @a(a="type")
  private String type;

  @a(a="url")
  private String url;

  public boolean allowInMobile()
  {
    return (0x2 & this.flag) != 0;
  }

  public boolean autoInstall()
  {
    return (0x4 & this.flag) != 0;
  }

  public String getDetail()
  {
    return this.detail;
  }

  public int getFlag()
  {
    return this.flag;
  }

  public String getIcon()
  {
    return this.icon;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getType()
  {
    return this.type;
  }

  public String getUrl()
  {
    return this.url;
  }

  public boolean isPreDownload()
  {
    return (0x1 & this.flag) != 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.Download
 * JD-Core Version:    0.6.0
 */