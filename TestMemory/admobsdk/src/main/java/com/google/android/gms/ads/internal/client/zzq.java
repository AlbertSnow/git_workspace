package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzq extends IInterface
{
  public abstract void onAdClosed()
    throws RemoteException;

  public abstract void onAdFailedToLoad(int paramInt)
    throws RemoteException;

  public abstract void onAdLeftApplication()
    throws RemoteException;

  public abstract void onAdLoaded()
    throws RemoteException;

  public abstract void onAdOpened()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzq
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public static zzq zzg(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
      if ((localIInterface != null) && ((localIInterface instanceof zzq)))
        return (zzq)localIInterface;
      return new zza(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.client.IAdListener");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
        onAdClosed();
        reply.writeNoException();
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
        int i = data.readInt();
        onAdFailedToLoad(i);
        reply.writeNoException();
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
        onAdLeftApplication();
        reply.writeNoException();
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
        onAdLoaded();
        reply.writeNoException();
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdListener");
        onAdOpened();
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzq
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

      public void onAdClosed()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onAdFailedToLoad(int errorCode)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
          localParcel1.writeInt(errorCode);
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onAdLeftApplication()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onAdLoaded()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
          this.zzoz.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onAdOpened()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdListener");
          this.zzoz.transact(5, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzq
 * JD-Core Version:    0.6.0
 */