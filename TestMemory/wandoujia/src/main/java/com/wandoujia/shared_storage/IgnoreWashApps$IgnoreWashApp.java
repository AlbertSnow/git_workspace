package com.wandoujia.shared_storage;

import java.util.HashMap;

public class IgnoreWashApps$IgnoreWashApp extends StorageLine
{
  private HashMap<IgnoreWashApps.IgnoreType, String> ignoreMap = new HashMap();
  private String pkgName;

  public IgnoreWashApps$IgnoreWashApp()
  {
    this(null);
  }

  public IgnoreWashApps$IgnoreWashApp(String paramString)
  {
    this.pkgName = paramString;
  }

  public String getKey()
  {
    return this.pkgName;
  }

  public String getMd5(IgnoreWashApps.IgnoreType paramIgnoreType)
  {
    return (String)this.ignoreMap.get(paramIgnoreType);
  }

  public void ignore(IgnoreWashApps.IgnoreType paramIgnoreType, String paramString)
  {
    this.ignoreMap.put(paramIgnoreType, paramString);
  }

  public boolean isIgnored(IgnoreWashApps.IgnoreType paramIgnoreType)
  {
    return this.ignoreMap.containsKey(paramIgnoreType);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.IgnoreWashApps.IgnoreWashApp
 * JD-Core Version:    0.6.0
 */