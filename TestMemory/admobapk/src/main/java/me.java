import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.bi;
import com.google.android.gms.ads.internal.client.h;
import com.google.android.gms.ads.internal.client.y;
import com.google.android.gms.ads.internal.util.client.e;

public class me
{
  private final h a;
  private final Context b;
  private final y c;

  me(Context paramContext, y paramy)
  {
    this(paramContext, paramy, h.a);
  }

  private me(Context paramContext, y paramy, h paramh)
  {
    this.b = paramContext;
    this.c = paramy;
    this.a = paramh;
  }

  public final void a(bi parambi)
  {
    try
    {
      this.c.a(h.a(this.b, parambi));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      e.b("Failed to load ad.", localRemoteException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     me
 * JD-Core Version:    0.6.0
 */