package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract interface zzck extends IInterface
{
  public abstract IBinder zza(zzd paramzzd1, zzd paramzzd2, zzd paramzzd3, int paramInt)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzck
  {
    public static zzck zzv(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
      if ((localIInterface != null) && ((localIInterface instanceof zzck)))
        return (zzck)localIInterface;
      return new zza(paramIBinder);
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        zzd localzzd1 = zzd.zza.zzbs(data.readStrongBinder());
        zzd localzzd2 = zzd.zza.zzbs(data.readStrongBinder());
        zzd localzzd3 = zzd.zza.zzbs(data.readStrongBinder());
        int i = data.readInt();
        IBinder localIBinder = zza(localzzd1, localzzd2, localzzd3, i);
        reply.writeNoException();
        reply.writeStrongBinder(localIBinder);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzck
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

      public IBinder zza(zzd paramzzd1, zzd paramzzd2, zzd paramzzd3, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        IBinder localIBinder;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
          localParcel1.writeStrongBinder(paramzzd1 != null ? paramzzd1.asBinder() : null);
          localParcel1.writeStrongBinder(paramzzd2 != null ? paramzzd2.asBinder() : null);
          localParcel1.writeStrongBinder(paramzzd3 != null ? paramzzd3.asBinder() : null);
          localParcel1.writeInt(paramInt);
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
 * Qualified Name:     com.google.android.gms.internal.zzck
 * JD-Core Version:    0.6.0
 */