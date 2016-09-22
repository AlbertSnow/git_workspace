package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.client.ae;

final class ad
  implements ab
{
  private IBinder a;

  ad(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final y a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      IBinder localIBinder = localParcel2.readStrongBinder();
      Object localObject2;
      if (localIBinder == null)
        localObject2 = null;
      while (true)
      {
        return localObject2;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
        if ((localIInterface != null) && ((localIInterface instanceof y)))
        {
          localObject2 = (y)localIInterface;
          continue;
        }
        localObject2 = new aa(localIBinder);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject1;
  }

  public final void a(at paramat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if (paramat != null);
      for (IBinder localIBinder = paramat.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(v paramv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if (paramv != null);
      for (IBinder localIBinder = paramv.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if (paramNativeAdOptionsParcel != null)
      {
        localParcel1.writeInt(1);
        paramNativeAdOptionsParcel.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.a.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(com.google.android.gms.ads.internal.formats.client.v paramv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if (paramv != null);
      for (IBinder localIBinder = paramv.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(com.google.android.gms.ads.internal.formats.client.y paramy)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if (paramy != null);
      for (IBinder localIBinder = paramy.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(String paramString, ae paramae, com.google.android.gms.ads.internal.formats.client.ab paramab)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localParcel1.writeString(paramString);
      if (paramae != null);
      for (IBinder localIBinder1 = paramae.asBinder(); ; localIBinder1 = null)
      {
        localParcel1.writeStrongBinder(localIBinder1);
        IBinder localIBinder2 = null;
        if (paramab != null)
          localIBinder2 = paramab.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        this.a.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.ad
 * JD-Core Version:    0.6.0
 */