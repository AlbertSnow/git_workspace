import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class akj
  implements ako
{
  private final akp a;

  public akj(akp paramakp)
  {
    this.a = paramakp;
  }

  public final ajh a(ajh paramajh)
  {
    this.a.m.d.add(paramajh);
    return paramajh;
  }

  public final void a()
  {
    Iterator localIterator = this.a.f.values().iterator();
    while (localIterator.hasNext())
      ((aif)localIterator.next()).d();
    this.a.m.f = Collections.emptySet();
  }

  public final void a(int paramInt)
  {
  }

  public final void a(Bundle paramBundle)
  {
  }

  public final void a(ConnectionResult paramConnectionResult, aia paramaia, int paramInt)
  {
  }

  public final ajh b(ajh paramajh)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }

  public final boolean b()
  {
    return true;
  }

  public final void c()
  {
    akp localakp = this.a;
    localakp.a.lock();
    try
    {
      localakp.k = new ajy(localakp, localakp.h, localakp.i, localakp.d, localakp.j, localakp.a, localakp.c);
      localakp.k.a();
      localakp.b.signalAll();
      return;
    }
    finally
    {
      localakp.a.unlock();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akj
 * JD-Core Version:    0.6.0
 */