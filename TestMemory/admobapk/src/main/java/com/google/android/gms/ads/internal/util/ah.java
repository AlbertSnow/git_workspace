package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.WebChromeClient;
import com.google.android.gms.ads.internal.webview.ac;
import com.google.android.gms.ads.internal.webview.b;

@TargetApi(14)
public class ah extends af
{
  public final String a(SslError paramSslError)
  {
    return paramSslError.getUrl();
  }

  public final WebChromeClient c(b paramb)
  {
    return new ac(paramb);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.ah
 * JD-Core Version:    0.6.0
 */