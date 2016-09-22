package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzex.zza;

public abstract interface zzt extends IInterface
{
  public abstract IBinder zza(zzd paramzzd, String paramString, zzex paramzzex, int paramInt)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzt
  {
    public static zzt zzj(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      if ((localIInterface != null) && ((localIInterface instanceof zzt)))
        return (zzt)localIInterface;
      return new zza(paramIBinder);
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        zzd localzzd = zzd.zza.zzbs(data.readStrongBinder());
        String str = data.readString();
        zzex localzzex = zzex.zza.zzE(data.readStrongBinder());
        int i = data.readInt();
        IBinder localIBinder = zza(localzzd, str, localzzex, i);
        reply.writeNoException();
        reply.writeStrongBinder(localIBinder);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzt
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

      public IBinder zza(zzd paramzzd, String paramString, zzex paramzzex, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        IBinder localIBinder;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          localParcel1.writeString(paramString);
          localParcel1.writeStrongBinder(paramzzex != null ? paramzzex.asBinder() : null);
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
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzt
 * JD-Core Version:    0.6.0
 */