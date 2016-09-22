import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class hq
  implements hn
{
  final CopyOnWriteArraySet a;
  boolean b;
  int c;
  int d;
  private final Handler e;
  private final hs f;
  private final boolean[] g;

  @SuppressLint({"HandlerLeak"})
  public hq(int paramInt1, int paramInt2, int paramInt3)
  {
    Log.i("ExoPlayerImpl", "Init 1.3.1");
    this.b = false;
    this.c = 1;
    this.a = new CopyOnWriteArraySet();
    this.g = new boolean[paramInt1];
    while (i < this.g.length)
    {
      this.g[i] = true;
      i++;
    }
    this.e = new hr(this);
    this.f = new hs(this.e, this.b, this.g, 2500, 5000);
  }

  public final int a()
  {
    return this.c;
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    Handler localHandler;
    if (this.g[0] != paramBoolean)
    {
      this.g[0] = paramBoolean;
      localHandler = this.f.a;
      if (!paramBoolean)
        break label45;
    }
    label45: for (int i = 1; ; i = 0)
    {
      localHandler.obtainMessage(8, 0, i).sendToTarget();
      return;
    }
  }

  public final void a(long paramLong)
  {
    this.f.a.obtainMessage(6, Long.valueOf(paramLong)).sendToTarget();
  }

  public final void a(ho paramho, int paramInt, Object paramObject)
  {
    hs localhs = this.f;
    localhs.b = (1 + localhs.b);
    localhs.a.obtainMessage(9, 1, 0, Pair.create(paramho, paramObject)).sendToTarget();
  }

  public final void a(hp paramhp)
  {
    this.a.add(paramhp);
  }

  public final void a(boolean paramBoolean)
  {
    if (this.b != paramBoolean)
    {
      this.b = paramBoolean;
      this.d = (1 + this.d);
      Handler localHandler = this.f.a;
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        localHandler.obtainMessage(3, i, 0).sendToTarget();
        Iterator localIterator = this.a.iterator();
        while (localIterator.hasNext())
          ((hp)localIterator.next()).a(paramBoolean, this.c);
      }
    }
  }

  public final void a(ix[] paramArrayOfix)
  {
    this.f.a.obtainMessage(1, paramArrayOfix).sendToTarget();
  }

  public final void b(ho paramho, int paramInt, Object paramObject)
  {
    this.f.a(paramho, 1, paramObject);
  }

  public final boolean b()
  {
    return this.b;
  }

  public final void c()
  {
    this.f.a.sendEmptyMessage(4);
  }

  public final void d()
  {
    this.f.a();
    this.e.removeCallbacksAndMessages(null);
  }

  public final long e()
  {
    hs localhs = this.f;
    if (localhs.c == -1L)
      return -1L;
    return localhs.c / 1000L;
  }

  public final long f()
  {
    return this.f.d / 1000L;
  }

  public final long g()
  {
    hs localhs = this.f;
    if (localhs.e == -1L)
      return -1L;
    return localhs.e / 1000L;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hq
 * JD-Core Version:    0.6.0
 */