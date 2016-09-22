package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzex extends IInterface
{
  public abstract zzey zzaf(String paramString)
    throws RemoteException;

  public abstract boolean zzag(String paramString)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzex
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzex zzE(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      if ((localIInterface != null) && ((localIInterface instanceof zzex)))
        return (zzex)localIInterface;
      return new zza(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      String str;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        str = data.readString();
        zzey localzzey = zzaf(str);
        reply.writeNoException();
        reply.writeStrongBinder(localzzey != null ? localzzey.asBinder() : null);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        str = data.readString();
        boolean bool = zzag(str);
        reply.writeNoException();
        reply.writeInt(bool ? 1 : 0);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzex
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

      public zzey zzaf(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzey localzzey;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
          localParcel1.writeString(paramString);
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localzzey = zzey.zza.zzF(localParcel2.readStrongBinder());
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localzzey;
      }

      public boolean zzag(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
          localParcel1.writeString(paramString);
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.zzex
 * JD-Core Version:    0.6.0
 */