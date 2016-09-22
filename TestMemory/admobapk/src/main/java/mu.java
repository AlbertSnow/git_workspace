import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

public final class mu
{
  private static mu a;
  private nf b;

  private mu(Context paramContext)
  {
    try
    {
      Log.d("AppStreamingHelper", "Creating delegate");
      this.b = ng.asInterface(apr.a(paramContext, apr.a, "com.google.android.gms.piccard.dynamite").a("com.google.android.gms.appstreaming.internal.AppStreamingHelperDelegateImpl"));
      this.b.initialize(apn.a(paramContext));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("AppStreamingHelper", localRemoteException.getMessage());
      return;
    }
    catch (apz localapz)
    {
      label48: break label48;
    }
  }

  public static mu a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new mu(paramContext.getApplicationContext());
      mu localmu = a;
      return localmu;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final boolean a()
  {
    try
    {
      if (this.b != null)
      {
        boolean bool = this.b.isAppStreamingSupported();
        return bool;
      }
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("AppStreamingHelper", localRemoteException.getMessage());
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mu
 * JD-Core Version:    0.6.0
 */