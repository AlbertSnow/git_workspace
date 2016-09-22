import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

public final class all extends aja
  implements aiw
{
  volatile aix a;
  private Status b;

  private final boolean a()
  {
    null.get();
    return false;
  }

  static void b(aiv paramaiv)
  {
    if ((paramaiv instanceof aiu));
    try
    {
      ((aiu)paramaiv).b();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      String str = String.valueOf(paramaiv);
      Log.w("TransformedResultImpl", 18 + String.valueOf(str).length() + "Unable to release " + str, localRuntimeException);
    }
  }

  public final void a(aiv paramaiv)
  {
    monitorenter;
    try
    {
      if (paramaiv.a().b())
        if (!a());
      while (true)
      {
        return;
        a(paramaiv.a());
        b(paramaiv);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  final void a(Status paramStatus)
  {
    monitorenter;
    try
    {
      this.b = paramStatus;
      monitorenter;
      try
      {
        if (a());
        monitorexit;
        return;
      }
      finally
      {
        monitorexit;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     all
 * JD-Core Version:    0.6.0
 */