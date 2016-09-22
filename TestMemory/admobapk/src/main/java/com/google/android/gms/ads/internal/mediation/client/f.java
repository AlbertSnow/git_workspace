package com.google.android.gms.ads.internal.mediation.client;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apj;
import apk;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.g;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.t;
import com.google.android.gms.ads.internal.reward.mediation.client.a;
import com.google.android.gms.ads.internal.reward.mediation.client.c;

public abstract class f extends Binder
  implements e
{
  public f()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      apj localapj7 = apk.a(paramParcel1.readStrongBinder());
      AdSizeParcel localAdSizeParcel2;
      if (paramParcel1.readInt() != 0)
      {
        localAdSizeParcel2 = com.google.android.gms.ads.internal.client.i.a(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label288;
      }
      for (AdRequestParcel localAdRequestParcel8 = g.a(paramParcel1); ; localAdRequestParcel8 = null)
      {
        a(localapj7, localAdSizeParcel2, localAdRequestParcel8, paramParcel1.readString(), i.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localAdSizeParcel2 = null;
        break;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      apj localapj6 = a();
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (localapj6 != null)
        localIBinder4 = localapj6.asBinder();
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      apj localapj5 = apk.a(paramParcel1.readStrongBinder());
      int m = paramParcel1.readInt();
      AdRequestParcel localAdRequestParcel7 = null;
      if (m != 0)
        localAdRequestParcel7 = g.a(paramParcel1);
      a(localapj5, localAdRequestParcel7, paramParcel1.readString(), i.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      b();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      c();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      apj localapj4 = apk.a(paramParcel1.readStrongBinder());
      AdSizeParcel localAdSizeParcel1;
      if (paramParcel1.readInt() != 0)
      {
        localAdSizeParcel1 = com.google.android.gms.ads.internal.client.i.a(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label517;
      }
      for (AdRequestParcel localAdRequestParcel6 = g.a(paramParcel1); ; localAdRequestParcel6 = null)
      {
        a(localapj4, localAdSizeParcel1, localAdRequestParcel6, paramParcel1.readString(), paramParcel1.readString(), i.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localAdSizeParcel1 = null;
        break;
      }
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      apj localapj3 = apk.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (AdRequestParcel localAdRequestParcel5 = g.a(paramParcel1); ; localAdRequestParcel5 = null)
      {
        a(localapj3, localAdRequestParcel5, paramParcel1.readString(), paramParcel1.readString(), i.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      d();
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      e();
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      apj localapj2 = apk.a(paramParcel1.readStrongBinder());
      AdRequestParcel localAdRequestParcel4;
      String str3;
      IBinder localIBinder3;
      Object localObject;
      if (paramParcel1.readInt() != 0)
      {
        localAdRequestParcel4 = g.a(paramParcel1);
        str3 = paramParcel1.readString();
        localIBinder3 = paramParcel1.readStrongBinder();
        if (localIBinder3 != null)
          break label702;
        localObject = null;
      }
      while (true)
      {
        a(localapj2, localAdRequestParcel4, str3, (a)localObject, paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
        localAdRequestParcel4 = null;
        break;
        IInterface localIInterface = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if ((localIInterface != null) && ((localIInterface instanceof a)))
        {
          localObject = (a)localIInterface;
          continue;
        }
        localObject = new c(localIBinder3);
      }
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      int k = paramParcel1.readInt();
      AdRequestParcel localAdRequestParcel3 = null;
      if (k != 0)
        localAdRequestParcel3 = g.a(paramParcel1);
      a(localAdRequestParcel3, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      f();
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      boolean bool = g();
      paramParcel2.writeNoException();
      if (bool);
      for (int j = 1; ; j = 0)
      {
        paramParcel2.writeInt(j);
        return true;
      }
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      apj localapj1 = apk.a(paramParcel1.readStrongBinder());
      AdRequestParcel localAdRequestParcel2;
      String str1;
      String str2;
      h localh;
      if (paramParcel1.readInt() != 0)
      {
        localAdRequestParcel2 = g.a(paramParcel1);
        str1 = paramParcel1.readString();
        str2 = paramParcel1.readString();
        localh = i.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() == 0)
          break label952;
      }
      for (NativeAdOptionsParcel localNativeAdOptionsParcel = t.a(paramParcel1); ; localNativeAdOptionsParcel = null)
      {
        a(localapj1, localAdRequestParcel2, str1, str2, localh, localNativeAdOptionsParcel, paramParcel1.createStringArrayList());
        paramParcel2.writeNoException();
        return true;
        localAdRequestParcel2 = null;
        break;
      }
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      n localn = h();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localn != null)
        localIBinder2 = localn.asBinder();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      q localq = i();
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (localq != null)
        localIBinder1 = localq.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      Bundle localBundle3 = j();
      paramParcel2.writeNoException();
      if (localBundle3 != null)
      {
        paramParcel2.writeInt(1);
        localBundle3.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      Bundle localBundle2 = k();
      paramParcel2.writeNoException();
      if (localBundle2 != null)
      {
        paramParcel2.writeInt(1);
        localBundle2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      Bundle localBundle1 = l();
      paramParcel2.writeNoException();
      if (localBundle1 != null)
      {
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 20:
      label288: label702: paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      label517: label952: int i = paramParcel1.readInt();
      AdRequestParcel localAdRequestParcel1 = null;
      if (i != 0)
        localAdRequestParcel1 = g.a(paramParcel1);
      a(localAdRequestParcel1, paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 21:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    a(apk.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.f
 * JD-Core Version:    0.6.0
 */