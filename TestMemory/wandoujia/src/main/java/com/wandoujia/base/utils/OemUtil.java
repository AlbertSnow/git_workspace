package com.wandoujia.base.utils;

import android.content.SharedPreferences.Editor;
import android.os.Looper;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.sntp.SntpClient;

public class OemUtil
{
  private static final String SHARED_PREFERENCE_KEY = "sntp_pref";
  private static final String SNTP_KEY = "sntp";
  private static boolean autoCheckAppUpgrade;
  private static boolean canCreateShortCut;
  private static boolean canShowAutoInstall;
  private static boolean canShowComputerConnection;
  private static boolean deleteApkAfterInstall;
  private static boolean enableAlertUpdate;
  private static boolean enableBatteryNotification;
  private static boolean enableCleanNotification;
  private static boolean enablePushNotification;
  private static boolean isOem;
  private static boolean isPaid;
  private static long lastSntpTime = 0L;
  private static boolean showFeedbackEntry;
  private static boolean showRootInstall;
  private static long sntpOutTimeDays;

  static
  {
    isOem = false;
    isPaid = false;
    showFeedbackEntry = true;
    canCreateShortCut = true;
    canShowComputerConnection = true;
    canShowAutoInstall = true;
    enableAlertUpdate = true;
    showRootInstall = false;
    deleteApkAfterInstall = true;
    enablePushNotification = true;
    enableBatteryNotification = true;
    enableCleanNotification = true;
    autoCheckAppUpgrade = true;
    sntpOutTimeDays = 30L;
  }

  public static boolean canCreateShortcut()
  {
    return (!isOem()) || (canCreateShortCut);
  }

  public static boolean canShowAutoInstall()
  {
    return (!isOem()) || (canShowAutoInstall);
  }

  public static boolean canShowComputerConnection()
  {
    return (!isOem()) || (canShowComputerConnection);
  }

  public static boolean canShowFeedbackEntry()
  {
    return (!isOem()) || (showFeedbackEntry);
  }

  public static boolean deleteApkAfterInstall()
  {
    return (!isOem()) || (deleteApkAfterInstall);
  }

  public static boolean enableAlertUpdate()
  {
    return (!isOem()) || (enableAlertUpdate);
  }

  public static boolean enableAutoCheckAppUpgrade()
  {
    return (!isOem()) || (autoCheckAppUpgrade);
  }

  public static boolean enableBatteryNotification()
  {
    return (!isOem()) || (enableBatteryNotification);
  }

  public static boolean enableCleanNotification()
  {
    return (!isOem()) || (enableCleanNotification);
  }

  public static boolean enablePushNotification()
  {
    return (!isOem()) || (enablePushNotification);
  }

  public static void ensureSntpTimeIsSet()
  {
    if (getInitSntpTime() == 0L)
      initSntpTime();
  }

  public static long getCurrentSntpTime()
  {
    long l;
    if (GlobalConfig.isDebug())
      l = System.currentTimeMillis();
    do
    {
      return l;
      l = SntpClient.currentTimeInMillis();
    }
    while (SntpClient.sntpSuccess());
    return 0L;
  }

  public static long getInitSntpTime()
  {
    return Preferences.getById(GlobalConfig.getAppContext(), "sntp_pref").getLong("sntp", 0L);
  }

  public static long getSntpDeviceInstalledTime()
  {
    ensureSntpTimeIsSet();
    long l = getCurrentSntpTime();
    if (l == 0L)
      return l;
    return l - getInitSntpTime();
  }

  public static long getSntpTimeToOut()
  {
    if ((Looper.getMainLooper() == Looper.myLooper()) && (lastSntpTime == 0L))
      return 0L;
    if (lastSntpTime == 0L)
      lastSntpTime = getSntpDeviceInstalledTime();
    if (lastSntpTime == 0L)
      return lastSntpTime;
    return sntpOutTimeDays * DateUtil.DAY - lastSntpTime;
  }

  private static void initSntpTime()
  {
    Preferences.getById(GlobalConfig.getAppContext(), "sntp_pref").edit().putLong("sntp", getCurrentSntpTime()).commit();
  }

  public static boolean isAllowCreateShortcut()
  {
    if (isOem())
      return canCreateShortcut();
    return (!isPaid()) || (isSntpTimeOut());
  }

  public static boolean isOem()
  {
    return isOem;
  }

  public static boolean isOemOrPaid()
  {
    return (isOem()) || (isPaid());
  }

  public static boolean isPaid()
  {
    return isPaid;
  }

  public static boolean isSntpTimeOut()
  {
    if ((Looper.getMainLooper() == Looper.myLooper()) && (lastSntpTime == 0L));
    do
    {
      return false;
      if (lastSntpTime != 0L)
        continue;
      lastSntpTime = getSntpDeviceInstalledTime();
    }
    while ((lastSntpTime == 0L) || (lastSntpTime <= sntpOutTimeDays * DateUtil.DAY));
    return true;
  }

  public static void setAutoCheckAppUpgrade(boolean paramBoolean)
  {
    autoCheckAppUpgrade = paramBoolean;
  }

  public static void setCanCreateShortCut(boolean paramBoolean)
  {
    canCreateShortCut = paramBoolean;
  }

  public static void setCanShowAutoInstall(boolean paramBoolean)
  {
    canShowAutoInstall = paramBoolean;
  }

  public static void setCanShowComputerConnection(boolean paramBoolean)
  {
    canShowComputerConnection = paramBoolean;
  }

  public static void setDeleteApkAfterInstall(boolean paramBoolean)
  {
    deleteApkAfterInstall = paramBoolean;
  }

  public static void setEnableAlertUpdate(boolean paramBoolean)
  {
    enableAlertUpdate = paramBoolean;
  }

  public static void setEnableBatteryNotification(boolean paramBoolean)
  {
    enableBatteryNotification = paramBoolean;
  }

  public static void setEnableCleanNotification(boolean paramBoolean)
  {
    enableCleanNotification = paramBoolean;
  }

  public static void setEnablePushNotification(boolean paramBoolean)
  {
    enablePushNotification = paramBoolean;
  }

  public static void setIsOem(boolean paramBoolean)
  {
    isOem = paramBoolean;
  }

  public static void setIsPaid(boolean paramBoolean)
  {
    isPaid = paramBoolean;
  }

  public static void setShowFeedbackEntry(boolean paramBoolean)
  {
    showFeedbackEntry = paramBoolean;
  }

  public static void setShowRootInstall(boolean paramBoolean)
  {
    showRootInstall = paramBoolean;
  }

  public static void setSntpOutTimeDays(long paramLong)
  {
    sntpOutTimeDays = paramLong;
  }

  public static boolean showRootInstall()
  {
    return (isOem()) && (showRootInstall);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.OemUtil
 * JD-Core Version:    0.6.0
 */