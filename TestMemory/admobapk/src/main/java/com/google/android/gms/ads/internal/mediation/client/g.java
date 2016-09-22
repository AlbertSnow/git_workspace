package com.google.android.gms.ads.internal.mediation.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import apj;
import apk;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.a;
import java.util.List;

final class g
  implements e
{
  private IBinder a;

  g(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final apj a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

  public final void a(apj paramapj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if (paramapj != null);
      for (IBinder localIBinder = paramapj.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.a.transact(21, localParcel1, localParcel2, 0);
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

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString, h paramh)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      IBinder localIBinder1;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdRequestParcel == null)
          break label121;
        localParcel1.writeInt(1);
        paramAdRequestParcel.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        IBinder localIBinder2 = null;
        if (paramh != null)
          localIBinder2 = paramh.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        this.a.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder1 = null;
        break;
        label121: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, a parama, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      IBinder localIBinder1;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdRequestParcel == null)
          break label129;
        localParcel1.writeInt(1);
        paramAdRequestParcel.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString1);
        IBinder localIBinder2 = null;
        if (parama != null)
          localIBinder2 = parama.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        localParcel1.writeString(paramString2);
        this.a.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder1 = null;
        break;
        label129: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      IBinder localIBinder1;
      if (paramapj != null)
      {
        localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdRequestParcel == null)
          break label129;
        localParcel1.writeInt(1);
        paramAdRequestParcel.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        IBinder localIBinder2 = null;
        if (paramh != null)
          localIBinder2 = paramh.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        this.a.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder1 = null;
        break;
        label129: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (paramapj == null)
          continue;
        IBinder localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdRequestParcel == null)
          continue;
        localParcel1.writeInt(1);
        paramAdRequestParcel.writeToParcel(localParcel1, 0);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        IBinder localIBinder2 = null;
        if (paramh == null)
          continue;
        localIBinder2 = paramh.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        if (paramNativeAdOptionsParcel != null)
        {
          localParcel1.writeInt(1);
          paramNativeAdOptionsParcel.writeToParcel(localParcel1, 0);
          localParcel1.writeStringList(paramList);
          this.a.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          localIBinder1 = null;
          continue;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      localParcel1.writeInt(0);
    }
  }

  public final void a(apj paramapj, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, h paramh)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (paramapj == null)
          continue;
        IBinder localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdSizeParcel == null)
          continue;
        localParcel1.writeInt(1);
        paramAdSizeParcel.writeToParcel(localParcel1, 0);
        if (paramAdRequestParcel != null)
        {
          localParcel1.writeInt(1);
          paramAdRequestParcel.writeToParcel(localParcel1, 0);
          localParcel1.writeString(paramString);
          IBinder localIBinder2 = null;
          if (paramh == null)
            continue;
          localIBinder2 = paramh.asBinder();
          localParcel1.writeStrongBinder(localIBinder2);
          this.a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          localIBinder1 = null;
          continue;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      localParcel1.writeInt(0);
    }
  }

  public final void a(apj paramapj, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (paramapj == null)
          continue;
        IBinder localIBinder1 = paramapj.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramAdSizeParcel == null)
          continue;
        localParcel1.writeInt(1);
        paramAdSizeParcel.writeToParcel(localParcel1, 0);
        if (paramAdRequestParcel != null)
        {
          localParcel1.writeInt(1);
          paramAdRequestParcel.writeToParcel(localParcel1, 0);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          IBinder localIBinder2 = null;
          if (paramh == null)
            continue;
          localIBinder2 = paramh.asBinder();
          localParcel1.writeStrongBinder(localIBinder2);
          this.a.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          localIBinder1 = null;
          continue;
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      localParcel1.writeInt(0);
    }
  }

  public final void a(AdRequestParcel paramAdRequestParcel, String paramString)
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
      while (true)
      {
        localParcel1.writeString(paramString);
        this.a.transact(11, localParcel1, localParcel2, 0);
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

  public final void a(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
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
      while (true)
      {
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        this.a.transact(20, localParcel1, localParcel2, 0);
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

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final void b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(4, localParcel1, localParcel2, 0);
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

  public final void c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
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

  public final void d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(8, localParcel1, localParcel2, 0);
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

  public final void e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(9, localParcel1, localParcel2, 0);
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

  public final void f()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(12, localParcel1, localParcel2, 0);
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

  public final boolean g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(13, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      int j = 0;
      if (i != 0)
        j = 1;
      return j;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject;
  }

  public final n h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(15, localParcel1, localParcel2, 0);
      localParcel2.readException();
      IBinder localIBinder = localParcel2.readStrongBinder();
      Object localObject2;
      if (localIBinder == null)
        localObject2 = null;
      while (true)
      {
        return localObject2;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        if ((localIInterface != null) && ((localIInterface instanceof n)))
        {
          localObject2 = (n)localIInterface;
          continue;
        }
        localObject2 = new p(localIBinder);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject1;
  }

  public final q i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(16, localParcel1, localParcel2, 0);
      localParcel2.readException();
      IBinder localIBinder = localParcel2.readStrongBinder();
      Object localObject2;
      if (localIBinder == null)
        localObject2 = null;
      while (true)
      {
        return localObject2;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        if ((localIInterface != null) && ((localIInterface instanceof q)))
        {
          localObject2 = (q)localIInterface;
          continue;
        }
        localObject2 = new s(localIBinder);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    throw localObject1;
  }

  public final Bundle j()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(17, localParcel1, localParcel2, 0);
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

  public final Bundle k()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(18, localParcel1, localParcel2, 0);
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

  public final Bundle l()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.a.transact(19, localParcel1, localParcel2, 0);
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
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.g
 * JD-Core Version:    0.6.0
 */