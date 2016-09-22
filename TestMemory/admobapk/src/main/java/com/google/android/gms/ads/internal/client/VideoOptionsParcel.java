package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@a
public class VideoOptionsParcel extends AbstractSafeParcelable
{
  public static final bv CREATOR = new bv();
  public final int a;
  public final boolean b;

  public VideoOptionsParcel(int paramInt, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramBoolean;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.VideoOptionsParcel
 * JD-Core Version:    0.6.0
 */