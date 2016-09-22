import android.os.Handler;
import com.google.android.gms.appstreaming.internal.AppStreamingFragmentDelegateImpl;
import java.util.concurrent.Executor;

public final class mz
  implements ass
{
  public mz(AppStreamingFragmentDelegateImpl paramAppStreamingFragmentDelegateImpl)
  {
  }

  public final void a()
  {
    AppStreamingFragmentDelegateImpl localAppStreamingFragmentDelegateImpl = this.a;
    if (localAppStreamingFragmentDelegateImpl.h != null)
    {
      localAppStreamingFragmentDelegateImpl.b = new atj(localAppStreamingFragmentDelegateImpl.h, new nb(localAppStreamingFragmentDelegateImpl.e), localAppStreamingFragmentDelegateImpl.c, localAppStreamingFragmentDelegateImpl.g, new Handler(), localAppStreamingFragmentDelegateImpl.f, localAppStreamingFragmentDelegateImpl.i);
      if (!localAppStreamingFragmentDelegateImpl.j)
        break label122;
      localAppStreamingFragmentDelegateImpl.b.a();
      if ((localAppStreamingFragmentDelegateImpl.i == null) || (System.currentTimeMillis() <= localAppStreamingFragmentDelegateImpl.k))
        break label132;
    }
    label132: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        break label137;
      atj localatj = localAppStreamingFragmentDelegateImpl.b;
      localatj.k.execute(new atk(localatj));
      return;
      label122: localAppStreamingFragmentDelegateImpl.b.b();
      break;
    }
    label137: localAppStreamingFragmentDelegateImpl.b.a(0);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mz
 * JD-Core Version:    0.6.0
 */