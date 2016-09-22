package com.wandoujia.appmanager.model;

import android.text.Html;
import android.text.TextUtils;
import com.wandoujia.base.utils.JsonSerializer;
import com.wandoujia.gson.c;
import com.wandoujia.push.protocol.NotificationModel;
import java.io.Serializable;
import org.json.JSONObject;

public class MarketAppInfo
  implements Serializable
{
  public static final String REASON_HAS_POP_ADS = "HAS_POP_ADS";
  public static final String REASON_NOT_SUPERIOR = "NOT_SUPERIOR";
  public static final String REASON_SIGNATURE_NOT_MATCH = "SIGNATURE_NOT_MATCH";
  public static final String REASON_SIGNATURE_NOT_OFFICIAL = "SIGNATURE_NOT_OFFICIAL";
  public static final String REASON_SIGNATURE_OFFICICAL_UNKNOWN = "SIGNATURE_OFFICICAL_UNKNOWN";
  public static final String TYPE_NOT_RECOMMEND = "NOT_RECOMMEND";
  public static final String TYPE_STRONG_RECOMMEND = "STRONG_RECOMMEND";
  public static final String TYPE_WARNNING = "WARNNING";
  private String changeLog;
  private String detailUrl;
  private String developer;
  private String downloadCnt;
  private String downloadUrl;
  private String fileMd5;
  private boolean hasPatch = false;
  private String iconPath;
  int importantLevel;
  private MarketAppInfo.ImportantUpgradeInfo importantUpdate;
  private boolean isCerStrMatch = false;
  private long lastModified;
  private String lastModifiedTime;
  private String market;
  private MarketAppInfo.NotRecommendReason notRecommendReason;
  private NotificationModel notificationModel;
  private String packageName;
  private String patchMd5;
  private int patchSize;
  private String patchURL;
  private String recommendedType;
  private int showIndex;
  private String size;
  private boolean superior;
  private String title;
  private String versionCode;
  private String versionName;

  public static MarketAppInfo parseFromJson(String paramString)
  {
    return (MarketAppInfo)JsonSerializer.fromJson(paramString, MarketAppInfo.class);
  }

  public static MarketAppInfo parseFromJsonObj(JSONObject paramJSONObject)
  {
    MarketAppInfo localMarketAppInfo = (MarketAppInfo)JsonSerializer.fromJsonObject(paramJSONObject, MarketAppInfo.class);
    try
    {
      String str = paramJSONObject.getString("notificationModel");
      localNotificationModel = (NotificationModel)new c().a(str, NotificationModel.class);
      if (localNotificationModel != null)
        localMarketAppInfo.setNotificationModel(localNotificationModel);
      return localMarketAppInfo;
    }
    catch (Exception localException)
    {
      while (true)
        NotificationModel localNotificationModel = null;
    }
  }

  public String getChangeLog()
  {
    if (!TextUtils.isEmpty(this.changeLog))
      this.changeLog = Html.fromHtml(this.changeLog).toString();
    return this.changeLog;
  }

  public String getDetailUrl()
  {
    return this.detailUrl;
  }

  public String getDeveloper()
  {
    return this.developer;
  }

  public String getDownloadCount()
  {
    return this.downloadCnt;
  }

  public String getDownloadUrl()
  {
    return this.downloadUrl;
  }

  public String getFileMd5()
  {
    return this.fileMd5;
  }

  public String getIconPath()
  {
    return this.iconPath;
  }

  public int getImportantLevel()
  {
    return this.importantLevel;
  }

  public MarketAppInfo.ImportantUpgradeInfo getImportantUpdate()
  {
    return this.importantUpdate;
  }

  public int getIndex()
  {
    return this.showIndex;
  }

  public long getLastModified()
  {
    return this.lastModified;
  }

  public String getLastModifiedTime()
  {
    return this.lastModifiedTime;
  }

  public String getMarket()
  {
    return this.market;
  }

  public MarketAppInfo.NotRecommendReason getNotRecommendReason()
  {
    return this.notRecommendReason;
  }

  public NotificationModel getNotificationModel()
  {
    return this.notificationModel;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public String getPatchMd5()
  {
    return this.patchMd5;
  }

  public int getPatchSize()
  {
    return this.patchSize;
  }

  public String getPatchURL()
  {
    return this.patchURL;
  }

  public String getRecommendedType()
  {
    return this.recommendedType;
  }

  public String getSize()
  {
    return this.size;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getVersionCode()
  {
    return this.versionCode;
  }

  public String getVersionName()
  {
    return this.versionName;
  }

  public boolean isCerStrMatch()
  {
    return this.isCerStrMatch;
  }

  public boolean isHasPatch()
  {
    return this.hasPatch;
  }

  public boolean isSuperior()
  {
    return this.superior;
  }

  public void setIndex(int paramInt)
  {
    this.showIndex = paramInt;
  }

  public void setNotificationModel(NotificationModel paramNotificationModel)
  {
    this.notificationModel = paramNotificationModel;
  }

  public void setRecommendedType(String paramString)
  {
    this.recommendedType = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.model.MarketAppInfo
 * JD-Core Version:    0.6.0
 */