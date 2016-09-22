package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zza extends IInterface
{
  public abstract String getType()
    throws RemoteException;

  public abstract int getAmount()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zza
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public static zza zzZ(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
      if ((localIInterface != null) && ((localIInterface instanceof zza)))
        return (zza)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        String str = getType();
        reply.writeNoException();
        reply.writeString(str);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        int i = getAmount();
        reply.writeNoException();
        reply.writeInt(i);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zza
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

      public String getType()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardItem");
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

      public int getAmount()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardItem");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
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
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zza
 * JD-Core Version:    0.6.0
 */