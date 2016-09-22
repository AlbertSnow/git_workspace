package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzgd extends IInterface
{
  public abstract void zza(zzgc paramzzgc)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzgd
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
    }

    public static zzgd zzP(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
      if ((localIInterface != null) && ((localIInterface instanceof zzgd)))
        return (zzgd)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        zzgc localzzgc = zzgc.zza.zzO(data.readStrongBinder());
        zza(localzzgc);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzgd
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

      public void zza(zzgc paramzzgc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
          localParcel1.writeStrongBinder(paramzzgc != null ? paramzzgc.asBinder() : null);
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.zzgd
 * JD-Core Version:    0.6.0
 */