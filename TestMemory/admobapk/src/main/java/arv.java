import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.SignInResponse;

public abstract class arv extends Binder
  implements aru
{
  public arv()
  {
    attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
  }

  public static aru a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof aru)))
      return (aru)localIInterface;
    return new arw(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      ConnectionResult localConnectionResult;
      if (paramParcel1.readInt() != 0)
      {
        localConnectionResult = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label146;
      }
      for (AuthAccountResult localAuthAccountResult = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(paramParcel1); ; localAuthAccountResult = null)
      {
        a(localConnectionResult, localAuthAccountResult);
        paramParcel2.writeNoException();
        return true;
        localConnectionResult = null;
        break;
      }
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0);
      for (Status localStatus3 = (Status)Status.CREATOR.createFromParcel(paramParcel1); ; localStatus3 = null)
      {
        a(localStatus3);
        paramParcel2.writeNoException();
        return true;
      }
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0);
      for (Status localStatus2 = (Status)Status.CREATOR.createFromParcel(paramParcel1); ; localStatus2 = null)
      {
        b(localStatus2);
        paramParcel2.writeNoException();
        return true;
      }
    case 7:
      label146: paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      Status localStatus1;
      if (paramParcel1.readInt() != 0)
      {
        localStatus1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label310;
      }
      label310: for (GoogleSignInAccount localGoogleSignInAccount = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(paramParcel1); ; localGoogleSignInAccount = null)
      {
        a(localStatus1, localGoogleSignInAccount);
        paramParcel2.writeNoException();
        return true;
        localStatus1 = null;
        break;
      }
    case 8:
    }
    paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
    if (paramParcel1.readInt() != 0);
    for (SignInResponse localSignInResponse = (SignInResponse)SignInResponse.CREATOR.createFromParcel(paramParcel1); ; localSignInResponse = null)
    {
      a(localSignInResponse);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     arv
 * JD-Core Version:    0.6.0
 */