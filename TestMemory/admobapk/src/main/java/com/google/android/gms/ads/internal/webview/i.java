package com.google.android.gms.ads.internal.webview;

import com.google.android.gms.ads.internal.gmsg.t;
import java.util.Map;
import java.util.Set;

final class i
  implements t
{
  i(c paramc)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    if (paramMap.keySet().contains("start"))
      this.a.d();
    do
    {
      return;
      if (!paramMap.keySet().contains("stop"))
        continue;
      c localc2 = this.a;
      localc2.r = (-1 + localc2.r);
      localc2.e();
      return;
    }
    while (!paramMap.keySet().contains("cancel"));
    c localc1 = this.a;
    localc1.q = true;
    localc1.e();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.i
 * JD-Core Version:    0.6.0
 */