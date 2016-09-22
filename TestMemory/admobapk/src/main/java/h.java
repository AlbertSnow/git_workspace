import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

public final class h
{
  final i a;
  final ComponentName b;
  private final l c;

  h(l paraml, i parami, ComponentName paramComponentName)
  {
    this.c = paraml;
    this.a = parami;
    this.b = paramComponentName;
  }

  public final boolean a(Uri paramUri, Bundle paramBundle, List paramList)
  {
    try
    {
      boolean bool = this.c.a(this.a, paramUri, paramBundle, paramList);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     h
 * JD-Core Version:    0.6.0
 */