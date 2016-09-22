package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface zzcs extends IInterface
{
  public abstract void zza(zzcn paramzzcn)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzcs
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public static zzcs zzA(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
      if ((localIInterface != null) && ((localIInterface instanceof zzcs)))
        return (zzcs)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        zzcn localzzcn = zzcn.zza.zzx(data.readStrongBinder());
        zza(localzzcn);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzcs
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

      public void zza(zzcn paramzzcn)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
          localParcel1.writeStrongBinder(paramzzcn != null ? paramzzcn.asBinder() : null);
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
 * Qualified Name:     com.google.android.gms.internal.zzcs
 * JD-Core Version:    0.6.0
 */