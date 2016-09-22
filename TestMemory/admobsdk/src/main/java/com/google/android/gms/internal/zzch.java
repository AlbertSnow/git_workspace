package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract interface zzch extends IInterface
{
  public abstract zzd zzdJ()
    throws RemoteException;

  public abstract Uri getUri()
    throws RemoteException;

  public abstract double getScale()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzch
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzch zzt(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if ((localIInterface != null) && ((localIInterface instanceof zzch)))
        return (zzch)localIInterface;
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
        reply.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        localObject = zzdJ();
        reply.writeNoException();
        reply.writeStrongBinder(localObject != null ? ((zzd)localObject).asBinder() : null);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        localObject = getUri();
        reply.writeNoException();
        if (localObject != null)
        {
          reply.writeInt(1);
          ((Uri)localObject).writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        double d = getScale();
        reply.writeNoException();
        reply.writeDouble(d);
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzch
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

      public zzd zzdJ()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzd localzzd;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localzzd = zzd.zza.zzbs(localParcel2.readStrongBinder());
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localzzd;
      }

      public Uri getUri()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        Uri localUri;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (0 != localParcel2.readInt())
            localUri = (Uri)Uri.CREATOR.createFromParcel(localParcel2);
          else
            localUri = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localUri;
      }

      public double getScale()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        double d;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d = localParcel2.readDouble();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return d;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzch
 * JD-Core Version:    0.6.0
 */