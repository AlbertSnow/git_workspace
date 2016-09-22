package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.IBinder;
import android.os.Parcel;
import apj;

public final class c
  implements a
{
  private IBinder a;

  public c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(1, localParcel1, localParcel2, 0);
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

  public final void a(apj paramapj, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
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

  public final void a(apj paramapj, RewardItemParcel paramRewardItemParcel)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      IBinder localIBinder;
      if (paramapj != null)
      {
        localIBinder = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramRewardItemParcel == null)
          break label85;
        localParcel1.writeInt(1);
        paramRewardItemParcel.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.a.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
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

  public final void b(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
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

  public final void b(apj paramapj, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
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

  public final void c(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
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

  public final void d(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
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

  public final void e(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(6, localParcel1, localParcel2, 0);
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

  public final void f(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(8, localParcel1, localParcel2, 0);
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

  public final void g(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(10, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.client.c
 * JD-Core Version:    0.6.0
 */