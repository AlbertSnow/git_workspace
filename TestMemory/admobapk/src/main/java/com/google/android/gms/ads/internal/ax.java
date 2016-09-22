package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.v;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.util.c;

final class ax extends WebViewClient
{
  ax(aw paramaw)
  {
  }

  public final void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    if (this.a.e != null);
    try
    {
      this.a.e.a(0);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      c.c("Could not call AdListener.onAdFailedToLoad().", localRemoteException);
    }
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.startsWith(this.a.f()))
      return false;
    d locald1 = m.aG;
    if (paramString.startsWith((String)bc.a().n.a(locald1)))
    {
      if (this.a.e != null);
      try
      {
        this.a.e.a(3);
        this.a.a(0);
        return true;
      }
      catch (RemoteException localRemoteException4)
      {
        while (true)
          c.c("Could not call AdListener.onAdFailedToLoad().", localRemoteException4);
      }
    }
    d locald2 = m.aH;
    if (paramString.startsWith((String)bc.a().n.a(locald2)))
    {
      if (this.a.e != null);
      try
      {
        this.a.e.a(0);
        this.a.a(0);
        return true;
      }
      catch (RemoteException localRemoteException3)
      {
        while (true)
          c.c("Could not call AdListener.onAdFailedToLoad().", localRemoteException3);
      }
    }
    d locald3 = m.aI;
    if (paramString.startsWith((String)bc.a().n.a(locald3)))
    {
      if (this.a.e != null);
      try
      {
        this.a.e.c();
        int i = this.a.b(paramString);
        this.a.a(i);
        return true;
      }
      catch (RemoteException localRemoteException2)
      {
        while (true)
          c.c("Could not call AdListener.onAdLoaded().", localRemoteException2);
      }
    }
    if (paramString.startsWith("gmsg://"))
      return true;
    if (this.a.e != null);
    try
    {
      this.a.e.b();
      String str = this.a.c(paramString);
      aw localaw = this.a;
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(Uri.parse(str));
      localaw.c.startActivity(localIntent);
      return true;
    }
    catch (RemoteException localRemoteException1)
    {
      while (true)
        c.c("Could not call AdListener.onAdLeftApplication().", localRemoteException1);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ax
 * JD-Core Version:    0.6.0
 */