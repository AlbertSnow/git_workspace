package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzj;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcr.zza;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzcs.zza;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzct.zza;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcu.zza;

public abstract interface zzs extends IInterface
{
  public abstract zzr zzbn()
    throws RemoteException;

  public abstract void zzb(zzq paramzzq)
    throws RemoteException;

  public abstract void zza(zzcr paramzzcr)
    throws RemoteException;

  public abstract void zza(zzcs paramzzcs)
    throws RemoteException;

  public abstract void zza(String paramString, zzcu paramzzcu, zzct paramzzct)
    throws RemoteException;

  public abstract void zza(NativeAdOptionsParcel paramNativeAdOptionsParcel)
    throws RemoteException;

  public abstract void zzb(zzx paramzzx)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzs
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public static zzs zzi(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if ((localIInterface != null) && ((localIInterface instanceof zzs)))
        return (zzs)localIInterface;
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
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        localObject = zzbn();
        reply.writeNoException();
        reply.writeStrongBinder(localObject != null ? ((zzr)localObject).asBinder() : null);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        localObject = zzq.zza.zzg(data.readStrongBinder());
        zzb((zzq)localObject);
        reply.writeNoException();
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        localObject = zzcr.zza.zzz(data.readStrongBinder());
        zza((zzcr)localObject);
        reply.writeNoException();
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        localObject = zzcs.zza.zzA(data.readStrongBinder());
        zza((zzcs)localObject);
        reply.writeNoException();
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        localObject = data.readString();
        zzcu localzzcu = zzcu.zza.zzC(data.readStrongBinder());
        zzct localzzct = zzct.zza.zzB(data.readStrongBinder());
        zza((String)localObject, localzzcu, localzzct);
        reply.writeNoException();
        return true;
      case 6:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        if (0 != data.readInt())
          localObject = NativeAdOptionsParcel.CREATOR.zze(data);
        else
          localObject = null;
        zza((NativeAdOptionsParcel)localObject);
        reply.writeNoException();
        return true;
      case 7:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        localObject = zzx.zza.zzn(data.readStrongBinder());
        zzb((zzx)localObject);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzs
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

      public zzr zzbn()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzr localzzr;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localzzr = zzr.zza.zzh(localParcel2.readStrongBinder());
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localzzr;
      }

      public void zzb(zzq paramzzq)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
          localParcel1.writeStrongBinder(paramzzq != null ? paramzzq.asBinder() : null);
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzcr paramzzcr)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
          localParcel1.writeStrongBinder(paramzzcr != null ? paramzzcr.asBinder() : null);
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzcs paramzzcs)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
          localParcel1.writeStrongBinder(paramzzcs != null ? paramzzcs.asBinder() : null);
          this.zzoz.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(String paramString, zzcu paramzzcu, zzct paramzzct)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
          localParcel1.writeString(paramString);
          localParcel1.writeStrongBinder(paramzzcu != null ? paramzzcu.asBinder() : null);
          localParcel1.writeStrongBinder(paramzzct != null ? paramzzct.asBinder() : null);
          this.zzoz.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(NativeAdOptionsParcel paramNativeAdOptionsParcel)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
          if (paramNativeAdOptionsParcel != null)
          {
            localParcel1.writeInt(1);
            paramNativeAdOptionsParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.zzoz.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zzb(zzx paramzzx)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
          localParcel1.writeStrongBinder(paramzzx != null ? paramzzx.asBinder() : null);
          this.zzoz.transact(7, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzs
 * JD-Core Version:    0.6.0
 */