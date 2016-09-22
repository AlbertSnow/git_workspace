package com.wandoujia.p4.netcheck.model;

import java.io.Serializable;
import java.util.List;

public class Configs$Publics
  implements Serializable
{
  private List<String> network;
  private List<List<String>> urls;

  public List<String> getNetwork()
  {
    return this.network;
  }

  public List<List<String>> getUrls()
  {
    return this.urls;
  }

  public void setNetwork(List<String> paramList)
  {
    this.network = paramList;
  }

  public void setUrls(List<List<String>> paramList)
  {
    this.urls = paramList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.model.Configs.Publics
 * JD-Core Version:    0.6.0
 */