package com.wandoujia.p4.gift.http.model;

import com.wandoujia.entities.app.IconSet;
import java.io.Serializable;

public class GiftInfo$GiftDetail
  implements Serializable
{
  private String appName;
  private String cdkey;
  private String content;
  private String dateRange;
  private String directions;
  private String downloadUrls;
  private String endDate;
  private long endDateStamp;
  private String exchangeDateRange;
  private String giftType;
  private String giftValue;
  private IconSet icons;
  private long id;
  private boolean isReceived;
  private String packageName;
  private String provideType;
  private Integer receivedCount;
  private Integer remnantCount;
  private String startDate;
  private String subject;

  public String getAppName()
  {
    return this.appName;
  }

  public String getCdkey()
  {
    return this.cdkey;
  }

  public String getContent()
  {
    return this.content;
  }

  public String getDateRange()
  {
    return this.dateRange;
  }

  public String getDirections()
  {
    return this.directions;
  }

  public String getDownloadUrls()
  {
    return this.downloadUrls;
  }

  public String getEndDate()
  {
    return this.endDate;
  }

  public long getEndDateStamp()
  {
    return this.endDateStamp;
  }

  public String getExchangeDateRange()
  {
    return this.exchangeDateRange;
  }

  public String getGiftType()
  {
    return this.giftType;
  }

  public String getGiftValue()
  {
    return this.giftValue;
  }

  public IconSet getIcons()
  {
    return this.icons;
  }

  public long getId()
  {
    return this.id;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getProvideType()
  {
    return this.provideType;
  }

  public Integer getReceivedCount()
  {
    return this.receivedCount;
  }

  public Integer getRemnantCount()
  {
    return this.remnantCount;
  }

  public String getStartDate()
  {
    return this.startDate;
  }

  public String getSubject()
  {
    return this.subject;
  }

  public boolean isReceived()
  {
    return this.isReceived;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.model.GiftInfo.GiftDetail
 * JD-Core Version:    0.6.0
 */