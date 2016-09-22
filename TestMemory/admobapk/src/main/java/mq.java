import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class mq
  implements apm
{
  final nc a;

  mq(nc paramnc)
  {
    this.a = paramnc;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    try
    {
      View localView = (View)apn.a(this.a.onCreateView(apn.a(paramLayoutInflater), apn.a(paramViewGroup), paramBundle));
      return localView;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeException(localRemoteException);
  }

  public final void a()
  {
    try
    {
      this.a.onStart();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeException(localRemoteException);
  }

  public final void a(Bundle paramBundle)
  {
    try
    {
      this.a.onCreate(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeException(localRemoteException);
  }

  public final void b()
  {
    try
    {
      this.a.onResume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeException(localRemoteException);
  }

  public final void b(Bundle paramBundle)
  {
    try
    {
      this.a.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("AppStreamingFragment", localRemoteException.getMessage());
    }
  }

  public final void c()
  {
    try
    {
      this.a.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeException(localRemoteException);
  }

  public final void d()
  {
    try
    {
      this.a.onStop();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("AppStreamingFragment", localRemoteException.getMessage());
    }
  }

  public final void e()
  {
    try
    {
      this.a.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("AppStreamingFragment", localRemoteException.getMessage());
    }
  }

  public final boolean f()
  {
    try
    {
      boolean bool = this.a.onBackPressed();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("AppStreamingFragment", localRemoteException.getMessage());
    }
    return false;
  }

  public final void g()
  {
    try
    {
      this.a.mute();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("AppStreamingFragment", localRemoteException.getMessage());
    }
  }

  public final void h()
  {
    try
    {
      this.a.unmute();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("AppStreamingFragment", localRemoteException.getMessage());
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mq
 * JD-Core Version:    0.6.0
 */