package com.google.android.gms.ads.internal.state;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import aom;
import aoq;
import apr;
import apz;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.g;
import com.google.android.gms.ads.internal.util.n;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.ads.internal.util.r;
import com.google.android.gms.ads.internal.util.y;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;

@com.google.android.gms.ads.internal.report.client.a
public final class h
  implements r
{
  private long A = 0L;
  public final Object a = new Object();
  public final String b = y.b();
  public com.google.android.gms.ads.internal.activeview.l c;
  public final HashSet d = new HashSet();
  final HashMap e = new HashMap();
  public Boolean f = null;
  public boolean g = false;
  public boolean h = false;
  private final i i = new i(this.b);
  private BigInteger j = BigInteger.ONE;
  private boolean k = false;
  private boolean l = true;
  private int m = 0;
  private boolean n = false;
  private Context o;
  private VersionInfoParcel p;
  private com.google.android.gms.ads.internal.csi.b q = null;
  private boolean r = true;
  private com.google.android.gms.ads.internal.appcontent.c s = null;
  private com.google.android.gms.ads.internal.appcontent.d t = null;
  private com.google.android.gms.ads.internal.appcontent.b u = null;
  private String v;
  private String w;
  private boolean x = false;
  private boolean y = false;
  private String z = "";

  public h(y paramy)
  {
  }

  private boolean m()
  {
    synchronized (this.a)
    {
      boolean bool = this.r;
      return bool;
    }
  }

  public final Bundle a(Context paramContext, j paramj, String paramString)
  {
    Bundle localBundle1;
    Bundle localBundle2;
    synchronized (this.a)
    {
      localBundle1 = new Bundle();
      localBundle1.putBundle("app", this.i.a(paramContext, paramString));
      localBundle2 = new Bundle();
      Iterator localIterator1 = this.e.keySet().iterator();
      if (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        localBundle2.putBundle(str, ((k)this.e.get(str)).a());
      }
    }
    localBundle1.putBundle("slots", localBundle2);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2 = this.d.iterator();
    while (localIterator2.hasNext())
      localArrayList.add(((c)localIterator2.next()).a());
    localBundle1.putParcelableArrayList("ads", localArrayList);
    paramj.a(this.d);
    this.d.clear();
    monitorexit;
    return localBundle1;
  }

  public final com.google.android.gms.ads.internal.appcontent.d a(Context paramContext)
  {
    if ((!((Boolean)com.google.android.gms.ads.internal.config.m.y.a()).booleanValue()) || (!aoq.a(14)) || (m()))
      return null;
    synchronized (this.a)
    {
      if ((Looper.getMainLooper() == null) || (paramContext == null))
        return null;
      if (this.s == null)
      {
        Application localApplication = (Application)paramContext.getApplicationContext();
        if (localApplication == null)
          localApplication = (Application)paramContext;
        this.s = new com.google.android.gms.ads.internal.appcontent.c(localApplication, paramContext);
      }
      if (this.u == null)
        this.u = new com.google.android.gms.ads.internal.appcontent.b();
      if (this.t == null)
        this.t = new com.google.android.gms.ads.internal.appcontent.d(this.s, this.u, new com.google.android.gms.ads.internal.report.a(this.o, this.p, null, null));
      this.t.a();
      com.google.android.gms.ads.internal.appcontent.d locald = this.t;
      return locald;
    }
  }

  public final String a()
  {
    synchronized (this.a)
    {
      String str = this.j.toString();
      this.j = this.j.add(BigInteger.ONE);
      return str;
    }
  }

  public final Future a(Context paramContext, String paramString)
  {
    this.A = bc.a().i.a();
    Object localObject1 = this.a;
    monitorenter;
    if (paramString != null);
    try
    {
      if (!paramString.equals(this.z))
      {
        this.z = paramString;
        Future localFuture = (Future)new com.google.android.gms.ads.internal.util.h(paramContext, paramString, this.A).d();
        return localFuture;
      }
      return null;
    }
    finally
    {
      monitorexit;
    }
    throw localObject2;
  }

  public final Future a(Context paramContext, boolean paramBoolean)
  {
    synchronized (this.a)
    {
      if (paramBoolean != this.l)
      {
        this.l = paramBoolean;
        Future localFuture = (Future)new f(paramContext, paramBoolean).d();
        return localFuture;
      }
      return null;
    }
  }

  public final Future a(String paramString)
  {
    Object localObject1 = this.a;
    monitorenter;
    if (paramString != null);
    try
    {
      if (!paramString.equals(this.v))
      {
        this.v = paramString;
        Future localFuture = (Future)new n(this.o, paramString).d();
        return localFuture;
      }
      return null;
    }
    finally
    {
      monitorexit;
    }
    throw localObject2;
  }

  @TargetApi(23)
  public final void a(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    while (true)
    {
      com.google.android.gms.ads.internal.csi.a locala;
      synchronized (this.a)
      {
        if (this.n)
          continue;
        this.o = paramContext.getApplicationContext();
        this.p = paramVersionInfoParcel;
        ((Future)new com.google.android.gms.ads.internal.util.j(paramContext, this).d());
        ((Future)new com.google.android.gms.ads.internal.util.k(paramContext, this).d());
        ((Future)new com.google.android.gms.ads.internal.util.m(paramContext, this).d());
        ((Future)new o(paramContext, this).d());
        ((Future)new g(paramContext, this).d());
        ((Future)new com.google.android.gms.ads.internal.util.i(paramContext, this).d());
        Thread localThread = Thread.currentThread();
        com.google.android.gms.ads.internal.report.a.a(this.o, localThread, this.p);
        this.w = bc.a().e.a(paramContext, paramVersionInfoParcel.b);
        if ((!aoq.a(23)) || (NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()))
          continue;
        this.x = true;
        this.c = new com.google.android.gms.ads.internal.activeview.l(paramContext.getApplicationContext(), this.p, bc.a().e.a(paramContext, paramVersionInfoParcel));
        locala = new com.google.android.gms.ads.internal.csi.a(this.o, this.p.b);
        try
        {
          if (locala.a)
            continue;
          com.google.android.gms.ads.internal.util.c.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
          localb = null;
          this.q = localb;
          com.google.android.gms.ads.internal.purchase.k localk = bc.a().o;
          Context localContext = this.o;
          com.google.android.gms.ads.internal.purchase.l locall = new com.google.android.gms.ads.internal.purchase.l(localk, localContext);
          Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
          localIntent.setPackage("com.android.vending");
          localContext.bindService(localIntent, locall, 1);
          this.n = true;
          return;
          if (locala.d == null)
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          com.google.android.gms.ads.internal.util.c.c("Cannot initialize CSI reporter.", localIllegalArgumentException);
          continue;
        }
      }
      if (TextUtils.isEmpty(locala.e))
        throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
      com.google.android.gms.ads.internal.csi.b localb = new com.google.android.gms.ads.internal.csi.b(locala.d, locala.e, locala.b, locala.c);
    }
  }

  public final void a(Bundle paramBundle)
  {
    while (true)
    {
      synchronized (this.a)
      {
        if (!paramBundle.containsKey("use_https"))
          continue;
        boolean bool1 = paramBundle.getBoolean("use_https");
        this.l = bool1;
        if (!paramBundle.containsKey("webview_cache_version"))
          continue;
        int i1 = paramBundle.getInt("webview_cache_version");
        this.m = i1;
        if (!paramBundle.containsKey("content_url_opted_out"))
          continue;
        a(paramBundle.getBoolean("content_url_opted_out"));
        if (!paramBundle.containsKey("content_url_hashes"))
          continue;
        this.v = paramBundle.getString("content_url_hashes");
        if (!paramBundle.containsKey("auto_collect_location"))
          continue;
        boolean bool2 = paramBundle.getBoolean("auto_collect_location");
        this.y = bool2;
        if (!paramBundle.containsKey("app_settings_json"))
          continue;
        String str = paramBundle.getString("app_settings_json");
        this.z = str;
        if (paramBundle.containsKey("app_settings_last_update_ms"))
        {
          l1 = paramBundle.getLong("app_settings_last_update_ms");
          this.A = l1;
          return;
          bool1 = this.l;
          continue;
          i1 = this.m;
          continue;
          bool2 = this.y;
          continue;
          str = this.z;
        }
      }
      long l1 = 0L;
    }
  }

  public final void a(c paramc)
  {
    synchronized (this.a)
    {
      this.d.add(paramc);
      return;
    }
  }

  public final void a(String paramString, k paramk)
  {
    synchronized (this.a)
    {
      this.e.put(paramString, paramk);
      return;
    }
  }

  public final void a(Throwable paramThrowable, boolean paramBoolean)
  {
    new com.google.android.gms.ads.internal.report.a(this.o, this.p, null, null).a(paramThrowable, paramBoolean);
  }

  public final void a(boolean paramBoolean)
  {
    synchronized (this.a)
    {
      if (this.r != paramBoolean)
        ((Future)new com.google.android.gms.ads.internal.util.l(this.o, paramBoolean).d());
      this.r = paramBoolean;
      com.google.android.gms.ads.internal.appcontent.d locald = a(this.o);
      if ((locald != null) && (!locald.isAlive()))
      {
        com.google.android.gms.ads.internal.util.c.d("start fetching content...");
        locald.a();
      }
      return;
    }
  }

  public final i b()
  {
    synchronized (this.a)
    {
      i locali = this.i;
      return locali;
    }
  }

  public final Future b(Context paramContext, boolean paramBoolean)
  {
    synchronized (this.a)
    {
      if (paramBoolean != this.y)
      {
        this.y = paramBoolean;
        Future localFuture = (Future)new p(paramContext, paramBoolean).d();
        return localFuture;
      }
      return null;
    }
  }

  public final com.google.android.gms.ads.internal.csi.b c()
  {
    synchronized (this.a)
    {
      com.google.android.gms.ads.internal.csi.b localb = this.q;
      return localb;
    }
  }

  public final boolean d()
  {
    synchronized (this.a)
    {
      boolean bool = this.k;
      this.k = true;
      return bool;
    }
  }

  public final boolean e()
  {
    while (true)
    {
      synchronized (this.a)
      {
        if (!this.l)
        {
          if (!this.x)
            break label38;
          break label33;
          return i1;
        }
      }
      label33: int i1 = 1;
      continue;
      label38: i1 = 0;
    }
  }

  public final String f()
  {
    synchronized (this.a)
    {
      String str = this.w;
      return str;
    }
  }

  public final String g()
  {
    synchronized (this.a)
    {
      String str = this.v;
      return str;
    }
  }

  public final Boolean h()
  {
    synchronized (this.a)
    {
      Boolean localBoolean = this.f;
      return localBoolean;
    }
  }

  public final boolean i()
  {
    synchronized (this.a)
    {
      boolean bool = this.y;
      return bool;
    }
  }

  public final e j()
  {
    synchronized (this.a)
    {
      e locale = new e(this.z, this.A);
      return locale;
    }
  }

  public final Resources k()
  {
    Resources localResources1;
    if (this.p.e)
      localResources1 = this.o.getResources();
    while (true)
    {
      return localResources1;
      try
      {
        apr localapr = apr.a(this.o, apr.a, "com.google.android.gms.ads.dynamite");
        localResources1 = null;
        if (localapr == null)
          continue;
        Resources localResources2 = localapr.b.getResources();
        return localResources2;
      }
      catch (apz localapz)
      {
        com.google.android.gms.ads.internal.util.c.c("Cannot load resource from dynamite apk or local jar", localapz);
      }
    }
    return null;
  }

  public final boolean l()
  {
    synchronized (this.a)
    {
      boolean bool = this.g;
      return bool;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.state.h
 * JD-Core Version:    0.6.0
 */