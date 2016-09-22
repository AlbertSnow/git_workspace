package com.google.android.gms.ads.internal.request.service;

import com.google.android.gms.ads.internal.report.client.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@a
final class q
{
  final List a;
  final String b;
  final String c;
  final boolean d;
  final String e;
  final String f;
  String g;
  int h;

  public q(int paramInt, Map paramMap)
  {
    this.g = ((String)paramMap.get("url"));
    paramMap.get("base_uri");
    this.b = ((String)paramMap.get("post_parameters"));
    this.d = a((String)paramMap.get("drt_include"));
    a((String)paramMap.get("pan_include"));
    paramMap.get("activation_overlay_url");
    b((String)paramMap.get("check_packages"));
    this.e = ((String)paramMap.get("request_id"));
    this.c = ((String)paramMap.get("type"));
    this.a = b((String)paramMap.get("errors"));
    this.h = paramInt;
    this.f = ((String)paramMap.get("fetched_ad"));
  }

  private static boolean a(String paramString)
  {
    return (paramString != null) && ((paramString.equals("1")) || (paramString.equals("true")));
  }

  private static List b(String paramString)
  {
    if (paramString == null)
      return null;
    return Arrays.asList(paramString.split(","));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.q
 * JD-Core Version:    0.6.0
 */