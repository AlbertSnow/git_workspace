package com.google.android.gms.ads.internal.formats.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class t extends Binder
  implements s
{
  public t()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }

  public static s a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    if ((localIInterface != null) && ((localIInterface instanceof s)))
      return (s)localIInterface;
    return new u(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      String str2 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      a locala = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (locala != null);
      for (IBinder localIBinder = locala.asBinder(); ; localIBinder = null)
      {
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      List localList = a();
      paramParcel2.writeNoException();
      paramParcel2.writeStringList(localList);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      String str1 = k();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      c(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 6:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    b();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.client.t
 * JD-Core Version:    0.6.0
 */