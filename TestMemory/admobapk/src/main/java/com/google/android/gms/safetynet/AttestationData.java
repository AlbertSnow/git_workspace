package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import aqp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AttestationData extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new aqp();
  public final int a;
  String b;

  public AttestationData(int paramInt, String paramString)
  {
    this.a = paramInt;
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
 * Qualified Name:     com.google.android.gms.safetynet.AttestationData
 * JD-Core Version:    0.6.0
 */