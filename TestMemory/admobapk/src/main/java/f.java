import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public abstract class f
  implements ServiceConnection
{
  public abstract void a(b paramb);

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null)
      localObject = null;
    while (true)
    {
      a(new g(this, (l)localObject, paramComponentName));
      return;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
      if ((localIInterface != null) && ((localIInterface instanceof l)))
      {
        localObject = (l)localIInterface;
        continue;
      }
      localObject = new n(paramIBinder);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     f
 * JD-Core Version:    0.6.0
 */