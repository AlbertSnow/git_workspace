package com.wandoujia.p4.gift.http.model;

import com.wandoujia.api.proto.GiftDetail;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.p4.app.button.model.AppModelWrapper;
import com.wandoujia.p4.app.button.model.a;
import java.io.Serializable;

public class GiftModel
  implements BaseModel, Serializable
{
  AppModelWrapper appModelWrapper;
  String cdkey;
  String cdkeyId;
  String description;
  String directions;
  private long endDateStamp;
  String exchangeDateRange;
  private GiftModel.GiftViewType giftViewType;
  long id;
  boolean isReceived;
  String packageName;
  private String provideType;
  int receivedCount;
  int remnantCount;
  String specialAction;
  String title;

  public GiftModel()
  {
  }

  public GiftModel(GiftDetail paramGiftDetail)
  {
    this.packageName = paramGiftDetail.package_name;
    this.cdkey = paramGiftDetail.cdkey;
    this.id = paramGiftDetail.id.longValue();
    this.specialAction = paramGiftDetail.special_action;
    this.title = paramGiftDetail.title;
    this.description = paramGiftDetail.description;
    this.isReceived = paramGiftDetail.is_received.booleanValue();
    this.provideType = paramGiftDetail.provide_type;
  }

  public a getAppModel()
  {
    if (this.appModelWrapper == null)
      return null;
    return this.appModelWrapper.getAppModel();
  }

  public String getCdkey()
  {
    return this.cdkey;
  }

  public String getCdkeyId()
  {
    return this.cdkeyId;
  }

  public String getDescription()
  {
    return this.description;
  }

  public String getDirections()
  {
    return this.directions;
  }

  public long getEndDateStamp()
  {
    return this.endDateStamp;
  }

  public String getExchangeDateRange()
  {
    return this.exchangeDateRange;
  }

  public GiftModel.GiftViewType getGiftViewType()
  {
    return this.giftViewType;
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

  public int getReceivedCount()
  {
    return this.receivedCount;
  }

  public int getRemnantCount()
  {
    return this.remnantCount;
  }

  public String getSpecialAction()
  {
    return this.specialAction;
  }

  public String getTitle()
  {
    return this.title;
  }

  public boolean isReceived()
  {
    return this.isReceived;
  }

  public void setAppModelWrapper(AppModelWrapper paramAppModelWrapper)
  {
    this.appModelWrapper = paramAppModelWrapper;
  }

  public GiftModel setCdkey(String paramString)
  {
    this.cdkey = paramString;
    return this;
  }

  public void setCdkeyId(String paramString)
  {
    this.cdkeyId = paramString;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setDirections(String paramString)
  {
    this.directions = paramString;
  }

  public void setEndDateStamp(long paramLong)
  {
    this.endDateStamp = paramLong;
  }

  public void setExchangeDateRange(String paramString)
  {
    this.exchangeDateRange = paramString;
  }

  public GiftModel setGiftViewType(GiftModel.GiftViewType paramGiftViewType)
  {
    this.giftViewType = paramGiftViewType;
    return this;
  }

  public void setId(long paramLong)
  {
    this.id = paramLong;
  }

  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }

  public void setProvideType(String paramString)
  {
    this.provideType = paramString;
  }

  public GiftModel setReceived(boolean paramBoolean)
  {
    this.isReceived = paramBoolean;
    return this;
  }

  public void setReceivedCount(int paramInt)
  {
    this.receivedCount = paramInt;
  }

  public void setRemnantCount(int paramInt)
  {
    this.remnantCount = paramInt;
  }

  public void setSpecialAction(String paramString)
  {
    this.specialAction = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.model.GiftModel
 * JD-Core Version:    0.6.0
 */