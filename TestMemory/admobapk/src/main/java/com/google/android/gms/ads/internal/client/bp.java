package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.e;

final class bp extends z
{
  bp(bo parambo)
  {
  }

  public final String a()
  {
    return null;
  }

  public final void a(AdRequestParcel paramAdRequestParcel)
  {
    e.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
    a.a.post(new bq(this));
  }

  public final boolean b()
  {
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.bp
 * JD-Core Version:    0.6.0
 */