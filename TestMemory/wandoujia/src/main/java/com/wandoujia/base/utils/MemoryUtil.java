package com.wandoujia.base.utils;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MemoryUtil
{
  public static final int BUFFER_SIZE = 8192;
  public static final int FULL_PERCENT = 100;
  private static final long KB = 1024L;
  public static final long MB = 1048576L;
  private static final String MEMINFO_FILE = "/proc/meminfo";
  private static final String WANDOUJIA = "com.wandoujia";

  public static Set<String> findAllRunningPackage(Context paramContext)
  {
    HashSet localHashSet = new HashSet();
    if (Build.VERSION.SDK_INT < 21)
    {
      List localList2 = getRunningProcessInfo(paramContext);
      if (!CollectionUtils.isEmpty(localList2))
      {
        Iterator localIterator2 = localList2.iterator();
        while (localIterator2.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator2.next();
          if ((localRunningAppProcessInfo == null) || (localRunningAppProcessInfo.pkgList == null) || (localRunningAppProcessInfo.importance < 300))
            continue;
          Collections.addAll(localHashSet, localRunningAppProcessInfo.pkgList);
        }
      }
    }
    else
    {
      List localList1 = getRunningServiceInfo(paramContext);
      if (!CollectionUtils.isEmpty(localList1))
      {
        Iterator localIterator1 = localList1.iterator();
        while (localIterator1.hasNext())
        {
          ActivityManager.RunningServiceInfo localRunningServiceInfo = (ActivityManager.RunningServiceInfo)localIterator1.next();
          if (localRunningServiceInfo.service == null)
            continue;
          localHashSet.add(localRunningServiceInfo.service.getPackageName());
        }
      }
    }
    return localHashSet;
  }

  public static long getAvailMemory(Context paramContext)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if (localActivityManager == null)
      return 0L;
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    localActivityManager.getMemoryInfo(localMemoryInfo);
    return localMemoryInfo.availMem / 1048576L;
  }

  public static List<ActivityManager.RunningAppProcessInfo> getRunningProcessInfo(Context paramContext)
  {
    return ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
  }

  public static List<ActivityManager.RunningServiceInfo> getRunningServiceInfo(Context paramContext)
  {
    return ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(2147483647);
  }

  public static long getTotalMemory()
  {
    long l = 0L;
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
      l = 1024L * Integer.valueOf(localBufferedReader.readLine().split("\\s+")[1]).intValue();
      localBufferedReader.close();
      label49: return l / 1048576L;
    }
    catch (IOException localIOException)
    {
      break label49;
    }
  }

  public static long getUsedMemory(Context paramContext)
  {
    return getTotalMemory() - getAvailMemory(paramContext);
  }

  @TargetApi(5)
  public static long getUsedMemory(Context paramContext, String paramString)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if (SystemUtil.aboveApiLevel(21))
    {
      List localList2 = getRunningServiceInfo(paramContext);
      if ((localList2 == null) || (localList2.size() == 0))
        return 0L;
      Iterator localIterator2 = localList2.iterator();
      ActivityManager.RunningServiceInfo localRunningServiceInfo;
      do
      {
        if (!localIterator2.hasNext())
          break;
        localRunningServiceInfo = (ActivityManager.RunningServiceInfo)localIterator2.next();
      }
      while ((localRunningServiceInfo.service == null) || (!localRunningServiceInfo.service.getPackageName().equals(paramString)));
      int[] arrayOfInt2 = new int[1];
      arrayOfInt2[0] = localRunningServiceInfo.pid;
      return 1024L * localActivityManager.getProcessMemoryInfo(arrayOfInt2)[0].getTotalPss();
    }
    List localList1 = getRunningProcessInfo(paramContext);
    if (localList1 == null)
      return 0L;
    Iterator localIterator1 = localList1.iterator();
    while (localIterator1.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator1.next();
      String[] arrayOfString = localRunningAppProcessInfo.pkgList;
      if ((arrayOfString == null) || (arrayOfString.length == 0))
        continue;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        if (!arrayOfString[j].equals(paramString))
          continue;
        int[] arrayOfInt1 = new int[1];
        arrayOfInt1[0] = localRunningAppProcessInfo.pid;
        return 1024L * localActivityManager.getProcessMemoryInfo(arrayOfInt1)[0].getTotalPss();
      }
    }
    return 0L;
  }

  public static int getUsedMemoryPercent()
  {
    long l1 = getUsedMemory(GlobalConfig.getAppContext());
    long l2 = getTotalMemory();
    if (l2 <= 0L)
      return 0;
    return (int)(l1 * 100L / l2);
  }

  public static boolean isAppKillable(Context paramContext, String paramString)
  {
    String str = LauncherUtil.getDefaultLauncher(paramContext);
    int i = 1;
    if ((!TextUtils.isEmpty(str)) && (str.equals(paramString)))
      i = 0;
    if (AppKillBlacklistUtil.isAppInWhiteList(paramString))
      i = 0;
    if (paramString.startsWith("com.wandoujia"))
      return false;
    return i;
  }

  @TargetApi(8)
  public static void killAllProcesses(Context paramContext, String paramString)
  {
    Set localSet = findAllRunningPackage(paramContext);
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (((!TextUtils.isEmpty(paramString)) && (str.equals(paramString))) || (!isAppKillable(paramContext, str)))
        continue;
      if (SystemUtil.aboveApiLevel(8))
      {
        localActivityManager.killBackgroundProcesses(str);
        continue;
      }
      localActivityManager.restartPackage(str);
    }
  }

  @TargetApi(8)
  public static void killProcess(Context paramContext, String paramString)
  {
    if (!isAppKillable(paramContext, paramString))
      return;
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if (SystemUtil.aboveApiLevel(8))
    {
      localActivityManager.killBackgroundProcesses(paramString);
      return;
    }
    localActivityManager.restartPackage(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.MemoryUtil
 * JD-Core Version:    0.6.0
 */