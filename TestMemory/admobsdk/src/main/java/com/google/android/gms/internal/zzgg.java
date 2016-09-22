package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface zzgg extends IInterface
{
  public abstract String getProductId()
    throws RemoteException;

  public abstract Intent getPurchaseData()
    throws RemoteException;

  public abstract int getResultCode()
    throws RemoteException;

  public abstract boolean isVerified()
    throws RemoteException;

  public abstract void finishPurchase()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzgg
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
    }

    public static zzgg zzS(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
      if ((localIInterface != null) && ((localIInterface instanceof zzgg)))
        return (zzgg)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        localObject = getProductId();
        reply.writeNoException();
        reply.writeString((String)localObject);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        localObject = getPurchaseData();
        reply.writeNoException();
        if (localObject != null)
        {
          reply.writeInt(1);
          ((Intent)localObject).writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        int i = getResultCode();
        reply.writeNoException();
        reply.writeInt(i);
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        boolean bool = isVerified();
        reply.writeNoException();
        reply.writeInt(bool ? 1 : 0);
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        finishPurchase();
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzgg
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

      public String getProductId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
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

      public Intent getPurchaseData()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        Intent localIntent;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (0 != localParcel2.readInt())
            localIntent = (Intent)Intent.CREATOR.createFromParcel(localParcel2);
          else
            localIntent = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localIntent;
      }

      public int getResultCode()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return i;
      }

      public boolean isVerified()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
          this.zzoz.transact(4, localParcel1, localParcel2, 0);
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

      public void finishPurchase()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
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
 * Qualified Name:     com.google.android.gms.internal.zzgg
 * JD-Core Version:    0.6.0
 */