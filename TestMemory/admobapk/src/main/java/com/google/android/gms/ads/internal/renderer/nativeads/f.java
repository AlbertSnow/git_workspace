package com.google.android.gms.ads.internal.renderer.nativeads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import apn;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.client.ab;
import com.google.android.gms.ads.internal.formats.client.s;
import com.google.android.gms.ads.internal.js.aj;
import com.google.android.gms.ads.internal.js.z;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.av;
import com.google.android.gms.ads.internal.util.ba;
import com.google.android.gms.ads.internal.util.bc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import ey;
import ha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class f
  implements Callable
{
  private static final long c = TimeUnit.SECONDS.toMillis(60L);
  final an a;
  final com.google.android.gms.ads.internal.state.b b;
  private final Context d;
  private final av e;
  private final ha f;
  private final a g;
  private final Object h = new Object();
  private boolean i;
  private int j;
  private List k;
  private JSONObject l;

  public f(Context paramContext, an paraman, av paramav, ha paramha, com.google.android.gms.ads.internal.state.b paramb)
  {
    this.d = paramContext;
    this.a = paraman;
    this.e = paramav;
    this.b = paramb;
    this.f = paramha;
    this.g = new a(paramContext, paramb, paraman, paramha);
    a locala = this.g;
    if (locala.l);
    while (true)
    {
      synchronized (a.b)
      {
        if (a.c)
          continue;
        if (locala.e.getApplicationContext() == null)
          continue;
        Context localContext = locala.e.getApplicationContext();
        a.d = new com.google.android.gms.ads.internal.js.n(localContext, locala.f.a.k, a.a(locala.f), new d(locala), new z());
        a.c = true;
        this.i = false;
        this.j = -2;
        this.k = null;
        return;
        localContext = locala.e;
      }
      locala.i = new com.google.android.gms.ads.internal.js.c();
    }
  }

  private final com.google.android.gms.ads.internal.state.a a(com.google.android.gms.ads.internal.formats.i parami)
  {
    while (true)
    {
      synchronized (this.h)
      {
        int m = this.j;
        if ((parami != null) || (this.j != -2))
          continue;
        m = 0;
        if (m != -2)
        {
          locali = null;
          return new com.google.android.gms.ads.internal.state.a(this.b.a.c, null, this.b.b.d, m, this.b.b.f, this.k, this.b.b.l, this.b.b.k, this.b.a.i, false, null, null, null, null, null, 0L, this.b.d, this.b.b.g, this.b.f, this.b.g, this.b.b.o, this.l, locali, null, null, null, this.b.b.F, this.b.b.G, null, this.b.b.J);
        }
      }
      com.google.android.gms.ads.internal.formats.i locali = parami;
    }
  }

  private static Integer a(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);
      Integer localInteger = Integer.valueOf(Color.rgb(localJSONObject.getInt("r"), localJSONObject.getInt("g"), localJSONObject.getInt("b")));
      return localInteger;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  static List a(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add((Drawable)apn.a(((com.google.android.gms.ads.internal.formats.c)localIterator.next()).a()));
    return localArrayList;
  }

  private com.google.android.gms.ads.internal.state.a b()
  {
    try
    {
      a locala = this.g;
      if (locala.l)
        locala.j = new aj(a.d.b(locala.h));
      while (true)
      {
        str2 = UUID.randomUUID().toString();
        if (!a())
          break;
        localJSONObject1 = null;
        if (a())
          break label784;
        str3 = localJSONObject1.getString("template_id");
        if (this.b.a.z == null)
          break label772;
        bool1 = this.b.a.z.b;
        if (this.b.a.z == null)
          break label778;
        bool2 = this.b.a.z.d;
        if (!"2".equals(str3))
          break label446;
        localObject1 = new p(bool1, bool2);
        if (!a())
          break label612;
        localObject2 = null;
        if ((localObject2 instanceof com.google.android.gms.ads.internal.formats.f))
        {
          com.google.android.gms.ads.internal.formats.f localf1 = (com.google.android.gms.ads.internal.formats.f)localObject2;
          o localo = new o(this);
          j localj = new j(this, localf1);
          localo.a = localj;
          this.g.a(new k(this, localj));
        }
        return a((com.google.android.gms.ads.internal.formats.i)localObject2);
        com.google.android.gms.ads.internal.js.c localc = locala.i;
        Context localContext = locala.e;
        VersionInfoParcel localVersionInfoParcel = locala.f.a.k;
        String str1 = a.a(locala.f);
        ha localha = locala.h;
        com.google.android.gms.ads.internal.js.f localf = new com.google.android.gms.ads.internal.js.f();
        y.a.post(new com.google.android.gms.ads.internal.js.d(localc, localContext, localVersionInfoParcel, localf, localha, str1));
        locala.k = ((com.google.android.gms.ads.internal.js.a)localf.get(a.a, TimeUnit.MILLISECONDS));
        locala.k.a(locala.g, locala.g, locala.g, locala.g, false, null, null, null);
      }
    }
    catch (CancellationException localCancellationException)
    {
      while (true)
      {
        String str2;
        String str3;
        if (!this.i)
          a(0);
        return a(null);
        com.google.android.gms.ads.internal.util.future.a locala2 = new com.google.android.gms.ads.internal.util.future.a();
        g localg = new g(this, new o(this), locala2, str2);
        this.g.a(localg);
        JSONObject localJSONObject1 = (JSONObject)locala2.get(c, TimeUnit.MILLISECONDS);
        continue;
        if ("1".equals(str3))
        {
          localObject1 = new q(bool1, bool2);
          continue;
        }
        if ("3".equals(str3))
        {
          String str4 = localJSONObject1.getString("custom_template_id");
          com.google.android.gms.ads.internal.util.future.a locala1 = new com.google.android.gms.ads.internal.util.future.a();
          y.a.post(new i(this, locala1, str4));
          if (locala1.get(c, TimeUnit.MILLISECONDS) != null)
          {
            localObject1 = new r(bool1);
            continue;
          }
          String str5 = String.valueOf(localJSONObject1.getString("custom_template_id"));
          if (str5.length() != 0);
          for (String str6 = "No handler for custom template: ".concat(str5); ; str6 = new String("No handler for custom template: "))
          {
            com.google.android.gms.ads.internal.util.c.c(str6);
            break;
          }
        }
        a(0);
        break;
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("tracking_urls_and_actions");
        String[] arrayOfString = b(localJSONObject2, "impression_tracking_urls");
        if (arrayOfString == null);
        com.google.android.gms.ads.internal.formats.i locali;
        for (List localList = null; ; localList = Arrays.asList(arrayOfString))
        {
          this.k = localList;
          this.l = localJSONObject2.optJSONObject("active_view");
          locali = ((n)localObject1).a(this, localJSONObject1);
          if (locali != null)
            break label697;
          com.google.android.gms.ads.internal.util.c.c("Failed to retrieve ad assets.");
          localObject2 = null;
          break;
        }
        locali.a(new com.google.android.gms.ads.internal.formats.j(this.d, this.a, this.g, this.f, localJSONObject1, locali, this.b.a.k, str2));
        Object localObject2 = locali;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.c("Malformed native JSON response.", localJSONException);
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
      {
        label697: com.google.android.gms.ads.internal.util.c.c("Timeout when loading native ad.", localTimeoutException);
        continue;
        label772: boolean bool1 = false;
        continue;
        label778: boolean bool2 = false;
        continue;
        label784: Object localObject1 = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      label446: label612: break label369;
    }
    catch (InterruptedException localInterruptedException)
    {
      label369: break label369;
    }
  }

  private static String[] b(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    if (localJSONArray == null)
      return null;
    String[] arrayOfString = new String[localJSONArray.length()];
    for (int m = 0; m < localJSONArray.length(); m++)
      arrayOfString[m] = localJSONArray.getString(m);
    return arrayOfString;
  }

  public final com.google.android.gms.ads.internal.util.future.g a(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject("attribution");
    if (localJSONObject == null)
      return new com.google.android.gms.ads.internal.util.future.b(null);
    String str = localJSONObject.optString("text");
    int m = localJSONObject.optInt("text_size", -1);
    Integer localInteger1 = a(localJSONObject, "text_color");
    Integer localInteger2 = a(localJSONObject, "bg_color");
    int n = localJSONObject.optInt("animation_ms", 1000);
    int i1 = localJSONObject.optInt("presentation_ms", 4000);
    int i2;
    Object localObject;
    if ((this.b.a.z != null) && (this.b.a.z.a >= 2))
    {
      i2 = this.b.a.z.e;
      localObject = new ArrayList();
      if (localJSONObject.optJSONArray("images") == null)
        break label226;
      localObject = a(localJSONObject, "images", false, false, true);
    }
    while (true)
    {
      com.google.android.gms.ads.internal.util.future.g localg = com.google.android.gms.ads.internal.util.future.c.a((List)localObject);
      l locall = new l(this, str, localInteger2, localInteger1, m, i1, n, i2);
      com.google.android.gms.ads.internal.util.future.a locala = new com.google.android.gms.ads.internal.util.future.a();
      localg.a(new com.google.android.gms.ads.internal.util.future.d(locala, locall, localg));
      return locala;
      i2 = 1;
      break;
      label226: ((List)localObject).add(a(localJSONObject, "image", false, false));
    }
  }

  public final com.google.android.gms.ads.internal.util.future.g a(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1);
    for (JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString); ; localJSONObject = paramJSONObject.optJSONObject(paramString))
    {
      if (localJSONObject == null)
        localJSONObject = new JSONObject();
      return a(localJSONObject, paramBoolean1, paramBoolean2);
    }
  }

  final com.google.android.gms.ads.internal.util.future.g a(JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1);
    double d1;
    for (String str = paramJSONObject.getString("url"); ; str = paramJSONObject.optString("url"))
    {
      d1 = paramJSONObject.optDouble("scale", 1.0D);
      if (!TextUtils.isEmpty(str))
        break;
      a(0, paramBoolean1);
      return new com.google.android.gms.ads.internal.util.future.b(null);
    }
    if (paramBoolean2)
      return new com.google.android.gms.ads.internal.util.future.b(new com.google.android.gms.ads.internal.formats.c(null, Uri.parse(str), d1));
    av localav = this.e;
    m localm = new m(this, paramBoolean1, d1, str);
    bc localbc = new bc(localav);
    av.a.a(new ba(str, localm, localbc));
    return localbc;
  }

  public final List a(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1);
    ArrayList localArrayList;
    for (JSONArray localJSONArray = paramJSONObject.getJSONArray(paramString); ; localJSONArray = paramJSONObject.optJSONArray(paramString))
    {
      localArrayList = new ArrayList();
      if ((localJSONArray != null) && (localJSONArray.length() != 0))
        break;
      a(0, paramBoolean1);
      return localArrayList;
    }
    if (paramBoolean3);
    for (int m = localJSONArray.length(); ; m = 1)
      for (int n = 0; n < m; n++)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(n);
        if (localJSONObject == null)
          localJSONObject = new JSONObject();
        localArrayList.add(a(localJSONObject, paramBoolean1, paramBoolean2));
      }
    return localArrayList;
  }

  public final void a(int paramInt)
  {
    synchronized (this.h)
    {
      this.i = true;
      this.j = paramInt;
      return;
    }
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
      a(paramInt);
  }

  final void a(s params, String paramString)
  {
    try
    {
      ab localab = this.a.b(params.k());
      if (localab != null)
        localab.a(params, paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.c(40 + String.valueOf(paramString).length() + "Failed to call onCustomClick for asset " + paramString + ".", localRemoteException);
    }
  }

  public final boolean a()
  {
    synchronized (this.h)
    {
      boolean bool = this.i;
      return bool;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.nativeads.f
 * JD-Core Version:    0.6.0
 */