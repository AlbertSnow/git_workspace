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

public abstract interface zzv extends IInterface
{
  public abstract IBinder zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, int paramInt)
    throws RemoteException;

  public abstract IBinder zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, int paramInt1, int paramInt2)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzv
  {
    public static zzv zzl(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      if ((localIInterface != null) && ((localIInterface instanceof zzv)))
        return (zzv)localIInterface;
      return new zza(paramIBinder);
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      zzd localzzd;
      AdSizeParcel localAdSizeParcel;
      String str;
      zzex localzzex;
      int i;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        localzzd = zzd.zza.zzbs(data.readStrongBinder());
        if (0 != data.readInt())
          localAdSizeParcel = AdSizeParcel.CREATOR.zzc(data);
        else
          localAdSizeParcel = null;
        str = data.readString();
        localzzex = zzex.zza.zzE(data.readStrongBinder());
        i = data.readInt();
        IBinder localIBinder1 = zza(localzzd, localAdSizeParcel, str, localzzex, i);
        reply.writeNoException();
        reply.writeStrongBinder(localIBinder1);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        localzzd = zzd.zza.zzbs(data.readStrongBinder());
        if (0 != data.readInt())
          localAdSizeParcel = AdSizeParcel.CREATOR.zzc(data);
        else
          localAdSizeParcel = null;
        str = data.readString();
        localzzex = zzex.zza.zzE(data.readStrongBinder());
        i = data.readInt();
        int j = data.readInt();
        IBinder localIBinder2 = zza(localzzd, localAdSizeParcel, str, localzzex, i, j);
        reply.writeNoException();
        reply.writeStrongBinder(localIBinder2);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzv
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

      public IBinder zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        IBinder localIBinder;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          if (paramAdSizeParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdSizeParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
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

      public IBinder zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, int paramInt1, int paramInt2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        IBinder localIBinder;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          if (paramAdSizeParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdSizeParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString);
          localParcel1.writeStrongBinder(paramzzex != null ? paramzzex.asBinder() : null);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzv
 * JD-Core Version:    0.6.0
 */