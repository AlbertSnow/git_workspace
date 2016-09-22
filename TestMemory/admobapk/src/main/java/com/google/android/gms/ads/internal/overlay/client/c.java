package com.google.android.gms.ads.internal.overlay.client;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class c extends Binder
  implements b
{
  public c()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      int i1 = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (i1 != 0)
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      a(localBundle2);
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      f();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      g();
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      h();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      i();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      int n = paramParcel1.readInt();
      Bundle localBundle1 = null;
      if (n != 0)
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      b(localBundle1);
      paramParcel2.writeNoException();
      if (localBundle1 != null)
      {
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      j();
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      k();
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      l();
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      d();
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      boolean bool = e();
      paramParcel2.writeNoException();
      if (bool);
      for (int m = 1; ; m = 0)
      {
        paramParcel2.writeInt(m);
        return true;
      }
    case 12:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    int i = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    int k = paramParcel1.readInt();
    Intent localIntent = null;
    if (k != 0)
      localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
    a(i, j, localIntent);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.client.c
 * JD-Core Version:    0.6.0
 */