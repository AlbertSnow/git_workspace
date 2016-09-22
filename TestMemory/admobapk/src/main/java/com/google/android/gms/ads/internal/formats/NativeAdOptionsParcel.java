package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import aod;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@a
public class NativeAdOptionsParcel extends AbstractSafeParcelable
{
  public static final t CREATOR = new t();
  public final int a;
  public final boolean b;
  public final int c;
  public final boolean d;
  public final int e;

  public NativeAdOptionsParcel(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramInt2;
    this.d = paramBoolean2;
    this.e = paramInt3;
  }

  public NativeAdOptionsParcel(c paramc)
  {
    this(2, paramc.a, paramc.b, paramc.c, paramc.d);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d);
    aod.a(paramParcel, 5, this.e);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel
 * JD-Core Version:    0.6.0
 */