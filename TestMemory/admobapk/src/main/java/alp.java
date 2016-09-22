import android.os.Binder;

public abstract class alp
{
  private static alt c;
  private static int d;
  public final String a;
  public final Object b;
  private Object e = null;

  static
  {
    new Object();
    c = null;
    d = 0;
  }

  protected alp(String paramString, Object paramObject)
  {
    this.a = paramString;
    this.b = paramObject;
  }

  public static int a()
  {
    return 0;
  }

  public static alp a(String paramString, Integer paramInteger)
  {
    return new alr(paramString, paramInteger);
  }

  public static alp a(String paramString, Long paramLong)
  {
    return new alq(paramString, paramLong);
  }

  public static alp a(String paramString1, String paramString2)
  {
    return new als(paramString1, paramString2);
  }

  public static boolean b()
  {
    return false;
  }

  protected abstract Object a(String paramString);

  public final Object c()
  {
    try
    {
      Object localObject3 = a(this.a);
      return localObject3;
    }
    catch (SecurityException localSecurityException)
    {
      long l = Binder.clearCallingIdentity();
      try
      {
        Object localObject2 = a(this.a);
        return localObject2;
      }
      finally
      {
        Binder.restoreCallingIdentity(l);
      }
    }
    throw localObject1;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     alp
 * JD-Core Version:    0.6.0
 */