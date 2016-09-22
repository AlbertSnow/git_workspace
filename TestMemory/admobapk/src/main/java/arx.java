import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

public abstract interface arx extends IInterface
{
  public abstract void a(int paramInt);

  public abstract void a(int paramInt, Account paramAccount, aru paramaru);

  public abstract void a(anb paramanb, int paramInt, boolean paramBoolean);

  public abstract void a(aru paramaru);

  public abstract void a(AuthAccountRequest paramAuthAccountRequest, aru paramaru);

  public abstract void a(ResolveAccountRequest paramResolveAccountRequest, anq paramanq);

  public abstract void a(CheckServerAuthResult paramCheckServerAuthResult);

  public abstract void a(RecordConsentRequest paramRecordConsentRequest, aru paramaru);

  public abstract void a(SignInRequest paramSignInRequest, aru paramaru);

  public abstract void a(boolean paramBoolean);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     arx
 * JD-Core Version:    0.6.0
 */