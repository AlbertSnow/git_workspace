import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appstreaming.AppStreamingInfo;

public abstract class nd extends Binder
  implements nc
{
  public nd()
  {
    attachInterface(this, "com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
  }

  public static nc asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof nc)))
      return (nc)localIInterface;
    return new ne(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      apg localapg = aph.a(paramParcel1.readStrongBinder());
      apj localapj4 = apk.a(paramParcel1.readStrongBinder());
      AppStreamingInfo localAppStreamingInfo;
      IBinder localIBinder2;
      Object localObject;
      if (paramParcel1.readInt() != 0)
      {
        localAppStreamingInfo = (AppStreamingInfo)AppStreamingInfo.CREATOR.createFromParcel(paramParcel1);
        localIBinder2 = paramParcel1.readStrongBinder();
        localObject = null;
        if (localIBinder2 != null)
          break label217;
      }
      while (true)
      {
        initialize(localapg, localapj4, localAppStreamingInfo, (ni)localObject);
        paramParcel2.writeNoException();
        return true;
        localAppStreamingInfo = null;
        break;
        IInterface localIInterface = localIBinder2.queryLocalInterface("com.google.android.gms.appstreaming.internal.IAppStreamingStateListener");
        if ((localIInterface != null) && ((localIInterface instanceof ni)))
        {
          localObject = (ni)localIInterface;
          continue;
        }
        localObject = new nk(localIBinder2);
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle3 = null)
      {
        onCreate(localBundle3);
        paramParcel2.writeNoException();
        return true;
      }
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      apj localapj1 = apk.a(paramParcel1.readStrongBinder());
      apj localapj2 = apk.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
      {
        apj localapj3 = onCreateView(localapj1, localapj2, localBundle2);
        paramParcel2.writeNoException();
        IBinder localIBinder1 = null;
        if (localapj3 != null)
          localIBinder1 = localapj3.asBinder();
        paramParcel2.writeStrongBinder(localIBinder1);
        return true;
      }
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      onStart();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      onResume();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      onPause();
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      onStop();
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      onDestroy();
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
      {
        onSaveInstanceState(localBundle1);
        paramParcel2.writeNoException();
        if (localBundle1 == null)
          break;
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      boolean bool = onBackPressed();
      paramParcel2.writeNoException();
      if (bool);
      for (int i = 1; ; i = 0)
      {
        paramParcel2.writeInt(i);
        return true;
      }
    case 12:
      label217: paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
      mute();
      paramParcel2.writeNoException();
      return true;
    case 13:
    }
    paramParcel1.enforceInterface("com.google.android.gms.appstreaming.internal.IAppStreamingFragmentDelegate");
    unmute();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nd
 * JD-Core Version:    0.6.0
 */