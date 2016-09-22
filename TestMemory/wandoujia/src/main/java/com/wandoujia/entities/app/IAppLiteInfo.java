package com.wandoujia.entities.app;

import java.util.List;

public abstract interface IAppLiteInfo
{
  public abstract List<ApkObbInfo> getApkObbs();

  public abstract String getAppGiftCdKey();

  public abstract String getAppGiftCdKeyId();

  public abstract String getAppGiftContent();

  public abstract String getAppGiftDirections();

  public abstract long getAppGiftEndDateStamp();

  public abstract String getAppGiftExchangeDateRange();

  public abstract long getAppGiftId();

  public abstract String getAppGiftProvideType();

  public abstract String getAppGiftSubject();

  public abstract boolean getAppLiteAd();

  public abstract int getAppLiteAdType();

  public abstract boolean getAppLiteCompatible();

  public abstract String getAppLiteDescription();

  public abstract String getAppLiteDetailParam();

  public abstract String getAppLiteDisplayStatUrl();

  public abstract String getAppLiteDownloadCountStr();

  public abstract String getAppLiteDownloadUrl();

  public abstract String getAppLiteEditorComment();

  public abstract String getAppLiteGiftTitle();

  public abstract String getAppLiteIcon();

  public abstract List<String> getAppLiteIncompatibleDetail();

  public abstract boolean getAppLiteIsAward();

  public abstract int getAppLiteLikesRate();

  public abstract String getAppLiteMd5();

  public abstract String getAppLitePackageName();

  public abstract String getAppLitePaidStatus();

  public abstract int getAppLiteSize();

  public abstract String getAppLiteTitle();

  public abstract int getAppLiteVersionCode();

  public abstract String getAppLiteWeeklyDownloadCountStr();

  public abstract String getAppType();

  public abstract List<ExtensionPack> getExtensionPacks();

  public abstract String getTagline();

  public abstract List<? extends IAppLiteInfo.ITag> getTags();

  public abstract UseInfo getUseInfo();

  public abstract boolean isFreeTraffic();

  public abstract boolean isTrusted();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.IAppLiteInfo
 * JD-Core Version:    0.6.0
 */