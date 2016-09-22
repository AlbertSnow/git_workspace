package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzez extends IInterface
{
  public abstract void onAdClicked()
    throws RemoteException;

  public abstract void onAdClosed()
    throws RemoteException;

  public abstract void onAdFailedToLoad(int paramInt)
    throws RemoteException;

  public abstract void onAdLeftApplication()
    throws RemoteException;

  public abstract void onAdOpened()
    throws RemoteException;

  public abstract void onAdLoaded()
    throws RemoteException;

  public abstract void zza(zzfa paramzzfa)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzez
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzez zzG(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      if ((localIInterface != null) && ((localIInterface instanceof zzez)))
        return (zzez)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        onAdClicked();
        reply.writeNoException();
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        onAdClosed();
        reply.writeNoException();
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        int i = data.readInt();
        onAdFailedToLoad(i);
        reply.writeNoException();
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        onAdLeftApplication();
        reply.writeNoException();
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        onAdOpened();
        reply.writeNoException();
        return true;
      case 6:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        onAdLoaded();
        reply.writeNoException();
        return true;
      case 7:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        zzfa localzzfa = zzfa.zza.zzH(data.readStrongBinder());
        zza(localzzfa);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzez
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

      public void onAdClicked()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onAdClosed()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void onAdFailedToLoad(int error)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          localParcel1.writeInt(error);
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
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
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
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
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          this.zzoz.transact(5, localParcel1, localParcel2, 0);
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
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          this.zzoz.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzfa paramzzfa)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          localParcel1.writeStrongBinder(paramzzfa != null ? paramzzfa.asBinder() : null);
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
 * Qualified Name:     com.google.android.gms.internal.zzez
 * JD-Core Version:    0.6.0
 */