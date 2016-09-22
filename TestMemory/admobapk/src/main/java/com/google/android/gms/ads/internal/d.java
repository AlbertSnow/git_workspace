package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.purchase.k;
import com.google.android.gms.ads.internal.state.a;
import com.google.android.gms.ads.internal.webview.b;

final class d
  implements Runnable
{
  d(c paramc, Intent paramIntent)
  {
  }

  public final void run()
  {
    int i = k.a(this.a);
    if ((i == 0) && (this.b.d.j != null) && (this.b.d.j.b != null) && (this.b.d.j.b.i() != null))
      this.b.d.j.b.i().a();
    this.b.d.F = false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.d
 * JD-Core Version:    0.6.0
 */