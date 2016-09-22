package com.google.android.gms.analytics.internal;

public final class az
{
  public static ba<Long> A;
  public static ba<Long> B;
  public static ba<Long> C;
  public static ba<Long> D;
  public static ba<Long> E;
  public static ba<Boolean> a;
  public static ba<String> b;
  public static ba<Integer> c;
  public static ba<Integer> d;
  public static ba<Long> e;
  public static ba<Long> f;
  public static ba<Long> g;
  public static ba<Long> h;
  public static ba<Integer> i;
  public static ba<Integer> j;
  public static ba<String> k;
  public static ba<String> l;
  public static ba<String> m;
  public static ba<String> n;
  public static ba<Integer> o;
  public static ba<String> p;
  public static ba<String> q;
  public static ba<Integer> r;
  public static ba<Integer> s;
  public static ba<Integer> t;
  public static ba<String> u;
  public static ba<Integer> v;
  public static ba<Integer> w;
  public static ba<Integer> x;
  public static ba<Long> y;
  public static ba<Boolean> z;

  static
  {
    ba.a("analytics.service_enabled", false);
    a = ba.a("analytics.service_client_enabled", true);
    b = ba.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    ba.a("analytics.max_tokens", 60L);
    ba.a("analytics.tokens_per_sec");
    c = ba.a("analytics.max_stored_hits", 2000, 20000);
    ba.a("analytics.max_stored_hits_per_app", 2000);
    d = ba.a("analytics.max_stored_properties_per_app", 100);
    e = ba.a("analytics.local_dispatch_millis", 1800000L, 120000L);
    f = ba.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    ba.a("analytics.min_local_dispatch_millis", 120000L);
    ba.a("analytics.max_local_dispatch_millis", 7200000L);
    g = ba.a("analytics.dispatch_alarm_millis", 7200000L);
    h = ba.a("analytics.max_dispatch_alarm_millis", 32400000L);
    i = ba.a("analytics.max_hits_per_dispatch", 20);
    j = ba.a("analytics.max_hits_per_batch", 20);
    k = ba.a("analytics.insecure_host", "http://www.google-analytics.com");
    l = ba.a("analytics.secure_host", "https://ssl.google-analytics.com");
    m = ba.a("analytics.simple_endpoint", "/collect");
    n = ba.a("analytics.batching_endpoint", "/batch");
    o = ba.a("analytics.max_get_length", 2036);
    p = ba.a("analytics.batching_strategy.k", zzm.zzKD.name(), zzm.zzKD.name());
    q = ba.a("analytics.compression_strategy.k", zzo.zzKL.name());
    ba.a("analytics.max_hits_per_request.k", 20);
    r = ba.a("analytics.max_hit_length.k", 8192);
    s = ba.a("analytics.max_post_length.k", 8192);
    t = ba.a("analytics.max_batch_post_length", 8192);
    u = ba.a("analytics.fallback_responses.k", "404,502");
    v = ba.a("analytics.batch_retry_interval.seconds.k", 3600);
    ba.a("analytics.service_monitor_interval", 86400000L);
    w = ba.a("analytics.http_connection.connect_timeout_millis", 60000);
    x = ba.a("analytics.http_connection.read_timeout_millis", 61000);
    y = ba.a("analytics.campaigns.time_limit", 86400000L);
    ba.a("analytics.first_party_experiment_id", "");
    ba.a("analytics.first_party_experiment_variant", 0);
    z = ba.a("analytics.test.disable_receiver", false);
    A = ba.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    B = ba.a("analytics.service_client.connect_timeout_millis", 5000L);
    ba.a("analytics.service_client.second_connect_delay_millis", 5000L);
    ba.a("analytics.service_client.unexpected_reconnect_millis", 60000L);
    C = ba.a("analytics.service_client.reconnect_throttle_millis", 1800000L);
    D = ba.a("analytics.monitoring.sample_period_millis", 86400000L);
    E = ba.a("analytics.initialization_warning_threshold", 5000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.az
 * JD-Core Version:    0.6.0
 */