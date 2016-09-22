package com.google.android.gms.ads.internal.reward.mediation;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class h extends com.google.android.gms.ads.internal.util.a
  implements g
{
  final com.google.android.gms.ads.internal.reward.c a;
  private final com.google.android.gms.ads.internal.state.b b;
  private final Context c;
  private final ArrayList d = new ArrayList();
  private final ArrayList e = new ArrayList();
  private final HashSet f = new HashSet();
  private final Object g = new Object();

  public h(Context paramContext, com.google.android.gms.ads.internal.state.b paramb, com.google.android.gms.ads.internal.reward.c paramc)
  {
    this.c = paramContext;
    this.b = paramb;
    this.a = paramc;
  }

  private final com.google.android.gms.ads.internal.state.a a(int paramInt, String paramString, com.google.android.gms.ads.internal.mediation.b paramb)
  {
    return new com.google.android.gms.ads.internal.state.a(this.b.a.c, null, this.b.b.d, paramInt, this.b.b.f, this.b.b.j, this.b.b.l, this.b.b.k, this.b.a.i, this.b.b.h, paramb, null, paramString, this.b.c, null, this.b.b.i, this.b.d, this.b.b.g, this.b.f, this.b.b.n, this.b.b.o, this.b.h, null, this.b.b.C, this.b.b.D, this.b.b.E, this.b.b.F, this.b.b.G, null, this.b.b.J);
  }

  public final void a()
  {
    Iterator localIterator1 = this.b.c.a.iterator();
    String str2;
    String str3;
    while (localIterator1.hasNext())
    {
      com.google.android.gms.ads.internal.mediation.b localb = (com.google.android.gms.ads.internal.mediation.b)localIterator1.next();
      String str1 = localb.i;
      Iterator localIterator2 = localb.c.iterator();
      while (localIterator2.hasNext())
      {
        str2 = (String)localIterator2.next();
        if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str2))
          break label401;
        String str4;
        k localk;
        try
        {
          String str5 = new JSONObject(str1).getString("class_name");
          str3 = str5;
          str4 = localb.a;
          synchronized (this.g)
          {
            localk = this.a.b(str3);
            if ((localk != null) && (localk.b != null))
              if (localk.a != null)
                break label181;
          }
        }
        catch (JSONException localJSONException)
        {
          com.google.android.gms.ads.internal.util.c.b("Unable to determine custom event class name, skipping...", localJSONException);
        }
        continue;
        label181: a locala = new a(this.c, str3, str1, str4, this.b, localk, this);
        this.d.add((Future)locala.d());
        this.e.add(str3);
        monitorexit;
      }
    }
    for (int i = 0; ; i++)
    {
      if (i < this.d.size());
      try
      {
        ((Future)this.d.get(i)).get();
        synchronized (this.g)
        {
          if (this.f.contains(this.e.get(i)))
          {
            com.google.android.gms.ads.internal.state.a locala2 = a(-2, (String)this.e.get(i), (com.google.android.gms.ads.internal.mediation.b)this.b.c.a.get(i));
            com.google.android.gms.ads.internal.util.client.a.a.post(new i(this, locala2));
            return;
          }
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        com.google.android.gms.ads.internal.state.a locala1 = a(3, null, null);
        com.google.android.gms.ads.internal.util.client.a.a.post(new j(this, locala1));
        return;
      }
      catch (Exception localException)
      {
      }
      label401: str3 = str2;
      break;
    }
  }

  public final void a(int paramInt)
  {
  }

  public final void a(String paramString)
  {
    synchronized (this.g)
    {
      this.f.add(paramString);
      return;
    }
  }

  public final void b()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.h
 * JD-Core Version:    0.6.0
 */