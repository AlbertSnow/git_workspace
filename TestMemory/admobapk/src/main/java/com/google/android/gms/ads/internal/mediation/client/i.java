package com.google.android.gms.ads.internal.mediation.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class i extends Binder
  implements h
{
  public i()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }

  public static h a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    if ((localIInterface != null) && ((localIInterface instanceof h)))
      return (h)localIInterface;
    return new j(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      a();
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      b();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      c();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      d();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      e();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null)
        localObject = null;
      while (true)
      {
        a((k)localObject);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
        if ((localIInterface != null) && ((localIInterface instanceof k)))
        {
          localObject = (k)localIInterface;
          continue;
        }
        localObject = new m(localIBinder);
      }
    case 8:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    f();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.i
 * JD-Core Version:    0.6.0
 */