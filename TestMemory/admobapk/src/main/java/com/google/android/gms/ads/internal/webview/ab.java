package com.google.android.gms.ads.internal.webview;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.av;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.g;
import com.google.android.gms.ads.internal.util.y;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@a
@TargetApi(11)
public final class ab extends c
{
  public ab(b paramb, boolean paramBoolean)
  {
    super(paramb, paramBoolean);
  }

  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    if (this.o != null)
      this.o.b(paramString);
    try
    {
      if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName()))
        return super.shouldInterceptRequest(paramWebView, paramString);
      if (!(paramWebView instanceof b))
      {
        com.google.android.gms.ads.internal.util.c.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      localb = (b)paramWebView;
      c localc = localb.l();
      synchronized (localc.b)
      {
        localc.h = false;
        localc.j = true;
        y.a(new e(localc));
        if (localb.k().e)
        {
          str3 = (String)com.google.android.gms.ads.internal.config.m.u.a();
          com.google.android.gms.ads.internal.util.c.a(24 + String.valueOf(str3).length() + "shouldInterceptRequest(" + str3 + ")");
          Context localContext = localb.getContext();
          String str4 = this.a.o().b;
          HashMap localHashMap = new HashMap();
          localHashMap.put("User-Agent", bc.a().e.a(localContext, str4));
          localHashMap.put("Cache-Control", "max-stale=3600");
          str5 = (String)new av(localContext).a(0, str3, localHashMap, null).get(60L, TimeUnit.SECONDS);
          if (str5 != null)
            break label377;
          return null;
        }
      }
    }
    catch (IOException localIOException)
    {
      b localb;
      String str3;
      String str5;
      String str1 = String.valueOf(localIOException.getMessage());
      if (str1.length() != 0);
      for (String str2 = "Could not fetch MRAID JS. ".concat(str1); ; str2 = new String("Could not fetch MRAID JS. "))
      {
        com.google.android.gms.ads.internal.util.c.e(str2);
        return super.shouldInterceptRequest(paramWebView, paramString);
        if (localb.p())
        {
          str3 = (String)com.google.android.gms.ads.internal.config.m.t.a();
          break;
        }
        str3 = (String)com.google.android.gms.ads.internal.config.m.s.a();
        break;
        WebResourceResponse localWebResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str5.getBytes("UTF-8")));
        return localWebResourceResponse;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      break label301;
    }
    catch (ExecutionException localExecutionException)
    {
      break label301;
    }
    catch (TimeoutException localTimeoutException)
    {
      label301: label377: break label301;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.ab
 * JD-Core Version:    0.6.0
 */