package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor.zza;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzq.zza;

public abstract class zzf$zza extends Binder
  implements zzf
{
  public static zzf a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
    if ((localIInterface != null) && ((localIInterface instanceof zzf)))
      return (zzf)localIInterface;
    return new d(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.signin.internal.ISignInService");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      int i2 = paramParcel1.readInt();
      AuthAccountRequest localAuthAccountRequest = null;
      if (i2 != 0)
        localAuthAccountRequest = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(paramParcel1);
      a(localAuthAccountRequest, zze.zza.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      int i1 = paramParcel1.readInt();
      CheckServerAuthResult localCheckServerAuthResult = null;
      if (i1 != 0)
        localCheckServerAuthResult = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(paramParcel1);
      a(localCheckServerAuthResult);
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      if (paramParcel1.readInt() != 0);
      for (boolean bool2 = true; ; bool2 = false)
      {
        a(bool2);
        paramParcel2.writeNoException();
        return true;
      }
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      int n = paramParcel1.readInt();
      ResolveAccountRequest localResolveAccountRequest = null;
      if (n != 0)
        localResolveAccountRequest = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(paramParcel1);
      a(localResolveAccountRequest, zzq.zza.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      int k = paramParcel1.readInt();
      int m = paramParcel1.readInt();
      Account localAccount = null;
      if (m != 0)
        localAccount = (Account)Account.CREATOR.createFromParcel(paramParcel1);
      a(k, localAccount, zze.zza.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9:
    }
    paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
    IAccountAccessor localIAccountAccessor = IAccountAccessor.zza.a(paramParcel1.readStrongBinder());
    int i = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    boolean bool1 = false;
    if (j != 0)
      bool1 = true;
    a(localIAccountAccessor, i, bool1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.signin.internal.zzf.zza
 * JD-Core Version:    0.6.0
 */