final class oi
{
  private int a = 0;

  public final void a()
  {
    monitorenter;
    try
    {
      this.a = (1 + this.a);
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

  public final void b()
  {
    monitorenter;
    try
    {
      if (this.a == 0)
        throw new RuntimeException("too many decrements");
    }
    finally
    {
      monitorexit;
    }
    this.a = (-1 + this.a);
    if (this.a == 0)
      notifyAll();
    monitorexit;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     oi
 * JD-Core Version:    0.6.0
 */