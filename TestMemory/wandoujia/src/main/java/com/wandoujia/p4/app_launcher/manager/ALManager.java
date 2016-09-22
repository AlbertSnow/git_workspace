package com.wandoujia.p4.app_launcher.manager;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.p4.app_launcher.e.b;
import com.wandoujia.p4.app_launcher.model.ALAppInfo;
import com.wandoujia.p4.app_launcher.model.ALSuggestion;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.FunctionInfo;
import com.wandoujia.ripple_framework.model.Model;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ALManager
{
  private final Handler a = new Handler(Looper.getMainLooper());
  private WeakReference<l> b;
  private WeakReference<k> c;
  private b d;
  private final LocalAppChangedListener e = new e(this);

  public ALManager()
  {
    d.a(new f(this));
  }

  private static ALSuggestion a(String paramString)
  {
    ALSuggestion localALSuggestion;
    try
    {
      com.wandoujia.p4.app_launcher.e.a locala = new com.wandoujia.p4.app_launcher.e.a();
      ((com.wandoujia.p4.app_launcher.e.d)locala.getRequestBuilder()).a(paramString);
      localALSuggestion = (ALSuggestion)com.wandoujia.p4.a.b().execute(locala);
      Iterator localIterator1 = localALSuggestion.appsElemList.iterator();
      while (localIterator1.hasNext())
      {
        if (b(((ALAppInfo)localIterator1.next()).packageName))
          continue;
        localIterator1.remove();
      }
      Iterator localIterator2 = localALSuggestion.intentElemList.iterator();
      while (localIterator2.hasNext())
      {
        if (b(((ALSuggestion.FunctionInfo)localIterator2.next()).packageName))
          continue;
        localIterator2.remove();
      }
    }
    catch (ExecutionException localExecutionException)
    {
      localALSuggestion = null;
    }
    return localALSuggestion;
  }

  private void a()
  {
    d.a(new g(this));
  }

  private void a(ALSuggestion paramALSuggestion, List<Model> paramList)
  {
    this.a.post(new j(this, paramALSuggestion, paramList));
  }

  private static String b()
  {
    Object localObject1 = AppManager.a().c();
    if (((List)localObject1).isEmpty());
    try
    {
      Future localFuture = AppManager.a().a(new Handler[0]);
      if (localFuture != null)
      {
        localObject2 = (List)localFuture.get(5L, TimeUnit.SECONDS);
        localObject1 = localObject2;
        ArrayList localArrayList = new ArrayList();
        if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
        {
          Iterator localIterator = ((List)localObject1).iterator();
          while (localIterator.hasNext())
          {
            LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
            ALAppInfo localALAppInfo = new ALAppInfo();
            localALAppInfo.packageName = localLocalAppInfo.getPackageName();
            localALAppInfo.version = localLocalAppInfo.getVersionName();
            localALAppInfo.versionCode = localLocalAppInfo.getVersionCode();
            localArrayList.add(localALAppInfo);
          }
        }
        return com.wandoujia.p4.http.c.a.a().a(localArrayList);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        continue;
        Object localObject2 = localObject1;
      }
    }
  }

  private static boolean b(String paramString)
  {
    return AppManager.a().f(paramString) != null;
  }

  public final void a(ALManager.CellEvent paramCellEvent)
  {
    if ((this.c != null) && (this.c.get() != null))
      ((k)this.c.get()).onEvent(paramCellEvent);
  }

  public final void a(k paramk)
  {
    this.c = new WeakReference(paramk);
  }

  public final void a(l paraml)
  {
    if ((GlobalConfig.isDebug()) && (Looper.myLooper() != Looper.getMainLooper()))
      throw new IllegalStateException("Must run on UI thread!");
    this.b = new WeakReference(paraml);
    d.a(new h(this));
    a();
    com.wandoujia.online_config.c.a();
    if (ConfigStorage.a("enable_al_install_suggestion", true))
    {
      if (this.d == null)
        this.d = new b();
      this.d.a();
    }
  }

  public final void a(List<Entity> paramList)
  {
    d.a(new i(this, paramList));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.manager.ALManager
 * JD-Core Version:    0.6.0
 */