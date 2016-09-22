import java.util.Arrays;

public final class kw
  implements kr
{
  private final int a;
  private int b;
  private int c;
  private kq[] d;

  public kw(int paramInt)
  {
    lp.a(true);
    this.a = 262144;
    this.d = new kq[100];
  }

  private int c()
  {
    monitorenter;
    try
    {
      int i = this.b;
      int j = this.a;
      int k = i * j;
      monitorexit;
      return k;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final kq a()
  {
    monitorenter;
    try
    {
      this.b = (1 + this.b);
      kq[] arrayOfkq;
      int i;
      if (this.c > 0)
      {
        arrayOfkq = this.d;
        i = -1 + this.c;
        this.c = i;
      }
      for (kq localkq = arrayOfkq[i]; ; localkq = new kq(new byte[this.a], 0))
        return localkq;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(int paramInt)
  {
    monitorenter;
    try
    {
      int i = Math.max(0, ly.a(0, this.a) - this.b);
      if (i < this.c)
      {
        Arrays.fill(this.d, i, this.c, null);
        this.c = i;
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(kq paramkq)
  {
    monitorenter;
    try
    {
      if (paramkq.a.length == this.a);
      for (boolean bool = true; ; bool = false)
      {
        lp.a(bool);
        this.b = (-1 + this.b);
        if (this.c == this.d.length)
          this.d = ((kq[])Arrays.copyOf(this.d, this.d.length << 1));
        kq[] arrayOfkq = this.d;
        int i = this.c;
        this.c = (i + 1);
        arrayOfkq[i] = paramkq;
        notifyAll();
        return;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final int b()
  {
    return this.a;
  }

  public final void b(int paramInt)
  {
    monitorenter;
    try
    {
      if (c() > paramInt)
        wait();
    }
    finally
    {
      monitorexit;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     kw
 * JD-Core Version:    0.6.0
 */