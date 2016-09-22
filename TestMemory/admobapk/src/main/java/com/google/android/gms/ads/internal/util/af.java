package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.webview.ab;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.ads.internal.webview.c;
import com.google.android.gms.ads.internal.webview.t;
import java.util.Set;

@TargetApi(11)
public class af extends ae
{
  public final c a(b paramb, boolean paramBoolean)
  {
    return new ab(paramb, paramBoolean);
  }

  public final Set a(Uri paramUri)
  {
    return paramUri.getQueryParameterNames();
  }

  public final boolean a(DownloadManager.Request paramRequest)
  {
    paramRequest.allowScanningByMediaScanner();
    paramRequest.setNotificationVisibility(1);
    return true;
  }

  public boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    super.a(paramContext, paramWebSettings);
    return ((Boolean)bj.a(new ag(this, paramContext, paramWebSettings))).booleanValue();
  }

  public final boolean a(Window paramWindow)
  {
    paramWindow.setFlags(16777216, 16777216);
    return true;
  }

  public final boolean b(View paramView)
  {
    paramView.setLayerType(0, null);
    return true;
  }

  public WebChromeClient c(b paramb)
  {
    return new t(paramb);
  }

  public final boolean c(View paramView)
  {
    paramView.setLayerType(1, null);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.af
 * JD-Core Version:    0.6.0
 */