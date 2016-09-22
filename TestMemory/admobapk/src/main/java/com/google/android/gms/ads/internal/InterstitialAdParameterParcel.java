package com.google.android.gms.ads.internal;

import android.os.Parcel;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@a
public final class InterstitialAdParameterParcel extends AbstractSafeParcelable
{
  public static final ae CREATOR = new ae();
  public final int a;
  public final boolean b;
  public final boolean c;
  public final String d;
  public final boolean e;
  public final float f;
  public final int g;

  InterstitialAdParameterParcel(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, float paramFloat, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramString;
    this.e = paramBoolean3;
    this.f = paramFloat;
    this.g = paramInt2;
  }

  public InterstitialAdParameterParcel(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat, int paramInt)
  {
    this(3, paramBoolean1, paramBoolean2, null, paramBoolean3, paramFloat, paramInt);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d, false);
    aod.a(paramParcel, 5, this.e);
    aod.a(paramParcel, 6, this.f);
    aod.a(paramParcel, 7, this.g);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.InterstitialAdParameterParcel
 * JD-Core Version:    0.6.0
 */