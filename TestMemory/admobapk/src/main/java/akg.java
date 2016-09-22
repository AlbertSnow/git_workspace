import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

final class akg extends akq
{
  akg(akf paramakf, ako paramako, ajy paramajy, SignInResponse paramSignInResponse)
  {
    super(paramako);
  }

  public final void a()
  {
    ajy localajy = this.b;
    SignInResponse localSignInResponse = this.c;
    ConnectionResult localConnectionResult1;
    ResolveAccountResponse localResolveAccountResponse;
    if (localajy.b(0))
    {
      localConnectionResult1 = localSignInResponse.b;
      if (!localConnectionResult1.b())
        break label149;
      localResolveAccountResponse = localSignInResponse.c;
      ConnectionResult localConnectionResult2 = localResolveAccountResponse.c;
      if (!localConnectionResult2.b())
      {
        String str = String.valueOf(localConnectionResult2);
        Log.wtf("GoogleApiClientConnecting", 48 + String.valueOf(str).length() + "Sign-in succeeded with resolve account failure: " + str, new Exception());
        localajy.b(localConnectionResult2);
      }
    }
    else
    {
      return;
    }
    localajy.g = true;
    localajy.h = anc.a(localResolveAccountResponse.b);
    localajy.i = localResolveAccountResponse.d;
    localajy.j = localResolveAccountResponse.e;
    localajy.e();
    return;
    label149: if (localajy.a(localConnectionResult1))
    {
      localajy.f();
      localajy.e();
      return;
    }
    localajy.b(localConnectionResult1);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akg
 * JD-Core Version:    0.6.0
 */