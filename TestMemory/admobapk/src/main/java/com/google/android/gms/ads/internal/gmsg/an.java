package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.ads.internal.webview.o;
import com.google.android.gms.ads.internal.webview.q;
import java.util.Map;

@a
final class an
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    if (!((Boolean)m.af.a()).booleanValue())
      return;
    o localo1 = paramb.z();
    if (localo1 == null);
    while (true)
    {
      try
      {
        o localo3 = new o(paramb, Float.parseFloat((String)paramMap.get("duration")));
        paramb.a(localo3);
        localo2 = localo3;
        bool = "1".equals(paramMap.get("muted"));
        f = Float.parseFloat((String)paramMap.get("currentTime"));
        i = Integer.parseInt((String)paramMap.get("playbackState"));
        if (i < 0)
          break label230;
        if (3 >= i)
          continue;
      }
      catch (NullPointerException localNullPointerException)
      {
        synchronized (localo2.b)
        {
          boolean bool;
          float f;
          localo2.g = f;
          localo2.f = bool;
          int j = localo2.c;
          localo2.c = i;
          y.a(new q(localo2, j, i));
          return;
          localNullPointerException = localNullPointerException;
          c.b("Unable to parse videoMeta message.", localNullPointerException);
          bc.a().h.a(localNullPointerException, true);
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        continue;
      }
      o localo2 = localo1;
      continue;
      label230: int i = 0;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.an
 * JD-Core Version:    0.6.0
 */