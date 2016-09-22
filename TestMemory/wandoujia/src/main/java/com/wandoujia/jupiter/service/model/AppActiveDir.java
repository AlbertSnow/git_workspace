package com.wandoujia.jupiter.service.model;

import java.io.Serializable;
import java.util.List;

public class AppActiveDir
  implements Serializable
{
  private List<String> dirs;
  private long expired;
  private String pn;

  public List<String> getDirs()
  {
    return this.dirs;
  }

  public long getExpired()
  {
    return this.expired;
  }

  public String getPn()
  {
    return this.pn;
  }

  public void setDirs(List<String> paramList)
  {
    this.dirs = paramList;
  }

  public void setExpired(long paramLong)
  {
    this.expired = paramLong;
  }

  public void setPn(String paramString)
  {
    this.pn = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.model.AppActiveDir
 * JD-Core Version:    0.6.0
 */