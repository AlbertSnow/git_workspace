package com.wandoujia.clean.db.model;

import java.io.Serializable;

public class GarbageBean
  implements Serializable
{
  public static final int FLAG_NO_FOREGROUND_SCAN = 1;
  public static final int PATH_TYPE_AD_FOLDER = 3;
  public static final int PATH_TYPE_CACHE = 1;
  public static final int PATH_TYPE_CACHE_REG = 4;
  public static final int PATH_TYPE_SOFT_DETAIL = 5;
  public static final int PATH_TYPE_SYSTEM_CACHE = 2;
  private static final long serialVersionUID = 3214269733498724543L;
  public String alertInfo;
  public String appName;
  public int contentType;
  public boolean deleted;
  public String desc;
  public int flag;
  public int id;
  public long latestModification;
  public String pathMd5;
  public int pathType;
  public String pkgNameMd5;
  public String regPkgName;
  public String rootPathMd5;
  public String simpleAlertInfo;
  public String subPath;
  public int subPathLevel;
  public String title;

  public boolean isForegroundScan()
  {
    return (0x1 & this.flag) == 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.db.model.GarbageBean
 * JD-Core Version:    0.6.0
 */