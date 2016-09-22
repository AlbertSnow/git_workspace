import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.bc;
import com.google.android.gms.ads.internal.client.bu;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.e;

@a
public final class mn
{
  private final Object a = new Object();
  private bc b;
  private mo c;

  public final void a(bc parambc)
  {
    while (true)
    {
      mo localmo;
      synchronized (this.a)
      {
        this.b = parambc;
        if (this.c == null)
          continue;
        localmo = this.c;
        anw.a(localmo, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.a)
        {
          this.c = localmo;
          if (this.b == null)
            return;
        }
      }
      try
      {
        this.b.a(new bu(localmo));
        monitorexit;
        continue;
        localObject4 = finally;
        monitorexit;
        throw localObject4;
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          e.b("Unable to call setVideoLifecycleCallbacks on video controller.", localRemoteException);
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mn
 * JD-Core Version:    0.6.0
 */