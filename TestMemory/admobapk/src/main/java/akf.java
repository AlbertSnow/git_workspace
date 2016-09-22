import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

final class akf extends ars
{
  private final WeakReference a;

  akf(ajy paramajy)
  {
    this.a = new WeakReference(paramajy);
  }

  public final void a(SignInResponse paramSignInResponse)
  {
    ajy localajy = (ajy)this.a.get();
    if (localajy == null)
      return;
    localajy.a.a(new akg(this, localajy, localajy, paramSignInResponse));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akf
 * JD-Core Version:    0.6.0
 */