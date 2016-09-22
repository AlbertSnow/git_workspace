package com.google.android.gms.ads.internal.mediation;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@a
public final class c
{
  public final List a;
  public final long b;
  public final List c;
  public final List d;
  public final List e;
  public final List f;
  public final boolean g;
  public final String h;
  public final long i;
  public final String j;
  public final int k;
  public final int l;
  public final long m;
  public final boolean n;
  public int o;
  public int p;

  public c(String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject(paramString);
    String str1;
    if (com.google.android.gms.ads.internal.util.c.a(2))
    {
      str1 = String.valueOf(localJSONObject1.toString(2));
      if (str1.length() == 0)
        break label135;
    }
    JSONArray localJSONArray;
    ArrayList localArrayList;
    int i2;
    label135: for (String str2 = "Mediation Response JSON: ".concat(str1); ; str2 = new String("Mediation Response JSON: "))
    {
      com.google.android.gms.ads.internal.util.c.a(str2);
      localJSONArray = localJSONObject1.getJSONArray("ad_networks");
      localArrayList = new ArrayList(localJSONArray.length());
      int i1 = 0;
      i2 = -1;
      while (i1 < localJSONArray.length())
      {
        b localb = new b(localJSONArray.getJSONObject(i1));
        localArrayList.add(localb);
        if ((i2 < 0) && (a(localb)))
          i2 = i1;
        i1++;
      }
    }
    this.o = i2;
    this.p = localJSONArray.length();
    this.a = Collections.unmodifiableList(localArrayList);
    this.h = localJSONObject1.getString("qdata");
    this.l = localJSONObject1.optInt("fs_model_type", -1);
    this.m = localJSONObject1.optLong("timeout_ms", -1L);
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("settings");
    if (localJSONObject2 != null)
    {
      this.b = localJSONObject2.optLong("ad_network_timeout_millis", -1L);
      this.c = k.a(localJSONObject2, "click_urls");
      this.d = k.a(localJSONObject2, "imp_urls");
      this.e = k.a(localJSONObject2, "nofill_urls");
      this.f = k.a(localJSONObject2, "remote_ping_urls");
      this.g = localJSONObject2.optBoolean("render_in_browser", false);
      long l1 = localJSONObject2.optLong("refresh", -1L);
      long l2;
      RewardItemParcel localRewardItemParcel;
      if (l1 > 0L)
      {
        l2 = l1 * 1000L;
        this.i = l2;
        localRewardItemParcel = RewardItemParcel.a(localJSONObject2.optJSONArray("rewards"));
        if (localRewardItemParcel != null)
          break label398;
        this.j = null;
      }
      for (this.k = 0; ; this.k = localRewardItemParcel.c)
      {
        this.n = localJSONObject2.optBoolean("use_displayed_impression", false);
        return;
        l2 = -1L;
        break;
        label398: this.j = localRewardItemParcel.b;
      }
    }
    this.b = -1L;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.i = -1L;
    this.j = null;
    this.k = 0;
    this.n = false;
    this.g = false;
  }

  public c(List paramList1, long paramLong1, List paramList2, List paramList3, List paramList4, List paramList5, boolean paramBoolean1, String paramString1, long paramLong2, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, long paramLong3, boolean paramBoolean2)
  {
    this.a = paramList1;
    this.b = -1L;
    this.c = paramList2;
    this.d = paramList3;
    this.e = paramList4;
    this.f = paramList5;
    this.g = false;
    this.h = paramString1;
    this.i = -1L;
    this.o = 0;
    this.p = 1;
    this.j = null;
    this.k = 0;
    this.l = -1;
    this.m = -1L;
    this.n = false;
  }

  private static boolean a(b paramb)
  {
    Iterator localIterator = paramb.c.iterator();
    while (localIterator.hasNext())
      if (((String)localIterator.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
        return true;
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.c
 * JD-Core Version:    0.6.0
 */