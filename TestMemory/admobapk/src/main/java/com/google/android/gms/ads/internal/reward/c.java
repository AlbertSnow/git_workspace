package com.google.android.gms.ads.internal.reward;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import anw;
import com.google.android.gms.ads.internal.bd;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.service.j;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.reward.mediation.h;
import com.google.android.gms.ads.internal.util.an;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class c extends com.google.android.gms.ads.internal.c
  implements com.google.android.gms.ads.internal.reward.mediation.e
{
  private static final com.google.android.gms.ads.internal.mediation.client.a k = new com.google.android.gms.ads.internal.mediation.client.a();
  final Map i = new HashMap();
  boolean j;

  public c(Context paramContext, m paramm, AdSizeParcel paramAdSizeParcel, com.google.android.gms.ads.internal.mediation.client.b paramb, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, null, paramb, paramVersionInfoParcel, paramm);
  }

  private final com.google.android.gms.ads.internal.state.b b(com.google.android.gms.ads.internal.state.b paramb)
  {
    com.google.android.gms.ads.internal.util.c.a("Creating mediation ad response for non-mediated rewarded ad.");
    try
    {
      String str1 = j.a(paramb.b).toString();
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("pubid", paramb.a.e);
      String str2 = localJSONObject.toString();
      com.google.android.gms.ads.internal.mediation.b localb = new com.google.android.gms.ads.internal.mediation.b(str1, null, Arrays.asList(new String[] { "com.google.ads.mediation.admob.AdMobAdapter" }), null, null, Collections.emptyList(), Collections.emptyList(), str2, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
      com.google.android.gms.ads.internal.mediation.c localc = new com.google.android.gms.ads.internal.mediation.c(Arrays.asList(new com.google.android.gms.ads.internal.mediation.b[] { localb }), -1L, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false);
      return new com.google.android.gms.ads.internal.state.b(paramb.a, paramb.b, localc, paramb.d, paramb.e, paramb.f, paramb.g, paramb.h);
    }
    catch (JSONException localJSONException)
    {
      com.google.android.gms.ads.internal.util.c.b("Unable to generate ad state for non-mediated rewarded video.", localJSONException);
    }
    return new com.google.android.gms.ads.internal.state.b(paramb.a, paramb.b, null, paramb.d, 0, paramb.f, paramb.g, paramb.h);
  }

  public final boolean H()
  {
    anw.b("isLoaded must be called on the main UI thread.");
    return (this.d.g == null) && (this.d.h == null) && (this.d.j != null) && (!this.j);
  }

  public final void I()
  {
    a(this.d.j, false);
    o();
  }

  public final void J()
  {
    if ((this.d.j != null) && (this.d.j.n != null))
      com.google.android.gms.ads.internal.mediation.k.a(this.d.c, this.d.e.b, this.d.j, this.d.b, false, this.d.j.n.j);
    q();
  }

  public final void K()
  {
    m();
  }

  public final void L()
  {
    e();
  }

  public final void M()
  {
    n();
  }

  public final void a()
  {
    anw.b("destroy must be called on the main UI thread.");
    Iterator localIterator = this.i.keySet().iterator();
    while (true)
      if (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        try
        {
          com.google.android.gms.ads.internal.reward.mediation.k localk = (com.google.android.gms.ads.internal.reward.mediation.k)this.i.get(str1);
          if ((localk == null) || (localk.a == null))
            continue;
          localk.a.c();
        }
        catch (RemoteException localRemoteException)
        {
          String str2 = String.valueOf(str1);
          if (str2.length() != 0);
          for (String str3 = "Fail to destroy adapter: ".concat(str2); ; str3 = new String("Fail to destroy adapter: "))
          {
            com.google.android.gms.ads.internal.util.c.e(str3);
            break;
          }
        }
      }
  }

  public final void a(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    anw.b("loadAd must be called on the main UI thread.");
    if (TextUtils.isEmpty(paramRewardedVideoAdRequestParcel.c))
    {
      com.google.android.gms.ads.internal.util.c.e("Invalid ad unit id. Aborting.");
      return;
    }
    this.j = false;
    this.d.b = paramRewardedVideoAdRequestParcel.c;
    super.a(paramRewardedVideoAdRequestParcel.b);
  }

  public final void a(com.google.android.gms.ads.internal.state.b paramb, l paraml)
  {
    if (paramb.e != -2)
    {
      y.a.post(new d(this, paramb));
      return;
    }
    this.d.k = paramb;
    if (paramb.c == null)
      this.d.k = b(paramb);
    this.d.E = 0;
    bd localbd = this.d;
    h localh = new h(this.d.c, this.d.k, this);
    String str1 = String.valueOf(localh.getClass().getName());
    if (str1.length() != 0);
    for (String str2 = "AdRenderer: ".concat(str1); ; str2 = new String("AdRenderer: "))
    {
      com.google.android.gms.ads.internal.util.c.b(str2);
      localh.d();
      localbd.h = localh;
      return;
    }
  }

  protected final boolean a(AdRequestParcel paramAdRequestParcel, com.google.android.gms.ads.internal.state.a parama, boolean paramBoolean)
  {
    return false;
  }

  public final boolean a(com.google.android.gms.ads.internal.state.a parama1, com.google.android.gms.ads.internal.state.a parama2)
  {
    return true;
  }

  public final com.google.android.gms.ads.internal.reward.mediation.k b(String paramString)
  {
    Object localObject1 = (com.google.android.gms.ads.internal.reward.mediation.k)this.i.get(paramString);
    if (localObject1 == null);
    try
    {
      localb = this.h;
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
      {
        localObject4 = k;
        localObject3 = new com.google.android.gms.ads.internal.reward.mediation.k(((com.google.android.gms.ads.internal.mediation.client.b)localObject4).a(paramString), this);
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        com.google.android.gms.ads.internal.mediation.client.b localb;
        try
        {
          this.i.put(paramString, localObject3);
          localObject1 = localObject3;
          return localObject1;
          localException1 = localException1;
          localObject2 = localException1;
          Object localObject3 = localObject1;
          String str1 = String.valueOf(paramString);
          if (str1.length() == 0)
            continue;
          String str2 = "Fail to instantiate adapter ".concat(str1);
          com.google.android.gms.ads.internal.util.c.c(str2, (Throwable)localObject2);
          return localObject3;
          str2 = new String("Fail to instantiate adapter ");
          continue;
        }
        catch (Exception localException2)
        {
          Object localObject2 = localException2;
          continue;
        }
        Object localObject4 = localb;
      }
    }
  }

  public final void b(RewardItemParcel paramRewardItemParcel)
  {
    if ((this.d.j != null) && (this.d.j.n != null))
      com.google.android.gms.ads.internal.mediation.k.a(this.d.c, this.d.e.b, this.d.j, this.d.b, false, this.d.j.n.k);
    if ((this.d.j != null) && (this.d.j.q != null) && (!TextUtils.isEmpty(this.d.j.q.j)))
      paramRewardItemParcel = new RewardItemParcel(this.d.j.q.j, this.d.j.q.k);
    a(paramRewardItemParcel);
  }

  public final void h()
  {
    anw.b("pause must be called on the main UI thread.");
    Iterator localIterator = this.i.keySet().iterator();
    while (true)
      if (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        try
        {
          com.google.android.gms.ads.internal.reward.mediation.k localk = (com.google.android.gms.ads.internal.reward.mediation.k)this.i.get(str1);
          if ((localk == null) || (localk.a == null))
            continue;
          localk.a.d();
        }
        catch (RemoteException localRemoteException)
        {
          String str2 = String.valueOf(str1);
          if (str2.length() != 0);
          for (String str3 = "Fail to pause adapter: ".concat(str2); ; str3 = new String("Fail to pause adapter: "))
          {
            com.google.android.gms.ads.internal.util.c.e(str3);
            break;
          }
        }
      }
  }

  public final void i()
  {
    anw.b("resume must be called on the main UI thread.");
    Iterator localIterator = this.i.keySet().iterator();
    while (true)
      if (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        try
        {
          com.google.android.gms.ads.internal.reward.mediation.k localk = (com.google.android.gms.ads.internal.reward.mediation.k)this.i.get(str1);
          if ((localk == null) || (localk.a == null))
            continue;
          localk.a.e();
        }
        catch (RemoteException localRemoteException)
        {
          String str2 = String.valueOf(str1);
          if (str2.length() != 0);
          for (String str3 = "Fail to resume adapter: ".concat(str2); ; str3 = new String("Fail to resume adapter: "))
          {
            com.google.android.gms.ads.internal.util.c.e(str3);
            break;
          }
        }
      }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.c
 * JD-Core Version:    0.6.0
 */