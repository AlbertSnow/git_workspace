package com.google.android.gms.ads.internal.request;

import aht;
import ahu;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.gmsg.u;
import com.google.android.gms.ads.internal.js.aa;
import com.google.android.gms.ads.internal.js.n;
import com.google.android.gms.ads.internal.request.service.j;
import com.google.android.gms.ads.internal.request.service.r;
import com.google.android.gms.ads.internal.util.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class ae extends com.google.android.gms.ads.internal.util.a
{
  static n a;
  static com.google.android.gms.ads.internal.gmsg.ae b;
  private static long e = TimeUnit.SECONDS.toMillis(10L);
  private static final Object f = new Object();
  private static boolean g = false;
  private static u h;
  private static com.google.android.gms.ads.internal.gmsg.t i;
  final b c;
  aa d;
  private final q k;
  private final Object l = new Object();
  private final Context m;

  static
  {
    a = null;
    h = null;
    b = null;
    i = null;
  }

  public ae(Context paramContext, q paramq, b paramb)
  {
    super(true);
    this.c = paramb;
    this.m = paramContext;
    this.k = paramq;
    synchronized (f)
    {
      if (!g)
      {
        b = new com.google.android.gms.ads.internal.gmsg.ae();
        h = new u(paramContext.getApplicationContext(), paramq.j);
        i = new am();
        a = new n(this.m.getApplicationContext(), this.k.j, (String)m.a.a(), new al(), new ak());
        g = true;
      }
      return;
    }
  }

  private final AdResponseParcel a(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    String str = y.a();
    JSONObject localJSONObject1 = a(paramAdRequestInfoParcel, str);
    AdResponseParcel localAdResponseParcel;
    if (localJSONObject1 == null)
      localAdResponseParcel = new AdResponseParcel(0);
    while (true)
    {
      return localAdResponseParcel;
      long l1 = bc.a().i.b();
      com.google.android.gms.ads.internal.gmsg.ae localae = b;
      com.google.android.gms.ads.internal.util.future.a locala = new com.google.android.gms.ads.internal.util.future.a();
      localae.a.put(str, locala);
      com.google.android.gms.ads.internal.util.client.a.a.post(new ag(this, localJSONObject1, str));
      long l2 = e - (bc.a().i.b() - l1);
      try
      {
        localJSONObject2 = (JSONObject)locala.get(l2, TimeUnit.MILLISECONDS);
        if (localJSONObject2 == null)
          return new AdResponseParcel(-1);
      }
      catch (InterruptedException localInterruptedException)
      {
        return new AdResponseParcel(-1);
      }
      catch (TimeoutException localTimeoutException)
      {
        return new AdResponseParcel(2);
      }
      catch (ExecutionException localExecutionException)
      {
        JSONObject localJSONObject2;
        return new AdResponseParcel(0);
        localAdResponseParcel = j.a(this.m, paramAdRequestInfoParcel, localJSONObject2.toString());
        if ((localAdResponseParcel.e == -3) || (!TextUtils.isEmpty(localAdResponseParcel.c)))
          continue;
        return new AdResponseParcel(3);
      }
      catch (CancellationException localCancellationException)
      {
        label147: break label147;
      }
    }
  }

  private final JSONObject a(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    Bundle localBundle = paramAdRequestInfoParcel.c.c.getBundle("sdk_less_server_data");
    String str = paramAdRequestInfoParcel.c.c.getString("sdk_less_network_id");
    if (localBundle == null);
    JSONObject localJSONObject1;
    do
    {
      return null;
      r localr = bc.a().k.a(this.m);
      new com.google.android.gms.ads.internal.config.a((String)m.a.a());
      localJSONObject1 = j.a(paramAdRequestInfoParcel, localr, null, null, null, new ArrayList(), null, null);
    }
    while (localJSONObject1 == null);
    try
    {
      com.google.android.gms.ads.identifier.c localc2 = com.google.android.gms.ads.identifier.a.a(this.m);
      localc1 = localc2;
      localHashMap = new HashMap();
      localHashMap.put("request_id", paramString);
      localHashMap.put("network_id", str);
      localHashMap.put("request_param", localJSONObject1);
      localHashMap.put("data", localBundle);
      if (localc1 != null)
      {
        localHashMap.put("adid", localc1.a);
        if (!localc1.b)
          break label230;
        j = 1;
        localHashMap.put("lat", Integer.valueOf(j));
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      try
      {
        while (true)
        {
          HashMap localHashMap;
          JSONObject localJSONObject2 = bc.a().e.a(localHashMap);
          return localJSONObject2;
          localIllegalStateException = localIllegalStateException;
          com.google.android.gms.ads.internal.util.c.c("Cannot get advertising id info", localIllegalStateException);
          com.google.android.gms.ads.identifier.c localc1 = null;
        }
        int j = 0;
      }
      catch (JSONException localJSONException)
      {
        return null;
      }
    }
    catch (aht localaht)
    {
      break label216;
    }
    catch (IOException localIOException)
    {
      break label216;
    }
    catch (ahu localahu)
    {
      label216: label230: break label216;
    }
  }

  protected static void a(com.google.android.gms.ads.internal.js.a parama)
  {
    parama.a("/loadAd", b);
    parama.a("/fetchHttpRequest", h);
    parama.a("/invalidRequest", i);
  }

  protected static void b(com.google.android.gms.ads.internal.js.a parama)
  {
    parama.b("/loadAd", b);
    parama.b("/fetchHttpRequest", h);
    parama.b("/invalidRequest", i);
  }

  public final void a()
  {
    com.google.android.gms.ads.internal.util.c.b("SdkLessAdLoaderBackgroundTask started.");
    AdRequestInfoParcel localAdRequestInfoParcel = new AdRequestInfoParcel(this.k, null, -1L);
    AdResponseParcel localAdResponseParcel = a(localAdRequestInfoParcel);
    long l1 = bc.a().i.b();
    com.google.android.gms.ads.internal.state.b localb = new com.google.android.gms.ads.internal.state.b(localAdRequestInfoParcel, localAdResponseParcel, null, null, localAdResponseParcel.e, l1, localAdResponseParcel.n, null);
    com.google.android.gms.ads.internal.util.client.a.a.post(new af(this, localb));
  }

  public final void b()
  {
    synchronized (this.l)
    {
      com.google.android.gms.ads.internal.util.client.a.a.post(new aj(this));
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.ae
 * JD-Core Version:    0.6.0
 */