package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import java.util.ArrayList;
import java.util.List;

public abstract interface zzfb extends IInterface
{
  public abstract String getHeadline()
    throws RemoteException;

  public abstract List getImages()
    throws RemoteException;

  public abstract String getBody()
    throws RemoteException;

  public abstract zzch zzdK()
    throws RemoteException;

  public abstract String getCallToAction()
    throws RemoteException;

  public abstract double getStarRating()
    throws RemoteException;

  public abstract String getStore()
    throws RemoteException;

  public abstract String getPrice()
    throws RemoteException;

  public abstract void recordImpression()
    throws RemoteException;

  public abstract void zzc(zzd paramzzd)
    throws RemoteException;

  public abstract void zzd(zzd paramzzd)
    throws RemoteException;

  public abstract boolean getOverrideImpressionRecording()
    throws RemoteException;

  public abstract boolean getOverrideClickHandling()
    throws RemoteException;

  public abstract Bundle getExtras()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzfb
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public static zzfb zzI(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      if ((localIInterface != null) && ((localIInterface instanceof zzfb)))
        return (zzfb)localIInterface;
      return new zza(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int code, Parcel data, Parcel reply, int flags)
      throws RemoteException
    {
      Object localObject1;
      Object localObject2;
      boolean bool;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject1 = getHeadline();
        reply.writeNoException();
        reply.writeString((String)localObject1);
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject1 = getImages();
        reply.writeNoException();
        reply.writeList((List)localObject1);
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject1 = getBody();
        reply.writeNoException();
        reply.writeString((String)localObject1);
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject1 = zzdK();
        reply.writeNoException();
        reply.writeStrongBinder(localObject1 != null ? ((zzch)localObject1).asBinder() : null);
        return true;
      case 6:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject1 = getCallToAction();
        reply.writeNoException();
        reply.writeString((String)localObject1);
        return true;
      case 7:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        double d = getStarRating();
        reply.writeNoException();
        reply.writeDouble(d);
        return true;
      case 8:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject2 = getStore();
        reply.writeNoException();
        reply.writeString((String)localObject2);
        return true;
      case 9:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject2 = getPrice();
        reply.writeNoException();
        reply.writeString((String)localObject2);
        return true;
      case 10:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        recordImpression();
        reply.writeNoException();
        return true;
      case 11:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject2 = zzd.zza.zzbs(data.readStrongBinder());
        zzc((zzd)localObject2);
        reply.writeNoException();
        return true;
      case 12:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        localObject2 = zzd.zza.zzbs(data.readStrongBinder());
        zzd((zzd)localObject2);
        reply.writeNoException();
        return true;
      case 13:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        bool = getOverrideImpressionRecording();
        reply.writeNoException();
        reply.writeInt(bool ? 1 : 0);
        return true;
      case 14:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        bool = getOverrideClickHandling();
        reply.writeNoException();
        reply.writeInt(bool ? 1 : 0);
        return true;
      case 15:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        Bundle localBundle = getExtras();
        reply.writeNoException();
        if (localBundle != null)
        {
          reply.writeInt(1);
          localBundle.writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzfb
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

      public String getHeadline()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
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

      public List getImages()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        ArrayList localArrayList;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          ClassLoader localClassLoader = getClass().getClassLoader();
          localArrayList = localParcel2.readArrayList(localClassLoader);
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localArrayList;
      }

      public String getBody()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(4, localParcel1, localParcel2, 0);
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

      public zzch zzdK()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzch localzzch;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localzzch = zzch.zza.zzt(localParcel2.readStrongBinder());
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localzzch;
      }

      public String getCallToAction()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(6, localParcel1, localParcel2, 0);
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

      public double getStarRating()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        double d;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(7, localParcel1, localParcel2, 0);
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

      public String getStore()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(8, localParcel1, localParcel2, 0);
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

      public String getPrice()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(9, localParcel1, localParcel2, 0);
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

      public void recordImpression()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zzc(zzd paramzzd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          this.zzoz.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zzd(zzd paramzzd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          this.zzoz.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public boolean getOverrideImpressionRecording()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(13, localParcel1, localParcel2, 0);
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

      public boolean getOverrideClickHandling()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(14, localParcel1, localParcel2, 0);
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

      public Bundle getExtras()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        Bundle localBundle;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
          this.zzoz.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (0 != localParcel2.readInt())
            localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          else
            localBundle = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localBundle;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfb
 * JD-Core Version:    0.6.0
 */