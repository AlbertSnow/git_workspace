import android.content.Context;
import android.content.ServiceConnection;

public abstract class amv
{
  private static final Object a = new Object();
  private static amv b;

  public static amv a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null)
        b = new amw(paramContext.getApplicationContext());
      return b;
    }
  }

  public abstract boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3);

  public abstract void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amv
 * JD-Core Version:    0.6.0
 */