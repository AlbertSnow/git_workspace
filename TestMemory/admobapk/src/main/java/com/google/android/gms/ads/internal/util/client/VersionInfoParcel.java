package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@a
public final class VersionInfoParcel extends AbstractSafeParcelable
{
  public static final g CREATOR = new g();
  public final int a;
  public String b;
  public int c;
  public int d;
  public boolean e;

  public VersionInfoParcel(int paramInt1, int paramInt2, boolean paramBoolean)
  {
  }

  VersionInfoParcel(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramBoolean;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c);
    aod.a(paramParcel, 4, this.d);
    aod.a(paramParcel, 5, this.e);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.client.VersionInfoParcel
 * JD-Core Version:    0.6.0
 */