package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import aod;
import com.google.android.gms.ads.internal.report.client.a;

@a
public class ThinAdSizeParcel extends AdSizeParcel
{
  public ThinAdSizeParcel(AdSizeParcel paramAdSizeParcel)
  {
    super(paramAdSizeParcel.a, paramAdSizeParcel.b, paramAdSizeParcel.c, paramAdSizeParcel.d, paramAdSizeParcel.e, paramAdSizeParcel.f, paramAdSizeParcel.g, paramAdSizeParcel.h, paramAdSizeParcel.i, paramAdSizeParcel.j, paramAdSizeParcel.k);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 6, this.f);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.ThinAdSizeParcel
 * JD-Core Version:    0.6.0
 */