package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.util.bi;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class t
  implements com.google.android.gms.ads.internal.gmsg.t
{
  t(o paramo, a parama, bi parambi)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    synchronized (this.c.c.a)
    {
      c.d("JS Engine is requesting an update");
      if (this.c.c.g == 0)
      {
        c.d("Starting reload.");
        this.c.c.g = 2;
        this.c.c.a(this.c.a);
      }
      this.a.b("/requestReload", (com.google.android.gms.ads.internal.gmsg.t)this.b.a);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.t
 * JD-Core Version:    0.6.0
 */