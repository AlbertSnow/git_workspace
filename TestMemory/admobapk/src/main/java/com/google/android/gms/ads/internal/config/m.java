package com.google.android.gms.ads.internal.config;

import android.content.Context;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.bj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@a
public final class m
{
  public static final d A;
  public static final d B;
  public static final d C;
  public static final d D;
  public static final d E;
  public static final d F;
  public static final d G;
  public static final d H;
  public static final d I;
  public static final d J;
  public static final d K;
  public static final d L;
  public static final d M;
  public static final d N;
  public static final d O;
  public static final d P;
  public static final d Q;
  public static final d R;
  public static final d S;
  public static final d T;
  public static final d U;
  public static final d V;
  public static final d W;
  public static final d X;
  public static final d Y;
  public static final d Z;
  public static final d a;
  public static final d aA;
  public static final d aB;
  public static final d aC;
  public static final d aD;
  public static final d aE;
  public static final d aF;
  public static final d aG;
  public static final d aH;
  public static final d aI;
  public static final d aJ;
  public static final d aK;
  public static final d aL;
  public static final d aM;
  public static final d aN;
  public static final d aO;
  public static final d aP;
  public static final d aQ;
  public static final d aR;
  public static final d aS;
  public static final d aT;
  public static final d aU;
  public static final d aa;
  public static final d ab;
  public static final d ac;
  public static final d ad;
  public static final d ae;
  public static final d af;
  public static final d ag;
  public static final d ah;
  public static final d ai;
  public static final d aj;
  public static final d ak;
  public static final d al;
  public static final d am;
  public static final d an;
  public static final d ao;
  public static final d ap;
  public static final d aq;
  public static final d ar;
  public static final d as;
  public static final d at;
  public static final d au;
  public static final d av;
  public static final d aw;
  public static final d ax;
  public static final d ay;
  public static final d az;
  public static final d b;
  public static final d c;
  public static final d d;
  public static final d e;
  public static final d f;
  public static final d g;
  public static final d h;
  public static final d i;
  public static final d j;
  public static final d k;
  public static final d l;
  public static final d m;
  public static final d n;
  public static final d o;
  public static final d p;
  public static final d q;
  public static final d r;
  public static final d s;
  public static final d t;
  public static final d u;
  public static final d v;
  public static final d w;
  public static final d x;
  public static final d y;
  public static final d z;

  static
  {
    d.a(0, "gads:sdk_core_experiment_id");
    a = d.a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    d.a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
    d.a(0, "gads:request_builder:singleton_webview_experiment_id");
    d.a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));
    d.a(0, "gads:sdk_use_dynamic_module_experiment_id");
    b = d.a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    c = d.a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    d = d.a(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    e = d.a(0, "gads:block_autoclicks", Boolean.valueOf(false));
    d.a(0, "gads:block_autoclicks_experiment_id");
    d.b(0, "gads:prefetch:experiment_id");
    d.a(0, "gads:spam_app_context:experiment_id");
    f = d.a(0, "gads:spam_app_context:enabled", Boolean.valueOf(false));
    d.a(0, "gads:video_stream_cache:experiment_id");
    g = d.a(0, "gads:video_stream_cache:limit_count", 5);
    h = d.a(0, "gads:video_stream_cache:limit_space", 8388608);
    i = d.a(0, "gads:video_stream_exo_cache:buffer_size", 8388608);
    j = d.a(0, "gads:video_stream_cache:limit_time_sec", 300L);
    k = d.a(0, "gads:video_stream_cache:notify_interval_millis", 1000L);
    l = d.a(0, "gads:video_stream_cache:connect_timeout_millis", 10000);
    m = d.a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    n = d.a(0, "gads:video:metric_frame_hash_times", "");
    o = d.a(0, "gads:video:metric_frame_hash_time_leniency", 500L);
    d.b(0, "gads:spam_ad_id_decorator:experiment_id");
    p = d.a(0, "gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    d.b(0, "gads:looper_for_gms_client:experiment_id");
    q = d.a(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    r = d.a(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    d.a(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
    s = d.a(0, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    t = d.a(0, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    u = d.a(0, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    v = d.a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
    w = d.a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    x = d.a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    y = d.a(0, "gads:enable_content_fetching", Boolean.valueOf(true));
    z = d.a(0, "gads:content_length_weight", 1);
    A = d.a(0, "gads:content_age_weight", 1);
    B = d.a(0, "gads:min_content_len", 11);
    C = d.a(0, "gads:fingerprint_number", 10);
    D = d.a(0, "gads:sleep_sec", 10);
    E = d.a(0, "gad:app_index_enabled", Boolean.valueOf(true));
    F = d.a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
    G = d.a(0, "gads:app_index:timeout_ms", 1000L);
    d.a(0, "gads:app_index:experiment_id");
    d.a(0, "gads:kitkat_interstitial_workaround:experiment_id");
    H = d.a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    I = d.a(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
    J = d.a(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    d.a(0, "gads:interstitial_follow_url:experiment_id");
    d.a(0, "gads:analytics_enabled", Boolean.valueOf(true));
    K = d.a(0, "gads:ad_key_enabled", Boolean.valueOf(false));
    d.a(0, "gads:webview_cache_version", 0);
    L = d.a(1, "gads:webview_recycle:enabled", Boolean.valueOf(false));
    d.a(1, "gads:webview_recycle:experiment_id");
    d.b(0, "gads:pan:experiment_id");
    M = d.a(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    N = d.a(0, "gads:ad_manager_creator:enabled", Boolean.valueOf(true));
    O = d.a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
    P = d.a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));
    Q = d.a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    R = d.a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    S = d.a(1, "gads:interstitial_ad_pool:max_pools", 3);
    T = d.a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    U = d.a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    V = d.a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    W = d.a(1, "gads:spherical_video:vertex_shader", "");
    X = d.a(1, "gads:spherical_video:fragment_shader", "");
    d.a(1, "gads:spherical_video:experiment_id");
    Y = d.a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
    Z = d.a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));
    d.a(1, "gads:include_local_global_rectangles:experiment_id");
    aa = d.a(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
    ab = d.a(0, "gads:device_info_caching_expiry_ms:expiry", 300000L);
    ac = d.a(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
    ad = d.a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    d.a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
    d.a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
    d.a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
    d.a(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
    ae = d.a(0, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
    af = d.a(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));
    d.a(0, "gads:gmsg:video_meta:experiment_id");
    d.a(0, "gads:network:cache_prediction_duration_s", 300L);
    ag = d.a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
    ah = d.a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
    ai = d.a(0, "gads:ad_loader:timeout_ms", 60000L);
    aj = d.a(0, "gads:rendering:timeout_ms", 60000L);
    ak = d.a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    al = d.a(1, "gads:gestures:task_timeout", 2000L);
    d.a(1, "gads:gestures:encrypt_size_limit:experiment_id");
    am = d.a(1, "gads:gestures:encrypt_size_limit:enabled", Boolean.valueOf(true));
    d.a(1, "gads:gestures:cpu:experiment_id");
    an = d.a(1, "gads:gestures:cpu_query:enabled", Boolean.valueOf(false));
    ao = d.a(1, "gads:gestures:cpu_click:enabled", Boolean.valueOf(false));
    d.a(1, "gads:gestures:jbk:experiment_id");
    ap = d.a(1, "gads:gestures:jbk_query:enabled", Boolean.valueOf(false));
    aq = d.a(1, "gads:gestures:jbk_click:enabled", Boolean.valueOf(false));
    d.a(1, "gads:gestures:stk:experiment_id");
    ar = d.a(1, "gads:gestures:stk:enabled", Boolean.valueOf(false));
    as = d.a(0, "gass:client:enabled", Boolean.valueOf(false));
    d.a(0, "gass:client:experiment_id");
    d.a(0, "gass:enabled", Boolean.valueOf(false));
    d.a(0, "gass:enable_int_signal", Boolean.valueOf(true));
    d.a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    d.a(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
    at = d.a(0, "gads:support_screen_shot", Boolean.valueOf(true));
    au = d.a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));
    d.a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
    d.a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12L));
    av = d.a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    aw = d.a(1, "gads:singleton_webview_native", Boolean.valueOf(false));
    d.a(1, "gads:singleton_webview_native:experiment_id");
    ax = d.a(1, "gads:enable_untrack_view_native", Boolean.valueOf(true));
    ay = d.a(1, "gads:reset_listeners_preparead_native", Boolean.valueOf(true));
    az = d.a(0, "gads:method_tracing:enabled", Boolean.valueOf(false));
    aA = d.a(0, "gads:method_tracing:duration_ms", 30000L);
    aB = d.a(0, "gads:method_tracing:count", 5);
    aC = d.a(0, "gads:method_tracing:filesize", 134217728);
    d.a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));
    d.b(1, "gads:auto_location_for_coarse_permission:experiment_id");
    aD = d.a(1, "gads:auto_location_timeout", 2000L);
    d.b(1, "gads:auto_location_timeout:experiment_id");
    d.a(1, "gads:auto_location_interval", -1L);
    d.b(1, "gads:auto_location_interval:experiment_id");
    aE = d.a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));
    d.a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
    aF = d.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);
    d.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms:experiment_id");
    d.a(0, "gads:afs:csa:experiment_id");
    aG = d.a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    aH = d.a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    aI = d.a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    aJ = d.a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    aK = d.a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
    aL = d.a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000L);
    aM = d.a(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));
    aN = d.a(0, "gads:safe_browsing:reporting:malicious:enabled", Boolean.valueOf(false));
    aO = d.a(0, "gads:safe_browsing:reporting:full:enabled", Boolean.valueOf(false));
    aP = d.a(0, "gads:safe_browsing:screenshot:enabled", Boolean.valueOf(false));
    aQ = d.a(0, "gads:safe_browsing:reporting:url", "https://sb-ssl.google.com/safebrowsing/clientreport/malware");
    aR = d.a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
    aS = d.a(0, "gads:safe_browsing:safety_net:delay_ms", 2000L);
    d.a(0, "gads:safe_browsing:experiment_id");
    aT = d.a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));
    aU = d.a(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));
  }

  public static List a()
  {
    return bc.a().m.a();
  }

  public static void a(Context paramContext)
  {
    bj.a(new n(paramContext));
  }

  public static List b()
  {
    i locali = bc.a().m;
    List localList = locali.a();
    Iterator localIterator = locali.c.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)((d)localIterator.next()).a();
      if (str == null)
        continue;
      localList.add(str);
    }
    return localList;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.config.m
 * JD-Core Version:    0.6.0
 */