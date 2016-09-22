package com.google.android.gms.ads.internal.webview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;

@a
@TargetApi(11)
public class t extends WebChromeClient
{
  private final b a;

  public t(b paramb)
  {
    this.a = paramb;
  }

  private static Context a(WebView paramWebView)
  {
    Object localObject;
    if (!(paramWebView instanceof b))
      localObject = paramWebView.getContext();
    b localb;
    do
    {
      return localObject;
      localb = (b)paramWebView;
      localObject = localb.f();
    }
    while (localObject != null);
    return (Context)localb.getContext();
  }

  private static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    try
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
      localBuilder.setTitle(paramString1);
      if (paramBoolean)
      {
        LinearLayout localLinearLayout = new LinearLayout(paramContext);
        localLinearLayout.setOrientation(1);
        TextView localTextView = new TextView(paramContext);
        localTextView.setText(paramString2);
        EditText localEditText = new EditText(paramContext);
        localEditText.setText(paramString3);
        localLinearLayout.addView(localTextView);
        localLinearLayout.addView(localEditText);
        localBuilder.setView(localLinearLayout).setPositiveButton(17039370, new z(paramJsPromptResult, localEditText)).setNegativeButton(17039360, new y(paramJsPromptResult)).setOnCancelListener(new x(paramJsPromptResult)).create().show();
        return true;
      }
      localBuilder.setMessage(paramString2).setPositiveButton(17039370, new w(paramJsResult)).setNegativeButton(17039360, new v(paramJsResult)).setOnCancelListener(new u(paramJsResult)).create().show();
      return true;
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      c.c("Fail to display Dialog.", localBadTokenException);
    }
    return true;
  }

  protected final void a(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    ab localab = this.a.i();
    if (localab == null)
    {
      c.e("Could not get ad overlay when showing custom view.");
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    localab.e = new FrameLayout(localab.a);
    localab.e.setBackgroundColor(-16777216);
    localab.e.addView(paramView, -1, -1);
    localab.a.setContentView(localab.e);
    localab.j = true;
    localab.f = paramCustomViewCallback;
    localab.d = true;
    localab.a(paramInt);
  }

  public final void onCloseWindow(WebView paramWebView)
  {
    if (!(paramWebView instanceof b))
    {
      c.e("Tried to close a WebView that wasn't an AdWebView.");
      return;
    }
    ab localab = ((b)paramWebView).i();
    if (localab == null)
    {
      c.e("Tried to close an AdWebView not associated with an overlay.");
      return;
    }
    localab.a();
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str1 = String.valueOf(paramConsoleMessage.message());
    String str2 = String.valueOf(paramConsoleMessage.sourceId());
    int i = paramConsoleMessage.lineNumber();
    String str3 = 19 + String.valueOf(str1).length() + String.valueOf(str2).length() + "JS: " + str1 + " (" + str2 + ":" + i + ")";
    if (str3.contains("Application Cache"))
      return super.onConsoleMessage(paramConsoleMessage);
    switch (aa.a[paramConsoleMessage.messageLevel().ordinal()])
    {
    default:
      c.d(str3);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return super.onConsoleMessage(paramConsoleMessage);
      c.c(str3);
      continue;
      c.e(str3);
      continue;
      c.d(str3);
      continue;
      c.b(str3);
    }
  }

  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)paramMessage.obj;
    WebView localWebView = new WebView(paramWebView.getContext());
    localWebView.setWebViewClient(this.a.l());
    localWebViewTransport.setWebView(localWebView);
    paramMessage.sendToTarget();
    return true;
  }

  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l = 5242880L - paramLong3;
    if (l <= 0L)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    if (paramLong1 == 0L)
    {
      if ((paramLong2 <= l) && (paramLong2 <= 1048576L));
      while (true)
      {
        paramQuotaUpdater.updateQuota(paramLong2);
        return;
        paramLong2 = 0L;
      }
    }
    if (paramLong2 == 0L)
      paramLong1 = Math.min(paramLong1 + Math.min(131072L, l), 1048576L);
    while (true)
    {
      paramLong2 = paramLong1;
      break;
      if (paramLong2 > Math.min(1048576L - paramLong1, l))
        continue;
      paramLong1 += paramLong2;
    }
  }

  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    if (paramCallback != null)
      if ((!com.google.android.gms.ads.internal.util.y.a(this.a.getContext().getPackageManager(), this.a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) && (!com.google.android.gms.ads.internal.util.y.a(this.a.getContext().getPackageManager(), this.a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")))
        break label98;
    label98: for (boolean bool = true; ; bool = false)
    {
      paramCallback.invoke(paramString, bool, true);
      return;
    }
  }

  public final void onHideCustomView()
  {
    ab localab = this.a.i();
    if (localab == null)
    {
      c.e("Could not get ad overlay when hiding custom view.");
      return;
    }
    localab.b();
  }

  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }

  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }

  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(a(paramWebView), paramString1, paramString2, null, paramJsResult, null, false);
  }

  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return a(a(paramWebView), paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }

  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l1 = 5242880L - paramLong2;
    long l2 = 131072L + paramLong1;
    if (l1 < l2)
    {
      paramQuotaUpdater.updateQuota(0L);
      return;
    }
    paramQuotaUpdater.updateQuota(l2);
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    a(paramView, -1, paramCustomViewCallback);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.t
 * JD-Core Version:    0.6.0
 */