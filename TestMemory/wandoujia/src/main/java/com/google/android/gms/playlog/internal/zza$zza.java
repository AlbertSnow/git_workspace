package com.google.android.gms.playlog.internal;

import android.os.Binder;
import android.os.Parcel;

public abstract class zza$zza extends Binder
  implements zza
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default:
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 2:
      do
      {
        return bool;
        paramParcel2.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
        return bool;
        paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
        paramParcel1.readString();
        if (paramParcel1.readInt() == 0)
          continue;
        b.a(paramParcel1);
      }
      while (paramParcel1.readInt() == 0);
      a.a(paramParcel1);
      return bool;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        b.a(paramParcel1);
      paramParcel1.createTypedArrayList(LogEvent.CREATOR);
      return bool;
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
    paramParcel1.readString();
    if (paramParcel1.readInt() != 0)
      b.a(paramParcel1);
    paramParcel1.createByteArray();
    return bool;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.playlog.internal.zza.zza
 * JD-Core Version:    0.6.0
 */