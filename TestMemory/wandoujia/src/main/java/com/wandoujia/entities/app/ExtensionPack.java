package com.wandoujia.entities.app;

import java.io.Serializable;

public class ExtensionPack
  implements Serializable
{
  private String filepath;
  private String humansize;
  private String pf5;
  private long size;
  private int type;
  private String url;
  private int versionCode;

  public String getFilepath()
  {
    return this.filepath;
  }

  public long getSize()
  {
    return this.size;
  }

  public int getType()
  {
    return this.type;
  }

  public String getUrl()
  {
    return this.url;
  }

  public int getVersionCode()
  {
    return this.versionCode;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.ExtensionPack
 * JD-Core Version:    0.6.0
 */