package com.google.android.gms.ads.internal.formats.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import apj;
import apk;
import java.util.ArrayList;
import java.util.List;

final class q
  implements o
{
  private IBinder a;

  q(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final String a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
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

  public final List b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      ArrayList localArrayList = localParcel2.readArrayList(getClass().getClassLoader());
      return localArrayList;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final String c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final a d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      a locala = b.a(localParcel2.readStrongBinder());
      return locala;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final String e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final String f()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final apj g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      apj localapj = apk.a(localParcel2.readStrongBinder());
      return localapj;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final Bundle h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
        return localBundle;
      }
      Bundle localBundle = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      this.a.transact(10, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.q
 * JD-Core Version:    0.6.0
 */