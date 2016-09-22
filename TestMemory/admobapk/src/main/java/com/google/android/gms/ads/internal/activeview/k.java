package com.google.android.gms.ads.internal.activeview;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@a
public final class k
{
  final String a;
  final JSONObject b;
  final String c;
  final String d;
  final boolean e;
  final boolean f;

  public k(String paramString1, VersionInfoParcel paramVersionInfoParcel, String paramString2, JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.d = paramVersionInfoParcel.b;
    this.b = paramJSONObject;
    this.c = paramString1;
    this.a = paramString2;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.k
 * JD-Core Version:    0.6.0
 */