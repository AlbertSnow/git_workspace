package com.google.android.gms.ads.internal.request.service;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.c;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@a
public final class o
{
  List A;
  String B;
  boolean C;
  String D;
  final AdRequestInfoParcel E;
  String a;
  String b;
  String c;
  List d;
  String e;
  String f;
  List g;
  long h = -1L;
  boolean i = false;
  List j;
  long k = -1L;
  int l = -1;
  boolean m = false;
  boolean n = false;
  boolean o = false;
  boolean p = true;
  String q = "";
  boolean r = false;
  boolean s = false;
  RewardItemParcel t;
  List u;
  List v;
  boolean w = false;
  AutoClickProtectionConfigurationParcel x;
  boolean y = false;
  String z;

  public o(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    this.E = paramAdRequestInfoParcel;
  }

  private static String a(Map paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
      return (String)localList.get(0);
    return null;
  }

  private static long b(Map paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      try
      {
        float f1 = Float.parseFloat(str);
        return ()(f1 * 1000.0F);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        c.e(36 + String.valueOf(paramString).length() + String.valueOf(str).length() + "Could not parse float from " + paramString + " header: " + str);
      }
    }
    return -1L;
  }

  private static List c(Map paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      if (str != null)
        return Arrays.asList(str.trim().split("\\s+"));
    }
    return null;
  }

  private static boolean d(Map paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    return (localList != null) && (!localList.isEmpty()) && (Boolean.valueOf((String)localList.get(0)).booleanValue());
  }

  public final void a(Map paramMap)
  {
    this.a = a(paramMap, "X-Afma-Ad-Size");
    this.D = a(paramMap, "X-Afma-Ad-Slot-Size");
    List localList1 = c(paramMap, "X-Afma-Click-Tracking-Urls");
    if (localList1 != null)
      this.d = localList1;
    List localList2 = (List)paramMap.get("X-Afma-Debug-Dialog");
    if ((localList2 != null) && (!localList2.isEmpty()))
      this.e = ((String)localList2.get(0));
    List localList3 = c(paramMap, "X-Afma-Tracking-Urls");
    if (localList3 != null)
      this.g = localList3;
    long l1 = b(paramMap, "X-Afma-Interstitial-Timeout");
    if (l1 != -1L)
      this.h = l1;
    this.i |= d(paramMap, "X-Afma-Mediation");
    List localList4 = c(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (localList4 != null)
      this.j = localList4;
    long l2 = b(paramMap, "X-Afma-Refresh-Rate");
    if (l2 != -1L)
      this.k = l2;
    List localList5 = (List)paramMap.get("X-Afma-Orientation");
    String str5;
    String str2;
    if ((localList5 != null) && (!localList5.isEmpty()))
    {
      str5 = (String)localList5.get(0);
      if ("portrait".equalsIgnoreCase(str5))
        this.l = bc.a().g.b();
    }
    else
    {
      this.f = a(paramMap, "X-Afma-ActiveView");
      List localList6 = (List)paramMap.get("X-Afma-Use-HTTPS");
      if ((localList6 != null) && (!localList6.isEmpty()))
        this.o = Boolean.valueOf((String)localList6.get(0)).booleanValue();
      this.m |= d(paramMap, "X-Afma-Custom-Rendering-Allowed");
      this.n = "native".equals(a(paramMap, "X-Afma-Ad-Format"));
      List localList7 = (List)paramMap.get("X-Afma-Content-Url-Opted-Out");
      if ((localList7 != null) && (!localList7.isEmpty()))
        this.p = Boolean.valueOf((String)localList7.get(0)).booleanValue();
      List localList8 = (List)paramMap.get("X-Afma-Gws-Query-Id");
      if ((localList8 != null) && (!localList8.isEmpty()))
        this.q = ((String)localList8.get(0));
      String str1 = a(paramMap, "X-Afma-Fluid");
      if ((str1 != null) && (str1.equals("height")))
        this.r = true;
      this.s = "native_express".equals(a(paramMap, "X-Afma-Ad-Format"));
      this.t = RewardItemParcel.a(a(paramMap, "X-Afma-Rewards"));
      if (this.u == null)
        this.u = c(paramMap, "X-Afma-Reward-Video-Start-Urls");
      if (this.v == null)
        this.v = c(paramMap, "X-Afma-Reward-Video-Complete-Urls");
      this.w |= d(paramMap, "X-Afma-Use-Displayed-Impression");
      this.y |= d(paramMap, "X-Afma-Auto-Collect-Location");
      this.z = a(paramMap, "Set-Cookie");
      str2 = a(paramMap, "X-Afma-Auto-Protection-Configuration");
      if ((str2 != null) && (!TextUtils.isEmpty(str2)))
        break label809;
      Uri.Builder localBuilder = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
      localBuilder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
      if (!TextUtils.isEmpty(this.e))
        localBuilder.appendQueryParameter("debugDialog", this.e);
      boolean bool = ((Boolean)m.e.a()).booleanValue();
      String[] arrayOfString = new String[1];
      String str3 = String.valueOf(localBuilder.toString());
      String str4 = String.valueOf("navigationURL");
      arrayOfString[0] = (18 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + "&" + str4 + "={NAVIGATION_URL}");
      this.x = new AutoClickProtectionConfigurationParcel(bool, Arrays.asList(arrayOfString));
    }
    while (true)
    {
      List localList9 = c(paramMap, "X-Afma-Remote-Ping-Urls");
      if (localList9 != null)
        this.A = localList9;
      this.B = a(paramMap, "X-Afma-Safe-Browsing");
      this.C |= d(paramMap, "X-Afma-Render-In-Browser");
      return;
      if (!"landscape".equalsIgnoreCase(str5))
        break;
      this.l = bc.a().g.a();
      break;
      try
      {
        label809: this.x = AutoClickProtectionConfigurationParcel.a(new JSONObject(str2));
      }
      catch (JSONException localJSONException)
      {
        c.c("Error parsing configuration JSON", localJSONException);
        this.x = new AutoClickProtectionConfigurationParcel();
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.o
 * JD-Core Version:    0.6.0
 */