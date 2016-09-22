package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

public final class am
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("request_id");
    String str2 = String.valueOf((String)paramMap.get("errors"));
    if (str2.length() != 0);
    for (String str3 = "Invalid request: ".concat(str2); ; str3 = new String("Invalid request: "))
    {
      c.e(str3);
      ae.b.a(str1);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.am
 * JD-Core Version:    0.6.0
 */