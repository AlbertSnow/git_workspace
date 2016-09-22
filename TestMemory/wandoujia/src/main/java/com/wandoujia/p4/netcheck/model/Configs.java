package com.wandoujia.p4.netcheck.model;

import java.io.Serializable;

public class Configs
  implements Serializable
{
  public Configs.DownloadUrls downloadurls;
  public Configs.Publics publics;
  public Configs.TestDomain testdomain;
  public String ua;

  public Configs.DownloadUrls getDownloadurls()
  {
    return this.downloadurls;
  }

  public Configs.Publics getPublics()
  {
    return this.publics;
  }

  public Configs.TestDomain getTestdomain()
  {
    return this.testdomain;
  }

  public String getUa()
  {
    return this.ua;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.model.Configs
 * JD-Core Version:    0.6.0
 */