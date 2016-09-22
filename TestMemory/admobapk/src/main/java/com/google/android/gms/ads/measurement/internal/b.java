package com.google.android.gms.ads.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class b extends Binder
  implements a
{
  public b()
  {
    attachInterface(this, "com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporter");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporter");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporter");
    if (paramParcel1.readInt() != 0);
    for (Bundle localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle = null)
    {
      a(localBundle);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.measurement.internal.b
 * JD-Core Version:    0.6.0
 */