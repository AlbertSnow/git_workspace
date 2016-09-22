package com.wandoujia.launcher.launcher.b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.launcher.launcher.models.LauncherSuggestionModel;
import com.wandoujia.launcher.launcher.models.SimpleAppInfo;
import com.wandoujia.p4.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class c
{
  private static c b;
  private final Byte a = Byte.valueOf(1);
  private List<LauncherSuggestionModel> c;
  private List<SimpleAppInfo> d;
  private a e = new a();
  private x<g> f = new x();
  private List<String> g = new ArrayList();
  private Handler h = new Handler(Looper.getMainLooper());

  public static c a()
  {
    monitorenter;
    try
    {
      if (b == null)
        b = new c();
      c localc = b;
      return localc;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void d(String paramString)
  {
    monitorenter;
    try
    {
      if (this.g.contains(paramString))
        this.g.remove(paramString);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  private void j()
  {
    this.h.post(new f(this));
  }

  public final void a(g paramg)
  {
    this.f.a(paramg);
  }

  public final boolean a(String paramString)
  {
    Iterator localIterator = b().iterator();
    while (localIterator.hasNext())
      if (TextUtils.equals(((SimpleAppInfo)localIterator.next()).getPackageName(), paramString))
        return true;
    return false;
  }

  public final List<SimpleAppInfo> b()
  {
    if ((this.d == null) || (this.d.isEmpty()))
      this.d = this.e.a();
    if ((this.d != null) && (!this.d.isEmpty()));
    try
    {
      Collections.sort(this.d);
      label56: return new ArrayList(this.d);
      return new ArrayList();
    }
    catch (Exception localException)
    {
      break label56;
    }
  }

  public final void b(String paramString)
  {
    this.d = b();
    if (this.d != null)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        SimpleAppInfo localSimpleAppInfo = (SimpleAppInfo)localIterator.next();
        if (!localSimpleAppInfo.getPackageName().equals(paramString))
          continue;
        this.d.remove(localSimpleAppInfo);
        this.e.a(paramString);
      }
    }
    com.wandoujia.launcher.e.a.b();
    j();
  }

  public final List<SimpleAppInfo> c()
  {
    if (this.d == null)
      return null;
    return new ArrayList(this.d);
  }

  public final void c(String paramString)
  {
    ThreadPool.execute(new d(this, paramString));
  }

  public final int d()
  {
    if (this.d == null)
      return 0;
    return this.d.size();
  }

  public final List<LauncherSuggestionModel> e()
  {
    if ((this.c == null) || (this.c.isEmpty()))
      this.c = a.b();
    if (this.c != null)
      return new ArrayList(this.c);
    return new ArrayList();
  }

  public final void f()
  {
    this.d = b();
    Iterator localIterator = this.d.iterator();
    int i = android.support.v4.app.d.i();
    while (localIterator.hasNext())
    {
      SimpleAppInfo localSimpleAppInfo = (SimpleAppInfo)localIterator.next();
      if (AppManager.a().h(localSimpleAppInfo.getPackageName()))
        continue;
      localIterator.remove();
      this.e.a(localSimpleAppInfo.getPackageName());
    }
    if (((this.d != null) && (this.d.size() < 4)) || (i != android.support.v4.app.d.i()))
      android.support.v4.app.d.b(i);
    com.wandoujia.launcher.e.a.b();
    j();
  }

  public final void g()
  {
    a.d();
    this.c = null;
    if (this.e != null)
      this.c = a.b();
  }

  public final void h()
  {
    this.e.c();
  }

  public final void i()
  {
    ThreadPool.execute(new e(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.b.c
 * JD-Core Version:    0.6.0
 */