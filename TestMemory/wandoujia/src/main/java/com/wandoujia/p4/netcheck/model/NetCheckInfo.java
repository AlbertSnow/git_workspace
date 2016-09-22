package com.wandoujia.p4.netcheck.model;

import java.io.Serializable;
import java.util.List;

public class NetCheckInfo
  implements Serializable
{
  private NetCheckInfo.Common common;
  private List<NetCheckInfo.Infos> download;
  private List<NetCheckInfo.Infos> ping;
  private List<NetCheckInfo.Infos> publics;
  private List<NetCheckInfo.Infos> tcp;
  private List<NetCheckInfo.Infos> traceroute;

  public void setCommon(NetCheckInfo.Common paramCommon)
  {
    this.common = paramCommon;
  }

  public void setDownload(List<NetCheckInfo.Infos> paramList)
  {
    this.download = paramList;
  }

  public void setPing(List<NetCheckInfo.Infos> paramList)
  {
    this.ping = paramList;
  }

  public void setPublics(List<NetCheckInfo.Infos> paramList)
  {
    this.publics = paramList;
  }

  public void setTcp(List<NetCheckInfo.Infos> paramList)
  {
    this.tcp = paramList;
  }

  public void setTraceroute(List<NetCheckInfo.Infos> paramList)
  {
    this.traceroute = paramList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.model.NetCheckInfo
 * JD-Core Version:    0.6.0
 */