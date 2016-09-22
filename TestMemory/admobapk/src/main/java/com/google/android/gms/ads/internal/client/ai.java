package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import apj;
import com.google.android.gms.ads.internal.purchase.client.p;
import com.google.android.gms.ads.internal.purchase.client.r;
import com.google.android.gms.ads.internal.reward.client.k;

public abstract class ai extends Binder
  implements ah
{
  public ai()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
  }

  public static ah a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
    if ((localIInterface != null) && ((localIInterface instanceof ah)))
      return (ah)localIInterface;
    return new aj(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      apj localapj = b();
      paramParcel2.writeNoException();
      IBinder localIBinder7 = null;
      if (localapj != null)
        localIBinder7 = localapj.asBinder();
      paramParcel2.writeStrongBinder(localIBinder7);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      boolean bool4 = d();
      paramParcel2.writeNoException();
      if (bool4);
      for (int i2 = 1; ; i2 = 0)
      {
        paramParcel2.writeInt(i2);
        return true;
      }
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      int n = paramParcel1.readInt();
      AdRequestParcel localAdRequestParcel = null;
      if (n != 0)
        localAdRequestParcel = g.a(paramParcel1);
      boolean bool3 = a(localAdRequestParcel);
      paramParcel2.writeNoException();
      int i1 = 0;
      if (bool3)
        i1 = 1;
      paramParcel2.writeInt(i1);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      h();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      i();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(w.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      IBinder localIBinder6 = paramParcel1.readStrongBinder();
      Object localObject5 = null;
      if (localIBinder6 == null);
      while (true)
      {
        a((an)localObject5);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface5 = localIBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if ((localIInterface5 != null) && ((localIInterface5 instanceof an)))
        {
          localObject5 = (an)localIInterface5;
          continue;
        }
        localObject5 = new ap(localIBinder6);
      }
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      E();
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      j();
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      g();
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      AdSizeParcel localAdSizeParcel2 = c();
      paramParcel2.writeNoException();
      if (localAdSizeParcel2 != null)
      {
        paramParcel2.writeInt(1);
        localAdSizeParcel2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      int m = paramParcel1.readInt();
      AdSizeParcel localAdSizeParcel1 = null;
      if (m != 0)
        localAdSizeParcel1 = i.a(paramParcel1);
      a(localAdSizeParcel1);
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      IBinder localIBinder5 = paramParcel1.readStrongBinder();
      Object localObject4 = null;
      if (localIBinder5 == null);
      while (true)
      {
        a((com.google.android.gms.ads.internal.purchase.client.d)localObject4);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface4 = localIBinder5.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if ((localIInterface4 != null) && ((localIInterface4 instanceof com.google.android.gms.ads.internal.purchase.client.d)))
        {
          localObject4 = (com.google.android.gms.ads.internal.purchase.client.d)localIInterface4;
          continue;
        }
        localObject4 = new com.google.android.gms.ads.internal.purchase.client.f(localIBinder5);
      }
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      IBinder localIBinder4 = paramParcel1.readStrongBinder();
      Object localObject3 = null;
      if (localIBinder4 == null);
      while (true)
      {
        a((p)localObject3, paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface3 = localIBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if ((localIInterface3 != null) && ((localIInterface3 instanceof p)))
        {
          localObject3 = (p)localIInterface3;
          continue;
        }
        localObject3 = new r(localIBinder4);
      }
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      String str = D();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      Object localObject2 = null;
      if (localIBinder3 == null);
      while (true)
      {
        a((com.google.android.gms.ads.internal.customrenderedad.client.d)localObject2);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface2 = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if ((localIInterface2 != null) && ((localIInterface2 instanceof com.google.android.gms.ads.internal.customrenderedad.client.d)))
        {
          localObject2 = (com.google.android.gms.ads.internal.customrenderedad.client.d)localIInterface2;
          continue;
        }
        localObject2 = new com.google.android.gms.ads.internal.customrenderedad.client.f(localIBinder3);
      }
    case 20:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      Object localObject1 = null;
      if (localIBinder2 == null);
      while (true)
      {
        a((s)localObject1);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface1 = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
        if ((localIInterface1 != null) && ((localIInterface1 instanceof s)))
        {
          localObject1 = (s)localIInterface1;
          continue;
        }
        localObject1 = new u(localIBinder2);
      }
    case 21:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(au.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 22:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      int k = paramParcel1.readInt();
      boolean bool2 = false;
      if (k != 0)
        bool2 = true;
      a(bool2);
      paramParcel2.writeNoException();
      return true;
    case 23:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      boolean bool1 = k();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool1)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 24:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(k.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 25:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 26:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      bc localbc = l();
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (localbc != null)
        localIBinder1 = localbc.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    case 29:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
    int i = paramParcel1.readInt();
    VideoOptionsParcel localVideoOptionsParcel = null;
    if (i != 0)
      localVideoOptionsParcel = bv.a(paramParcel1);
    a(localVideoOptionsParcel);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.ai
 * JD-Core Version:    0.6.0
 */