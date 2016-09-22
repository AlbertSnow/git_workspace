package com.wandoujia.entities.app;

import java.util.List;

public abstract interface IAppDetailInfo
{
  public abstract int getAdType();

  public abstract List<ApkObbInfo> getApkObbs();

  public abstract boolean getAppDetailCompatible();

  public abstract String getAppDetailDownloadUrl();

  public abstract String getAppDetailIcon();

  public abstract List<String> getAppDetailIncompatibleDetail();

  public abstract String getAppDetailMd5();

  public abstract String getAppDetailPackageName();

  public abstract String getAppDetailPaidStatus();

  public abstract int getAppDetailSize();

  public abstract String getAppDetailTitle();

  public abstract int getAppDetailVersionCode();

  public abstract String getAppLiteDetailParam();

  public abstract String getAppLiteDisplayStatUrl();

  public abstract List<ExtensionPack> getExtensionPacks();

  public abstract List<? extends IAppDetailInfo.ITag> getTags();

  public abstract boolean isAd();

  public abstract boolean isFreeTraffic();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.IAppDetailInfo
 * JD-Core Version:    0.6.0
 */