package com.google.android.gms.ads.internal.request.service;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class m
  implements t
{
  m(k paramk)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    q localq;
    synchronized (this.a.a)
    {
      if (this.a.d.isDone())
        return;
      localq = new q(-2, paramMap);
      if (!this.a.b.equals(localq.e))
        return;
    }
    String str1 = localq.g;
    if (str1 == null)
    {
      c.e("URL missing in loadAdUrl GMSG.");
      monitorexit;
      return;
    }
    String str3;
    if (str1.contains("%40mediation_adapters%40"))
    {
      String str2 = str1.replaceAll("%40mediation_adapters%40", com.google.android.gms.ads.internal.state.service.a.a(paramb.getContext(), (String)paramMap.get("check_adapters"), this.a.c));
      localq.g = str2;
      str3 = String.valueOf(str2);
      if (str3.length() == 0)
        break label183;
    }
    label183: for (String str4 = "Ad request URL modified to ".concat(str3); ; str4 = new String("Ad request URL modified to "))
    {
      c.a(str4);
      this.a.d.b(localq);
      monitorexit;
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.m
 * JD-Core Version:    0.6.0
 */