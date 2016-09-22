package com.google.android.gms.ads.internal.mediation;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class o
  implements a
{
  private final AdRequestInfoParcel a;
  private final com.google.android.gms.ads.internal.mediation.client.b b;
  private final Context c;
  private final Object d = new Object();
  private final c e;
  private final boolean f;
  private final long g;
  private final long h;
  private final l i;
  private final boolean j;
  private boolean k = false;
  private f l;
  private List m = new ArrayList();

  public o(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, com.google.android.gms.ads.internal.mediation.client.b paramb, c paramc, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, l paraml)
  {
    this.c = paramContext;
    this.a = paramAdRequestInfoParcel;
    this.b = paramb;
    this.e = paramc;
    this.f = paramBoolean1;
    this.j = paramBoolean2;
    this.g = paramLong1;
    this.h = paramLong2;
    this.i = paraml;
  }

  public final i a(List paramList)
  {
    com.google.android.gms.ads.internal.util.c.b("Starting mediation.");
    ArrayList localArrayList = new ArrayList();
    j localj1 = this.i.a();
    Iterator localIterator1 = paramList.iterator();
    label424: 
    while (localIterator1.hasNext())
    {
      b localb = (b)localIterator1.next();
      String str1 = String.valueOf(localb.b);
      String str2;
      Iterator localIterator2;
      if (str1.length() != 0)
      {
        str2 = "Trying mediation network: ".concat(str1);
        com.google.android.gms.ads.internal.util.c.d(str2);
        localIterator2 = localb.c.iterator();
      }
      while (true)
      {
        String str3;
        j localj2;
        i locali2;
        while (true)
        {
          if (!localIterator2.hasNext())
            break label424;
          str3 = (String)localIterator2.next();
          localj2 = this.i.a();
          synchronized (this.d)
          {
            if (this.k)
            {
              i locali1 = new i(-1);
              return locali1;
              str2 = new String("Trying mediation network: ");
              break;
            }
            this.l = new f(this.c, str3, this.b, this.e, localb, this.a.c, this.a.d, this.a.k, this.f, this.j, this.a.z, this.a.n);
            locali2 = this.l.a(this.g, this.h);
            this.m.add(locali2);
            if (locali2.a == 0)
            {
              com.google.android.gms.ads.internal.util.c.b("Adapter succeeded.");
              this.i.a("mediation_network_succeed", str3);
              if (!localArrayList.isEmpty())
                this.i.a("mediation_networks_fail", TextUtils.join(",", localArrayList));
              this.i.a(localj2, new String[] { "mls" });
              this.i.a(localj1, new String[] { "ttm" });
              return locali2;
            }
          }
        }
        localArrayList.add(str3);
        this.i.a(localj2, new String[] { "mlf" });
        if (locali2.c == null)
          continue;
        y.a.post(new p(this, locali2));
      }
    }
    if (!localArrayList.isEmpty())
      this.i.a("mediation_networks_fail", TextUtils.join(",", localArrayList));
    return new i(1);
  }

  public final void a()
  {
    synchronized (this.d)
    {
      this.k = true;
      if (this.l != null)
        this.l.a();
      return;
    }
  }

  public final List b()
  {
    return this.m;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.o
 * JD-Core Version:    0.6.0
 */