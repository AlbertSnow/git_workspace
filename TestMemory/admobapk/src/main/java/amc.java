import java.util.ArrayList;

public abstract class amc
{
  Object a;
  boolean b;

  public amc(alx paramalx, Object paramObject)
  {
    this.a = paramObject;
    this.b = false;
  }

  protected abstract void a(Object paramObject);

  public final void b()
  {
    c();
    synchronized (this.c.h)
    {
      this.c.h.remove(this);
      return;
    }
  }

  public final void c()
  {
    monitorenter;
    try
    {
      this.a = null;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amc
 * JD-Core Version:    0.6.0
 */