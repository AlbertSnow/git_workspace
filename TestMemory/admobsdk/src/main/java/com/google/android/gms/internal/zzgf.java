package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract interface zzgf extends IInterface
{
  public abstract IBinder zzf(zzd paramzzd)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzgf
  {
    public static zzgf zzR(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
      if ((localIInterface != null) && ((localIInterface instanceof zzgf)))
        return (zzgf)localIInterface;
      return new zza(paramIBinder);
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
        zzd localzzd = zzd.zza.zzbs(data.readStrongBinder());
        IBinder localIBinder = zzf(localzzd);
        reply.writeNoException();
        reply.writeStrongBinder(localIBinder);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzgf
    {
      private IBinder zzoz;

      zza(IBinder paramIBinder)
      {
        this.zzoz = paramIBinder;
      }

      public IBinder asBinder()
      {
        return this.zzoz;
      }

      public IBinder zzf(zzd paramzzd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        IBinder localIBinder;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localIBinder = localParcel2.readStrongBinder();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localIBinder;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgf
 * JD-Core Version:    0.6.0
 */