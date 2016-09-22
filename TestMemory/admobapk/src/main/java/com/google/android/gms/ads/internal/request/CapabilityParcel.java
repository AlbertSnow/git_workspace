package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@a
public class CapabilityParcel extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new v();
  public final int a;
  public final boolean b;
  public final boolean c;
  public final boolean d;

  CapabilityParcel(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramInt;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramBoolean3;
  }

  public CapabilityParcel(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this(2, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.CapabilityParcel
 * JD-Core Version:    0.6.0
 */