package com.google.android.gms.ads.internal.gmsg;

import alv;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;
import java.util.concurrent.Future;

@com.google.android.gms.ads.internal.report.client.a
public final class ax
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    aq localaq = bc.a().x;
    if (paramMap.containsKey("abort"))
    {
      if (!localaq.a(paramb))
        c.e("Precache abort but no preload task running.");
      return;
    }
    String str1 = (String)paramMap.get("src");
    if (str1 == null)
    {
      c.e("Precache video action is missing the src parameter.");
      return;
    }
    try
    {
      int k = Integer.parseInt((String)paramMap.get("player"));
      i = k;
      if (paramMap.containsKey("mimetype"))
      {
        str2 = (String)paramMap.get("mimetype");
        ao localao = aq.b(paramb);
        int j = 0;
        if (localao != null)
          j = 1;
        if (j == 0)
          break label143;
        c.e("Precache task already running.");
        return;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int i;
      String str2;
      while (true)
      {
        i = 0;
        continue;
        str2 = "";
      }
      label143: alv.a(paramb.h());
      ((Future)new ao(paramb, paramb.h().a.a(paramb, i, str2), str1).d());
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ax
 * JD-Core Version:    0.6.0
 */