package com.wandoujia.account.c;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.listener.d;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public final class a extends Dialog
{
  private static float[] a = { 20.0F, 60.0F };
  private static float[] b = { 40.0F, 60.0F };
  private final String c;
  private ProgressBar d;
  private WebView e;
  private d f;
  private LinearLayout g;
  private String h;
  private boolean i = false;

  static
  {
    new FrameLayout.LayoutParams(-1, -1);
  }

  public a(Context paramContext, String paramString, d paramd)
  {
    super(paramContext);
    this.c = paramString;
    this.f = paramd;
  }

  public a(Context paramContext, String paramString1, String paramString2, d paramd)
  {
    super(paramContext);
    this.h = paramString2;
    this.c = paramString1;
    this.i = true;
    this.f = paramd;
  }

  private String a()
  {
    if (this.c.equals("http://www.wandoujia.com/account/?source=p3#find"))
      return this.c;
    try
    {
      if (this.c.contains("%s"))
      {
        if (!TextUtils.isEmpty(this.h))
        {
          String str3 = this.c;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = ("?wdj_auth=" + URLEncoder.encode(this.h, "utf-8") + "&callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close?__auth__", "utf-8"));
          return String.format(str3, arrayOfObject2);
        }
        String str2 = this.c;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = ("&callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close?__auth__", "utf-8"));
        return String.format(str2, arrayOfObject1);
      }
      if (TextUtils.isEmpty(new URI(this.c).getQuery()))
      {
        if (!TextUtils.isEmpty(this.h))
          return this.c + "?wdj_auth=" + URLEncoder.encode(this.h, "utf-8") + "&callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close?__auth__", "utf-8");
        return this.c + "?callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close?__auth__", "utf-8");
      }
      if (!TextUtils.isEmpty(this.h))
        return this.c + "&wdj_auth=" + URLEncoder.encode(this.h, "utf-8") + "&callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close?__auth__", "utf-8");
      String str1 = this.c + "&callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close?__auth__", "utf-8");
      return str1;
    }
    catch (Exception localException)
    {
      return this.c;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      label357: break label357;
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    Display localDisplay = getWindow().getWindowManager().getDefaultDisplay();
    float f1 = getContext().getResources().getDisplayMetrics().density;
    if (getContext().getResources().getConfiguration().orientation == 2);
    for (float[] arrayOfFloat = a; ; arrayOfFloat = b)
    {
      requestWindowFeature(1);
      this.g = ((LinearLayout)LayoutInflater.from(getContext()).inflate(R.layout.account_sdk_webview, null));
      this.d = ((ProgressBar)this.g.findViewById(R.id.account_sdk_web_loading_progress));
      this.e = ((WebView)this.g.findViewById(R.id.account_sdk_web));
      this.e.setVerticalScrollBarEnabled(true);
      this.e.setHorizontalScrollBarEnabled(true);
      this.e.setWebViewClient(new b(this, 0));
      this.e.getSettings().setJavaScriptEnabled(true);
      this.e.getSettings().setBuiltInZoomControls(true);
      CookieSyncManager localCookieSyncManager = CookieSyncManager.createInstance(this.e.getContext());
      CookieManager localCookieManager = CookieManager.getInstance();
      CookieSyncManager.getInstance().startSync();
      CookieManager.getInstance().removeSessionCookie();
      CookieManager.getInstance().removeAllCookie();
      this.e.clearCache(true);
      this.e.clearHistory();
      localCookieManager.setAcceptCookie(true);
      if (!TextUtils.isEmpty(this.h))
        localCookieManager.setCookie("https://account.wandoujia.com", "wdj_auth=" + this.h + "; domain=.wandouja.com");
      localCookieSyncManager.sync();
      this.e.loadUrl(a());
      addContentView(this.g, new LinearLayout.LayoutParams(localDisplay.getWidth() - (int)(0.5F + f1 * arrayOfFloat[0]), localDisplay.getHeight() - (int)(0.5F + f1 * arrayOfFloat[1])));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.c.a
 * JD-Core Version:    0.6.0
 */