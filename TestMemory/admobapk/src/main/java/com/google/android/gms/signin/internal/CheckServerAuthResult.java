package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import art;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class CheckServerAuthResult extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new art();
  final int a;
  final boolean b;
  final List c;

  public CheckServerAuthResult(int paramInt, boolean paramBoolean, List paramList)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramList;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.b(paramParcel, 3, this.c, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.CheckServerAuthResult
 * JD-Core Version:    0.6.0
 */