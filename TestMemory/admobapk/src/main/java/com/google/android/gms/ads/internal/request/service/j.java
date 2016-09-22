package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class j
{
  private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);

  public static AdResponseParcel a(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      String str3 = localJSONObject.optString("ad_base_url", null);
      String str4 = localJSONObject.optString("ad_url", null);
      String str5 = localJSONObject.optString("ad_size", null);
      String str6 = localJSONObject.optString("ad_slot_size", str5);
      if ((paramAdRequestInfoParcel != null) && (paramAdRequestInfoParcel.m != 0))
      {
        bool1 = true;
        str7 = localJSONObject.optString("ad_json", null);
        if (str7 == null)
          str7 = localJSONObject.optString("ad_html", null);
        if (str7 == null)
          str7 = localJSONObject.optString("body", null);
        long l1 = -1L;
        String str8 = localJSONObject.optString("debug_dialog", null);
        if (!localJSONObject.has("interstitial_timeout"))
          break label809;
        l2 = ()(1000.0D * localJSONObject.getDouble("interstitial_timeout"));
        String str9 = localJSONObject.optString("orientation", null);
        int i = -1;
        if ("portrait".equals(str9))
          i = bc.a().g.b();
        while (true)
        {
          if ((!TextUtils.isEmpty(str7)) || (TextUtils.isEmpty(str4)))
            break label793;
          localAdResponseParcel1 = b.a(paramAdRequestInfoParcel, paramContext, paramAdRequestInfoParcel.k.b, str4, null, null, null, null);
          str3 = localAdResponseParcel1.b;
          str10 = localAdResponseParcel1.c;
          l1 = localAdResponseParcel1.n;
          if (str10 != null)
            break;
          return new AdResponseParcel(0);
          if (!"landscape".equals(str9))
            continue;
          i = bc.a().g.a();
        }
        JSONArray localJSONArray1 = localJSONObject.optJSONArray("click_urls");
        if (localAdResponseParcel1 == null)
        {
          localList1 = null;
          if (localJSONArray1 != null)
            localList1 = a(localJSONArray1, localList1);
          JSONArray localJSONArray2 = localJSONObject.optJSONArray("impression_urls");
          if (localAdResponseParcel1 != null)
            break label752;
          localList2 = null;
          label307: if (localJSONArray2 != null)
            localList2 = a(localJSONArray2, localList2);
          JSONArray localJSONArray3 = localJSONObject.optJSONArray("manual_impression_urls");
          if (localAdResponseParcel1 != null)
            break label762;
          localList3 = null;
          label337: if (localJSONArray3 != null)
            localList3 = a(localJSONArray3, localList3);
          if (localAdResponseParcel1 == null)
            break label786;
          if (localAdResponseParcel1.l != -1)
            i = localAdResponseParcel1.l;
          if (localAdResponseParcel1.g <= 0L)
            break label786;
          l3 = localAdResponseParcel1.g;
          String str11 = localJSONObject.optString("active_view");
          boolean bool2 = localJSONObject.optBoolean("ad_is_javascript", false);
          String str12 = null;
          if (bool2)
            str12 = localJSONObject.optString("ad_passback_url", null);
          boolean bool3 = localJSONObject.optBoolean("mediation", false);
          boolean bool4 = localJSONObject.optBoolean("custom_render_allowed", false);
          boolean bool5 = localJSONObject.optBoolean("content_url_opted_out", true);
          boolean bool6 = localJSONObject.optBoolean("prefetch", false);
          long l4 = localJSONObject.optLong("refresh_interval_milliseconds", -1L);
          long l5 = localJSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
          String str13 = localJSONObject.optString("gws_query_id", "");
          boolean bool7 = "height".equals(localJSONObject.optString("fluid", ""));
          boolean bool8 = localJSONObject.optBoolean("native_express", false);
          List localList4 = a(localJSONObject.optJSONArray("video_start_urls"), null);
          List localList5 = a(localJSONObject.optJSONArray("video_complete_urls"), null);
          RewardItemParcel localRewardItemParcel = RewardItemParcel.a(localJSONObject.optJSONArray("rewards"));
          boolean bool9 = localJSONObject.optBoolean("use_displayed_impression", false);
          AutoClickProtectionConfigurationParcel localAutoClickProtectionConfigurationParcel = AutoClickProtectionConfigurationParcel.a(localJSONObject.optJSONObject("auto_protection_configuration"));
          String str14 = localJSONObject.optString("set_cookie", "");
          List localList6 = a(localJSONObject.optJSONArray("remote_ping_urls"), null);
          String str15 = localJSONObject.optString("safe_browsing");
          boolean bool10 = localJSONObject.optBoolean("render_in_browser", paramAdRequestInfoParcel.M);
          AdResponseParcel localAdResponseParcel2 = new AdResponseParcel(paramAdRequestInfoParcel, str3, str10, localList1, localList2, l3, bool3, l5, localList3, l4, i, str5, l1, str8, bool2, str12, str11, bool4, bool1, paramAdRequestInfoParcel.p, bool5, bool6, str13, bool7, bool8, localRewardItemParcel, localList4, localList5, bool9, localAutoClickProtectionConfigurationParcel, paramAdRequestInfoParcel.I, str14, localList6, str15, bool10, str6);
          return localAdResponseParcel2;
        }
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        String str7;
        List localList1;
        List localList2;
        List localList3;
        String str1 = String.valueOf(localJSONException.getMessage());
        if (str1.length() != 0);
        for (String str2 = "Could not parse the inline ad response: ".concat(str1); ; str2 = new String("Could not parse the inline ad response: "))
        {
          c.e(str2);
          return new AdResponseParcel(0);
          localList1 = localAdResponseParcel1.d;
          break;
          label752: localList2 = localAdResponseParcel1.f;
          break label307;
          label762: localList3 = localAdResponseParcel1.j;
          break label337;
        }
        label786: long l3 = l2;
        continue;
        label793: String str10 = str7;
        AdResponseParcel localAdResponseParcel1 = null;
        continue;
        boolean bool1 = false;
        continue;
        label809: long l2 = -1L;
      }
    }
  }

  private static Integer a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
      return Integer.valueOf(i);
  }

  private static String a(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0xFFFFFF & paramInt);
    return String.format(localLocale, "#%06x", arrayOfObject);
  }

  private static List a(JSONArray paramJSONArray, List paramList)
  {
    if (paramJSONArray == null)
      paramList = null;
    while (true)
    {
      return paramList;
      if (paramList == null)
        paramList = new LinkedList();
      for (int i = 0; i < paramJSONArray.length(); i++)
        paramList.add(paramJSONArray.getString(i));
    }
  }

  private static JSONArray a(List paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localJSONArray.put((String)localIterator.next());
    return localJSONArray;
  }

  public static JSONObject a(AdRequestInfoParcel paramAdRequestInfoParcel, r paramr, y paramy, Location paramLocation, String paramString1, List paramList, Bundle paramBundle, String paramString2)
  {
    try
    {
      localHashMap = new HashMap();
      if (paramList.size() > 0)
        localHashMap.put("eid", TextUtils.join(",", paramList));
      if (paramAdRequestInfoParcel.b != null)
        localHashMap.put("ad_pos", paramAdRequestInfoParcel.b);
      AdRequestParcel localAdRequestParcel = paramAdRequestInfoParcel.c;
      String str3 = com.google.android.gms.ads.internal.state.service.a.a();
      if (str3 != null)
        localHashMap.put("abf", str3);
      if (localAdRequestParcel.b != -1L)
        localHashMap.put("cust_age", a.format(new Date(localAdRequestParcel.b)));
      if (localAdRequestParcel.c != null)
        localHashMap.put("extras", localAdRequestParcel.c);
      if (localAdRequestParcel.d != -1)
        localHashMap.put("cust_gender", Integer.valueOf(localAdRequestParcel.d));
      if (localAdRequestParcel.e != null)
        localHashMap.put("kw", localAdRequestParcel.e);
      if (localAdRequestParcel.g != -1)
        localHashMap.put("tag_for_child_directed_treatment", Integer.valueOf(localAdRequestParcel.g));
      if (localAdRequestParcel.f)
        localHashMap.put("adtest", "on");
      SearchAdRequestParcel localSearchAdRequestParcel;
      if (localAdRequestParcel.a >= 2)
      {
        if (localAdRequestParcel.h)
          localHashMap.put("d_imp_hdr", Integer.valueOf(1));
        if (!TextUtils.isEmpty(localAdRequestParcel.i))
          localHashMap.put("ppid", localAdRequestParcel.i);
        if (localAdRequestParcel.j != null)
        {
          localSearchAdRequestParcel = localAdRequestParcel.j;
          if (Color.alpha(localSearchAdRequestParcel.b) != 0)
            localHashMap.put("acolor", a(localSearchAdRequestParcel.b));
          if (Color.alpha(localSearchAdRequestParcel.c) != 0)
            localHashMap.put("bgcolor", a(localSearchAdRequestParcel.c));
          if ((Color.alpha(localSearchAdRequestParcel.d) != 0) && (Color.alpha(localSearchAdRequestParcel.e) != 0))
          {
            localHashMap.put("gradientto", a(localSearchAdRequestParcel.d));
            localHashMap.put("gradientfrom", a(localSearchAdRequestParcel.e));
          }
          if (Color.alpha(localSearchAdRequestParcel.f) != 0)
            localHashMap.put("bcolor", a(localSearchAdRequestParcel.f));
          localHashMap.put("bthick", Integer.toString(localSearchAdRequestParcel.g));
        }
      }
      switch (localSearchAdRequestParcel.h)
      {
      default:
        if (localObject2 != null)
          localHashMap.put("btype", localObject2);
        switch (localSearchAdRequestParcel.i)
        {
        default:
          if (localObject3 != null)
            localHashMap.put("callbuttoncolor", localObject3);
          if (localSearchAdRequestParcel.j != null)
            localHashMap.put("channel", localSearchAdRequestParcel.j);
          if (Color.alpha(localSearchAdRequestParcel.k) != 0)
            localHashMap.put("dcolor", a(localSearchAdRequestParcel.k));
          if (localSearchAdRequestParcel.l != null)
            localHashMap.put("font", localSearchAdRequestParcel.l);
          if (Color.alpha(localSearchAdRequestParcel.m) != 0)
            localHashMap.put("hcolor", a(localSearchAdRequestParcel.m));
          localHashMap.put("headersize", Integer.toString(localSearchAdRequestParcel.n));
          if (localSearchAdRequestParcel.o != null)
            localHashMap.put("q", localSearchAdRequestParcel.o);
          if ((localAdRequestParcel.a >= 3) && (localAdRequestParcel.l != null))
            localHashMap.put("url", localAdRequestParcel.l);
          if (localAdRequestParcel.a >= 5)
          {
            if (localAdRequestParcel.n != null)
              localHashMap.put("custom_targeting", localAdRequestParcel.n);
            if (localAdRequestParcel.o != null)
              localHashMap.put("category_exclusions", localAdRequestParcel.o);
            if (localAdRequestParcel.p != null)
              localHashMap.put("request_agent", localAdRequestParcel.p);
          }
          if ((localAdRequestParcel.a >= 6) && (localAdRequestParcel.q != null))
            localHashMap.put("request_pkg", localAdRequestParcel.q);
          if (localAdRequestParcel.a >= 7)
            localHashMap.put("is_designed_for_families", Boolean.valueOf(localAdRequestParcel.r));
          localHashMap.put("format", paramAdRequestInfoParcel.d.b);
          if (paramAdRequestInfoParcel.d.f == -1)
            localHashMap.put("smart_w", "full");
          if (paramAdRequestInfoParcel.d.c == -2)
            localHashMap.put("smart_h", "auto");
          if (paramAdRequestInfoParcel.d.j)
            localHashMap.put("fluid", "height");
          if (paramAdRequestInfoParcel.d.h != null)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            AdSizeParcel[] arrayOfAdSizeParcel = paramAdRequestInfoParcel.d.h;
            int i = arrayOfAdSizeParcel.length;
            int j = 0;
            if (j < i)
            {
              AdSizeParcel localAdSizeParcel = arrayOfAdSizeParcel[j];
              if (localStringBuilder.length() != 0)
                localStringBuilder.append("|");
              int k;
              if (localAdSizeParcel.f == -1)
              {
                k = (int)(localAdSizeParcel.g / paramr.r);
                label1041: localStringBuilder.append(k);
                localStringBuilder.append("x");
                if (localAdSizeParcel.c != -2)
                  break label1106;
              }
              label1106: for (int m = (int)(localAdSizeParcel.d / paramr.r); ; m = localAdSizeParcel.c)
              {
                localStringBuilder.append(m);
                j++;
                break;
                k = localAdSizeParcel.f;
                break label1041;
              }
            }
            localHashMap.put("sz", localStringBuilder);
          }
          if (paramAdRequestInfoParcel.m != 0)
          {
            localHashMap.put("native_version", Integer.valueOf(paramAdRequestInfoParcel.m));
            if (!paramAdRequestInfoParcel.d.k)
            {
              localHashMap.put("native_templates", paramAdRequestInfoParcel.n);
              NativeAdOptionsParcel localNativeAdOptionsParcel = paramAdRequestInfoParcel.z;
              if (localNativeAdOptionsParcel == null)
                break label3048;
              i1 = localNativeAdOptionsParcel.c;
              break label3017;
              label1194: localHashMap.put("native_image_orientation", localObject1);
              if (!paramAdRequestInfoParcel.A.isEmpty())
                localHashMap.put("native_custom_templates", paramAdRequestInfoParcel.A);
            }
          }
          localHashMap.put("slotname", paramAdRequestInfoParcel.e);
          localHashMap.put("pn", paramAdRequestInfoParcel.f.packageName);
          if (paramAdRequestInfoParcel.g != null)
            localHashMap.put("vc", Integer.valueOf(paramAdRequestInfoParcel.g.versionCode));
          localHashMap.put("ms", paramString1);
          localHashMap.put("seq_num", paramAdRequestInfoParcel.i);
          localHashMap.put("session_id", paramAdRequestInfoParcel.j);
          localHashMap.put("js", paramAdRequestInfoParcel.k.b);
          Bundle localBundle1 = paramAdRequestInfoParcel.O;
          localHashMap.put("am", Integer.valueOf(paramr.a));
          localHashMap.put("cog", a(paramr.b));
          localHashMap.put("coh", a(paramr.c));
          if (!TextUtils.isEmpty(paramr.d))
            localHashMap.put("carrier", paramr.d);
          localHashMap.put("gl", paramr.e);
          if (paramr.f)
            localHashMap.put("simulator", Integer.valueOf(1));
          if (paramr.g)
            localHashMap.put("is_sidewinder", Integer.valueOf(1));
          localHashMap.put("ma", a(paramr.h));
          localHashMap.put("sp", a(paramr.i));
          localHashMap.put("hl", paramr.j);
          if (!TextUtils.isEmpty(paramr.k))
            localHashMap.put("mv", paramr.k);
          localHashMap.put("muv", Integer.valueOf(paramr.l));
          if (paramr.m != -2)
            localHashMap.put("cnt", Integer.valueOf(paramr.m));
          localHashMap.put("gnt", Integer.valueOf(paramr.n));
          localHashMap.put("pt", Integer.valueOf(paramr.o));
          localHashMap.put("rm", Integer.valueOf(paramr.p));
          localHashMap.put("riv", Integer.valueOf(paramr.q));
          Bundle localBundle2 = new Bundle();
          localBundle2.putString("build", paramr.y);
          Bundle localBundle3 = new Bundle();
          localBundle3.putBoolean("is_charging", paramr.v);
          localBundle3.putDouble("battery_level", paramr.u);
          localBundle2.putBundle("battery", localBundle3);
          Bundle localBundle4 = new Bundle();
          localBundle4.putInt("active_network_state", paramr.x);
          localBundle4.putBoolean("active_network_metered", paramr.w);
          if (paramy != null)
          {
            Bundle localBundle5 = new Bundle();
            localBundle5.putInt("predicted_latency_micros", 0);
            localBundle5.putLong("predicted_down_throughput_bps", 0L);
            localBundle5.putLong("predicted_up_throughput_bps", 0L);
            localBundle4.putBundle("predictions", localBundle5);
          }
          localBundle2.putBundle("network", localBundle4);
          Bundle localBundle6 = new Bundle();
          localBundle6.putBoolean("is_browser_custom_tabs_capable", paramr.z);
          localBundle2.putBundle("browser", localBundle6);
          if (localBundle1 != null)
          {
            Bundle localBundle7 = new Bundle();
            localBundle7.putString("runtime_free", Long.toString(localBundle1.getLong("runtime_free_memory", -1L)));
            localBundle7.putString("runtime_max", Long.toString(localBundle1.getLong("runtime_max_memory", -1L)));
            localBundle7.putString("runtime_total", Long.toString(localBundle1.getLong("runtime_total_memory", -1L)));
            Debug.MemoryInfo localMemoryInfo = (Debug.MemoryInfo)localBundle1.getParcelable("debug_memory_info");
            if (localMemoryInfo != null)
            {
              localBundle7.putString("debug_info_dalvik_private_dirty", Integer.toString(localMemoryInfo.dalvikPrivateDirty));
              localBundle7.putString("debug_info_dalvik_pss", Integer.toString(localMemoryInfo.dalvikPss));
              localBundle7.putString("debug_info_dalvik_shared_dirty", Integer.toString(localMemoryInfo.dalvikSharedDirty));
              localBundle7.putString("debug_info_native_private_dirty", Integer.toString(localMemoryInfo.nativePrivateDirty));
              localBundle7.putString("debug_info_native_pss", Integer.toString(localMemoryInfo.nativePss));
              localBundle7.putString("debug_info_native_shared_dirty", Integer.toString(localMemoryInfo.nativeSharedDirty));
              localBundle7.putString("debug_info_other_private_dirty", Integer.toString(localMemoryInfo.otherPrivateDirty));
              localBundle7.putString("debug_info_other_pss", Integer.toString(localMemoryInfo.otherPss));
              localBundle7.putString("debug_info_other_shared_dirty", Integer.toString(localMemoryInfo.otherSharedDirty));
            }
            localBundle2.putBundle("android_mem_info", localBundle7);
          }
          localHashMap.put("device", localBundle2);
          Bundle localBundle8 = new Bundle();
          localBundle8.putString("doritos", paramString2);
          localHashMap.put("pii", localBundle8);
          localHashMap.put("platform", Build.MANUFACTURER);
          localHashMap.put("submodel", Build.MODEL);
          if (paramLocation != null)
          {
            a(localHashMap, paramLocation);
            if (paramAdRequestInfoParcel.a >= 2)
              localHashMap.put("quality_signals", paramAdRequestInfoParcel.l);
            if ((paramAdRequestInfoParcel.a >= 4) && (paramAdRequestInfoParcel.p))
              localHashMap.put("forceHttps", Boolean.valueOf(paramAdRequestInfoParcel.p));
            if (paramBundle != null)
              localHashMap.put("content_info", paramBundle);
            if (paramAdRequestInfoParcel.a < 5)
              break label2833;
            localHashMap.put("u_sd", Float.valueOf(paramAdRequestInfoParcel.t));
            localHashMap.put("sh", Integer.valueOf(paramAdRequestInfoParcel.s));
            localHashMap.put("sw", Integer.valueOf(paramAdRequestInfoParcel.r));
            if (paramAdRequestInfoParcel.a >= 6)
            {
              boolean bool2 = TextUtils.isEmpty(paramAdRequestInfoParcel.u);
              if (bool2);
            }
          }
        case 2:
        case 0:
        case 1:
        }
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    catch (JSONException localJSONException3)
    {
      while (true)
      {
        int i1;
        try
        {
          localHashMap.put("view_hierarchy", new JSONObject(paramAdRequestInfoParcel.u));
          localHashMap.put("correlation_id", Long.valueOf(paramAdRequestInfoParcel.v));
          if (paramAdRequestInfoParcel.a < 7)
            continue;
          localHashMap.put("request_id", paramAdRequestInfoParcel.w);
          if ((paramAdRequestInfoParcel.a < 11) || (paramAdRequestInfoParcel.C == null))
            continue;
          CapabilityParcel localCapabilityParcel = paramAdRequestInfoParcel.C;
          Bundle localBundle9 = new Bundle();
          localBundle9.putBoolean("iap_supported", localCapabilityParcel.b);
          localBundle9.putBoolean("default_iap_supported", localCapabilityParcel.c);
          localBundle9.putBoolean("app_streaming_supported", localCapabilityParcel.d);
          localHashMap.put("capability", localBundle9);
          if ((paramAdRequestInfoParcel.a < 12) || (TextUtils.isEmpty(paramAdRequestInfoParcel.D)))
            continue;
          localHashMap.put("anchor", paramAdRequestInfoParcel.D);
          if (paramAdRequestInfoParcel.a < 13)
            continue;
          localHashMap.put("android_app_volume", Float.valueOf(paramAdRequestInfoParcel.E));
          if (paramAdRequestInfoParcel.a < 18)
            continue;
          localHashMap.put("android_app_muted", Boolean.valueOf(paramAdRequestInfoParcel.K));
          if ((paramAdRequestInfoParcel.a < 14) || (paramAdRequestInfoParcel.F <= 0))
            continue;
          localHashMap.put("target_api", Integer.valueOf(paramAdRequestInfoParcel.F));
          if (paramAdRequestInfoParcel.a < 15)
            continue;
          if (paramAdRequestInfoParcel.G != -1)
            continue;
          n = -1;
          localHashMap.put("scroll_index", Integer.valueOf(n));
          if (paramAdRequestInfoParcel.a < 16)
            continue;
          localHashMap.put("_activity_context", Boolean.valueOf(paramAdRequestInfoParcel.H));
          if (paramAdRequestInfoParcel.a < 18)
            continue;
          boolean bool1 = TextUtils.isEmpty(paramAdRequestInfoParcel.L);
          if (bool1)
            continue;
        }
        catch (JSONException localJSONException3)
        {
          try
          {
            HashMap localHashMap;
            localHashMap.put("app_settings", new JSONObject(paramAdRequestInfoParcel.L));
            localHashMap.put("render_in_browser", Boolean.valueOf(paramAdRequestInfoParcel.M));
            if (paramAdRequestInfoParcel.a < 18)
              continue;
            localHashMap.put("android_num_video_cache_tasks", Integer.valueOf(paramAdRequestInfoParcel.N));
            if (!c.a(2))
              continue;
            String str4 = String.valueOf(bc.a().e.a(localHashMap).toString(2));
            if (str4.length() == 0)
              continue;
            str5 = "Ad Request JSON: ".concat(str4);
            c.a(str5);
            return bc.a().e.a(localHashMap);
            if ((paramAdRequestInfoParcel.c.a < 2) || (paramAdRequestInfoParcel.c.k == null))
              continue;
            a(localHashMap, paramAdRequestInfoParcel.c.k);
            continue;
            localJSONException1 = localJSONException1;
            String str1 = String.valueOf(localJSONException1.getMessage());
            if (str1.length() == 0)
              continue;
            str2 = "Problem serializing ad request to JSON: ".concat(str1);
            c.e(str2);
            return null;
            label2833: localHashMap.put("u_sd", Float.valueOf(paramr.r));
            localHashMap.put("sh", Integer.valueOf(paramr.t));
            localHashMap.put("sw", Integer.valueOf(paramr.s));
            continue;
            localJSONException3 = localJSONException3;
            c.c("Problem serializing view hierarchy to JSON", localJSONException3);
            continue;
            int n = paramAdRequestInfoParcel.G;
          }
          catch (JSONException localJSONException2)
          {
            c.c("Problem creating json from app settings", localJSONException2);
            continue;
            String str5 = new String("Ad Request JSON: ");
            continue;
            String str2 = new String("Problem serializing ad request to JSON: ");
            continue;
            localObject2 = null;
          }
        }
        continue;
        Object localObject3 = null;
        continue;
        Object localObject2 = "none";
        continue;
        localObject2 = "dashed";
        continue;
        localObject2 = "dotted";
        continue;
        localObject2 = "solid";
        continue;
        localObject3 = "dark";
        continue;
        localObject3 = "light";
        continue;
        localObject3 = "medium";
        continue;
        while (true)
          switch (i1)
          {
          default:
            label3017: localObject1 = "any";
            break label1194;
            label3048: i1 = 0;
          case 1:
          case 2:
          }
        Object localObject1 = "portrait";
        continue;
        localObject1 = "landscape";
      }
    }
  }

  public static JSONObject a(AdResponseParcel paramAdResponseParcel)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if (paramAdResponseParcel.b != null)
      localJSONObject1.put("ad_base_url", paramAdResponseParcel.b);
    if (paramAdResponseParcel.m != null)
      localJSONObject1.put("ad_size", paramAdResponseParcel.m);
    localJSONObject1.put("native", paramAdResponseParcel.t);
    if (paramAdResponseParcel.t)
    {
      localJSONObject1.put("ad_json", paramAdResponseParcel.c);
      if (paramAdResponseParcel.o != null)
        localJSONObject1.put("debug_dialog", paramAdResponseParcel.o);
      if (paramAdResponseParcel.g != -1L)
        localJSONObject1.put("interstitial_timeout", paramAdResponseParcel.g / 1000.0D);
      if (paramAdResponseParcel.l != bc.a().g.b())
        break label561;
      localJSONObject1.put("orientation", "portrait");
      label144: if (paramAdResponseParcel.d != null)
        localJSONObject1.put("click_urls", a(paramAdResponseParcel.d));
      if (paramAdResponseParcel.f != null)
        localJSONObject1.put("impression_urls", a(paramAdResponseParcel.f));
      if (paramAdResponseParcel.j != null)
        localJSONObject1.put("manual_impression_urls", a(paramAdResponseParcel.j));
      if (paramAdResponseParcel.r != null)
        localJSONObject1.put("active_view", paramAdResponseParcel.r);
      localJSONObject1.put("ad_is_javascript", paramAdResponseParcel.p);
      if (paramAdResponseParcel.q != null)
        localJSONObject1.put("ad_passback_url", paramAdResponseParcel.q);
      localJSONObject1.put("mediation", paramAdResponseParcel.h);
      localJSONObject1.put("custom_render_allowed", paramAdResponseParcel.s);
      localJSONObject1.put("content_url_opted_out", paramAdResponseParcel.v);
      localJSONObject1.put("prefetch", paramAdResponseParcel.w);
      if (paramAdResponseParcel.k != -1L)
        localJSONObject1.put("refresh_interval_milliseconds", paramAdResponseParcel.k);
      if (paramAdResponseParcel.i != -1L)
        localJSONObject1.put("mediation_config_cache_time_milliseconds", paramAdResponseParcel.i);
      if (!TextUtils.isEmpty(paramAdResponseParcel.z))
        localJSONObject1.put("gws_query_id", paramAdResponseParcel.z);
      if (!paramAdResponseParcel.A)
        break label589;
    }
    label561: label589: for (String str = "height"; ; str = "")
    {
      localJSONObject1.put("fluid", str);
      localJSONObject1.put("native_express", paramAdResponseParcel.B);
      if (paramAdResponseParcel.D != null)
        localJSONObject1.put("video_start_urls", a(paramAdResponseParcel.D));
      if (paramAdResponseParcel.E != null)
        localJSONObject1.put("video_complete_urls", a(paramAdResponseParcel.E));
      if (paramAdResponseParcel.C != null)
      {
        RewardItemParcel localRewardItemParcel = paramAdResponseParcel.C;
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("rb_type", localRewardItemParcel.b);
        localJSONObject2.put("rb_amount", localRewardItemParcel.c);
        JSONArray localJSONArray = new JSONArray();
        localJSONArray.put(localJSONObject2);
        localJSONObject1.put("rewards", localJSONArray);
      }
      localJSONObject1.put("use_displayed_impression", paramAdResponseParcel.F);
      localJSONObject1.put("auto_protection_configuration", paramAdResponseParcel.G);
      localJSONObject1.put("render_in_browser", paramAdResponseParcel.L);
      return localJSONObject1;
      localJSONObject1.put("ad_html", paramAdResponseParcel.c);
      break;
      if (paramAdResponseParcel.l != bc.a().g.a())
        break label144;
      localJSONObject1.put("orientation", "landscape");
      break label144;
    }
  }

  private static void a(HashMap paramHashMap, Location paramLocation)
  {
    HashMap localHashMap = new HashMap();
    Float localFloat = Float.valueOf(1000.0F * paramLocation.getAccuracy());
    Long localLong1 = Long.valueOf(1000L * paramLocation.getTime());
    Long localLong2 = Long.valueOf(()(10000000.0D * paramLocation.getLatitude()));
    Long localLong3 = Long.valueOf(()(10000000.0D * paramLocation.getLongitude()));
    localHashMap.put("radius", localFloat);
    localHashMap.put("lat", localLong2);
    localHashMap.put("long", localLong3);
    localHashMap.put("time", localLong1);
    paramHashMap.put("uule", localHashMap);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.j
 * JD-Core Version:    0.6.0
 */