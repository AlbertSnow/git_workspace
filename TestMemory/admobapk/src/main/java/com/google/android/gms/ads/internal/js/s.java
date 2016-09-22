package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.util.ar;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class s
  implements t
{
  s(o paramo, a parama)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    synchronized (this.b.c.a)
    {
      if ((this.b.b.b() == -1) || (this.b.b.b() == 1))
        return;
      this.b.c.g = 0;
      this.b.c.e.a(this.a);
      this.b.b.a(this.a);
      this.b.c.f = this.b.b;
      c.a("Successfully loaded JS Engine.");
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.s
 * JD-Core Version:    0.6.0
 */