package com.wandoujia.p4.model;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import java.io.Serializable;

public class CampaignDownloadInfo
  implements Serializable
{
  private static final long serialVersionUID = 169010654395272236L;
  public String contentType;
  public long currentBytes;
  public String extras;
  public String filePath;
  public String iconUrl;
  public String id;
  public String identity;
  public boolean isVisible;
  public long speed;
  public String status;
  public String title;
  public long totalBytes;
  public String url;

  public static CampaignDownloadInfo from(DownloadInfo paramDownloadInfo)
  {
    CampaignDownloadInfo localCampaignDownloadInfo = new CampaignDownloadInfo();
    localCampaignDownloadInfo.id = paramDownloadInfo.a;
    localCampaignDownloadInfo.url = paramDownloadInfo.d.a.b;
    localCampaignDownloadInfo.title = paramDownloadInfo.f;
    localCampaignDownloadInfo.totalBytes = paramDownloadInfo.d.d;
    localCampaignDownloadInfo.status = paramDownloadInfo.c.name();
    localCampaignDownloadInfo.contentType = paramDownloadInfo.e.name();
    localCampaignDownloadInfo.identity = paramDownloadInfo.b;
    localCampaignDownloadInfo.iconUrl = paramDownloadInfo.g;
    localCampaignDownloadInfo.filePath = paramDownloadInfo.d.a.e;
    localCampaignDownloadInfo.isVisible = paramDownloadInfo.h;
    localCampaignDownloadInfo.currentBytes = paramDownloadInfo.d.e;
    localCampaignDownloadInfo.speed = paramDownloadInfo.d.f;
    localCampaignDownloadInfo.extras = paramDownloadInfo.q;
    return localCampaignDownloadInfo;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.model.CampaignDownloadInfo
 * JD-Core Version:    0.6.0
 */