package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzhb
public class zzgb
  implements zzfz
{
  private final Context mContext;
  final Set<WebView> zzFr = Collections.synchronizedSet(new HashSet());

  public zzgb(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public void zza(String paramString1, String paramString2, String paramString3)
  {
    zzin.zzaI("Fetching assets for the given html");
    zzir.zzMc.post(new Runnable(paramString2, paramString3)
    {
      public void run()
      {
        WebView localWebView = zzgb.this.zzfR();
        1 local1 = new WebViewClient(localWebView)
        {
          public void onPageFinished(WebView view, String url)
          {
            zzin.zzaI("Loading assets have finished");
            zzgb.this.zzFr.remove(this.zztj);
          }

          public void onReceivedError(WebView view, int errorCode, String description, String failingUrl)
          {
            zzin.zzaK("Loading assets have failed.");
            zzgb.this.zzFr.remove(this.zztj);
          }
        };
        localWebView.setWebViewClient(local1);
        zzgb.this.zzFr.add(localWebView);
        localWebView.loadDataWithBaseURL(this.zzFs, this.zzFt, "text/html", "UTF-8", null);
        zzin.zzaI("Fetching assets finished.");
      }
    });
  }

  public WebView zzfR()
  {
    WebView localWebView = new WebView(this.mContext);
    localWebView.getSettings().setJavaScriptEnabled(true);
    return localWebView;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgb
 * JD-Core Version:    0.6.0
 */