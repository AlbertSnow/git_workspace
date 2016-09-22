package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public abstract interface zzcp extends IInterface
{
  public abstract String zzO(String paramString)
    throws RemoteException;

  public abstract zzch zzP(String paramString)
    throws RemoteException;

  public abstract List<String> getAvailableAssetNames()
    throws RemoteException;

  public abstract String getCustomTemplateId()
    throws RemoteException;

  public abstract void performClick(String paramString)
    throws RemoteException;

  public abstract void recordImpression()
    throws RemoteException;

  public static abstract class zza extends Binder
    implements zzcp
  {
    public zza()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzcp zzy(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      if ((localIInterface != null) && ((localIInterface instanceof zzcp)))
        return (zzcp)localIInterface;
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
      switch (code)
      {
      case 1598968902:
        reply.writeString("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return true;
      case 1:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = data.readString();
        localObject2 = zzO((String)localObject1);
        reply.writeNoException();
        reply.writeString((String)localObject2);
        return true;
      case 2:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = data.readString();
        localObject2 = zzP((String)localObject1);
        reply.writeNoException();
        reply.writeStrongBinder(localObject2 != null ? ((zzch)localObject2).asBinder() : null);
        return true;
      case 3:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = getAvailableAssetNames();
        reply.writeNoException();
        reply.writeStringList((List)localObject1);
        return true;
      case 4:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = getCustomTemplateId();
        reply.writeNoException();
        reply.writeString((String)localObject1);
        return true;
      case 5:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = data.readString();
        performClick((String)localObject1);
        reply.writeNoException();
        return true;
      case 6:
        data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        recordImpression();
        reply.writeNoException();
        return true;
      }
      return super.onTransact(code, data, reply, flags);
    }

    private static class zza
      implements zzcp
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

      public String zzO(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
          localParcel1.writeString(paramString);
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

      public zzch zzP(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        zzch localzzch;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
          localParcel1.writeString(paramString);
          this.zzoz.transact(2, localParcel1, localParcel2, 0);
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

      public List<String> getAvailableAssetNames()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        ArrayList localArrayList;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
          this.zzoz.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localArrayList = localParcel2.createStringArrayList();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        return localArrayList;
      }

      public String getCustomTemplateId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        String str;
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
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

      public void performClick(String assetName)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
          localParcel1.writeString(assetName);
          this.zzoz.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public void recordImpression()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
          this.zzoz.transact(6, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.zzcp
 * JD-Core Version:    0.6.0
 */