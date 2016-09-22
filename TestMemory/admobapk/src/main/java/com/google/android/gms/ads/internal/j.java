package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.customrenderedad.a;
import com.google.android.gms.ads.internal.customrenderedad.client.d;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.safebrowsing.m;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;

final class j
  implements Runnable
{
  j(g paramg, com.google.android.gms.ads.internal.state.b paramb, m paramm, com.google.android.gms.ads.internal.csi.l paraml)
  {
  }

  public final void run()
  {
    if ((this.a.b.s) && (this.d.d.y != null))
    {
      String str1 = this.a.b.b;
      String str2 = null;
      if (str1 != null)
        str2 = y.a(this.a.b.b);
      a locala = new a(this.d, str2, this.a.b.c);
      this.d.d.E = 1;
      try
      {
        this.d.b = false;
        this.d.d.y.a(locala);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        c.c("Could not call the onCustomRenderedAdLoadedListener.", localRemoteException);
        this.d.b = true;
      }
    }
    n localn = new n(this.d.d.c, this.a);
    com.google.android.gms.ads.internal.webview.b localb = this.d.a(this.a, localn, this.b);
    localb.setOnTouchListener(new k(this, localn));
    localb.setOnClickListener(new l(this, localn));
    this.d.d.E = 0;
    bd localbd = this.d.d;
    localbd.h = com.google.android.gms.ads.internal.renderer.j.a(this.d.d.c, this.d, this.a, this.d.d.d, localb, this.d.h, this.d, this.c);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.j
 * JD-Core Version:    0.6.0
 */