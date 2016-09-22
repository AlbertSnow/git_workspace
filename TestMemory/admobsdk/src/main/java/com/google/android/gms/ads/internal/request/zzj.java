package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzj extends IInterface
{
  public abstract AdResponseParcel zzd(AdRequestInfoParcel paramAdRequestInfoParcel)
    throws RemoteException;

  public abstract void zza(AdRequestInfoParcel paramAdRequestInfoParcel, zzk paramzzk)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzj
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public static zzj zzX(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      if ((localIInterface != null) && ((localIInterface instanceof zzj)))
        return (zzj)localIInterface;
      return new zza(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      AdRequestInfoParcel localAdRequestInfoParcel;
      Object localObject;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (0 != data.readInt())
          localAdRequestInfoParcel = AdRequestInfoParcel.CREATOR.zzi(data);
        else
          localAdRequestInfoParcel = null;
        localObject = zzd(localAdRequestInfoParcel);
        reply.writeNoException();
        if (localObject != null)
        {
          reply.writeInt(1);
          ((AdResponseParcel)localObject).writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (0 != data.readInt())
          localAdRequestInfoParcel = AdRequestInfoParcel.CREATOR.zzi(data);
        else
          localAdRequestInfoParcel = null;
        localObject = zzk.zza.zzY(data.readStrongBinder());
        zza(localAdRequestInfoParcel, (zzk)localObject);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzj
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

      public AdResponseParcel zzd(AdRequestInfoParcel paramAdRequestInfoParcel)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        AdResponseParcel localAdResponseParcel;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
          if (paramAdRequestInfoParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestInfoParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (0 != localParcel2.readInt())
            localAdResponseParcel = AdResponseParcel.CREATOR.zzj(localParcel2);
          else
            localAdResponseParcel = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localAdResponseParcel;
      }

      public void zza(AdRequestInfoParcel paramAdRequestInfoParcel, zzk paramzzk)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
          if (paramAdRequestInfoParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestInfoParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeStrongBinder(paramzzk != null ? paramzzk.asBinder() : null);
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzj
 * JD-Core Version:    0.6.0
 */