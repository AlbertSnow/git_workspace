package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzi;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzj;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.ads.internal.reward.mediation.client.zza.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import java.util.ArrayList;
import java.util.List;

public abstract interface zzey extends IInterface
{
  public abstract void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
    throws RemoteException;

  public abstract zzd getView()
    throws RemoteException;

  public abstract void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
    throws RemoteException;

  public abstract void showInterstitial()
    throws RemoteException;

  public abstract void destroy()
    throws RemoteException;

  public abstract void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
    throws RemoteException;

  public abstract void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
    throws RemoteException;

  public abstract void pause()
    throws RemoteException;

  public abstract void resume()
    throws RemoteException;

  public abstract void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, zza paramzza, String paramString2)
    throws RemoteException;

  public abstract void zzb(AdRequestParcel paramAdRequestParcel, String paramString)
    throws RemoteException;

  public abstract void showVideo()
    throws RemoteException;

  public abstract boolean isInitialized()
    throws RemoteException;

  public abstract void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList)
    throws RemoteException;

  public abstract zzfb zzeF()
    throws RemoteException;

  public abstract zzfc zzeG()
    throws RemoteException;

  public abstract Bundle zzeH()
    throws RemoteException;

  public abstract Bundle getInterstitialAdapterInfo()
    throws RemoteException;

  public abstract Bundle zzeI()
    throws RemoteException;

  public abstract void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzey
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static zzey zzF(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if ((localIInterface != null) && ((localIInterface instanceof zzey)))
        return (zzey)localIInterface;
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
      Object localObject3;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      Object localObject7;
      Object localObject2;
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject1 = zzd.zza.zzbs(data.readStrongBinder());
        if (0 != data.readInt())
          localObject3 = AdSizeParcel.CREATOR.zzc(data);
        else
          localObject3 = null;
        if (0 != data.readInt())
          localObject4 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject4 = null;
        localObject5 = data.readString();
        localObject6 = zzez.zza.zzG(data.readStrongBinder());
        zza((zzd)localObject1, (AdSizeParcel)localObject3, (AdRequestParcel)localObject4, (String)localObject5, (zzez)localObject6);
        reply.writeNoException();
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject1 = getView();
        reply.writeNoException();
        reply.writeStrongBinder(localObject1 != null ? ((zzd)localObject1).asBinder() : null);
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject1 = zzd.zza.zzbs(data.readStrongBinder());
        if (0 != data.readInt())
          localObject3 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject3 = null;
        localObject4 = data.readString();
        localObject5 = zzez.zza.zzG(data.readStrongBinder());
        zza((zzd)localObject1, (AdRequestParcel)localObject3, (String)localObject4, (zzez)localObject5);
        reply.writeNoException();
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        showInterstitial();
        reply.writeNoException();
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        destroy();
        reply.writeNoException();
        return true;
      case 6:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject1 = zzd.zza.zzbs(data.readStrongBinder());
        if (0 != data.readInt())
          localObject3 = AdSizeParcel.CREATOR.zzc(data);
        else
          localObject3 = null;
        if (0 != data.readInt())
          localObject4 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject4 = null;
        localObject5 = data.readString();
        localObject6 = data.readString();
        localObject7 = zzez.zza.zzG(data.readStrongBinder());
        zza((zzd)localObject1, (AdSizeParcel)localObject3, (AdRequestParcel)localObject4, (String)localObject5, (String)localObject6, (zzez)localObject7);
        reply.writeNoException();
        return true;
      case 7:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject1 = zzd.zza.zzbs(data.readStrongBinder());
        if (0 != data.readInt())
          localObject3 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject3 = null;
        localObject4 = data.readString();
        localObject5 = data.readString();
        localObject6 = zzez.zza.zzG(data.readStrongBinder());
        zza((zzd)localObject1, (AdRequestParcel)localObject3, (String)localObject4, (String)localObject5, (zzez)localObject6);
        reply.writeNoException();
        return true;
      case 8:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        pause();
        reply.writeNoException();
        return true;
      case 9:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        resume();
        reply.writeNoException();
        return true;
      case 10:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject1 = zzd.zza.zzbs(data.readStrongBinder());
        if (0 != data.readInt())
          localObject3 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject3 = null;
        localObject4 = data.readString();
        localObject5 = zza.zza.zzae(data.readStrongBinder());
        localObject6 = data.readString();
        zza((zzd)localObject1, (AdRequestParcel)localObject3, (String)localObject4, (zza)localObject5, (String)localObject6);
        reply.writeNoException();
        return true;
      case 11:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (0 != data.readInt())
          localObject1 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject1 = null;
        localObject3 = data.readString();
        zzb((AdRequestParcel)localObject1, (String)localObject3);
        reply.writeNoException();
        return true;
      case 12:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        showVideo();
        reply.writeNoException();
        return true;
      case 13:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        boolean bool = isInitialized();
        reply.writeNoException();
        reply.writeInt(bool ? 1 : 0);
        return true;
      case 14:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject2 = zzd.zza.zzbs(data.readStrongBinder());
        if (0 != data.readInt())
          localObject3 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject3 = null;
        localObject4 = data.readString();
        localObject5 = data.readString();
        localObject6 = zzez.zza.zzG(data.readStrongBinder());
        if (0 != data.readInt())
          localObject7 = NativeAdOptionsParcel.CREATOR.zze(data);
        else
          localObject7 = null;
        ArrayList localArrayList = data.createStringArrayList();
        zza((zzd)localObject2, (AdRequestParcel)localObject3, (String)localObject4, (String)localObject5, (zzez)localObject6, (NativeAdOptionsParcel)localObject7, localArrayList);
        reply.writeNoException();
        return true;
      case 15:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject2 = zzeF();
        reply.writeNoException();
        reply.writeStrongBinder(localObject2 != null ? ((zzfb)localObject2).asBinder() : null);
        return true;
      case 16:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject2 = zzeG();
        reply.writeNoException();
        reply.writeStrongBinder(localObject2 != null ? ((zzfc)localObject2).asBinder() : null);
        return true;
      case 17:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject2 = zzeH();
        reply.writeNoException();
        if (localObject2 != null)
        {
          reply.writeInt(1);
          ((Bundle)localObject2).writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      case 18:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject2 = getInterstitialAdapterInfo();
        reply.writeNoException();
        if (localObject2 != null)
        {
          reply.writeInt(1);
          ((Bundle)localObject2).writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      case 19:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject2 = zzeI();
        reply.writeNoException();
        if (localObject2 != null)
        {
          reply.writeInt(1);
          ((Bundle)localObject2).writeToParcel(reply, 1);
        }
        else
        {
          reply.writeInt(0);
        }
        return true;
      case 20:
        data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (0 != data.readInt())
          localObject2 = AdRequestParcel.CREATOR.zzb(data);
        else
          localObject2 = null;
        localObject3 = data.readString();
        localObject4 = data.readString();
        zza((AdRequestParcel)localObject2, (String)localObject3, (String)localObject4);
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzey
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

      public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          if (paramAdSizeParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdSizeParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString);
          localParcel1.writeStrongBinder(paramzzez != null ? paramzzez.asBinder() : null);
          this.zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public zzd getView()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzd localzzd;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
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

      public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString);
          localParcel1.writeStrongBinder(paramzzez != null ? paramzzez.asBinder() : null);
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
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
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void destroy()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          if (paramAdSizeParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdSizeParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeStrongBinder(paramzzez != null ? paramzzez.asBinder() : null);
          this.zzoz.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeStrongBinder(paramzzez != null ? paramzzez.asBinder() : null);
          this.zzoz.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void pause()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(8, localParcel1, localParcel2, 0);
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
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, zza paramzza, String paramString2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString1);
          localParcel1.writeStrongBinder(paramzza != null ? paramzza.asBinder() : null);
          localParcel1.writeString(paramString2);
          this.zzoz.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void zzb(AdRequestParcel paramAdRequestParcel, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString);
          this.zzoz.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void showVideo()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public boolean isInitialized()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        int i;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

      public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          localParcel1.writeStrongBinder(paramzzd != null ? paramzzd.asBinder() : null);
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeStrongBinder(paramzzez != null ? paramzzez.asBinder() : null);
          if (paramNativeAdOptionsParcel != null)
          {
            localParcel1.writeInt(1);
            paramNativeAdOptionsParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeStringList(paramList);
          this.zzoz.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public zzfb zzeF()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzfb localzzfb;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localzzfb = zzfb.zza.zzI(localParcel2.readStrongBinder());
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localzzfb;
      }

      public zzfc zzeG()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzfc localzzfc;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localzzfc = zzfc.zza.zzJ(localParcel2.readStrongBinder());
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localzzfc;
      }

      public Bundle zzeH()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        Bundle localBundle;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(17, localParcel1, localParcel2, 0);
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

      public Bundle getInterstitialAdapterInfo()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        Bundle localBundle;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(18, localParcel1, localParcel2, 0);
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

      public Bundle zzeI()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        Bundle localBundle;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          this.zzoz.transact(19, localParcel1, localParcel2, 0);
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

      public void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.zzoz.transact(20, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.zzey
 * JD-Core Version:    0.6.0
 */