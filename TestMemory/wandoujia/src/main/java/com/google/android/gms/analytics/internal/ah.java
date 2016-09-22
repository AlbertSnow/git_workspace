package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.o;
import com.google.android.gms.internal.ag;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.r;
import com.wandoujia.p4.app_launcher.manager.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ah extends u
{
  private boolean a;
  private final ae b;
  private final h c;
  private final zzag d;
  private final z e;
  private long f;
  private final au g;
  private final au h;
  private final l i;
  private long j;
  private boolean k;

  protected ah(w paramw, y paramy)
  {
    super(paramw);
    android.support.v4.app.d.a(paramy);
    this.f = -9223372036854775808L;
    this.d = new zzag(paramw);
    this.b = new ae(paramw);
    this.c = new h(paramw);
    this.e = y.d(paramw);
    this.i = new l(j());
    this.g = new ai(this, paramw);
    this.h = new aj(this, paramw);
  }

  private boolean B()
  {
    int m = 1;
    com.google.android.gms.internal.z.d();
    z();
    c("Dispatching a batch of local hits");
    int n;
    if (!this.e.b())
    {
      n = m;
      if (this.c.b())
        break label58;
    }
    while (true)
    {
      if ((n == 0) || (m == 0))
        break label63;
      c("No network or service available. Will retry later");
      return false;
      n = 0;
      break;
      label58: m = 0;
    }
    label63: long l1 = Math.max(as.f(), as.g());
    ArrayList localArrayList = new ArrayList();
    long l2 = 0L;
    try
    {
      while (true)
      {
        this.b.b();
        localArrayList.clear();
        try
        {
          localList1 = this.b.a(l1);
          if (localList1.isEmpty())
          {
            c("Store is empty, nothing to dispatch");
            E();
            try
            {
              this.b.c();
              this.b.d();
              return false;
            }
            catch (SQLiteException localSQLiteException11)
            {
              e("Failed to commit local dispatch transaction", localSQLiteException11);
              E();
              return false;
            }
          }
          a("Hits loaded from store. count", Integer.valueOf(localList1.size()));
          Iterator localIterator1 = localList1.iterator();
          while (true)
            if (localIterator1.hasNext())
            {
              if (((d)localIterator1.next()).c() != l2)
                continue;
              d("Database contains successfully uploaded hit", Long.valueOf(l2), Integer.valueOf(localList1.size()));
              E();
              try
              {
                this.b.c();
                this.b.d();
                return false;
              }
              catch (SQLiteException localSQLiteException10)
              {
                e("Failed to commit local dispatch transaction", localSQLiteException10);
                E();
                return false;
              }
            }
        }
        catch (SQLiteException localSQLiteException2)
        {
          List localList1;
          d("Failed to read hits from persisted store", localSQLiteException2);
          E();
          try
          {
            this.b.c();
            this.b.d();
            return false;
          }
          catch (SQLiteException localSQLiteException3)
          {
            e("Failed to commit local dispatch transaction", localSQLiteException3);
            E();
            return false;
          }
          if (this.e.b())
          {
            c("Service connected, sending hits to the service");
            while (!localList1.isEmpty())
            {
              d locald = (d)localList1.get(0);
              if (!this.e.a(locald))
                break;
              l2 = Math.max(l2, locald.c());
              localList1.remove(locald);
              b("Hit sent do device AnalyticsService for delivery", locald);
              try
              {
                this.b.b(locald.c());
                localArrayList.add(Long.valueOf(locald.c()));
              }
              catch (SQLiteException localSQLiteException8)
              {
                e("Failed to remove hit that was send for delivery", localSQLiteException8);
                E();
                try
                {
                  this.b.c();
                  this.b.d();
                  return false;
                }
                catch (SQLiteException localSQLiteException9)
                {
                  e("Failed to commit local dispatch transaction", localSQLiteException9);
                  E();
                  return false;
                }
              }
            }
          }
          long l3 = l2;
          List localList2;
          long l4;
          if (this.c.b())
          {
            localList2 = this.c.a(localList1);
            Iterator localIterator2 = localList2.iterator();
            l4 = l3;
            while (localIterator2.hasNext())
              l4 = Math.max(l4, ((Long)localIterator2.next()).longValue());
            localList1.removeAll(localList2);
          }
          try
          {
            this.b.a(localList2);
            localArrayList.addAll(localList2);
            l3 = l4;
            boolean bool = localArrayList.isEmpty();
            if (bool)
              try
              {
                this.b.c();
                this.b.d();
                return false;
              }
              catch (SQLiteException localSQLiteException5)
              {
                e("Failed to commit local dispatch transaction", localSQLiteException5);
                E();
                return false;
              }
          }
          catch (SQLiteException localSQLiteException6)
          {
            e("Failed to remove successfully uploaded hits", localSQLiteException6);
            E();
            try
            {
              this.b.c();
              this.b.d();
              return false;
            }
            catch (SQLiteException localSQLiteException7)
            {
              e("Failed to commit local dispatch transaction", localSQLiteException7);
              E();
              return false;
            }
            try
            {
              this.b.c();
              this.b.d();
              l2 = l3;
            }
            catch (SQLiteException localSQLiteException4)
            {
              e("Failed to commit local dispatch transaction", localSQLiteException4);
              E();
              return false;
            }
          }
        }
      }
    }
    finally
    {
      try
      {
        this.b.c();
        this.b.d();
        throw localObject;
      }
      catch (SQLiteException localSQLiteException1)
      {
        e("Failed to commit local dispatch transaction", localSQLiteException1);
        E();
      }
    }
    return false;
  }

  private long C()
  {
    com.google.android.gms.internal.z.d();
    z();
    try
    {
      long l = this.b.g();
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      e("Failed to get min/max hit times from local store", localSQLiteException);
    }
    return 0L;
  }

  private void D()
  {
    ax localax = q();
    if (!localax.b());
    long l;
    do
    {
      do
        return;
      while (localax.c());
      l = C();
    }
    while ((l == 0L) || (Math.abs(j().a() - l) > ((Long)az.h.a()).longValue()));
    a("Dispatch alarm scheduled (ms)", Long.valueOf(as.e()));
    localax.d();
  }

  private void E()
  {
    if (this.g.c())
      c("All hits dispatched or no network/service. Going to power save mode");
    this.g.d();
    ax localax = q();
    if (localax.c())
      localax.e();
  }

  private long F()
  {
    long l;
    if (this.f != -9223372036854775808L)
      l = this.f;
    do
    {
      return l;
      l = ((Long)az.e.a()).longValue();
    }
    while (!r().e());
    return 1000L * r().f();
  }

  private void G()
  {
    z();
    w.r();
    this.k = true;
    this.e.d();
    g();
  }

  private void a(b paramb, com.google.android.gms.internal.ah paramah)
  {
    android.support.v4.app.d.a(paramb);
    android.support.v4.app.d.a(paramah);
    o localo = new o(i());
    localo.b(paramb.e());
    localo.a(paramb.f());
    com.google.android.gms.internal.w localw = localo.f();
    f localf = (f)localw.b(f.class);
    localf.a("data");
    localf.h();
    localw.a(paramah);
    e locale = (e)localw.b(e.class);
    ag localag = (ag)localw.b(ag.class);
    Iterator localIterator = paramb.h().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = (String)localEntry.getKey();
      String str2 = (String)localEntry.getValue();
      if ("an".equals(str1))
      {
        localag.a(str2);
        continue;
      }
      if ("av".equals(str1))
      {
        localag.b(str2);
        continue;
      }
      if ("aid".equals(str1))
      {
        localag.c(str2);
        continue;
      }
      if ("aiid".equals(str1))
      {
        localag.d(str2);
        continue;
      }
      if ("uid".equals(str1))
      {
        localf.c(str2);
        continue;
      }
      locale.a(str1, str2);
    }
    b("Sending installation campaign to", paramb.e(), paramah);
    localw.a(s().b());
    localw.e();
  }

  private boolean b(String paramString)
  {
    return k().checkCallingOrSelfPermission(paramString) == 0;
  }

  private void h()
  {
    if (this.k);
    do
    {
      long l;
      do
      {
        do
          return;
        while ((!as.b()) || (this.e.b()));
        l = ((Long)az.C.a()).longValue();
      }
      while (!this.i.a(l));
      this.i.a();
      c("Connecting to service");
    }
    while (!this.e.c());
    c("Connected to service");
    this.i.b();
    e();
  }

  protected final void a()
  {
    this.b.A();
    this.c.A();
    this.e.A();
  }

  public final void a(ay paramay)
  {
    long l1 = this.j;
    com.google.android.gms.internal.z.d();
    z();
    long l2 = -1L;
    long l3 = s().d();
    if (l3 != 0L)
      l2 = Math.abs(j().a() - l3);
    b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(l2));
    h();
    try
    {
      B();
      s().e();
      g();
      if (paramay != null)
        paramay.a();
      if (this.j != l1)
        this.d.c();
      return;
    }
    catch (Throwable localThrowable)
    {
      do
      {
        e("Local dispatch failed", localThrowable);
        s().e();
        g();
      }
      while (paramay == null);
      paramay.a();
    }
  }

  public final void a(d paramd)
  {
    android.support.v4.app.d.a(paramd);
    com.google.android.gms.internal.z.d();
    z();
    if (this.k)
    {
      d("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
      if (TextUtils.isEmpty(paramd.g()))
        break label70;
    }
    while (true)
    {
      h();
      if (!this.e.a(paramd))
        break label168;
      d("Hit sent to the device AnalyticsService for delivery");
      return;
      a("Delivering hit", paramd);
      break;
      label70: Pair localPair = s().g().a();
      if (localPair == null)
        continue;
      Long localLong = (Long)localPair.second;
      String str1 = (String)localPair.first;
      String str2 = localLong + ":" + str1;
      HashMap localHashMap = new HashMap(paramd.b());
      localHashMap.put("_m", str2);
      paramd = d.a(this, paramd, localHashMap);
    }
    try
    {
      label168: this.b.a(paramd);
      g();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      e("Delivery failed to save hit to a database", localSQLiteException);
      l().a(paramd, "deliver: failed to insert hit to database");
    }
  }

  protected final void a(b paramb)
  {
    w.r();
    b("Sending first hit to property", paramb.e());
    if (s().c().a(as.l()));
    String str;
    do
    {
      return;
      str = s().f();
    }
    while (TextUtils.isEmpty(str));
    com.google.android.gms.internal.ah localah = m.a(l(), str);
    b("Found relevant installation campaign", localah);
    a(paramb, localah);
  }

  public final void a(String paramString)
  {
    android.support.v4.app.d.i(paramString);
    w.r();
    com.google.android.gms.internal.ah localah = m.a(l(), paramString);
    if (localah == null)
      d("Parsing failed. Ignoring invalid campaign data", paramString);
    while (true)
    {
      return;
      String str = s().f();
      if (paramString.equals(str))
      {
        f("Ignoring duplicate install campaign");
        return;
      }
      if (!TextUtils.isEmpty(str))
      {
        d("Ignoring multiple install campaigns. original, new", str, paramString);
        return;
      }
      s().a(paramString);
      if (s().c().a(as.l()))
      {
        d("Campaign received too late, ignoring", localah);
        return;
      }
      b("Received installation campaign", localah);
      Iterator localIterator = this.b.h().iterator();
      while (localIterator.hasNext())
        a((b)localIterator.next(), localah);
    }
  }

  public final long b(b paramb)
  {
    android.support.v4.app.d.a(paramb);
    z();
    w.r();
    try
    {
      this.b.b();
      this.b.a(0L, paramb.d());
      long l = this.b.a(0L, paramb.d(), paramb.e());
      paramb.a(1L + l);
      this.b.a(paramb);
      this.b.c();
      try
      {
        this.b.d();
        return l;
      }
      catch (SQLiteException localSQLiteException4)
      {
        e("Failed to end transaction", localSQLiteException4);
        return l;
      }
    }
    catch (SQLiteException localSQLiteException2)
    {
      e("Failed to update Analytics property", localSQLiteException2);
      try
      {
        this.b.d();
        return -1L;
      }
      catch (SQLiteException localSQLiteException3)
      {
        while (true)
          e("Failed to end transaction", localSQLiteException3);
      }
    }
    finally
    {
    }
    try
    {
      this.b.d();
      throw localObject;
    }
    catch (SQLiteException localSQLiteException1)
    {
      while (true)
        e("Failed to end transaction", localSQLiteException1);
    }
  }

  final void b()
  {
    z();
    boolean bool;
    Context localContext;
    if (!this.a)
    {
      bool = true;
      android.support.v4.app.d.a(bool, "Analytics backend already started");
      this.a = true;
      localContext = i().a();
      if (AnalyticsReceiver.a(localContext))
        break label82;
      f("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
      label47: if (CampaignTrackingReceiver.a(localContext))
        break label99;
      f("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
    }
    while (true)
    {
      n().a(new ak(this));
      return;
      bool = false;
      break;
      label82: if (AnalyticsService.a(localContext))
        break label47;
      g("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
      break label47;
      label99: if (CampaignTrackingService.a(localContext))
        continue;
      f("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
    }
  }

  protected final void c()
  {
    z();
    s().b();
    if (!b("android.permission.ACCESS_NETWORK_STATE"))
    {
      g("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      G();
    }
    if (!b("android.permission.INTERNET"))
    {
      g("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      G();
    }
    if (AnalyticsService.a(k()))
      c("AnalyticsService registered in the app manifest and enabled");
    while (true)
    {
      if ((!this.k) && (!this.b.e()))
        h();
      g();
      return;
      f("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
    }
  }

  final void d()
  {
    w.r();
    this.j = j().a();
  }

  protected final void e()
  {
    w.r();
    com.google.android.gms.internal.z.d();
    z();
    if (!as.b())
      f("Service client disabled. Can't dispatch local hits to device AnalyticsService");
    if (!this.e.b())
      c("Service not connected");
    do
      return;
    while (this.b.e());
    c("Dispatching local hits to device AnalyticsService");
    while (true)
    {
      List localList;
      try
      {
        localList = this.b.a(as.f());
        if (!localList.isEmpty())
          break label117;
        g();
        return;
      }
      catch (SQLiteException localSQLiteException1)
      {
        e("Failed to read hits from store", localSQLiteException1);
        E();
        return;
      }
      label98: Object localObject;
      localList.remove(localObject);
      try
      {
        this.b.b(((d)localObject).c());
        label117: if (localList.isEmpty())
          continue;
        localObject = (d)localList.get(0);
        if (this.e.a((d)localObject))
          break label98;
        g();
        return;
      }
      catch (SQLiteException localSQLiteException2)
      {
        e("Failed to remove hit that was send for delivery", localSQLiteException2);
        E();
      }
    }
  }

  public final void f()
  {
    com.google.android.gms.internal.z.d();
    z();
    c("Service disconnected");
  }

  public final void g()
  {
    w.r();
    z();
    if ((!this.k) && (F() > 0L));
    for (int m = 1; m == 0; m = 0)
    {
      this.d.b();
      E();
      return;
    }
    if (this.b.e())
    {
      this.d.b();
      E();
      return;
    }
    boolean bool;
    long l1;
    long l3;
    if (!((Boolean)az.z.a()).booleanValue())
    {
      this.d.a();
      bool = this.d.d();
      if (!bool)
        break label240;
      D();
      l1 = F();
      long l2 = s().d();
      if (l2 == 0L)
        break label218;
      l3 = l1 - Math.abs(j().a() - l2);
      if (l3 <= 0L)
        break label206;
    }
    while (true)
    {
      a("Dispatch scheduled (ms)", Long.valueOf(l3));
      if (!this.g.c())
        break label230;
      long l4 = Math.max(1L, l3 + this.g.b());
      this.g.b(l4);
      return;
      bool = true;
      break;
      label206: l3 = Math.min(as.d(), l1);
      continue;
      label218: l3 = Math.min(as.d(), l1);
    }
    label230: this.g.a(l3);
    return;
    label240: E();
    D();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.ah
 * JD-Core Version:    0.6.0
 */