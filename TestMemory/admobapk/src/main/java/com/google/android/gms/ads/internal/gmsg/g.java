package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import gv;
import ha;
import java.util.Map;

final class g
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("tx");
    String str2 = (String)paramMap.get("ty");
    String str3 = (String)paramMap.get("td");
    try
    {
      int i = Integer.parseInt(str1);
      int j = Integer.parseInt(str2);
      int k = Integer.parseInt(str3);
      ha localha = paramb.n();
      if (localha != null)
        localha.e.a(i, j, k);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      c.e("Could not parse touch parameters from gmsg.");
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.g
 * JD-Core Version:    0.6.0
 */