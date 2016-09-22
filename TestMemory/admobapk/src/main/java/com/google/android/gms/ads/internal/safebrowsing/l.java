package com.google.android.gms.ads.internal.safebrowsing;

import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;

@a
public final class l
{
  public static void a(String paramString)
  {
    if (((Boolean)m.aT.a()).booleanValue())
      c.b(paramString);
  }

  public static void a(String paramString, Exception paramException)
  {
    if (((Boolean)m.aT.a()).booleanValue())
      c.a(paramString, paramException);
  }

  public static boolean a()
  {
    return ((Boolean)m.aT.a()).booleanValue();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.safebrowsing.l
 * JD-Core Version:    0.6.0
 */