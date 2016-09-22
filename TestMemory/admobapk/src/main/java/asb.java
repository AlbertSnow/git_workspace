import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

public final class asb extends amq
  implements aro
{
  private final boolean l;
  private final amk m;
  private final Bundle n;
  private Integer o;

  public asb(Context paramContext, Looper paramLooper, boolean paramBoolean, amk paramamk, aiq paramaiq, air paramair)
  {
    this(paramContext, paramLooper, true, paramamk, localBundle, paramaiq, paramair);
  }

  public asb(Context paramContext, Looper paramLooper, boolean paramBoolean, amk paramamk, Bundle paramBundle, aiq paramaiq, air paramair)
  {
    super(paramContext, paramLooper, 44, paramamk, paramaiq, paramair);
    this.l = paramBoolean;
    this.m = paramamk;
    this.n = paramBundle;
    this.o = paramamk.h;
  }

  protected final String a()
  {
    return "com.google.android.gms.signin.service.START";
  }

  public final void a(anb paramanb, boolean paramBoolean)
  {
    try
    {
      ((arx)l()).a(paramanb, this.o.intValue(), paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
    }
  }

  public final void a(aru paramaru)
  {
    anw.a(paramaru, "Expecting a valid ISignInCallbacks");
    try
    {
      amk localamk = this.m;
      if (localamk.a != null);
      Account localAccount;
      for (Object localObject = localamk.a; ; localObject = localAccount)
      {
        boolean bool = "<<default account>>".equals(((Account)localObject).name);
        GoogleSignInAccount localGoogleSignInAccount = null;
        if (bool)
        {
          nn localnn = nn.a(this.c);
          localGoogleSignInAccount = localnn.a(localnn.b("defaultGoogleSignInAccount"));
        }
        ResolveAccountRequest localResolveAccountRequest = new ResolveAccountRequest((Account)localObject, this.o.intValue(), localGoogleSignInAccount);
        ((arx)l()).a(new SignInRequest(localResolveAccountRequest), paramaru);
        return;
        localAccount = new Account("<<default account>>", "com.google");
      }
    }
    catch (RemoteException localRemoteException1)
    {
      Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
      try
      {
        paramaru.a(new SignInResponse(8));
        return;
      }
      catch (RemoteException localRemoteException2)
      {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", localRemoteException1);
      }
    }
  }

  protected final String b()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }

  public final void c()
  {
    try
    {
      ((arx)l()).a(this.o.intValue());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
    }
  }

  public final void e_()
  {
    a(new amg(this));
  }

  public final boolean g()
  {
    return this.l;
  }

  protected final Bundle k()
  {
    String str = this.m.e;
    if (!this.c.getPackageName().equals(str))
      this.n.putString("com.google.android.gms.signin.internal.realClientPackageName", this.m.e);
    return this.n;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asb
 * JD-Core Version:    0.6.0
 */