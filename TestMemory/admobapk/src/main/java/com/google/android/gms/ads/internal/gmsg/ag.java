package com.google.android.gms.ads.internal.gmsg;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.mraid.d;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.ak;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.ads.internal.webview.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@com.google.android.gms.ads.internal.report.client.a
public final class ag
  implements t
{
  private final ab a;
  private final n b;
  private final d c;

  public ag(ab paramab, n paramn, d paramd)
  {
    this.a = paramab;
    this.b = paramn;
    this.c = paramd;
  }

  private final void a(boolean paramBoolean)
  {
    if (this.c != null)
      this.c.a(paramBoolean);
  }

  private static boolean a(Map paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }

  private static int b(Map paramMap)
  {
    String str = (String)paramMap.get("o");
    if (str != null)
    {
      if ("p".equalsIgnoreCase(str))
        return bc.a().g.b();
      if ("l".equalsIgnoreCase(str))
        return bc.a().g.a();
      if ("c".equalsIgnoreCase(str))
        return bc.a().g.c();
    }
    return -1;
  }

  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("a");
    if (str1 == null)
      com.google.android.gms.ads.internal.util.c.e("Action missing from an open GMSG.");
    com.google.android.gms.ads.internal.webview.c localc1;
    while (true)
    {
      return;
      if ((this.b != null) && (!this.b.a()))
      {
        this.b.a((String)paramMap.get("u"));
        return;
      }
      localc1 = paramb.l();
      if ("expand".equalsIgnoreCase(str1))
      {
        if (paramb.p())
        {
          com.google.android.gms.ads.internal.util.c.e("Cannot expand WebView that is already expanded.");
          return;
        }
        a(false);
        boolean bool5 = a(paramMap);
        int k = b(paramMap);
        if ((localc1.a.p()) && (!localc1.a.k().e));
        for (com.google.android.gms.ads.internal.client.a locala3 = null; ; locala3 = localc1.c)
        {
          localc1.a(new AdOverlayInfoParcel(locala3, localc1.d, localc1.k, localc1.a, bool5, k, localc1.a.o()));
          return;
        }
      }
      if ("webapp".equalsIgnoreCase(str1))
      {
        String str6 = (String)paramMap.get("u");
        a(false);
        if (str6 != null)
        {
          boolean bool3 = a(paramMap);
          int j = b(paramMap);
          boolean bool4 = localc1.a.p();
          com.google.android.gms.ads.internal.client.a locala2;
          Object localObject2;
          if ((bool4) && (!localc1.a.k().e))
          {
            locala2 = null;
            localObject2 = null;
            if (!bool4)
              break label344;
          }
          while (true)
          {
            localc1.a(new AdOverlayInfoParcel(locala2, (ak)localObject2, localc1.f, localc1.k, localc1.a, bool3, j, str6, localc1.a.o(), localc1.i));
            return;
            locala2 = localc1.c;
            break;
            label344: localObject2 = new h(localc1.a, localc1.d);
          }
        }
        boolean bool1 = a(paramMap);
        int i = b(paramMap);
        String str7 = (String)paramMap.get("html");
        String str8 = (String)paramMap.get("baseurl");
        boolean bool2 = localc1.a.p();
        com.google.android.gms.ads.internal.client.a locala1;
        Object localObject1;
        if ((bool2) && (!localc1.a.k().e))
        {
          locala1 = null;
          localObject1 = null;
          if (!bool2)
            break label513;
        }
        while (true)
        {
          localc1.a(new AdOverlayInfoParcel(locala1, (ak)localObject1, localc1.f, localc1.k, localc1.a, bool1, i, str7, str8, localc1.a.o(), localc1.i));
          return;
          locala1 = localc1.c;
          break;
          label513: localObject1 = new h(localc1.a, localc1.d);
        }
      }
      if (!"in_app_purchase".equalsIgnoreCase(str1))
        break;
      String str4 = (String)paramMap.get("product_id");
      String str5 = (String)paramMap.get("report_urls");
      if (this.a == null)
        continue;
      if ((str5 != null) && (!str5.isEmpty()))
      {
        String[] arrayOfString = str5.split(" ");
        this.a.a(str4, new ArrayList(Arrays.asList(arrayOfString)));
        return;
      }
      this.a.a(str4, new ArrayList());
      return;
    }
    if (("app".equalsIgnoreCase(str1)) && ("true".equalsIgnoreCase((String)paramMap.get("system_browser"))))
    {
      a(true);
      Context localContext = paramb.getContext();
      if (TextUtils.isEmpty((String)paramMap.get("u")))
      {
        com.google.android.gms.ads.internal.util.c.e("Destination url cannot be empty.");
        return;
      }
      com.google.android.gms.ads.internal.webview.c localc2 = paramb.l();
      Intent localIntent = new ah(paramb).a(localContext, paramMap);
      try
      {
        localc2.a(new AdLauncherIntentInfoParcel(localIntent));
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        com.google.android.gms.ads.internal.util.c.e(localActivityNotFoundException.getMessage());
        return;
      }
    }
    a(true);
    String str2 = (String)paramMap.get("u");
    if (!TextUtils.isEmpty(str2));
    for (String str3 = bc.a().e.a(paramb, str2); ; str3 = str2)
    {
      localc1.a(new AdLauncherIntentInfoParcel((String)paramMap.get("i"), str3, (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e")));
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ag
 * JD-Core Version:    0.6.0
 */