package com.google.android.gms.ads.internal.config;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.Collections;
import java.util.List;

@a
public final class b
  implements c
{
  public final List a(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    if (paramAdRequestInfoParcel.x == null)
      return Collections.emptyList();
    return paramAdRequestInfoParcel.x;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.config.b
 * JD-Core Version:    0.6.0
 */