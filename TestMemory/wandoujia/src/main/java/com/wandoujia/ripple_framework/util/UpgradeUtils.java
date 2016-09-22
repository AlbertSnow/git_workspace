package com.wandoujia.ripple_framework.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.logv3.model.packages.UrlPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class UpgradeUtils
{
  private static final Comparator<LocalAppInfo> a = new s();

  public static long a(List<LocalAppInfo> paramList1, List<LocalAppInfo> paramList2)
  {
    HashSet localHashSet = new HashSet();
    if (paramList2 != null)
    {
      Iterator localIterator2 = paramList2.iterator();
      l1 = 0L;
      while (localIterator2.hasNext())
      {
        LocalAppInfo localLocalAppInfo2 = (LocalAppInfo)localIterator2.next();
        l1 += localLocalAppInfo2.getUpgradeInfo().getFullSize();
        localHashSet.add(localLocalAppInfo2.getPackageName());
      }
    }
    long l1 = 0L;
    long l2;
    if (paramList1 != null)
    {
      Iterator localIterator1 = paramList1.iterator();
      while (localIterator1.hasNext())
      {
        LocalAppInfo localLocalAppInfo1 = (LocalAppInfo)localIterator1.next();
        if (localHashSet.contains(localLocalAppInfo1.getPackageName()))
          continue;
        LocalAppInfo.UpgradeInfo localUpgradeInfo = localLocalAppInfo1.getUpgradeInfo();
        if ((localUpgradeInfo == null) || (!localUpgradeInfo.isPatchUpgradable()))
          break label163;
        l2 = l1 + (localUpgradeInfo.getFullSize() - localUpgradeInfo.getPatchSize());
      }
    }
    while (true)
    {
      l1 = l2;
      break;
      return l1;
      label163: l2 = l1;
    }
  }

  public static ViewLogPackage a(String paramString)
  {
    ViewLogPackage.Builder localBuilder = new ViewLogPackage.Builder();
    localBuilder.url_package(new UrlPackage.Builder().url(paramString).build());
    return localBuilder.build();
  }

  public static List<LocalAppInfo> a()
  {
    try
    {
      List localList = (List)AppManager.a().c(new Handler[0]).get();
      c(localList);
      return localList;
    }
    catch (ExecutionException localExecutionException)
    {
      return Collections.emptyList();
    }
    catch (InterruptedException localInterruptedException)
    {
      label26: break label26;
    }
  }

  public static List<LocalAppInfo> a(List<LocalAppInfo> paramList)
  {
    if (paramList == null)
      return null;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
      if (!localLocalAppInfo.isUpgradable())
        continue;
      if (localLocalAppInfo.isImportantUpgradable())
      {
        localLocalAppInfo.setUpgradeType(LocalAppInfo.UpgradeType.IMPORTANT);
        localArrayList2.add(localLocalAppInfo);
      }
      while (true)
      {
        if (localLocalAppInfo.isImportantUpgradable())
          localLocalAppInfo.setUpgradeTypes(LocalAppInfo.UpgradeType.IMPORTANT.name());
        if (d(localLocalAppInfo.getPackageName()))
          localLocalAppInfo.setUpgradeTypes(LocalAppInfo.UpgradeType.RUNNING.name());
        if (localLocalAppInfo.getImportantLevel() == 1)
          localLocalAppInfo.setUpgradeTypes(LocalAppInfo.UpgradeType.TOP.name());
        if (!c(localLocalAppInfo.getPackageName()))
          break;
        localLocalAppInfo.setUpgradeTypes(LocalAppInfo.UpgradeType.RECENTLY.name());
        break;
        if (localLocalAppInfo.getImportantLevel() == 1)
        {
          localLocalAppInfo.setUpgradeType(LocalAppInfo.UpgradeType.TOP);
          localArrayList4.add(localLocalAppInfo);
          continue;
        }
        if (d(localLocalAppInfo.getPackageName()))
        {
          localLocalAppInfo.setUpgradeType(LocalAppInfo.UpgradeType.RUNNING);
          localArrayList3.add(localLocalAppInfo);
          continue;
        }
        if (!c(localLocalAppInfo.getPackageName()))
          continue;
        localLocalAppInfo.setUpgradeType(LocalAppInfo.UpgradeType.RECENTLY);
        localArrayList5.add(localLocalAppInfo);
      }
    }
    Collections.sort(localArrayList2, a);
    Collections.sort(localArrayList3, a);
    Collections.sort(localArrayList4, a);
    Collections.sort(localArrayList5, a);
    localArrayList1.addAll(localArrayList4);
    localArrayList1.addAll(localArrayList2);
    localArrayList1.addAll(localArrayList3);
    localArrayList1.addAll(localArrayList5);
    return localArrayList1;
  }

  private static void a(List<LocalAppInfo> paramList1, List<LocalAppInfo> paramList2, List<LocalAppInfo> paramList3)
  {
    paramList2.clear();
    paramList3.clear();
    Iterator localIterator = paramList1.iterator();
    while (localIterator.hasNext())
    {
      LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
      LocalAppInfo.UpgradeInfo localUpgradeInfo = localLocalAppInfo.getUpgradeInfo();
      if ((localUpgradeInfo == null) || (localLocalAppInfo.isUpgradeIgnored()))
        continue;
      String str = localUpgradeInfo.getRecommendedType();
      if ((TextUtils.isEmpty(str)) || (str.equals("STRONG_RECOMMEND")))
      {
        paramList2.add(localLocalAppInfo);
        continue;
      }
      if (str.equals("WARNNING"))
      {
        paramList3.add(localLocalAppInfo);
        continue;
      }
      str.equals("NOT_RECOMMEND");
    }
  }

  public static boolean a(LocalAppInfo paramLocalAppInfo)
  {
    if ((paramLocalAppInfo == null) || (paramLocalAppInfo.getUpgradeInfo() == null));
    String str;
    do
    {
      return false;
      str = paramLocalAppInfo.getUpgradeInfo().getRecommendedType();
    }
    while ((!TextUtils.equals(str, "STRONG_RECOMMEND")) && (!TextUtils.equals(str, "WARNNING")));
    return true;
  }

  public static LocalAppInfo.UpgradeInfo b(String paramString)
  {
    if (paramString == null)
      return null;
    LocalAppInfo localLocalAppInfo = ((AppManager)i.k().a("app")).f(paramString);
    if (localLocalAppInfo != null)
      return localLocalAppInfo.getUpgradeInfo();
    return null;
  }

  public static List<LocalAppInfo> b()
  {
    List localList = AppManager.a().i();
    LinkedList localLinkedList = new LinkedList();
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
        if ((!localLocalAppInfo.isUpgradable()) || (localLocalAppInfo.isUpgradeIgnored()))
          continue;
        localLinkedList.add(localLocalAppInfo);
      }
    }
    return localLinkedList;
  }

  public static List<LocalAppInfo> b(List<LocalAppInfo> paramList)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    a(paramList, localArrayList1, localArrayList2);
    localArrayList1.addAll(localArrayList2);
    return localArrayList1;
  }

  public static int c()
  {
    List localList1 = b();
    if (localList1.isEmpty());
    List localList2;
    do
    {
      return 0;
      localList2 = b(localList1);
    }
    while (localList2.isEmpty());
    Iterator localIterator = localList2.iterator();
    while (localIterator.hasNext())
    {
      LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
      ((AppTaskManager)i.k().a("app_task")).a(j.a(localLocalAppInfo, TemplateTypeEnum.TemplateType.UPGRADE_APP), a("wdj://notification/upgrade_all"));
    }
    return localList2.size();
  }

  public static void c(List<LocalAppInfo> paramList)
  {
    if (paramList == null);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
        if ((localLocalAppInfo.isUpgradable()) && (!localLocalAppInfo.isUpgradeIgnored()))
          continue;
        localIterator.remove();
      }
    }
  }

  private static boolean c(String paramString)
  {
    PackageInfo localPackageInfo = AppUtils.a(i.k().g(), paramString);
    if (localPackageInfo == null);
    do
      return false;
    while ((Build.VERSION.SDK_INT < 9) || (localPackageInfo.firstInstallTime == localPackageInfo.lastUpdateTime) || (System.currentTimeMillis() - localPackageInfo.lastUpdateTime > 2592000000L));
    return true;
  }

  private static boolean d(String paramString)
  {
    List localList = ((ActivityManager)i.k().g().getSystemService("activity")).getRunningAppProcesses();
    if (CollectionUtils.isEmpty(localList))
      return false;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      String[] arrayOfString = ((ActivityManager.RunningAppProcessInfo)localIterator.next()).pkgList;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
        if (arrayOfString[j].equals(paramString))
          return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.UpgradeUtils
 * JD-Core Version:    0.6.0
 */