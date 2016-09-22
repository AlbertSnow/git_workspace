import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class amy
{
  final amz a;
  final Set b;
  int c;
  boolean d;
  IBinder e;
  final amx f;
  ComponentName g;

  public amy(amw paramamw, amx paramamx)
  {
    this.f = paramamx;
    this.a = new amz(this);
    this.b = new HashSet();
    this.c = 2;
  }

  public final void a(ServiceConnection paramServiceConnection, String paramString)
  {
    aof localaof = this.h.c;
    Context localContext = this.h.b;
    Intent localIntent = this.f.a();
    localaof.a(localContext, aof.a(paramServiceConnection), paramString, localIntent, 3);
    this.b.add(paramServiceConnection);
  }

  @TargetApi(14)
  public final void a(String paramString)
  {
    this.c = 3;
    this.d = this.h.c.a(this.h.b, paramString, this.f.a(), this.a, 129);
    if (!this.d)
      this.c = 2;
    try
    {
      this.h.c.a(this.h.b, this.a);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
  }

  public final boolean a()
  {
    return this.b.isEmpty();
  }

  public final boolean a(ServiceConnection paramServiceConnection)
  {
    return this.b.contains(paramServiceConnection);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amy
 * JD-Core Version:    0.6.0
 */