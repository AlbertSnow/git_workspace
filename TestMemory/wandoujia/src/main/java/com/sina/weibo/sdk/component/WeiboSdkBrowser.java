package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.sina.weibo.sdk.component.view.LoadingBar;

public class WeiboSdkBrowser extends Activity
  implements c
{
  private static final String a = WeiboSdkBrowser.class.getName();
  private String b;
  private String c;
  private boolean d;
  private String e;
  private boolean f;
  private TextView g;
  private TextView h;
  private WebView i;
  private LoadingBar j;
  private LinearLayout k;
  private Button l;
  private d m;
  private l n;

  public static void a(Activity paramActivity, String paramString1, String paramString2)
  {
    paramActivity.getApplicationContext();
    h localh = h.a();
    if (!TextUtils.isEmpty(paramString1))
    {
      localh.b(paramString1);
      paramActivity.finish();
    }
    if (!TextUtils.isEmpty(paramString2))
    {
      localh.d(paramString2);
      paramActivity.finish();
    }
  }

  private static boolean a(d paramd)
  {
    return paramd.f() == BrowserLauncher.SHARE;
  }

  private void c(String paramString)
  {
    this.i.loadUrl(paramString);
  }

  private void d()
  {
    String str = "";
    if (!TextUtils.isEmpty(this.c))
      str = this.c;
    while (true)
    {
      this.h.setText(str);
      return;
      if (TextUtils.isEmpty(this.b))
        continue;
      str = this.b;
    }
  }

  private static boolean d(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
      return false;
    while (!"sinaweibo".equalsIgnoreCase(Uri.parse(paramString).getAuthority()));
    return true;
  }

  private void e()
  {
    this.k.setVisibility(0);
    this.i.setVisibility(8);
  }

  public final void a()
  {
    if (this.f)
    {
      e();
      return;
    }
    this.f = false;
    this.k.setVisibility(8);
    this.i.setVisibility(0);
  }

  public final void a(int paramInt, String paramString1, String paramString2)
  {
    new StringBuilder("onReceivedError: errorCode = ").append(paramInt).append(", description = ").append(paramString1).append(", failingUrl = ").append(paramString2);
    if (!paramString2.startsWith("sinaweibo"))
    {
      this.f = true;
      e();
    }
  }

  public final void a(String paramString)
  {
    this.e = paramString;
    if (!d(paramString))
      this.c = "";
  }

  protected final void b()
  {
    if (this.d)
    {
      this.h.setText(com.sina.weibo.sdk.a.g.a("Loading....", "加载中....", "載入中...."));
      this.j.setVisibility(0);
      return;
    }
    d();
    this.j.setVisibility(8);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    BrowserLauncher localBrowserLauncher = (BrowserLauncher)localBundle.getSerializable("key_launcher");
    Object localObject;
    if (localBrowserLauncher == BrowserLauncher.AUTH)
    {
      localObject = new a(this);
      ((a)localObject).c(localBundle);
      this.n = new b(this, (a)localObject);
      this.n.a(this);
    }
    while (true)
    {
      this.m = ((d)localObject);
      int i1;
      if (this.m == null)
        i1 = 0;
      while (true)
      {
        if (i1 != 0)
          break label256;
        finish();
        return;
        if (localBrowserLauncher == BrowserLauncher.SHARE)
        {
          localObject = new e(this);
          ((e)localObject).c(localBundle);
          g localg1 = new g(this, (e)localObject);
          localg1.a(this);
          this.n = localg1;
          break;
        }
        if (localBrowserLauncher != BrowserLauncher.WIDGET)
          break label1376;
        localObject = new m(this);
        ((m)localObject).c(localBundle);
        o localo = new o(this, (m)localObject);
        localo.a(this);
        this.n = localo;
        break;
        this.e = this.m.e();
        if (TextUtils.isEmpty(this.e))
        {
          i1 = 0;
          continue;
        }
        new StringBuilder("LOAD URL : ").append(this.e);
        this.b = this.m.g();
        i1 = 1;
      }
      label256: RelativeLayout localRelativeLayout1 = new RelativeLayout(this);
      localRelativeLayout1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localRelativeLayout1.setBackgroundColor(-1);
      LinearLayout localLinearLayout = new LinearLayout(this);
      localLinearLayout.setId(1);
      localLinearLayout.setOrientation(1);
      localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      RelativeLayout localRelativeLayout2 = new RelativeLayout(this);
      localRelativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, com.sina.weibo.sdk.a.g.a(this, 45)));
      localRelativeLayout2.setBackgroundDrawable(com.sina.weibo.sdk.a.g.b(this, "weibosdk_navigationbar_background.9.png"));
      this.g = new TextView(this);
      this.g.setClickable(true);
      this.g.setTextSize(2, 17.0F);
      this.g.setTextColor(com.sina.weibo.sdk.a.g.a());
      this.g.setText(com.sina.weibo.sdk.a.g.a("Close", "关闭", "关闭"));
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams1.addRule(5);
      localLayoutParams1.addRule(15);
      localLayoutParams1.leftMargin = com.sina.weibo.sdk.a.g.a(this, 10);
      localLayoutParams1.rightMargin = com.sina.weibo.sdk.a.g.a(this, 10);
      this.g.setLayoutParams(localLayoutParams1);
      localRelativeLayout2.addView(this.g);
      this.h = new TextView(this);
      this.h.setTextSize(2, 18.0F);
      this.h.setTextColor(-11382190);
      this.h.setEllipsize(TextUtils.TruncateAt.END);
      this.h.setSingleLine(true);
      this.h.setGravity(17);
      this.h.setMaxWidth(com.sina.weibo.sdk.a.g.a(this, 160));
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams2.addRule(13);
      this.h.setLayoutParams(localLayoutParams2);
      localRelativeLayout2.addView(this.h);
      TextView localTextView1 = new TextView(this);
      localTextView1.setLayoutParams(new LinearLayout.LayoutParams(-1, com.sina.weibo.sdk.a.g.a(this, 2)));
      localTextView1.setBackgroundDrawable(com.sina.weibo.sdk.a.g.b(this, "weibosdk_common_shadow_top.9.png"));
      this.j = new LoadingBar(this);
      this.j.setBackgroundColor(0);
      this.j.a(0);
      LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-1, com.sina.weibo.sdk.a.g.a(this, 3));
      this.j.setLayoutParams(localLayoutParams3);
      localLinearLayout.addView(localRelativeLayout2);
      localLinearLayout.addView(localTextView1);
      localLinearLayout.addView(this.j);
      this.i = new WebView(this);
      this.i.setBackgroundColor(-1);
      RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams4.addRule(3, 1);
      this.i.setLayoutParams(localLayoutParams4);
      this.k = new LinearLayout(this);
      this.k.setVisibility(8);
      this.k.setOrientation(1);
      this.k.setGravity(17);
      RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams5.addRule(3, 1);
      this.k.setLayoutParams(localLayoutParams5);
      ImageView localImageView = new ImageView(this);
      localImageView.setImageDrawable(com.sina.weibo.sdk.a.g.a(this, "weibosdk_empty_failed.png"));
      LinearLayout.LayoutParams localLayoutParams6 = new LinearLayout.LayoutParams(-2, -2);
      int i2 = com.sina.weibo.sdk.a.g.a(this, 8);
      localLayoutParams6.bottomMargin = i2;
      localLayoutParams6.rightMargin = i2;
      localLayoutParams6.topMargin = i2;
      localLayoutParams6.leftMargin = i2;
      localImageView.setLayoutParams(localLayoutParams6);
      this.k.addView(localImageView);
      TextView localTextView2 = new TextView(this);
      localTextView2.setGravity(1);
      localTextView2.setTextColor(-4342339);
      localTextView2.setTextSize(2, 14.0F);
      localTextView2.setText(com.sina.weibo.sdk.a.g.a("A network error occurs, please tap the button to reload", "网络出错啦，请点击按钮重新加载", "網路出錯啦，請點擊按鈕重新載入"));
      localTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
      this.k.addView(localTextView2);
      this.l = new Button(this);
      this.l.setGravity(17);
      this.l.setTextColor(-8882056);
      this.l.setTextSize(2, 16.0F);
      this.l.setText(com.sina.weibo.sdk.a.g.a("channel_data_error", "重新加载", "重新載入"));
      this.l.setBackgroundDrawable(com.sina.weibo.sdk.a.g.a(this, "weibosdk_common_button_alpha.9.png", "weibosdk_common_button_alpha_highlighted.9.png"));
      LinearLayout.LayoutParams localLayoutParams7 = new LinearLayout.LayoutParams(com.sina.weibo.sdk.a.g.a(this, 142), com.sina.weibo.sdk.a.g.a(this, 46));
      localLayoutParams7.topMargin = com.sina.weibo.sdk.a.g.a(this, 10);
      this.l.setLayoutParams(localLayoutParams7);
      this.l.setOnClickListener(new k(this));
      this.k.addView(this.l);
      localRelativeLayout1.addView(localLinearLayout);
      localRelativeLayout1.addView(this.i);
      localRelativeLayout1.addView(this.k);
      setContentView(localRelativeLayout1);
      this.h.setText(this.b);
      this.g.setOnClickListener(new j(this));
      this.i.getSettings().setJavaScriptEnabled(true);
      if (a(this.m))
        this.i.getSettings().setUserAgentString(android.support.v4.app.b.r());
      this.i.getSettings().setSavePassword(false);
      this.i.setWebViewClient(this.n);
      this.i.setWebChromeClient(new WeiboSdkBrowser.WeiboChromeClient(this, null));
      this.i.requestFocus();
      this.i.setScrollBarStyle(0);
      if (a(this.m))
      {
        e locale = (e)this.m;
        if (locale.a())
        {
          com.sina.weibo.sdk.net.g localg = locale.a(new com.sina.weibo.sdk.net.g(locale.b()));
          new com.sina.weibo.sdk.net.a(this).a("http://service.weibo.com/share/mobilesdk_uppic.php", localg, "POST", new i(this, locale));
          return;
        }
        c(this.e);
        return;
      }
      c(this.e);
      return;
      label1376: localObject = null;
    }
  }

  protected void onDestroy()
  {
    android.support.v4.app.b.g(this);
    super.onDestroy();
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      this.m.a(this);
      finish();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.WeiboSdkBrowser
 * JD-Core Version:    0.6.0
 */