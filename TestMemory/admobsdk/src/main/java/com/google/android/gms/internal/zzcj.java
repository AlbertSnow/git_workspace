package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract interface zzcj extends IInterface
{
  public abstract void zza(String paramString, zzd paramzzd)
    throws RemoteException;

  public abstract zzd zzK(String paramString)
    throws RemoteException;

  public abstract void zza(zzd paramzzd)
    throws RemoteException;

  public abstract void destroy()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzcj
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzcj zzu(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      if ((localIInterface != null) && ((localIInterface instanceof zzcj)))
        return (zzcj)localIInterface;
      return new zza(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      Object localObject;
      zzd localzzd;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        localObject = data.readString();
        localzzd = zzd.zza.zzbs(data.readStrongBinder());
        zza((String)localObject, localzzd);
        reply.writeNoException();
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        localObject = data.readString();
        localzzd = zzK((String)localObject);
        reply.writeNoException();
        reply.writeStrongBinder(localzzd != null ? localzzd.asBinder() : null);
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        localObject = zzd.zza.zzbs(data.readStrongBinder());
        zza((zzd)localObject);
        reply.writeNoException();
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        destroy();
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzcj
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

      public void zza(String paramString, zzd paramzzd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
          localParcel1.writeString(paramString);
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public zzd zzK(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzd localzzd;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
          localParcel1.writeString(paramString);
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localzzd = zzd.zza.zzbs(localParcel2.readStrongBinder());
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localzzd;
      }

      public void zza(zzd paramzzd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void destroy()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
          this.zzoz.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzcj
 * JD-Core Version:    0.6.0
 */