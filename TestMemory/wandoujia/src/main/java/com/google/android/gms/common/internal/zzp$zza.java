package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzp$zza extends Binder
  implements zzp
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readString();
      paramParcel1.createStringArray();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readString();
      paramParcel1.createStringArray();
      paramParcel1.readString();
      paramParcel1.readStrongBinder();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readString();
      paramParcel1.createStringArray();
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 20:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.createStringArray();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 21:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 22:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 23:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 24:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 25:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 26:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 27:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 28:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      paramParcel2.writeNoException();
      return true;
    case 30:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readString();
      paramParcel1.createStringArray();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 31:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 32:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 33:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readString();
      paramParcel1.readString();
      paramParcel1.createStringArray();
      paramParcel2.writeNoException();
      return true;
    case 34:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 35:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 36:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 37:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 38:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 40:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 41:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 42:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 43:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 44:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 45:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      paramParcel1.readString();
      paramParcel2.writeNoException();
      return true;
    case 46:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      zzo.zza.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
        GetServiceRequest.CREATOR.createFromParcel(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    case 47:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    zzo.zza.a(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0)
      ValidateAccountRequest.CREATOR.createFromParcel(paramParcel1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzp.zza
 * JD-Core Version:    0.6.0
 */