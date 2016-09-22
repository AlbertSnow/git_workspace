package com.google.android.gms.ads.internal.activeview;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.webview.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

@com.google.android.gms.ads.internal.report.client.a
public final class l
  implements m
{
  public final Object a = new Object();
  public final WeakHashMap b = new WeakHashMap();
  private final ArrayList c = new ArrayList();
  private final Context d;
  private final VersionInfoParcel e;
  private final com.google.android.gms.ads.internal.js.n f;

  public l(Context paramContext, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.js.n paramn)
  {
    this.d = paramContext.getApplicationContext();
    this.e = paramVersionInfoParcel;
    this.f = paramn;
  }

  private boolean d(com.google.android.gms.ads.internal.state.a parama)
  {
    while (true)
    {
      synchronized (this.a)
      {
        a locala = (a)this.b.get(parama);
        if ((locala != null) && (locala.d()))
        {
          i = 1;
          return i;
        }
      }
      int i = 0;
    }
  }

  public final a a(AdSizeParcel paramAdSizeParcel, com.google.android.gms.ads.internal.state.a parama)
  {
    return a(paramAdSizeParcel, parama, parama.b.b());
  }

  public final a a(AdSizeParcel paramAdSizeParcel, com.google.android.gms.ads.internal.state.a parama, View paramView)
  {
    return a(paramAdSizeParcel, parama, new i(paramView, parama), null);
  }

  public final a a(AdSizeParcel paramAdSizeParcel, com.google.android.gms.ads.internal.state.a parama, v paramv, ak paramak)
  {
    Object localObject3;
    synchronized (this.a)
    {
      if (d(parama))
      {
        a locala = (a)this.b.get(parama);
        return locala;
      }
      if (paramak != null)
        localObject3 = new n(this.d, paramAdSizeParcel, parama, this.e, paramv, paramak);
    }
    synchronized (((a)localObject3).a)
    {
      ((a)localObject3).c = this;
      this.b.put(parama, localObject3);
      this.c.add(localObject3);
      monitorexit;
      return localObject3;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
      localObject3 = new o(this.d, paramAdSizeParcel, parama, this.e, paramv, this.f);
    }
  }

  public final void a(a parama)
  {
    synchronized (this.a)
    {
      if (!parama.d())
      {
        this.c.remove(parama);
        Iterator localIterator = this.b.entrySet().iterator();
        while (localIterator.hasNext())
        {
          if (((Map.Entry)localIterator.next()).getValue() != parama)
            continue;
          localIterator.remove();
        }
      }
    }
    monitorexit;
  }

  public final void a(com.google.android.gms.ads.internal.state.a parama)
  {
    synchronized (this.a)
    {
      a locala = (a)this.b.get(parama);
      if (locala != null)
        locala.c();
      return;
    }
  }

  public final void b(com.google.android.gms.ads.internal.state.a parama)
  {
    synchronized (this.a)
    {
      a locala = (a)this.b.get(parama);
      if (locala != null);
      synchronized (locala.a)
      {
        locala.d = true;
        locala.a(3);
        return;
      }
    }
  }

  public final void c(com.google.android.gms.ads.internal.state.a parama)
  {
    synchronized (this.a)
    {
      a locala = (a)this.b.get(parama);
      if (locala != null);
      synchronized (locala.a)
      {
        locala.d = false;
        locala.a(3);
        return;
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.l
 * JD-Core Version:    0.6.0
 */