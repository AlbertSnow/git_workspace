import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.SignInResponse;

public abstract interface aru extends IInterface
{
  public abstract void a(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult);

  public abstract void a(Status paramStatus);

  public abstract void a(Status paramStatus, GoogleSignInAccount paramGoogleSignInAccount);

  public abstract void a(SignInResponse paramSignInResponse);

  public abstract void b(Status paramStatus);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aru
 * JD-Core Version:    0.6.0
 */