package com.tencent.open;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class a extends h
{
  private static FrameLayout.LayoutParams c = new FrameLayout.LayoutParams(-1, -1);
  private static WeakReference<ProgressDialog> e;
  private static Toast j = null;
  private WeakReference<Context> d;
  private String f;
  private b g;
  private FrameLayout h;
  private com.tencent.open.c.b i;

  public a(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    this.d = new WeakReference(paramContext);
    this.f = paramString2;
    this.g = new b(paramContext, paramString1, paramString2);
    new e(this, this.g, paramContext.getMainLooper());
  }

  protected final void a(String paramString)
  {
    com.tencent.open.a.f.b("openSDK_LOG.TDialog", "--onConsoleMessage--");
    try
    {
      f localf = this.a;
      com.tencent.open.c.b localb = this.i;
      com.tencent.open.a.f.a("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + paramString);
      if ((paramString != null) && (Uri.parse(paramString).getScheme().equals("jsbridge")))
      {
        ArrayList localArrayList = new ArrayList(Arrays.asList((paramString + "/#").split("/")));
        if (localArrayList.size() >= 6)
        {
          String str1 = (String)localArrayList.get(2);
          String str2 = (String)localArrayList.get(3);
          List localList = localArrayList.subList(4, -1 + localArrayList.size());
          g localg = new g(localb);
          localb.getUrl();
          localf.a(str1, str2, localList, localg);
        }
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void onBackPressed()
  {
    super.onBackPressed();
  }

  protected final void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    new TextView((Context)this.d.get()).setText("test");
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    this.i = new com.tencent.open.c.b((Context)this.d.get());
    this.i.setLayoutParams(localLayoutParams);
    this.h = new FrameLayout((Context)this.d.get());
    localLayoutParams.gravity = 17;
    this.h.setLayoutParams(localLayoutParams);
    this.h.addView(this.i);
    setContentView(this.h);
    this.i.setVerticalScrollBarEnabled(false);
    this.i.setHorizontalScrollBarEnabled(false);
    this.i.setWebViewClient(new c(this, 0));
    this.i.setWebChromeClient(this.b);
    this.i.clearFormData();
    WebSettings localWebSettings = this.i.getSettings();
    if (localWebSettings != null)
    {
      localWebSettings.setSavePassword(false);
      localWebSettings.setSaveFormData(false);
      localWebSettings.setCacheMode(-1);
      localWebSettings.setNeedInitialFocus(false);
      localWebSettings.setBuiltInZoomControls(true);
      localWebSettings.setSupportZoom(true);
      localWebSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
      localWebSettings.setJavaScriptEnabled(true);
      if ((this.d != null) && (this.d.get() != null))
      {
        localWebSettings.setDatabaseEnabled(true);
        localWebSettings.setDatabasePath(((Context)this.d.get()).getApplicationContext().getDir("databases", 0).getPath());
      }
      localWebSettings.setDomStorageEnabled(true);
      this.a.a(new d(0), "sdk_js_if");
      this.i.loadUrl(this.f);
      this.i.setLayoutParams(c);
      this.i.setVisibility(4);
      this.i.getSettings().setSavePassword(false);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.a
 * JD-Core Version:    0.6.0
 */