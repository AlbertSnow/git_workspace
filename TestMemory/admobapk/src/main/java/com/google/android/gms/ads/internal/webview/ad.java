package com.google.android.gms.ads.internal.webview;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import anu;
import com.google.android.gms.ads.internal.report.client.a;
import java.net.URI;
import java.net.URISyntaxException;

@a
public final class ad extends WebViewClient
{
  private final String a;
  private boolean b;
  private final b c;
  private final com.google.android.gms.ads.internal.renderer.c d;

  public ad(com.google.android.gms.ads.internal.renderer.c paramc, b paramb, String paramString)
  {
    this.a = b(paramString);
    this.b = false;
    this.c = paramb;
    this.d = paramc;
  }

  private boolean a(String paramString)
  {
    String str1 = b(paramString);
    if (TextUtils.isEmpty(str1));
    while (true)
    {
      return false;
      try
      {
        URI localURI1 = new URI(str1);
        if ("passback".equals(localURI1.getScheme()))
        {
          com.google.android.gms.ads.internal.util.c.b("Passback received");
          this.d.a();
          return true;
        }
        if (TextUtils.isEmpty(this.a))
          continue;
        URI localURI2 = new URI(this.a);
        String str2 = localURI2.getHost();
        String str3 = localURI1.getHost();
        String str4 = localURI2.getPath();
        String str5 = localURI1.getPath();
        if ((!anu.a(str2, str3)) || (!anu.a(str4, str5)))
          continue;
        com.google.android.gms.ads.internal.util.c.b("Passback received");
        this.d.a();
        return true;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        com.google.android.gms.ads.internal.util.c.c(localURISyntaxException.getMessage());
      }
    }
    return false;
  }

  private static String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return paramString;
      try
      {
        if (!paramString.endsWith("/"))
          continue;
        String str = paramString.substring(0, -1 + paramString.length());
        return str;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        com.google.android.gms.ads.internal.util.c.c(localIndexOutOfBoundsException.getMessage());
      }
    }
    return paramString;
  }

  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0);
    for (String str2 = "JavascriptAdWebViewClient::onLoadResource: ".concat(str1); ; str2 = new String("JavascriptAdWebViewClient::onLoadResource: "))
    {
      com.google.android.gms.ads.internal.util.c.b(str2);
      if (!a(paramString))
        this.c.l().onLoadResource(this.c.a(), paramString);
      return;
    }
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0);
    for (String str2 = "JavascriptAdWebViewClient::onPageFinished: ".concat(str1); ; str2 = new String("JavascriptAdWebViewClient::onPageFinished: "))
    {
      com.google.android.gms.ads.internal.util.c.b(str2);
      if (!this.b)
      {
        com.google.android.gms.ads.internal.renderer.c localc = this.d;
        localc.a.postDelayed(localc, localc.b);
        this.b = true;
      }
      return;
    }
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0);
    for (String str2 = "JavascriptAdWebViewClient::shouldOverrideUrlLoading: ".concat(str1); ; str2 = new String("JavascriptAdWebViewClient::shouldOverrideUrlLoading: "))
    {
      com.google.android.gms.ads.internal.util.c.b(str2);
      if (!a(paramString))
        break;
      com.google.android.gms.ads.internal.util.c.b("shouldOverrideUrlLoading: received passback url");
      return true;
    }
    return this.c.l().shouldOverrideUrlLoading(this.c.a(), paramString);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.ad
 * JD-Core Version:    0.6.0
 */