import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class m extends Binder
  implements l
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("android.support.customtabs.ICustomTabsService");
      return true;
    case 2:
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      boolean bool4 = a(paramParcel1.readLong());
      paramParcel2.writeNoException();
      if (bool4);
      for (int m = 1; ; m = 0)
      {
        paramParcel2.writeInt(m);
        return true;
      }
    case 3:
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      boolean bool3 = a(j.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int k = 0;
      if (bool3)
        k = 1;
      paramParcel2.writeInt(k);
      return true;
    case 4:
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      i locali2 = j.a(paramParcel1.readStrongBinder());
      Uri localUri;
      if (paramParcel1.readInt() != 0)
      {
        localUri = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label267;
      }
      for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle4 = null)
      {
        boolean bool2 = a(locali2, localUri, localBundle4, paramParcel1.createTypedArrayList(Bundle.CREATOR));
        paramParcel2.writeNoException();
        int j = 0;
        if (bool2)
          j = 1;
        paramParcel2.writeInt(j);
        return true;
        localUri = null;
        break;
      }
    case 5:
      label267: paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      String str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
      {
        Bundle localBundle3 = a(str, localBundle2);
        paramParcel2.writeNoException();
        if (localBundle3 == null)
          break;
        paramParcel2.writeInt(1);
        localBundle3.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 6:
    }
    paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
    i locali1 = j.a(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0);
    for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
    {
      boolean bool1 = a(locali1, localBundle1);
      paramParcel2.writeNoException();
      int i = 0;
      if (bool1)
        i = 1;
      paramParcel2.writeInt(i);
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     m
 * JD-Core Version:    0.6.0
 */