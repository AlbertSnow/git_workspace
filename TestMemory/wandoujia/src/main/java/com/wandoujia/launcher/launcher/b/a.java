package com.wandoujia.launcher.launcher.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.d;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher.launcher.models.LauncherSuggestionModel;
import com.wandoujia.launcher.launcher.models.LauncherSuggestions;
import com.wandoujia.launcher.launcher.models.SimpleAppInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class a
{
  private com.wandoujia.launcher.launcher.a.b a = com.wandoujia.launcher.launcher.a.b.a(GlobalConfig.getAppContext());
  private PackageManager b = GlobalConfig.getAppContext().getPackageManager();

  private static void a(List<SimpleAppInfo> paramList)
  {
    if (paramList == null);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        if ("GAME".equals(((SimpleAppInfo)localIterator.next()).getAppType()))
          continue;
        localIterator.remove();
      }
    }
  }

  public static List<LauncherSuggestionModel> b()
  {
    try
    {
      List localList = (List)android.support.v4.app.b.G("folder_casual_list");
      return localList;
    }
    catch (Throwable localThrowable)
    {
    }
    return new ArrayList();
  }

  private static void b(List<SimpleAppInfo> paramList)
  {
    if (paramList == null);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        if (!com.wandoujia.launcher.launcher.utils.a.c(((SimpleAppInfo)localIterator.next()).getPackageName()))
          continue;
        localIterator.remove();
      }
    }
  }

  private void c(List<SimpleAppInfo> paramList)
  {
    if (paramList == null)
      return;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      SimpleAppInfo localSimpleAppInfo = (SimpleAppInfo)localIterator.next();
      try
      {
        ApplicationInfo localApplicationInfo2 = this.b.getApplicationInfo(localSimpleAppInfo.getPackageName(), 0);
        localApplicationInfo1 = localApplicationInfo2;
        if (localApplicationInfo1 == null)
          continue;
        localSimpleAppInfo.setTitle((String)this.b.getApplicationLabel(localApplicationInfo1));
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        while (true)
          ApplicationInfo localApplicationInfo1 = null;
      }
    }
  }

  public static void d()
  {
    f();
    LauncherSuggestions localLauncherSuggestions1 = android.support.v4.app.b.J();
    LauncherSuggestions localLauncherSuggestions2;
    List localList3;
    if (localLauncherSuggestions1 == null)
    {
      localLauncherSuggestions2 = null;
      if (localLauncherSuggestions2 == null)
        return;
      if (localLauncherSuggestions2.getCase1() == null)
        break label233;
      localList3 = localLauncherSuggestions2.getCase1();
      if (localList3 == null)
        break label225;
      if (!(localList3 instanceof Serializable))
        throw new IllegalArgumentException("data must be a serializable");
    }
    else
    {
      List localList1 = localLauncherSuggestions1.getCase1();
      List localList2 = b();
      if ((localList2 == null) && (localList1 != null))
        d.j();
      label193: 
      while (true)
      {
        localLauncherSuggestions2 = localLauncherSuggestions1;
        break;
        if ((localList2 == null) || (localList1 == null))
          continue;
        if (localList2.size() != localList1.size())
        {
          d.j();
          continue;
        }
        Iterator localIterator = localList1.iterator();
        for (int i = 0; ; i++)
        {
          if (!localIterator.hasNext())
            break label193;
          LauncherSuggestionModel localLauncherSuggestionModel = (LauncherSuggestionModel)localIterator.next();
          if ((localLauncherSuggestionModel == null) || (localList2.get(i) == null) || (localLauncherSuggestionModel.getPackageName().equals(((LauncherSuggestionModel)localList2.get(i)).getPackageName())))
            continue;
          d.j();
          break;
        }
      }
    }
    if (android.support.v4.app.b.j(GlobalConfig.getAppContext(), "folder_casual_list"))
      GlobalConfig.getAppContext().deleteFile("folder_casual_list");
    android.support.v4.app.b.a(GlobalConfig.getAppContext(), "folder_casual_list", localList3);
    label225: d.m(localLauncherSuggestions2.getRecommendTitle());
    label233: d.b(System.currentTimeMillis());
    d.a(localLauncherSuggestions2.getCase0().size());
  }

  private List<SimpleAppInfo> e()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = AppManager.a().d();
    if (((List)localObject1).isEmpty());
    try
    {
      Future localFuture = AppManager.a().b(new Handler[0]);
      if (localFuture != null)
      {
        localObject3 = (List)localFuture.get(5L, TimeUnit.SECONDS);
        localObject1 = localObject3;
        label62: if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
        {
          HashSet localHashSet = new HashSet();
          Iterator localIterator = ((List)localObject1).iterator();
          while (localIterator.hasNext())
            localHashSet.add(((LocalAppInfo)localIterator.next()).getPackageName());
          localObject2 = android.support.v4.app.b.a(localHashSet);
          android.support.v4.app.b.a((List)localObject2);
          a((List)localObject2);
          b((List)localObject2);
          c((List)localObject2);
          return localObject2;
        }
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      break label62;
    }
    catch (TimeoutException localTimeoutException)
    {
      break label62;
    }
    catch (ExecutionException localExecutionException)
    {
      break label62;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        continue;
        Object localObject2 = localArrayList;
        continue;
        Object localObject3 = localObject1;
      }
    }
  }

  private static void f()
  {
    if (Looper.myLooper() == Looper.getMainLooper())
      throw new IllegalStateException("Must not run on UI thread!");
  }

  public final List<SimpleAppInfo> a()
  {
    return this.a.a();
  }

  public final void a(SimpleAppInfo paramSimpleAppInfo)
  {
    if ((paramSimpleAppInfo == null) || (TextUtils.isEmpty(paramSimpleAppInfo.getPackageName())) || (paramSimpleAppInfo != null));
    try
    {
      ApplicationInfo localApplicationInfo2 = this.b.getApplicationInfo(paramSimpleAppInfo.getPackageName(), 0);
      localApplicationInfo1 = localApplicationInfo2;
      if (localApplicationInfo1 != null)
      {
        String str = this.b.getApplicationLabel(localApplicationInfo1).toString();
        if (!TextUtils.equals(str, paramSimpleAppInfo.getPackageName()))
          paramSimpleAppInfo.setTitle(str);
      }
      this.a.a(paramSimpleAppInfo);
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        ApplicationInfo localApplicationInfo1 = null;
    }
  }

  public final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString));
    try
    {
      this.a.a(paramString);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void c()
  {
    f();
    List localList = e();
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        SimpleAppInfo localSimpleAppInfo = (SimpleAppInfo)localIterator.next();
        this.a.a(localSimpleAppInfo);
      }
    }
    d.a(System.currentTimeMillis());
    d.k();
    com.wandoujia.launcher.e.a.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.b.a
 * JD-Core Version:    0.6.0
 */