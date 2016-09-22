package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class i
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    String str = (String)paramMap.get("action");
    if ("pause".equals(str))
      paramb.F();
    do
      return;
    while (!"resume".equals(str));
    paramb.G();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.i
 * JD-Core Version:    0.6.0
 */