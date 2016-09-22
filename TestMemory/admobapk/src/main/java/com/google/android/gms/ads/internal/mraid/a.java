package com.google.android.gms.ads.internal.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

@com.google.android.gms.ads.internal.report.client.a
public final class a extends m
{
  public final Context a;
  String b;
  long c;
  long d;
  String e;
  String f;
  private final Map g;

  public a(b paramb, Map paramMap)
  {
    super(paramb, "createCalendarEvent");
    this.g = paramMap;
    this.a = paramb.f();
    this.b = d("description");
    this.e = d("summary");
    this.c = e("start_ticks");
    this.d = e("end_ticks");
    this.f = d("location");
  }

  private final String d(String paramString)
  {
    if (TextUtils.isEmpty((CharSequence)this.g.get(paramString)))
      return "";
    return (String)this.g.get(paramString);
  }

  private final long e(String paramString)
  {
    String str = (String)this.g.get(paramString);
    if (str == null)
      return -1L;
    try
    {
      long l = Long.parseLong(str);
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return -1L;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mraid.a
 * JD-Core Version:    0.6.0
 */