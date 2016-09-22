package com.google.android.gms.ads.internal.interstitial;

import anw;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.LinkedList;

@a
final class ae
{
  final LinkedList a;
  AdRequestParcel b;
  final String c;
  final int d;
  boolean e;

  ae(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    anw.a(paramAdRequestParcel);
    anw.a(paramString);
    this.a = new LinkedList();
    this.b = paramAdRequestParcel;
    this.c = paramString;
    this.d = paramInt;
  }

  final af a(AdRequestParcel paramAdRequestParcel)
  {
    if (paramAdRequestParcel != null)
      this.b = paramAdRequestParcel;
    return (af)this.a.remove();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.interstitial.ae
 * JD-Core Version:    0.6.0
 */