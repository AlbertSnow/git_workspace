package com.wandoujia.p4.subscribe.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.account.dto.Role;
import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.p4.subscribe.SubscribeConstants.Source;
import com.wandoujia.p4.subscribe.http.model.SubscribeOnBoardModel.OnBoardType;
import com.wandoujia.p4.subscribe.http.request.PostSubscribeRequest;
import com.wandoujia.p4.utils.x;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class SubscribeManager
{
  private static SubscribeManager a;
  private final x<h> b = new x();
  private final CachedThreadPoolExecutorWithCapacity c = new CachedThreadPoolExecutorWithCapacity(3);
  private final Handler d = new Handler(Looper.getMainLooper());

  public static SubscribeManager a()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new SubscribeManager();
      SubscribeManager localSubscribeManager = a;
      return localSubscribeManager;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void a(b paramb, SubscribeManager.NotifyEvent paramNotifyEvent)
  {
    List localList = this.b.b();
    this.d.post(new c(localList, paramNotifyEvent, paramb));
  }

  public static boolean a(SubscribeConstants.Source paramSource, SubscribeOnBoardModel.OnBoardType paramOnBoardType, String paramString)
  {
    b();
    if (!NetworkUtil.isNetworkConnected(com.wandoujia.p4.a.a()))
    {
      com.wandoujia.p4.utils.c.a(com.wandoujia.p4.a.a());
      return false;
    }
    com.wandoujia.p4.subscribe.http.a.a locala = new com.wandoujia.p4.subscribe.http.a.a(paramOnBoardType, paramString);
    if (paramSource != null)
      ((com.wandoujia.p4.subscribe.http.request.a)locala.getRequestBuilder()).a(paramSource);
    try
    {
      com.wandoujia.p4.a.b().execute(locala);
      d();
      return true;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return false;
  }

  public static boolean a(SubscribeConstants.Source paramSource, List<String> paramList)
  {
    b();
    if (!NetworkUtil.isNetworkConnected(com.wandoujia.p4.a.a()))
    {
      com.wandoujia.p4.utils.c.a(com.wandoujia.p4.a.a());
      return false;
    }
    com.wandoujia.appmanager.a.b localb = new com.wandoujia.appmanager.a.b(true, (String[])paramList.toArray(new String[0]));
    if (paramSource != null)
      ((PostSubscribeRequest)localb.getRequestBuilder()).a(paramSource);
    try
    {
      com.wandoujia.p4.a.b().execute(localb);
      d();
      return true;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return false;
  }

  private static void b()
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IllegalStateException("Cannot call in UI thread.");
  }

  public static boolean b(SubscribeConstants.Source paramSource, List<String> paramList)
  {
    b();
    if (!NetworkUtil.isNetworkConnected(com.wandoujia.p4.a.a()))
    {
      com.wandoujia.p4.utils.c.a(com.wandoujia.p4.a.a());
      return false;
    }
    com.wandoujia.appmanager.a.b localb = new com.wandoujia.appmanager.a.b(false, (String[])paramList.toArray(new String[0]));
    if (paramSource != null)
      ((PostSubscribeRequest)localb.getRequestBuilder()).a(paramSource);
    try
    {
      com.wandoujia.p4.a.b().execute(localb);
      c();
      if (!com.wandoujia.account.a.a(Role.ROLE_SUBSCRIBER))
        ((de.greenrobot.event.c)i.k().a("event_bus")).d(new j(EventBusManager.Type.DROP_ALL_SUBSCRIPTION, null));
      return true;
    }
    catch (ExecutionException localExecutionException)
    {
    }
    return false;
  }

  private static void c()
  {
    com.wandoujia.p4.account.manager.d.a().b("subscribe");
  }

  private static void d()
  {
    boolean bool = com.wandoujia.account.a.a(Role.ROLE_SUBSCRIBER);
    c();
    if (!bool)
      ((de.greenrobot.event.c)i.k().a("event_bus")).d(new j(EventBusManager.Type.NEW_FOLLOW_USER, null));
  }

  public final void a(h paramh)
  {
    if (paramh == null)
      return;
    this.b.a(paramh);
  }

  public final boolean a(Context paramContext, b paramb)
  {
    return b(paramContext, paramb);
  }

  public final boolean b(Context paramContext, b paramb)
  {
    b();
    if (!NetworkUtil.isNetworkConnected(com.wandoujia.p4.a.a()))
    {
      com.wandoujia.p4.utils.c.a(paramContext);
      return false;
    }
    boolean bool = paramb.subscribe();
    if (bool)
    {
      a(paramb, SubscribeManager.NotifyEvent.NOTIFY_SUBSCRIBE_SUCCESS);
      return bool;
    }
    a(paramb, SubscribeManager.NotifyEvent.NOTIFY_SUBSCRIBE_FAILED);
    return bool;
  }

  public final boolean c(Context paramContext, b paramb)
  {
    b();
    if (!NetworkUtil.isNetworkConnected(com.wandoujia.p4.a.a()))
    {
      com.wandoujia.p4.utils.c.a(paramContext);
      return false;
    }
    boolean bool = paramb.unsubscribe();
    if (bool)
    {
      a(paramb, SubscribeManager.NotifyEvent.NOTIFY_UNSUBSCRIBE_SUCCESS);
      return bool;
    }
    a(paramb, SubscribeManager.NotifyEvent.NOTIFY_UNSUBSCRIBE_FAILED);
    return bool;
  }

  public final void d(Context paramContext, b paramb)
  {
    this.c.execute(new d(this, paramContext, paramb));
  }

  public final void e(Context paramContext, b paramb)
  {
    this.c.execute(new e(this, paramContext, paramb));
  }

  public final void f(Context paramContext, b paramb)
  {
    this.c.execute(new f(this, paramContext, paramb));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.core.SubscribeManager
 * JD-Core Version:    0.6.0
 */