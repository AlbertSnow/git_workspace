package com.wandoujia.p4.netcheck.model;

import java.io.Serializable;

public class NetCheckInfo$Common
  implements Serializable
{
  private String area;
  private String datetime;
  private NetCheckInfo.DnsInfo dns;
  private String ip;
  private String network;
  private String space;
  private String udid;

  public String getUdid()
  {
    return this.udid;
  }

  public void setArea(String paramString)
  {
    this.area = paramString;
  }

  public void setDatetime(String paramString)
  {
    this.datetime = paramString;
  }

  public void setDns(NetCheckInfo.DnsInfo paramDnsInfo)
  {
    this.dns = paramDnsInfo;
  }

  public void setIp(String paramString)
  {
    this.ip = paramString;
  }

  public void setNetwork(String paramString)
  {
    this.network = paramString;
  }

  public void setSpace(String paramString)
  {
    this.space = paramString;
  }

  public void setUdid(String paramString)
  {
    this.udid = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.model.NetCheckInfo.Common
 * JD-Core Version:    0.6.0
 */