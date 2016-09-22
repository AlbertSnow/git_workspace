package com.google.android.gms.signin.internal;

import aiv;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aod;
import arr;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AuthAccountResult extends AbstractSafeParcelable
  implements aiv
{
  public static final Parcelable.Creator CREATOR = new arr();
  final int a;
  int b;
  Intent c;

  public AuthAccountResult()
  {
    this(0, null);
  }

  public AuthAccountResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramIntent;
  }

  private AuthAccountResult(int paramInt, Intent paramIntent)
  {
    this(2, 0, null);
  }

  public final Status a()
  {
    if (this.b == 0)
      return Status.a;
    return Status.d;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b);
    aod.a(paramParcel, 3, this.c, paramInt, false);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.AuthAccountResult
 * JD-Core Version:    0.6.0
 */