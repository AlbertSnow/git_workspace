package com.wandoujia.appmanager;

import android.text.TextUtils;
import com.wandoujia.appmanager.model.MarketAppInfo.ImportantUpgradeInfo;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class LocalAppInfo
  implements Serializable, Cloneable
{
  private static final long serialVersionUID = -2613862092095115839L;
  String allSignatures;
  String dataDir;
  long firstInstallTime;
  boolean isInstalledInternal;
  boolean isMovable;
  boolean isSystemApp;
  boolean isUpgradeIgnored;
  long lastUpdateTime;
  String md5;
  String packageInstaller;
  String packageName;
  LocalAppInfo.PreferredInstallLocation preferredInstallLocation;
  int showIndex;
  String signature;
  long size;
  String sourceDir;
  String title;
  String titlePinyinFirstChar;
  LocalAppInfo.UpgradeInfo upgradeInfo;
  int versionCode;
  String versionName;

  public static int compareByUpgradeable(LocalAppInfo paramLocalAppInfo1, LocalAppInfo paramLocalAppInfo2, String paramString)
  {
    int i = -1;
    boolean bool1 = paramLocalAppInfo1.isImportantUpgradable();
    boolean bool2 = paramLocalAppInfo2.isImportantUpgradable();
    if ((bool1) && (bool2))
      if (paramString == null)
        i = Long.signum(paramLocalAppInfo2.getUpgradeInfo().getImportantUpdate().getStartTime() - paramLocalAppInfo1.getUpgradeInfo().getImportantUpdate().getStartTime());
    do
    {
      do
        return i;
      while (paramLocalAppInfo1.getPackageName().equals(paramString));
      if (paramLocalAppInfo2.getPackageName().equals(paramString))
        return 1;
      return Long.signum(paramLocalAppInfo2.getUpgradeInfo().getImportantUpdate().getStartTime() - paramLocalAppInfo1.getUpgradeInfo().getImportantUpdate().getStartTime());
    }
    while (bool1);
    if (bool2)
      return 1;
    return Long.signum(paramLocalAppInfo2.getUpgradeInfo().getLastModified() - paramLocalAppInfo1.getUpgradeInfo().getLastModified());
  }

  public LocalAppInfo clone()
  {
    LocalAppInfo localLocalAppInfo = new LocalAppInfo();
    localLocalAppInfo.title = this.title;
    localLocalAppInfo.titlePinyinFirstChar = this.titlePinyinFirstChar;
    localLocalAppInfo.packageName = this.packageName;
    localLocalAppInfo.md5 = this.md5;
    localLocalAppInfo.size = this.size;
    localLocalAppInfo.versionName = this.versionName;
    localLocalAppInfo.versionCode = this.versionCode;
    localLocalAppInfo.isMovable = this.isMovable;
    localLocalAppInfo.isUpgradeIgnored = this.isUpgradeIgnored;
    localLocalAppInfo.isSystemApp = this.isSystemApp;
    localLocalAppInfo.upgradeInfo = this.upgradeInfo;
    localLocalAppInfo.sourceDir = this.sourceDir;
    localLocalAppInfo.signature = this.signature;
    localLocalAppInfo.allSignatures = this.allSignatures;
    localLocalAppInfo.preferredInstallLocation = this.preferredInstallLocation;
    localLocalAppInfo.dataDir = this.dataDir;
    localLocalAppInfo.lastUpdateTime = this.lastUpdateTime;
    localLocalAppInfo.isInstalledInternal = this.isInstalledInternal;
    localLocalAppInfo.showIndex = this.showIndex;
    return localLocalAppInfo;
  }

  public String getAllSignatures()
  {
    return this.allSignatures;
  }

  public String getDataDir()
  {
    return this.dataDir;
  }

  public long getFirstInstallTime()
  {
    return this.firstInstallTime;
  }

  public int getImportantLevel()
  {
    if (this.upgradeInfo == null)
      return 0;
    return this.upgradeInfo.getImportantLevel();
  }

  public int getIndex()
  {
    return this.showIndex;
  }

  public long getLastUpdateTime()
  {
    return this.lastUpdateTime;
  }

  public String getMD5()
  {
    return this.md5;
  }

  public String getPackageInstaller()
  {
    return this.packageInstaller;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public LocalAppInfo.PreferredInstallLocation getPreferredInstallLocation()
  {
    return this.preferredInstallLocation;
  }

  public String getSignature()
  {
    return this.signature;
  }

  public long getSize()
  {
    return this.size;
  }

  public String getSourceDir()
  {
    return this.sourceDir;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getTitlePinyinFirstChar()
  {
    return this.titlePinyinFirstChar;
  }

  public LocalAppInfo.UpgradeInfo getUpgradeInfo()
  {
    return this.upgradeInfo;
  }

  public LocalAppInfo.UpgradeType getUpgradeType()
  {
    if (this.upgradeInfo == null)
      return LocalAppInfo.UpgradeType.NONE;
    return this.upgradeInfo.getUpgradeType();
  }

  public List<String> getUpgradeTypes()
  {
    if (this.upgradeInfo == null)
      return null;
    return this.upgradeInfo.getUpgradeTypes();
  }

  public int getVersionCode()
  {
    return this.versionCode;
  }

  public String getVersionName()
  {
    return this.versionName;
  }

  public boolean isImportantUpgradable()
  {
    if (this.upgradeInfo == null);
    MarketAppInfo.ImportantUpgradeInfo localImportantUpgradeInfo;
    Calendar localCalendar;
    do
    {
      do
      {
        return false;
        localImportantUpgradeInfo = this.upgradeInfo.getImportantUpdate();
      }
      while (localImportantUpgradeInfo == null);
      localCalendar = Calendar.getInstance(Locale.CHINA);
      localCalendar.set(11, 0);
      localCalendar.set(12, 0);
      localCalendar.set(13, 0);
      localCalendar.set(14, 0);
    }
    while (localImportantUpgradeInfo.getExpireTime() < localCalendar.getTimeInMillis());
    return true;
  }

  public boolean isInstalledInternal()
  {
    return this.isInstalledInternal;
  }

  public boolean isMovable()
  {
    return this.isMovable;
  }

  public boolean isNotRecommendedUpgradable()
  {
    if (this.upgradeInfo == null)
      return false;
    return TextUtils.equals(this.upgradeInfo.getRecommendedType(), "NOT_RECOMMEND");
  }

  public boolean isRecommendedUpgradable()
  {
    if (this.upgradeInfo == null);
    String str;
    do
    {
      return false;
      str = this.upgradeInfo.getRecommendedType();
    }
    while ((!TextUtils.equals(str, "STRONG_RECOMMEND")) && (!TextUtils.equals(str, "WARNNING")));
    return true;
  }

  public boolean isSystemApp()
  {
    return this.isSystemApp;
  }

  public boolean isUpgradable()
  {
    return this.upgradeInfo != null;
  }

  public boolean isUpgradeIgnored()
  {
    return this.isUpgradeIgnored;
  }

  public void setIndex(int paramInt)
  {
    this.showIndex = paramInt;
  }

  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setTitlePinyinFirstChar(String paramString)
  {
    this.titlePinyinFirstChar = paramString;
  }

  public void setUpgradeType(LocalAppInfo.UpgradeType paramUpgradeType)
  {
    if (this.upgradeInfo == null)
      return;
    this.upgradeInfo.setUpgradeType(paramUpgradeType);
  }

  public void setUpgradeTypes(String paramString)
  {
    if (this.upgradeInfo == null)
      return;
    this.upgradeInfo.setUpgradeTypes(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.LocalAppInfo
 * JD-Core Version:    0.6.0
 */