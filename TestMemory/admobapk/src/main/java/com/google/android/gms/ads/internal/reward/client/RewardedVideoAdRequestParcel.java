package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import aod;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@a
public final class RewardedVideoAdRequestParcel extends AbstractSafeParcelable
{
  public static final p CREATOR = new p();
  public final int a;
  public final AdRequestParcel b;
  public final String c;

  public RewardedVideoAdRequestParcel(int paramInt, AdRequestParcel paramAdRequestParcel, String paramString)
  {
    this.a = paramInt;
    this.b = paramAdRequestParcel;
    this.c = paramString;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, paramInt, false);
    aod.a(paramParcel, 3, this.c, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel
 * JD-Core Version:    0.6.0
 */