package com.google.android.gms.analytics.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzac$zza extends Binder
  implements zzac
{
  public static zzac a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
    if ((localIInterface != null) && ((localIInterface instanceof zzac)))
      return (zzac)localIInterface;
    return new e(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
      a(paramParcel1.readHashMap(getClass().getClassLoader()), paramParcel1.readLong(), paramParcel1.readString(), paramParcel1.createTypedArrayList(Command.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
      a();
      paramParcel2.writeNoException();
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
    String str = b();
    paramParcel2.writeNoException();
    paramParcel2.writeString(str);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.zzac.zza
 * JD-Core Version:    0.6.0
 */