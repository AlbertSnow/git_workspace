import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.appstreaming.internal.AppStreamingFragmentDelegateImpl;
import java.util.logging.Logger;

public final class na extends BroadcastReceiver
{
  public na(AppStreamingFragmentDelegateImpl paramAppStreamingFragmentDelegateImpl)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.a.b == null);
    while (true)
    {
      return;
      if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
      {
        this.a.b.a();
        return;
      }
      if ((!"android.intent.action.SCREEN_ON".equals(paramIntent.getAction())) || (this.a.j))
        continue;
      try
      {
        if (!this.a.d.r())
          continue;
        this.a.b.b();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        AppStreamingFragmentDelegateImpl.a.log(asn.a, localRemoteException.getMessage());
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     na
 * JD-Core Version:    0.6.0
 */