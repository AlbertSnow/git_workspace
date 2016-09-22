package com.wandoujia.appmanager;

import android.text.TextUtils;
import com.wandoujia.appmanager.model.MarketAppInfo.ImportantUpgradeInfo;
import com.wandoujia.appmanager.model.MarketAppInfo.NotRecommendReason;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import com.wandoujia.push.protocol.NotificationModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LocalAppInfo$UpgradeInfo
  implements Serializable
{
  private static final long serialVersionUID = 7695403925137431389L;
  String appType;
  String changeLog;
  String detailUrl;
  int downloadCount;
  String fullMD5;
  long fullSize;
  String fullUrl;
  boolean hasPatch;
  int importantLevel;
  MarketAppInfo.ImportantUpgradeInfo importantUpdate;
  long lastModified;
  String lastModifiedTime;
  String market;
  MarketAppInfo.NotRecommendReason notRecommendReason;
  NotificationModel notificationModel;
  String patchMD5;
  long patchSize;
  String patchUrl;
  String recommendedType;
  boolean superior;
  LocalAppInfo.UpgradeType upgradeType = LocalAppInfo.UpgradeType.NONE;
  List<String> upgradeTypes = new ArrayList();
  int versionCode;
  String versionName;

  public static UpgradeInfo parseFromJson(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    c localc = new c();
    try
    {
      UpgradeInfo localUpgradeInfo = (UpgradeInfo)localc.a(paramString, new at().getType());
      return localUpgradeInfo;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
      if (GlobalConfig.isDebug())
        throw localJsonSyntaxException;
    }
    catch (Error localError)
    {
      return null;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      label52: break label52;
    }
  }

  public String getAppType()
  {
    return this.appType;
  }

  public String getChangeLog()
  {
    return this.changeLog;
  }

  public String getDetailUrl()
  {
    return this.detailUrl;
  }

  public int getDownloadCount()
  {
    return this.downloadCount;
  }

  public String getFullMD5()
  {
    return this.fullMD5;
  }

  public long getFullSize()
  {
    return this.fullSize;
  }

  public String getFullUrl()
  {
    return this.fullUrl;
  }

  public int getImportantLevel()
  {
    return this.importantLevel;
  }

  public MarketAppInfo.ImportantUpgradeInfo getImportantUpdate()
  {
    return this.importantUpdate;
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

  public String getPatchMD5()
  {
    return this.patchMD5;
  }

  public long getPatchSize()
  {
    return this.patchSize;
  }

  public String getPatchUrl()
  {
    return this.patchUrl;
  }

  public String getRecommendedType()
  {
    return this.recommendedType;
  }

  public LocalAppInfo.UpgradeType getUpgradeType()
  {
    return this.upgradeType;
  }

  public List<String> getUpgradeTypes()
  {
    return this.upgradeTypes;
  }

  public int getVersionCode()
  {
    return this.versionCode;
  }

  public String getVersionName()
  {
    return this.versionName;
  }

  public boolean hasPatch()
  {
    return this.hasPatch;
  }

  public boolean isImportantUpdate()
  {
    return this.importantUpdate != null;
  }

  public boolean isPatchUpgradable()
  {
    return (!TextUtils.isEmpty(this.patchUrl)) && (this.patchSize > 0L);
  }

  public boolean isSuperior()
  {
    return this.superior;
  }

  public void setAppType(String paramString)
  {
    this.appType = paramString;
  }

  public void setUpgradeType(LocalAppInfo.UpgradeType paramUpgradeType)
  {
    this.upgradeType = paramUpgradeType;
  }

  public void setUpgradeTypes(String paramString)
  {
    this.upgradeTypes.add(paramString);
  }

  public String toJson()
  {
    c localc = new c();
    try
    {
      String str = localc.a(this, new as().getType());
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo
 * JD-Core Version:    0.6.0
 */