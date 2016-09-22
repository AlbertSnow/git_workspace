package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class m
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    ab localab1 = paramb.i();
    if (localab1 != null)
    {
      localab1.a();
      return;
    }
    ab localab2 = paramb.j();
    if (localab2 != null)
    {
      localab2.a();
      return;
    }
    c.e("A GMSG tried to close something that wasn't an overlay.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.m
 * JD-Core Version:    0.6.0
 */