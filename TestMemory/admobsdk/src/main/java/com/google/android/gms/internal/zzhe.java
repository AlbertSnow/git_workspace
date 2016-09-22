package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public final class zzhe
{
  private static final SimpleDateFormat zzJg = new SimpleDateFormat("yyyyMMdd", Locale.US);

  public static JSONObject zza(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzhj paramzzhj, zzhn.zza paramzza, Location paramLocation, zzbm paramzzbm, String paramString1, String paramString2, List<String> paramList, Bundle paramBundle)
  {
    try
    {
      HashMap localHashMap = new HashMap();
      if (paramList.size() > 0)
        localHashMap.put("eid", TextUtils.join(",", paramList));
      if (paramAdRequestInfoParcel.zzHs != null)
        localHashMap.put("ad_pos", paramAdRequestInfoParcel.zzHs);
      zza(localHashMap, paramAdRequestInfoParcel.zzHt);
      localHashMap.put("format", paramAdRequestInfoParcel.zzrp.zzuh);
      if (paramAdRequestInfoParcel.zzrp.width == -1)
        localHashMap.put("smart_w", "full");
      if (paramAdRequestInfoParcel.zzrp.height == -2)
        localHashMap.put("smart_h", "auto");
      if (paramAdRequestInfoParcel.zzrp.zzul)
        localHashMap.put("fluid", "height");
      if (paramAdRequestInfoParcel.zzrp.zzuj != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        for (AdSizeParcel localAdSizeParcel : paramAdRequestInfoParcel.zzrp.zzuj)
        {
          if (localStringBuilder.length() != 0)
            localStringBuilder.append("|");
          localStringBuilder.append(localAdSizeParcel.width == -1 ? (int)(localAdSizeParcel.widthPixels / paramzzhj.zzHF) : localAdSizeParcel.width);
          localStringBuilder.append("x");
          localStringBuilder.append(localAdSizeParcel.height == -2 ? (int)(localAdSizeParcel.heightPixels / paramzzhj.zzHF) : localAdSizeParcel.height);
        }
        localHashMap.put("sz", localStringBuilder);
      }
      if (paramAdRequestInfoParcel.zzHz != 0)
      {
        localHashMap.put("native_version", Integer.valueOf(paramAdRequestInfoParcel.zzHz));
        if (!paramAdRequestInfoParcel.zzrp.zzum)
        {
          localHashMap.put("native_templates", paramAdRequestInfoParcel.zzrH);
          localHashMap.put("native_image_orientation", zzc(paramAdRequestInfoParcel.zzrD));
          if (!paramAdRequestInfoParcel.zzHK.isEmpty())
            localHashMap.put("native_custom_templates", paramAdRequestInfoParcel.zzHK);
        }
      }
      localHashMap.put("slotname", paramAdRequestInfoParcel.zzrj);
      localHashMap.put("pn", paramAdRequestInfoParcel.applicationInfo.packageName);
      if (paramAdRequestInfoParcel.zzHu != null)
        localHashMap.put("vc", Integer.valueOf(paramAdRequestInfoParcel.zzHu.versionCode));
      localHashMap.put("ms", paramString2);
      localHashMap.put("seq_num", paramAdRequestInfoParcel.zzHw);
      localHashMap.put("session_id", paramAdRequestInfoParcel.zzHx);
      localHashMap.put("js", paramAdRequestInfoParcel.zzrl.afmaVersion);
      zza(localHashMap, paramzzhj, paramzza);
      localHashMap.put("platform", Build.MANUFACTURER);
      localHashMap.put("submodel", Build.MODEL);
      if ((paramAdRequestInfoParcel.zzHt.versionCode >= 2) && (paramAdRequestInfoParcel.zzHt.zztK != null))
        zza(localHashMap, paramAdRequestInfoParcel.zzHt.zztK);
      if (paramAdRequestInfoParcel.versionCode >= 2)
        localHashMap.put("quality_signals", paramAdRequestInfoParcel.zzHy);
      if ((paramAdRequestInfoParcel.versionCode >= 4) && (paramAdRequestInfoParcel.zzHB))
        localHashMap.put("forceHttps", Boolean.valueOf(paramAdRequestInfoParcel.zzHB));
      if (paramBundle != null)
        localHashMap.put("content_info", paramBundle);
      if (paramAdRequestInfoParcel.versionCode >= 5)
      {
        localHashMap.put("u_sd", Float.valueOf(paramAdRequestInfoParcel.zzHF));
        localHashMap.put("sh", Integer.valueOf(paramAdRequestInfoParcel.zzHE));
        localHashMap.put("sw", Integer.valueOf(paramAdRequestInfoParcel.zzHD));
      }
      else
      {
        localHashMap.put("u_sd", Float.valueOf(paramzzhj.zzHF));
        localHashMap.put("sh", Integer.valueOf(paramzzhj.zzHE));
        localHashMap.put("sw", Integer.valueOf(paramzzhj.zzHD));
      }
      if (paramAdRequestInfoParcel.versionCode >= 6)
      {
        if (!TextUtils.isEmpty(paramAdRequestInfoParcel.zzHG))
          try
          {
            localHashMap.put("view_hierarchy", new JSONObject(paramAdRequestInfoParcel.zzHG));
          }
          catch (JSONException localJSONException2)
          {
            zzin.zzd("Problem serializing view hierarchy to JSON", localJSONException2);
          }
        localHashMap.put("correlation_id", Long.valueOf(paramAdRequestInfoParcel.zzHH));
      }
      if (paramAdRequestInfoParcel.versionCode >= 7)
        localHashMap.put("request_id", paramAdRequestInfoParcel.zzHI);
      if ((paramAdRequestInfoParcel.versionCode >= 11) && (paramAdRequestInfoParcel.zzHM != null))
        localHashMap.put("capability", paramAdRequestInfoParcel.zzHM.toBundle());
      zza(localHashMap, paramString1);
      if ((paramAdRequestInfoParcel.versionCode >= 12) && (!TextUtils.isEmpty(paramAdRequestInfoParcel.zzHN)))
        localHashMap.put("anchor", paramAdRequestInfoParcel.zzHN);
      if (paramAdRequestInfoParcel.versionCode >= 13)
        localHashMap.put("avol", Float.valueOf(paramAdRequestInfoParcel.zzHO));
      if ((paramAdRequestInfoParcel.versionCode >= 14) && (paramAdRequestInfoParcel.zzHP > 0))
        localHashMap.put("target_api", Integer.valueOf(paramAdRequestInfoParcel.zzHP));
      if (paramAdRequestInfoParcel.versionCode >= 15)
        localHashMap.put("scroll_index", Integer.valueOf(paramAdRequestInfoParcel.zzHQ == -1 ? -1 : paramAdRequestInfoParcel.zzHQ));
      if (zzin.zzQ(2))
      {
        String str = zzr.zzbC().zzG(localHashMap).toString(2);
        zzin.v("Ad Request JSON: " + str);
      }
      return zzr.zzbC().zzG(localHashMap);
    }
    catch (JSONException localJSONException1)
    {
      zzin.zzaK("Problem serializing ad request to JSON: " + localJSONException1.getMessage());
    }
    return null;
  }

  private static void zza(HashMap<String, Object> paramHashMap, String paramString)
  {
    if (paramString != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("token", paramString);
      paramHashMap.put("pan", localHashMap);
    }
  }

  private static void zza(HashMap<String, Object> paramHashMap, AdRequestParcel paramAdRequestParcel)
  {
    String str = zzil.zzhm();
    if (str != null)
      paramHashMap.put("abf", str);
    if (paramAdRequestParcel.zztC != -1L)
      paramHashMap.put("cust_age", zzJg.format(new Date(paramAdRequestParcel.zztC)));
    if (paramAdRequestParcel.extras != null)
      paramHashMap.put("extras", paramAdRequestParcel.extras);
    if (paramAdRequestParcel.zztD != -1)
      paramHashMap.put("cust_gender", Integer.valueOf(paramAdRequestParcel.zztD));
    if (paramAdRequestParcel.zztE != null)
      paramHashMap.put("kw", paramAdRequestParcel.zztE);
    if (paramAdRequestParcel.zztG != -1)
      paramHashMap.put("tag_for_child_directed_treatment", Integer.valueOf(paramAdRequestParcel.zztG));
    if (paramAdRequestParcel.zztF)
      paramHashMap.put("adtest", "on");
    if (paramAdRequestParcel.versionCode >= 2)
    {
      if (paramAdRequestParcel.zztH)
        paramHashMap.put("d_imp_hdr", Integer.valueOf(1));
      if (!TextUtils.isEmpty(paramAdRequestParcel.zztI))
        paramHashMap.put("ppid", paramAdRequestParcel.zztI);
      if (paramAdRequestParcel.zztJ != null)
        zza(paramHashMap, paramAdRequestParcel.zztJ);
    }
    if ((paramAdRequestParcel.versionCode >= 3) && (paramAdRequestParcel.zztL != null))
      paramHashMap.put("url", paramAdRequestParcel.zztL);
    if (paramAdRequestParcel.versionCode >= 5)
    {
      if (paramAdRequestParcel.zztN != null)
        paramHashMap.put("custom_targeting", paramAdRequestParcel.zztN);
      if (paramAdRequestParcel.zztO != null)
        paramHashMap.put("category_exclusions", paramAdRequestParcel.zztO);
      if (paramAdRequestParcel.zztP != null)
        paramHashMap.put("request_agent", paramAdRequestParcel.zztP);
    }
    if ((paramAdRequestParcel.versionCode >= 6) && (paramAdRequestParcel.zztQ != null))
      paramHashMap.put("request_pkg", paramAdRequestParcel.zztQ);
    if (paramAdRequestParcel.versionCode >= 7)
      paramHashMap.put("is_designed_for_families", Boolean.valueOf(paramAdRequestParcel.zztR));
  }

  private static void zza(HashMap<String, Object> paramHashMap, zzhj paramzzhj, zzhn.zza paramzza)
  {
    paramHashMap.put("am", Integer.valueOf(paramzzhj.zzJQ));
    paramHashMap.put("cog", zzy(paramzzhj.zzJR));
    paramHashMap.put("coh", zzy(paramzzhj.zzJS));
    if (!TextUtils.isEmpty(paramzzhj.zzJT))
      paramHashMap.put("carrier", paramzzhj.zzJT);
    paramHashMap.put("gl", paramzzhj.zzJU);
    if (paramzzhj.zzJV)
      paramHashMap.put("simulator", Integer.valueOf(1));
    if (paramzzhj.zzJW)
      paramHashMap.put("is_sidewinder", Integer.valueOf(1));
    paramHashMap.put("ma", zzy(paramzzhj.zzJX));
    paramHashMap.put("sp", zzy(paramzzhj.zzJY));
    paramHashMap.put("hl", paramzzhj.zzJZ);
    if (!TextUtils.isEmpty(paramzzhj.zzKa))
      paramHashMap.put("mv", paramzzhj.zzKa);
    paramHashMap.put("muv", Integer.valueOf(paramzzhj.zzKb));
    if (paramzzhj.zzKc != -2)
      paramHashMap.put("cnt", Integer.valueOf(paramzzhj.zzKc));
    paramHashMap.put("gnt", Integer.valueOf(paramzzhj.zzKd));
    paramHashMap.put("pt", Integer.valueOf(paramzzhj.zzKe));
    paramHashMap.put("rm", Integer.valueOf(paramzzhj.zzKf));
    paramHashMap.put("riv", Integer.valueOf(paramzzhj.zzKg));
    Bundle localBundle1 = new Bundle();
    localBundle1.putString("build", paramzzhj.zzKl);
    Bundle localBundle2 = new Bundle();
    localBundle2.putBoolean("is_charging", paramzzhj.zzKi);
    localBundle2.putDouble("battery_level", paramzzhj.zzKh);
    localBundle1.putBundle("battery", localBundle2);
    Bundle localBundle3 = new Bundle();
    localBundle3.putInt("active_network_state", paramzzhj.zzKk);
    localBundle3.putBoolean("active_network_metered", paramzzhj.zzKj);
    if (paramzza != null)
    {
      Bundle localBundle4 = new Bundle();
      localBundle4.putInt("predicted_latency_micros", paramzza.zzKq);
      localBundle4.putLong("predicted_down_throughput_bps", paramzza.zzKr);
      localBundle4.putLong("predicted_up_throughput_bps", paramzza.zzKs);
      localBundle3.putBundle("predictions", localBundle4);
    }
    localBundle1.putBundle("network", localBundle3);
    paramHashMap.put("device", localBundle1);
  }

  private static void zza(HashMap<String, Object> paramHashMap, Location paramLocation)
  {
    HashMap localHashMap = new HashMap();
    Float localFloat = Float.valueOf(paramLocation.getAccuracy() * 1000.0F);
    Long localLong1 = Long.valueOf(paramLocation.getTime() * 1000L);
    Long localLong2 = Long.valueOf(()(paramLocation.getLatitude() * 10000000.0D));
    Long localLong3 = Long.valueOf(()(paramLocation.getLongitude() * 10000000.0D));
    localHashMap.put("radius", localFloat);
    localHashMap.put("lat", localLong2);
    localHashMap.put("long", localLong3);
    localHashMap.put("time", localLong1);
    paramHashMap.put("uule", localHashMap);
  }

  private static void zza(HashMap<String, Object> paramHashMap, SearchAdRequestParcel paramSearchAdRequestParcel)
  {
    if (Color.alpha(paramSearchAdRequestParcel.zzvd) != 0)
      paramHashMap.put("acolor", zzL(paramSearchAdRequestParcel.zzvd));
    if (Color.alpha(paramSearchAdRequestParcel.backgroundColor) != 0)
      paramHashMap.put("bgcolor", zzL(paramSearchAdRequestParcel.backgroundColor));
    if ((Color.alpha(paramSearchAdRequestParcel.zzve) != 0) && (Color.alpha(paramSearchAdRequestParcel.zzvf) != 0))
    {
      paramHashMap.put("gradientto", zzL(paramSearchAdRequestParcel.zzve));
      paramHashMap.put("gradientfrom", zzL(paramSearchAdRequestParcel.zzvf));
    }
    if (Color.alpha(paramSearchAdRequestParcel.zzvg) != 0)
      paramHashMap.put("bcolor", zzL(paramSearchAdRequestParcel.zzvg));
    paramHashMap.put("bthick", Integer.toString(paramSearchAdRequestParcel.zzvh));
    String str1;
    switch (paramSearchAdRequestParcel.zzvi)
    {
    case 0:
      str1 = "none";
      break;
    case 1:
      str1 = "dashed";
      break;
    case 2:
      str1 = "dotted";
      break;
    case 3:
      str1 = "solid";
      break;
    default:
      str1 = null;
    }
    if (str1 != null)
      paramHashMap.put("btype", str1);
    String str2;
    switch (paramSearchAdRequestParcel.zzvj)
    {
    case 2:
      str2 = "dark";
      break;
    case 0:
      str2 = "light";
      break;
    case 1:
      str2 = "medium";
      break;
    default:
      str2 = null;
    }
    if (str2 != null)
      paramHashMap.put("callbuttoncolor", str2);
    if (paramSearchAdRequestParcel.zzvk != null)
      paramHashMap.put("channel", paramSearchAdRequestParcel.zzvk);
    if (Color.alpha(paramSearchAdRequestParcel.zzvl) != 0)
      paramHashMap.put("dcolor", zzL(paramSearchAdRequestParcel.zzvl));
    if (paramSearchAdRequestParcel.zzvm != null)
      paramHashMap.put("font", paramSearchAdRequestParcel.zzvm);
    if (Color.alpha(paramSearchAdRequestParcel.zzvn) != 0)
      paramHashMap.put("hcolor", zzL(paramSearchAdRequestParcel.zzvn));
    paramHashMap.put("headersize", Integer.toString(paramSearchAdRequestParcel.zzvo));
    if (paramSearchAdRequestParcel.zzvp != null)
      paramHashMap.put("q", paramSearchAdRequestParcel.zzvp);
  }

  private static Integer zzy(boolean paramBoolean)
  {
    return Integer.valueOf(paramBoolean ? 1 : 0);
  }

  private static String zzL(int paramInt)
  {
    return String.format(Locale.US, "#%06x", new Object[] { Integer.valueOf(paramInt & 0xFFFFFF) });
  }

  private static String zzc(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    int i = paramNativeAdOptionsParcel != null ? paramNativeAdOptionsParcel.zzyB : 0;
    switch (i)
    {
    case 1:
      return "portrait";
    case 2:
      return "landscape";
    case 0:
    }
    return "any";
  }

  public static AdResponseParcel zza(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      String str1 = localJSONObject.optString("ad_base_url", null);
      String str2 = localJSONObject.optString("ad_url", null);
      String str3 = localJSONObject.optString("ad_size", null);
      boolean bool1 = (paramAdRequestInfoParcel != null) && (paramAdRequestInfoParcel.zzHz != 0);
      String str4 = bool1 ? localJSONObject.optString("ad_json", null) : localJSONObject.optString("ad_html", null);
      long l1 = -1L;
      String str5 = localJSONObject.optString("debug_dialog", null);
      long l2 = localJSONObject.has("interstitial_timeout") ? ()(localJSONObject.getDouble("interstitial_timeout") * 1000.0D) : -1L;
      String str6 = localJSONObject.optString("orientation", null);
      int i = -1;
      if ("portrait".equals(str6))
        i = zzr.zzbE().zzhw();
      else if ("landscape".equals(str6))
        i = zzr.zzbE().zzhv();
      AdResponseParcel localAdResponseParcel = null;
      if (!TextUtils.isEmpty(str4))
      {
        if (TextUtils.isEmpty(str1))
        {
          zzin.zzaK("Could not parse the mediation config: Missing required ad_base_url field");
          return new AdResponseParcel(0);
        }
      }
      else if (!TextUtils.isEmpty(str2))
      {
        localAdResponseParcel = zzhd.zza(paramAdRequestInfoParcel, paramContext, paramAdRequestInfoParcel.zzrl.afmaVersion, str2, null, null, null, null, null);
        str1 = localAdResponseParcel.zzEF;
        str4 = localAdResponseParcel.body;
        l1 = localAdResponseParcel.zzHX;
      }
      else
      {
        zzin.zzaK("Could not parse the mediation config: Missing required " + (bool1 ? "ad_json" : "ad_html") + " or " + "ad_url" + " field.");
        return new AdResponseParcel(0);
      }
      JSONArray localJSONArray1 = localJSONObject.optJSONArray("click_urls");
      List localList1 = localAdResponseParcel == null ? null : localAdResponseParcel.zzBQ;
      if (localJSONArray1 != null)
        localList1 = zza(localJSONArray1, localList1);
      JSONArray localJSONArray2 = localJSONObject.optJSONArray("impression_urls");
      List localList2 = localAdResponseParcel == null ? null : localAdResponseParcel.zzBR;
      if (localJSONArray2 != null)
        localList2 = zza(localJSONArray2, localList2);
      JSONArray localJSONArray3 = localJSONObject.optJSONArray("manual_impression_urls");
      List localList3 = localAdResponseParcel == null ? null : localAdResponseParcel.zzHV;
      if (localJSONArray3 != null)
        localList3 = zza(localJSONArray3, localList3);
      if (localAdResponseParcel != null)
      {
        if (localAdResponseParcel.orientation != -1)
          i = localAdResponseParcel.orientation;
        if (localAdResponseParcel.zzHS > 0L)
          l2 = localAdResponseParcel.zzHS;
      }
      String str7 = localJSONObject.optString("active_view");
      String str8 = null;
      boolean bool2 = localJSONObject.optBoolean("ad_is_javascript", false);
      if (bool2)
        str8 = localJSONObject.optString("ad_passback_url", null);
      boolean bool3 = localJSONObject.optBoolean("mediation", false);
      boolean bool4 = localJSONObject.optBoolean("custom_render_allowed", false);
      boolean bool5 = localJSONObject.optBoolean("content_url_opted_out", true);
      boolean bool6 = localJSONObject.optBoolean("prefetch", false);
      int j = localJSONObject.optInt("oauth2_token_status", 0);
      long l3 = localJSONObject.optLong("refresh_interval_milliseconds", -1L);
      long l4 = localJSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
      String str9 = localJSONObject.optString("gws_query_id", "");
      boolean bool7 = "height".equals(localJSONObject.optString("fluid", ""));
      boolean bool8 = localJSONObject.optBoolean("native_express", false);
      List localList4 = zza(localJSONObject.optJSONArray("video_start_urls"), null);
      List localList5 = zza(localJSONObject.optJSONArray("video_complete_urls"), null);
      RewardItemParcel localRewardItemParcel = RewardItemParcel.zza(localJSONObject.optJSONArray("rewards"));
      boolean bool9 = localJSONObject.optBoolean("use_displayed_impression", false);
      return new AdResponseParcel(paramAdRequestInfoParcel, str1, str4, localList1, localList2, l2, bool3, l4, localList3, l3, i, str3, l1, str5, bool2, str8, str7, bool4, bool1, paramAdRequestInfoParcel.zzHB, bool5, bool6, j, str9, bool7, bool8, localRewardItemParcel, localList4, localList5, bool9);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaK("Could not parse the mediation config: " + localJSONException.getMessage());
    }
    return new AdResponseParcel(0);
  }

  @Nullable
  private static List<String> zza(@Nullable JSONArray paramJSONArray, @Nullable List<String> paramList)
    throws JSONException
  {
    if (paramJSONArray == null)
      return null;
    if (paramList == null)
      paramList = new LinkedList();
    for (int i = 0; i < paramJSONArray.length(); i++)
      paramList.add(paramJSONArray.getString(i));
    return paramList;
  }

  public static JSONObject zzc(AdResponseParcel paramAdResponseParcel)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramAdResponseParcel.zzEF != null)
      localJSONObject.put("ad_base_url", paramAdResponseParcel.zzEF);
    if (paramAdResponseParcel.zzHW != null)
      localJSONObject.put("ad_size", paramAdResponseParcel.zzHW);
    localJSONObject.put("native", paramAdResponseParcel.zzuk);
    if (paramAdResponseParcel.zzuk)
      localJSONObject.put("ad_json", paramAdResponseParcel.body);
    else
      localJSONObject.put("ad_html", paramAdResponseParcel.body);
    if (paramAdResponseParcel.zzHY != null)
      localJSONObject.put("debug_dialog", paramAdResponseParcel.zzHY);
    if (paramAdResponseParcel.zzHS != -1L)
      localJSONObject.put("interstitial_timeout", paramAdResponseParcel.zzHS / 1000.0D);
    if (paramAdResponseParcel.orientation == zzr.zzbE().zzhw())
      localJSONObject.put("orientation", "portrait");
    else if (paramAdResponseParcel.orientation == zzr.zzbE().zzhv())
      localJSONObject.put("orientation", "landscape");
    if (paramAdResponseParcel.zzBQ != null)
      localJSONObject.put("click_urls", zzi(paramAdResponseParcel.zzBQ));
    if (paramAdResponseParcel.zzBR != null)
      localJSONObject.put("impression_urls", zzi(paramAdResponseParcel.zzBR));
    if (paramAdResponseParcel.zzHV != null)
      localJSONObject.put("manual_impression_urls", zzi(paramAdResponseParcel.zzHV));
    if (paramAdResponseParcel.zzIb != null)
      localJSONObject.put("active_view", paramAdResponseParcel.zzIb);
    localJSONObject.put("ad_is_javascript", paramAdResponseParcel.zzHZ);
    if (paramAdResponseParcel.zzIa != null)
      localJSONObject.put("ad_passback_url", paramAdResponseParcel.zzIa);
    localJSONObject.put("mediation", paramAdResponseParcel.zzHT);
    localJSONObject.put("custom_render_allowed", paramAdResponseParcel.zzIc);
    localJSONObject.put("content_url_opted_out", paramAdResponseParcel.zzId);
    localJSONObject.put("prefetch", paramAdResponseParcel.zzIe);
    localJSONObject.put("oauth2_token_status", paramAdResponseParcel.zzIf);
    if (paramAdResponseParcel.zzBU != -1L)
      localJSONObject.put("refresh_interval_milliseconds", paramAdResponseParcel.zzBU);
    if (paramAdResponseParcel.zzHU != -1L)
      localJSONObject.put("mediation_config_cache_time_milliseconds", paramAdResponseParcel.zzHU);
    if (!TextUtils.isEmpty(paramAdResponseParcel.zzIi))
      localJSONObject.put("gws_query_id", paramAdResponseParcel.zzIi);
    localJSONObject.put("fluid", paramAdResponseParcel.zzul ? "height" : "");
    localJSONObject.put("native_express", paramAdResponseParcel.zzum);
    if (paramAdResponseParcel.zzIk != null)
      localJSONObject.put("video_start_urls", zzi(paramAdResponseParcel.zzIk));
    if (paramAdResponseParcel.zzIl != null)
      localJSONObject.put("video_complete_urls", zzi(paramAdResponseParcel.zzIl));
    if (paramAdResponseParcel.zzIj != null)
      localJSONObject.put("rewards", paramAdResponseParcel.zzIj.zzgR());
    localJSONObject.put("use_displayed_impression", paramAdResponseParcel.zzIm);
    return localJSONObject;
  }

  @Nullable
  static JSONArray zzi(List<String> paramList)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONArray.put(str);
    }
    return localJSONArray;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhe
 * JD-Core Version:    0.6.0
 */