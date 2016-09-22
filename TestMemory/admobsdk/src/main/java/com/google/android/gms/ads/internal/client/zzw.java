package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzw extends IInterface
{
  public abstract void onAppEvent(String paramString1, String paramString2)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzw
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzw zzm(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
      if ((localIInterface != null) && ((localIInterface instanceof zzw)))
        return (zzw)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        String str1 = data.readString();
        String str2 = data.readString();
        onAppEvent(str1, str2);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzw
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

      public void onAppEvent(String name, String info)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
          localParcel1.writeString(name);
          localParcel1.writeString(info);
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
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzw
 * JD-Core Version:    0.6.0
 */