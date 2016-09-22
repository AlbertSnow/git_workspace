package com.google.android.gms.ads.internal.activeview;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class d
  implements t
{
  d(a parama)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    if (!this.a.a(paramMap))
      return;
    String str1 = String.valueOf(this.a.b.c);
    if (str1.length() != 0);
    for (String str2 = "Received request to untrack: ".concat(str1); ; str2 = new String("Received request to untrack: "))
    {
      c.b(str2);
      this.a.b();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.activeview.d
 * JD-Core Version:    0.6.0
 */