package com.wandoujia.entities.app;

import java.io.Serializable;
import java.util.List;

public class TagAppsInfo
  implements Serializable
{
  private List<AppLiteInfo> apps = null;
  private TagInfo category = new TagInfo();

  public List<AppLiteInfo> getApps()
  {
    return this.apps;
  }

  public TagInfo getCategory()
  {
    return this.category;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.TagAppsInfo
 * JD-Core Version:    0.6.0
 */