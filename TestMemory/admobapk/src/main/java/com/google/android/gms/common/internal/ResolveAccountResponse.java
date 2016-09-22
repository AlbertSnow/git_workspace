package com.google.android.gms.common.internal;

import anc;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import any;
import aod;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ResolveAccountResponse extends AbstractSafeParcelable
{
  public static final Parcelable.Creator CREATOR = new any();
  final int a;
  public IBinder b;
  public ConnectionResult c;
  public boolean d;
  public boolean e;

  public ResolveAccountResponse(int paramInt, IBinder paramIBinder, ConnectionResult paramConnectionResult, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt;
    this.b = paramIBinder;
    this.c = paramConnectionResult;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    ResolveAccountResponse localResolveAccountResponse;
    do
    {
      return true;
      if (!(paramObject instanceof ResolveAccountResponse))
        return false;
      localResolveAccountResponse = (ResolveAccountResponse)paramObject;
    }
    while ((this.c.equals(localResolveAccountResponse.c)) && (anc.a(this.b).equals(anc.a(localResolveAccountResponse.b))));
    return false;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = aod.a(paramParcel, 20293);
    aod.a(paramParcel, 1, this.a);
    aod.a(paramParcel, 2, this.b, false);
    aod.a(paramParcel, 3, this.c, paramInt, false);
    aod.a(paramParcel, 4, this.d);
    aod.a(paramParcel, 5, this.e);
    aod.b(paramParcel, i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ResolveAccountResponse
 * JD-Core Version:    0.6.0
 */