package com.google.android.gms.ads.internal.webview;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.bf;
import com.google.android.gms.ads.internal.util.c;

public final class q
  implements Runnable
{
  public q(o paramo, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    while (true)
    {
      int k;
      int m;
      int n;
      synchronized (this.c.b)
      {
        if (this.a == this.b)
          continue;
        int i = 1;
        if ((this.c.e) || (this.b != 1))
          continue;
        int j = 1;
        if ((i == 0) || (this.b != 1))
          continue;
        k = 1;
        if ((i == 0) || (this.b != 2))
          continue;
        m = 1;
        if ((i == 0) || (this.b != 3))
          continue;
        n = 1;
        o localo = this.c;
        if (this.c.e)
          break label289;
        bool = false;
        if (j != 0)
          break label289;
        localo.e = bool;
        if (this.c.d == null)
        {
          return;
          i = 0;
          continue;
          j = 0;
          continue;
          k = 0;
          continue;
          m = 0;
          continue;
          n = 0;
          continue;
        }
        if (j == 0);
      }
      try
      {
        this.c.d.a();
        if (k == 0);
      }
      catch (RemoteException localRemoteException2)
      {
        try
        {
          this.c.d.b();
          if (m == 0);
        }
        catch (RemoteException localRemoteException2)
        {
          try
          {
            this.c.d.c();
            if (n == 0);
          }
          catch (RemoteException localRemoteException2)
          {
            try
            {
              while (true)
              {
                this.c.d.d();
                monitorexit;
                return;
                localObject2 = finally;
                monitorexit;
                throw localObject2;
                localRemoteException4 = localRemoteException4;
                c.c("Unable to call onVideoStart()", localRemoteException4);
                continue;
                localRemoteException3 = localRemoteException3;
                c.c("Unable to call onVideoPlay()", localRemoteException3);
              }
              localRemoteException2 = localRemoteException2;
              c.c("Unable to call onVideoPause()", localRemoteException2);
            }
            catch (RemoteException localRemoteException1)
            {
              while (true)
                c.c("Unable to call onVideoEnd()", localRemoteException1);
            }
          }
        }
      }
      label289: boolean bool = true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.q
 * JD-Core Version:    0.6.0
 */