import android.content.Context;

public final class aow
{
  public static aow a = new aow();
  private aov b = null;

  public final aov a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (this.b == null)
        if (paramContext.getApplicationContext() != null)
          break label37;
      while (true)
      {
        this.b = new aov(paramContext);
        aov localaov = this.b;
        return localaov;
        label37: Context localContext = paramContext.getApplicationContext();
        paramContext = localContext;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aow
 * JD-Core Version:    0.6.0
 */