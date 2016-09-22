package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzk extends IInterface
{
  public abstract void zzb(AdResponseParcel paramAdResponseParcel)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzk
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public static zzk zzY(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
      if ((localIInterface != null) && ((localIInterface instanceof zzk)))
        return (zzk)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.request.IAdResponseListener");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
        AdResponseParcel localAdResponseParcel;
        if (0 != data.readInt())
          localAdResponseParcel = AdResponseParcel.CREATOR.zzj(data);
        else
          localAdResponseParcel = null;
        zzb(localAdResponseParcel);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzk
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

      public void zzb(AdResponseParcel paramAdResponseParcel)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdResponseListener");
          if (paramAdResponseParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdResponseParcel.writeToParcel(localParcel1, 0);
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
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzk
 * JD-Core Version:    0.6.0
 */