package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.Parcel;
import apj;
import apk;

final class e
  implements c
{
  private IBinder a;

  e(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final apj a(apj paramapj1, apj paramapj2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if (paramapj1 != null);
      for (IBinder localIBinder1 = paramapj1.asBinder(); ; localIBinder1 = null)
      {
        localParcel1.writeStrongBinder(localIBinder1);
        IBinder localIBinder2 = null;
        if (paramapj2 != null)
          localIBinder2 = paramapj2.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        this.a.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        apj localapj = apk.a(localParcel2.readStrongBinder());
        return localapj;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final String a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      this.a.transact(1, localParcel1, localParcel2, 0);
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

  public final String a(apj paramapj, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.a.transact(8, localParcel1, localParcel2, 0);
        localParcel2.readException();
        String str = localParcel2.readString();
        return str;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localParcel1.writeString(paramString);
      this.a.transact(5, localParcel1, localParcel2, 0);
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

  public final void a(String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.a.transact(2, localParcel1, localParcel2, 0);
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

  public final boolean a(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        int j = 0;
        if (i != 0)
          j = 1;
        return j;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final boolean a(String paramString, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      localParcel1.writeString(paramString);
      int j;
      if (paramBoolean)
      {
        j = i;
        localParcel1.writeInt(j);
        this.a.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int k = localParcel2.readInt();
        if (k == 0)
          break label91;
      }
      while (true)
      {
        return i;
        j = 0;
        break;
        label91: i = 0;
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

  public final apj b(apj paramapj1, apj paramapj2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if (paramapj1 != null);
      for (IBinder localIBinder1 = paramapj1.asBinder(); ; localIBinder1 = null)
      {
        localParcel1.writeStrongBinder(localIBinder1);
        IBinder localIBinder2 = null;
        if (paramapj2 != null)
          localIBinder2 = paramapj2.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        this.a.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        apj localapj = apk.a(localParcel2.readStrongBinder());
        return localapj;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final boolean b(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        int j = 0;
        if (i != 0)
          j = 1;
        return j;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final String c(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        String str = localParcel2.readString();
        return str;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void d(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(9, localParcel1, localParcel2, 0);
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
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.adshield.internal.e
 * JD-Core Version:    0.6.0
 */