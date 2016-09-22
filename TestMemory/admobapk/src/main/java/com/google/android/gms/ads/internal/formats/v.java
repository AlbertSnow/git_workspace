package com.google.android.gms.ads.internal.formats;

import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.webview.b;

final class v
  implements Runnable
{
  v(u paramu, j paramj)
  {
  }

  public final void run()
  {
    b localb = this.a.d();
    if ((localb != null) && (this.b.a != null))
      this.b.a.addView(localb.b());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.v
 * JD-Core Version:    0.6.0
 */