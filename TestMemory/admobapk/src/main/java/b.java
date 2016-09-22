import android.content.ComponentName;
import android.os.RemoteException;

public class b
{
  private final l a;
  private final ComponentName b;

  b(l paraml, ComponentName paramComponentName)
  {
    this.a = paraml;
    this.b = paramComponentName;
  }

  public final h a(a parama)
  {
    c localc = new c(this, null);
    try
    {
      boolean bool = this.a.a(localc);
      if (!bool)
        return null;
      return new h(this.a, localc, this.b);
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public final boolean a(long paramLong)
  {
    try
    {
      boolean bool = this.a.a(0L);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     b
 * JD-Core Version:    0.6.0
 */