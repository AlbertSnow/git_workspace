import android.content.Context;
import android.os.IBinder;

public abstract class app
{
  private final String a;
  private Object b;

  public app(String paramString)
  {
    this.a = paramString;
  }

  public final Object a(Context paramContext)
  {
    ClassLoader localClassLoader;
    if (this.b == null)
    {
      anw.a(paramContext);
      Context localContext = ahw.d(paramContext);
      if (localContext == null)
        throw new apq("Could not get remote context.");
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.b = a((IBinder)localClassLoader.loadClass(this.a).newInstance());
      return this.b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new apq("Could not load creator class.", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new apq("Could not instantiate creator.", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new apq("Could not access creator.", localIllegalAccessException);
  }

  public abstract Object a(IBinder paramIBinder);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     app
 * JD-Core Version:    0.6.0
 */