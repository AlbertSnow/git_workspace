package com.tencent.open;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.tencent.open.a.f;
import com.tencent.open.utils.k;
import com.tencent.open.utils.o;
import com.tencent.tauth.d;
import java.lang.ref.WeakReference;

final class c extends WebViewClient
{
  private c(a parama)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    a.c(this.a).setVisibility(0);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    f.a("openSDK_LOG.TDialog", "Webview loading URL: " + paramString);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    a.b(this.a).a(new d(paramInt, paramString1));
    if ((a.a(this.a) != null) && (a.a(this.a).get() != null))
      Toast.makeText((Context)a.a(this.a).get(), "网络连接异常或系统错误", 0).show();
    this.a.dismiss();
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    f.a("openSDK_LOG.TDialog", "Redirect URL: " + paramString);
    if (paramString.startsWith(k.a().a((Context)a.a(this.a).get(), "auth://tauth.qq.com/")))
    {
      a.b(this.a).a(o.b(paramString));
      if (this.a.isShowing())
        this.a.dismiss();
      return true;
    }
    if (paramString.startsWith("auth://cancel"))
    {
      a.b(this.a);
      if (this.a.isShowing())
        this.a.dismiss();
      return true;
    }
    if (paramString.startsWith("auth://close"))
    {
      if (this.a.isShowing())
        this.a.dismiss();
      return true;
    }
    if (paramString.startsWith("download://"))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(paramString.substring(11))));
      localIntent.addFlags(268435456);
      if ((a.a(this.a) != null) && (a.a(this.a).get() != null))
        ((Context)a.a(this.a).get()).startActivity(localIntent);
      return true;
    }
    return paramString.startsWith("auth://progress");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.c
 * JD-Core Version:    0.6.0
 */