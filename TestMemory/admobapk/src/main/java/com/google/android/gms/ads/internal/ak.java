package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import apn;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.mediation.client.n;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class ak
  implements t
{
  ak(n paramn, q paramq, com.google.android.gms.ads.internal.mediation.client.q paramq1)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    View localView = paramb.b();
    if (localView == null);
    View.OnClickListener localOnClickListener1;
    do
    {
      do
        while (true)
        {
          return;
          try
          {
            if (this.a == null)
              break;
            if (!this.a.k())
            {
              this.a.a(apn.a(localView));
              this.b.a.e();
              return;
            }
          }
          catch (RemoteException localRemoteException)
          {
            c.c("Unable to call handleClick on mapper", localRemoteException);
            return;
          }
          View.OnClickListener localOnClickListener2 = paramb.C();
          if (localOnClickListener2 == null)
            continue;
          localOnClickListener2.onClick(paramb.b());
          return;
        }
      while (this.c == null);
      if (!this.c.i())
      {
        this.c.a(apn.a(localView));
        this.b.a.e();
        return;
      }
      localOnClickListener1 = paramb.C();
    }
    while (localOnClickListener1 == null);
    localOnClickListener1.onClick(paramb.b());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ak
 * JD-Core Version:    0.6.0
 */