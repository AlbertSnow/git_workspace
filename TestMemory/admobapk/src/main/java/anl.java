import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;

public abstract class anl extends Binder
  implements ank
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh27 = ani.a(paramParcel1.readStrongBinder());
      int i42 = paramParcel1.readInt();
      String str30 = paramParcel1.readString();
      String str31 = paramParcel1.readString();
      String[] arrayOfString4 = paramParcel1.createStringArray();
      String str32 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle25 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle25 = null)
      {
        a(localanh27, i42, str30, str31, arrayOfString4, str32, localBundle25);
        paramParcel2.writeNoException();
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh26 = ani.a(paramParcel1.readStrongBinder());
      int i40 = paramParcel1.readInt();
      String str29 = paramParcel1.readString();
      int i41 = paramParcel1.readInt();
      Bundle localBundle24 = null;
      if (i41 != 0)
        localBundle24 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      a(localanh26, i40, str29, localBundle24);
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh25 = ani.a(paramParcel1.readStrongBinder());
      int i38 = paramParcel1.readInt();
      String str28 = paramParcel1.readString();
      int i39 = paramParcel1.readInt();
      Bundle localBundle23 = null;
      if (i39 != 0)
        localBundle23 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      b(localanh25, i38, str28, localBundle23);
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh24 = ani.a(paramParcel1.readStrongBinder());
      int i36 = paramParcel1.readInt();
      String str27 = paramParcel1.readString();
      int i37 = paramParcel1.readInt();
      Bundle localBundle22 = null;
      if (i37 != 0)
        localBundle22 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      c(localanh24, i36, str27, localBundle22);
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh23 = ani.a(paramParcel1.readStrongBinder());
      int i34 = paramParcel1.readInt();
      String str26 = paramParcel1.readString();
      int i35 = paramParcel1.readInt();
      Bundle localBundle21 = null;
      if (i35 != 0)
        localBundle21 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      d(localanh23, i34, str26, localBundle21);
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh22 = ani.a(paramParcel1.readStrongBinder());
      int i32 = paramParcel1.readInt();
      String str25 = paramParcel1.readString();
      int i33 = paramParcel1.readInt();
      Bundle localBundle20 = null;
      if (i33 != 0)
        localBundle20 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      e(localanh22, i32, str25, localBundle20);
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh21 = ani.a(paramParcel1.readStrongBinder());
      int i31 = paramParcel1.readInt();
      String str21 = paramParcel1.readString();
      String str22 = paramParcel1.readString();
      String[] arrayOfString3 = paramParcel1.createStringArray();
      String str23 = paramParcel1.readString();
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      String str24 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle19 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle19 = null)
      {
        a(localanh21, i31, str21, str22, arrayOfString3, str23, localIBinder2, str24, localBundle19);
        paramParcel2.writeNoException();
        return true;
      }
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh20 = ani.a(paramParcel1.readStrongBinder());
      int i29 = paramParcel1.readInt();
      String str20 = paramParcel1.readString();
      int i30 = paramParcel1.readInt();
      Bundle localBundle18 = null;
      if (i30 != 0)
        localBundle18 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      f(localanh20, i29, str20, localBundle18);
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh19 = ani.a(paramParcel1.readStrongBinder());
      int i27 = paramParcel1.readInt();
      String str19 = paramParcel1.readString();
      int i28 = paramParcel1.readInt();
      Bundle localBundle17 = null;
      if (i28 != 0)
        localBundle17 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      g(localanh19, i27, str19, localBundle17);
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh18 = ani.a(paramParcel1.readStrongBinder());
      int i25 = paramParcel1.readInt();
      String str18 = paramParcel1.readString();
      int i26 = paramParcel1.readInt();
      Bundle localBundle16 = null;
      if (i26 != 0)
        localBundle16 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      h(localanh18, i25, str18, localBundle16);
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh17 = ani.a(paramParcel1.readStrongBinder());
      int i23 = paramParcel1.readInt();
      String str17 = paramParcel1.readString();
      int i24 = paramParcel1.readInt();
      Bundle localBundle15 = null;
      if (i24 != 0)
        localBundle15 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      i(localanh17, i23, str17, localBundle15);
      paramParcel2.writeNoException();
      return true;
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh16 = ani.a(paramParcel1.readStrongBinder());
      int i21 = paramParcel1.readInt();
      String str16 = paramParcel1.readString();
      int i22 = paramParcel1.readInt();
      Bundle localBundle14 = null;
      if (i22 != 0)
        localBundle14 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      j(localanh16, i21, str16, localBundle14);
      paramParcel2.writeNoException();
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh15 = ani.a(paramParcel1.readStrongBinder());
      int i19 = paramParcel1.readInt();
      String str15 = paramParcel1.readString();
      int i20 = paramParcel1.readInt();
      Bundle localBundle13 = null;
      if (i20 != 0)
        localBundle13 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      k(localanh15, i19, str15, localBundle13);
      paramParcel2.writeNoException();
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh14 = ani.a(paramParcel1.readStrongBinder());
      int i17 = paramParcel1.readInt();
      String str14 = paramParcel1.readString();
      int i18 = paramParcel1.readInt();
      Bundle localBundle12 = null;
      if (i18 != 0)
        localBundle12 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      l(localanh14, i17, str14, localBundle12);
      paramParcel2.writeNoException();
      return true;
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh13 = ani.a(paramParcel1.readStrongBinder());
      int i15 = paramParcel1.readInt();
      String str13 = paramParcel1.readString();
      int i16 = paramParcel1.readInt();
      Bundle localBundle11 = null;
      if (i16 != 0)
        localBundle11 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      m(localanh13, i15, str13, localBundle11);
      paramParcel2.writeNoException();
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh12 = ani.a(paramParcel1.readStrongBinder());
      int i14 = paramParcel1.readInt();
      String str12 = paramParcel1.readString();
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle10 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle10 = null)
      {
        a(localanh12, i14, str12, localIBinder1, localBundle10);
        paramParcel2.writeNoException();
        return true;
      }
    case 20:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh11 = ani.a(paramParcel1.readStrongBinder());
      int i13 = paramParcel1.readInt();
      String str10 = paramParcel1.readString();
      String[] arrayOfString2 = paramParcel1.createStringArray();
      String str11 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle9 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle9 = null)
      {
        a(localanh11, i13, str10, arrayOfString2, str11, localBundle9);
        paramParcel2.writeNoException();
        return true;
      }
    case 21:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      b(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 22:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      c(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 23:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh10 = ani.a(paramParcel1.readStrongBinder());
      int i11 = paramParcel1.readInt();
      String str9 = paramParcel1.readString();
      int i12 = paramParcel1.readInt();
      Bundle localBundle8 = null;
      if (i12 != 0)
        localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      n(localanh10, i11, str9, localBundle8);
      paramParcel2.writeNoException();
      return true;
    case 24:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      d(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 25:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh9 = ani.a(paramParcel1.readStrongBinder());
      int i9 = paramParcel1.readInt();
      String str8 = paramParcel1.readString();
      int i10 = paramParcel1.readInt();
      Bundle localBundle7 = null;
      if (i10 != 0)
        localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      o(localanh9, i9, str8, localBundle7);
      paramParcel2.writeNoException();
      return true;
    case 26:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      e(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 27:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh8 = ani.a(paramParcel1.readStrongBinder());
      int i7 = paramParcel1.readInt();
      String str7 = paramParcel1.readString();
      int i8 = paramParcel1.readInt();
      Bundle localBundle6 = null;
      if (i8 != 0)
        localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      p(localanh8, i7, str7, localBundle6);
      paramParcel2.writeNoException();
      return true;
    case 28:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a();
      paramParcel2.writeNoException();
      return true;
    case 30:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh7 = ani.a(paramParcel1.readStrongBinder());
      int i6 = paramParcel1.readInt();
      String str5 = paramParcel1.readString();
      String str6 = paramParcel1.readString();
      String[] arrayOfString1 = paramParcel1.createStringArray();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle5 = null)
      {
        a(localanh7, i6, str5, str6, arrayOfString1, localBundle5);
        paramParcel2.writeNoException();
        return true;
      }
    case 31:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      f(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 32:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      g(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 33:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 34:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 35:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      h(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 36:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      i(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 37:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh6 = ani.a(paramParcel1.readStrongBinder());
      int i4 = paramParcel1.readInt();
      String str4 = paramParcel1.readString();
      int i5 = paramParcel1.readInt();
      Bundle localBundle4 = null;
      if (i5 != 0)
        localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      q(localanh6, i4, str4, localBundle4);
      paramParcel2.writeNoException();
      return true;
    case 38:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh5 = ani.a(paramParcel1.readStrongBinder());
      int i2 = paramParcel1.readInt();
      String str3 = paramParcel1.readString();
      int i3 = paramParcel1.readInt();
      Bundle localBundle3 = null;
      if (i3 != 0)
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      r(localanh5, i2, str3, localBundle3);
      paramParcel2.writeNoException();
      return true;
    case 40:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      j(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 41:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh4 = ani.a(paramParcel1.readStrongBinder());
      int n = paramParcel1.readInt();
      String str2 = paramParcel1.readString();
      int i1 = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (i1 != 0)
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      s(localanh4, n, str2, localBundle2);
      paramParcel2.writeNoException();
      return true;
    case 42:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      k(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 43:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh3 = ani.a(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      String str1 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      Bundle localBundle1 = null;
      if (m != 0)
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      t(localanh3, k, str1, localBundle1);
      paramParcel2.writeNoException();
      return true;
    case 44:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      l(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 45:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      m(ani.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 46:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      anh localanh2 = ani.a(paramParcel1.readStrongBinder());
      int j = paramParcel1.readInt();
      GetServiceRequest localGetServiceRequest = null;
      if (j != 0)
        localGetServiceRequest = (GetServiceRequest)GetServiceRequest.CREATOR.createFromParcel(paramParcel1);
      a(localanh2, localGetServiceRequest);
      paramParcel2.writeNoException();
      return true;
    case 47:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    anh localanh1 = ani.a(paramParcel1.readStrongBinder());
    int i = paramParcel1.readInt();
    ValidateAccountRequest localValidateAccountRequest = null;
    if (i != 0)
      localValidateAccountRequest = (ValidateAccountRequest)ValidateAccountRequest.CREATOR.createFromParcel(paramParcel1);
    a(localanh1, localValidateAccountRequest);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     anl
 * JD-Core Version:    0.6.0
 */