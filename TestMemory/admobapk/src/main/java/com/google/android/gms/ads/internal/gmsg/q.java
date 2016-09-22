package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class q
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    String str1 = String.valueOf((String)paramMap.get("string"));
    if (str1.length() != 0);
    for (String str2 = "Received log message: ".concat(str1); ; str2 = new String("Received log message: "))
    {
      c.d(str2);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.q
 * JD-Core Version:    0.6.0
 */