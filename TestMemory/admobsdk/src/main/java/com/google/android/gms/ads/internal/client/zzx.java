package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzx extends IInterface
{
  public abstract long getValue()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzx
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public static zzx zzn(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
      if ((localIInterface != null) && ((localIInterface instanceof zzx)))
        return (zzx)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        long l = getValue();
        reply.writeNoException();
        reply.writeLong(l);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzx
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

      public long getValue()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        long l;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          l = localParcel2.readLong();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return l;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzx
 * JD-Core Version:    0.6.0
 */