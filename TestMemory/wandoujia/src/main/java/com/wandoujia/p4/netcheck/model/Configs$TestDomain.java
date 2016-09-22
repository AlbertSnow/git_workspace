package com.wandoujia.p4.netcheck.model;

import java.io.Serializable;
import java.util.List;

public class Configs$TestDomain
  implements Serializable
{
  private List<String> domains;
  private List<String> network;

  public List<String> getDomains()
  {
    return this.domains;
  }

  public List<String> getNetwork()
  {
    return this.network;
  }

  public void setDomains(List<String> paramList)
  {
    this.domains = paramList;
  }

  public void setNetwork(List<String> paramList)
  {
    this.network = paramList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.model.Configs.TestDomain
 * JD-Core Version:    0.6.0
 */