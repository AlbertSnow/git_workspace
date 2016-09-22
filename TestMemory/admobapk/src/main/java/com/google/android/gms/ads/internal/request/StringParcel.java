package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@a
public class StringParcel extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new an();
  final int a;
  String b;

  StringParcel(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }

  public StringParcel(String paramString)
  {
    this.a = 1;
    this.b = paramString;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.StringParcel
 * JD-Core Version:    0.6.0
 */