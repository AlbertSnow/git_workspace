package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzjk$zza extends Binder
  implements zzjk
{
  public static zzjk a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzjk)))
      return (zzjk)localIInterface;
    return new h(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.auth.api.internal.IAuthCallbacks");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    if (paramParcel1.readInt() != 0);
    for (ProxyResponse localProxyResponse = (ProxyResponse)ProxyResponse.CREATOR.createFromParcel(paramParcel1); ; localProxyResponse = null)
    {
      a(localProxyResponse);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.zzjk.zza
 * JD-Core Version:    0.6.0
 */