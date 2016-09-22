package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzgc extends IInterface
{
  public abstract String getProductId()
    throws RemoteException;

  public abstract void recordResolution(int paramInt)
    throws RemoteException;

  public abstract void recordPlayBillingResolution(int paramInt)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzgc
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
    }

    public static zzgc zzO(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      if ((localIInterface != null) && ((localIInterface instanceof zzgc)))
        return (zzgc)localIInterface;
      return new zza(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      int i;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
        String str = getProductId();
        reply.writeNoException();
        reply.writeString(str);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
        i = data.readInt();
        recordResolution(i);
        reply.writeNoException();
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
        i = data.readInt();
        recordPlayBillingResolution(i);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzgc
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
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
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

      public void recordResolution(int resolution)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
          localParcel1.writeInt(resolution);
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void recordPlayBillingResolution(int billingResponseCode)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
          localParcel1.writeInt(billingResponseCode);
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.zzgc
 * JD-Core Version:    0.6.0
 */