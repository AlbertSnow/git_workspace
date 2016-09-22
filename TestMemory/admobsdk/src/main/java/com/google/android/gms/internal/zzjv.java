package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzr;

@TargetApi(11)
@zzhb
public class zzjv extends WebChromeClient
{
  private final zzjp zzpD;

  protected boolean zza(Context paramContext, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    try
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
      localBuilder.setTitle(paramString1);
      if (paramBoolean)
        zza(paramContext, localBuilder, paramString2, paramString3, paramJsPromptResult);
      else
        zza(localBuilder, paramString2, paramJsResult);
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      zzin.zzd("Fail to display Dialog.", localBadTokenException);
    }
    return true;
  }

  private static void zza(AlertDialog.Builder paramBuilder, String paramString, JsResult paramJsResult)
  {
    paramBuilder.setMessage(paramString).setPositiveButton(17039370, new DialogInterface.OnClickListener(paramJsResult)
    {
      public void onClick(DialogInterface dialog, int which)
      {
        this.zzOh.confirm();
      }
    }).setNegativeButton(17039360, new DialogInterface.OnClickListener(paramJsResult)
    {
      public void onClick(DialogInterface dialog, int which)
      {
        this.zzOh.cancel();
      }
    }).setOnCancelListener(new DialogInterface.OnCancelListener(paramJsResult)
    {
      public void onCancel(DialogInterface dialog)
      {
        this.zzOh.cancel();
      }
    }).create().show();
  }

  private static void zza(Context paramContext, AlertDialog.Builder paramBuilder, String paramString1, String paramString2, JsPromptResult paramJsPromptResult)
  {
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(paramString1);
    EditText localEditText = new EditText(paramContext);
    localEditText.setText(paramString2);
    localLinearLayout.addView(localTextView);
    localLinearLayout.addView(localEditText);
    paramBuilder.setView(localLinearLayout).setPositiveButton(17039370, new DialogInterface.OnClickListener(paramJsPromptResult, localEditText)
    {
      public void onClick(DialogInterface dialog, int which)
      {
        this.zzOi.confirm(this.zzOj.getText().toString());
      }
    }).setNegativeButton(17039360, new DialogInterface.OnClickListener(paramJsPromptResult)
    {
      public void onClick(DialogInterface dialog, int which)
      {
        this.zzOi.cancel();
      }
    }).setOnCancelListener(new DialogInterface.OnCancelListener(paramJsPromptResult)
    {
      public void onCancel(DialogInterface dialog)
      {
        this.zzOi.cancel();
      }
    }).create().show();
  }

  public zzjv(zzjp paramzzjp)
  {
    this.zzpD = paramzzjp;
  }

  public final boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)resultMsg.obj;
    WebView localWebView = new WebView(view.getContext());
    localWebView.setWebViewClient(this.zzpD.zzhU());
    localWebViewTransport.setWebView(localWebView);
    resultMsg.sendToTarget();
    return true;
  }

  public final void onCloseWindow(WebView webView)
  {
    if (!(webView instanceof zzjp))
    {
      zzin.zzaK("Tried to close a WebView that wasn't an AdWebView.");
      return;
    }
    zzd localzzd = ((zzjp)webView).zzhS();
    if (localzzd == null)
    {
      zzin.zzaK("Tried to close an AdWebView not associated with an overlay.");
      return;
    }
    localzzd.close();
  }

  public final boolean onConsoleMessage(ConsoleMessage consoleMessage)
  {
    String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
    if (str.contains("Application Cache"))
      return super.onConsoleMessage(consoleMessage);
    switch (7.zzOk[consoleMessage.messageLevel().ordinal()])
    {
    case 1:
      zzin.e(str);
      break;
    case 2:
      zzin.zzaK(str);
      break;
    case 3:
    case 4:
      zzin.zzaJ(str);
      break;
    case 5:
      zzin.zzaI(str);
      break;
    default:
      zzin.zzaJ(str);
    }
    return super.onConsoleMessage(consoleMessage);
  }

  public final void onExceededDatabaseQuota(String url, String databaseIdentifier, long currentQuota, long estimatedSize, long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater)
  {
    long l1 = 5242880L - totalUsedQuota;
    if (l1 <= 0L)
    {
      quotaUpdater.updateQuota(currentQuota);
      return;
    }
    long l2;
    if (currentQuota == 0L)
    {
      l2 = (estimatedSize <= l1) && (estimatedSize <= 1048576L) ? estimatedSize : 0L;
    }
    else
    {
      long l3;
      if (estimatedSize == 0L)
      {
        l3 = Math.min(131072L, l1);
        l2 = Math.min(currentQuota + l3, 1048576L);
      }
      else
      {
        l3 = Math.min(1048576L - currentQuota, l1);
        l2 = estimatedSize <= l3 ? currentQuota + estimatedSize : currentQuota;
      }
    }
    quotaUpdater.updateQuota(l2);
  }

  public final void onHideCustomView()
  {
    zzd localzzd = this.zzpD.zzhS();
    if (localzzd == null)
    {
      zzin.zzaK("Could not get ad overlay when hiding custom view.");
      return;
    }
    localzzd.zzfl();
  }

  private final Context zza(WebView paramWebView)
  {
    if (!(paramWebView instanceof zzjp))
      return paramWebView.getContext();
    zzjp localzzjp = (zzjp)paramWebView;
    Activity localActivity = localzzjp.zzhP();
    return localActivity != null ? localActivity : localzzjp.getContext();
  }

  public final boolean onJsAlert(WebView webView, String url, String message, JsResult result)
  {
    return zza(zza(webView), url, message, null, result, null, false);
  }

  public final boolean onJsBeforeUnload(WebView webView, String url, String message, JsResult result)
  {
    return zza(zza(webView), url, message, null, result, null, false);
  }

  public final boolean onJsConfirm(WebView webView, String url, String message, JsResult result)
  {
    return zza(zza(webView), url, message, null, result, null, false);
  }

  public final boolean onJsPrompt(WebView webView, String url, String message, String defaultValue, JsPromptResult result)
  {
    return zza(zza(webView), url, message, defaultValue, null, result, true);
  }

  public final void onReachedMaxAppCacheSize(long spaceNeeded, long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater)
  {
    long l1 = 5242880L - totalUsedQuota;
    long l2 = spaceNeeded + 131072L;
    if (l1 < l2)
      quotaUpdater.updateQuota(0L);
    else
      quotaUpdater.updateQuota(l2);
  }

  public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback)
  {
    zza(view, -1, customViewCallback);
  }

  public final void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback)
  {
    if (callback != null)
      callback.invoke(origin, zziv(), true);
  }

  private final boolean zziv()
  {
    return (zzr.zzbC().zza(this.zzpD.getContext().getPackageManager(), this.zzpD.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) || (zzr.zzbC().zza(this.zzpD.getContext().getPackageManager(), this.zzpD.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION"));
  }

  protected final void zza(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    zzd localzzd = this.zzpD.zzhS();
    if (localzzd == null)
    {
      zzin.zzaK("Could not get ad overlay when showing custom view.");
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    localzzd.zza(paramView, paramCustomViewCallback);
    localzzd.setRequestedOrientation(paramInt);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjv
 * JD-Core Version:    0.6.0
 */