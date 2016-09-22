package com.google.android.gms.ads.internal.state;

import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.mediation.c;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import org.json.JSONObject;

@a
public final class b
{
  public final AdRequestInfoParcel a;
  public final AdResponseParcel b;
  public final c c;
  public final AdSizeParcel d;
  public final int e;
  public final long f;
  public final long g;
  public final JSONObject h;

  public b(AdRequestInfoParcel paramAdRequestInfoParcel, AdResponseParcel paramAdResponseParcel, c paramc, AdSizeParcel paramAdSizeParcel, int paramInt, long paramLong1, long paramLong2, JSONObject paramJSONObject)
  {
    this.a = paramAdRequestInfoParcel;
    this.b = paramAdResponseParcel;
    this.c = paramc;
    this.d = paramAdSizeParcel;
    this.e = paramInt;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = paramJSONObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.state.b
 * JD-Core Version:    0.6.0
 */