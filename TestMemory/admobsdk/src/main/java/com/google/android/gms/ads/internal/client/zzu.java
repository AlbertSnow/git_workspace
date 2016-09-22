package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzcf.zza;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgd.zza;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzgh.zza;

public abstract interface zzu extends IInterface
{
  public abstract com.google.android.gms.dynamic.zzd zzaM()
    throws RemoteException;

  public abstract void destroy()
    throws RemoteException;

  public abstract boolean isReady()
    throws RemoteException;

  public abstract boolean zzb(AdRequestParcel paramAdRequestParcel)
    throws RemoteException;

  public abstract void pause()
    throws RemoteException;

  public abstract void resume()
    throws RemoteException;

  public abstract void zza(zzq paramzzq)
    throws RemoteException;

  public abstract void zza(zzw paramzzw)
    throws RemoteException;

  public abstract void showInterstitial()
    throws RemoteException;

  public abstract void stopLoading()
    throws RemoteException;

  public abstract void zzaP()
    throws RemoteException;

  public abstract AdSizeParcel zzaN()
    throws RemoteException;

  public abstract void zza(AdSizeParcel paramAdSizeParcel)
    throws RemoteException;

  public abstract void zza(zzgd paramzzgd)
    throws RemoteException;

  public abstract void zza(zzgh paramzzgh, String paramString)
    throws RemoteException;

  public abstract String getMediationAdapterClassName()
    throws RemoteException;

  public abstract void zza(zzcf paramzzcf)
    throws RemoteException;

  public abstract void zza(zzp paramzzp)
    throws RemoteException;

  public abstract void zza(zzx paramzzx)
    throws RemoteException;

  public abstract void setManualImpressionsEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract boolean isLoading()
    throws RemoteException;

  public abstract void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
    throws RemoteException;

  public abstract void setUserId(String paramString)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzu
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzu zzk(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((localIInterface != null) && ((localIInterface instanceof zzu)))
        return (zzu)localIInterface;
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
      boolean bool2;
      Object localObject2;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.client.IAdManager");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        com.google.android.gms.dynamic.zzd localzzd = zzaM();
        reply.writeNoException();
        reply.writeStrongBinder(localzzd != null ? localzzd.asBinder() : null);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        destroy();
        reply.writeNoException();
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        boolean bool1 = isReady();
        reply.writeNoException();
        reply.writeInt(bool1 ? 1 : 0);
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (0 != data.readInt())
          localObject1 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject1 = null;
        boolean bool3 = zzb((AdRequestParcel)localObject1);
        reply.writeNoException();
        reply.writeInt(bool3 ? 1 : 0);
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        pause();
        reply.writeNoException();
        return true;
      case 6:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        resume();
        reply.writeNoException();
        return true;
      case 7:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzq.zza.zzg(data.readStrongBinder());
        zza((zzq)localObject1);
        reply.writeNoException();
        return true;
      case 8:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzw.zza.zzm(data.readStrongBinder());
        zza((zzw)localObject1);
        reply.writeNoException();
        return true;
      case 9:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        showInterstitial();
        reply.writeNoException();
        return true;
      case 10:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        stopLoading();
        reply.writeNoException();
        return true;
      case 11:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        zzaP();
        reply.writeNoException();
        return true;
      case 12:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzaN();
        reply.writeNoException();
        if (localObject1 != null)
        {
          reply.writeInt(1);
          ((AdSizeParcel)localObject1).writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      case 13:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (0 != data.readInt())
          localObject1 = AdSizeParcel.CREATOR.zzc(data);
        else
          localObject1 = null;
        zza((AdSizeParcel)localObject1);
        reply.writeNoException();
        return true;
      case 14:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzgd.zza.zzP(data.readStrongBinder());
        zza((zzgd)localObject1);
        reply.writeNoException();
        return true;
      case 15:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzgh.zza.zzT(data.readStrongBinder());
        String str = data.readString();
        zza((zzgh)localObject1, str);
        reply.writeNoException();
        return true;
      case 18:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = getMediationAdapterClassName();
        reply.writeNoException();
        reply.writeString((String)localObject1);
        return true;
      case 19:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzcf.zza.zzs(data.readStrongBinder());
        zza((zzcf)localObject1);
        reply.writeNoException();
        return true;
      case 20:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzp.zza.zzf(data.readStrongBinder());
        zza((zzp)localObject1);
        reply.writeNoException();
        return true;
      case 21:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = zzx.zza.zzn(data.readStrongBinder());
        zza((zzx)localObject1);
        reply.writeNoException();
        return true;
      case 22:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        bool2 = 0 != data.readInt();
        setManualImpressionsEnabled(bool2);
        reply.writeNoException();
        return true;
      case 23:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        bool2 = isLoading();
        reply.writeNoException();
        reply.writeInt(bool2 ? 1 : 0);
        return true;
      case 24:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject2 = com.google.android.gms.ads.internal.reward.client.zzd.zza.zzac(data.readStrongBinder());
        zza((com.google.android.gms.ads.internal.reward.client.zzd)localObject2);
        reply.writeNoException();
        return true;
      case 25:
        data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject2 = data.readString();
        setUserId((String)localObject2);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzu
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

      public com.google.android.gms.dynamic.zzd zzaM()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        com.google.android.gms.dynamic.zzd localzzd;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localzzd = com.google.android.gms.dynamic.zzd.zza.zzbs(localParcel2.readStrongBinder());
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localzzd;
      }

      public void destroy()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public boolean isReady()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
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

      public boolean zzb(AdRequestParcel paramAdRequestParcel)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.zzoz.transact(4, localParcel1, localParcel2, 0);
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

      public void pause()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void resume()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzq paramzzq)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeStrongBinder(paramzzq != null ? paramzzq.asBinder() : null);
          this.zzoz.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzw paramzzw)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeStrongBinder(paramzzw != null ? paramzzw.asBinder() : null);
          this.zzoz.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void showInterstitial()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void stopLoading()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zzaP()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public AdSizeParcel zzaN()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        AdSizeParcel localAdSizeParcel;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (0 != localParcel2.readInt())
            localAdSizeParcel = AdSizeParcel.CREATOR.zzc(localParcel2);
          else
            localAdSizeParcel = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localAdSizeParcel;
      }

      public void zza(AdSizeParcel paramAdSizeParcel)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          if (paramAdSizeParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdSizeParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          this.zzoz.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzgd paramzzgd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeStrongBinder(paramzzgd != null ? paramzzgd.asBinder() : null);
          this.zzoz.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzgh paramzzgh, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeStrongBinder(paramzzgh != null ? paramzzgh.asBinder() : null);
          localParcel1.writeString(paramString);
          this.zzoz.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public String getMediationAdapterClassName()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(18, localParcel1, localParcel2, 0);
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

      public void zza(zzcf paramzzcf)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeStrongBinder(paramzzcf != null ? paramzzcf.asBinder() : null);
          this.zzoz.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzp paramzzp)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeStrongBinder(paramzzp != null ? paramzzp.asBinder() : null);
          this.zzoz.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzx paramzzx)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeStrongBinder(paramzzx != null ? paramzzx.asBinder() : null);
          this.zzoz.transact(21, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void setManualImpressionsEnabled(boolean manualImpressionsEnabled)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeInt(manualImpressionsEnabled ? 1 : 0);
          this.zzoz.transact(22, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public boolean isLoading()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          this.zzoz.transact(23, localParcel1, localParcel2, 0);
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

      public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          this.zzoz.transact(24, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void setUserId(String userId)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
          localParcel1.writeString(userId);
          this.zzoz.transact(25, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzu
 * JD-Core Version:    0.6.0
 */