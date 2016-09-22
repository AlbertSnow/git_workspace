package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzr extends IInterface
{
  public abstract void zzf(AdRequestParcel paramAdRequestParcel)
    throws RemoteException;

  public abstract String getMediationAdapterClassName()
    throws RemoteException;

  public abstract boolean isLoading()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzr
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public static zzr zzh(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
      if ((localIInterface != null) && ((localIInterface instanceof zzr)))
        return (zzr)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.client.IAdLoader");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
        if (0 != data.readInt())
          localObject = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject = null;
        zzf((AdRequestParcel)localObject);
        reply.writeNoException();
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
        localObject = getMediationAdapterClassName();
        reply.writeNoException();
        reply.writeString((String)localObject);
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
        boolean bool = isLoading();
        reply.writeNoException();
        reply.writeInt(bool ? 1 : 0);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzr
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

      public void zzf(AdRequestParcel paramAdRequestParcel)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoader");
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public String getMediationAdapterClassName()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoader");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          str = localParcel2.readString();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return str;
      }

      public boolean isLoading()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoader");
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = 0 != localParcel2.readInt() ? 1 : 0;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return i;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzr
 * JD-Core Version:    0.6.0
 */