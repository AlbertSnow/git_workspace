package com.wandoujia.p4.campaign;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.wandoujia.account.a;
import com.wandoujia.jupiter.view.p;

final class c extends WebViewClient
{
  c(CampaignFragment paramCampaignFragment)
  {
  }

  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    this.a.c();
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    this.a.c();
    super.onPageFinished(paramWebView, paramString);
    if (paramString.contains("wandoujia.com"))
    {
      String str1 = CookieManager.getInstance().getCookie(paramString);
      if ((!TextUtils.isEmpty(str1)) && (str1.contains("wdj_auth")))
        for (String str2 : str1.split("; "))
        {
          if (!str2.contains("wdj_auth"))
            continue;
          a.b(str2.substring(9, str2.length()));
        }
      CookieSyncManager.getInstance().sync();
    }
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if ("http://www.wandoujia.com/?callback=finish".equals(paramString))
    {
      this.a.getActivity().finish();
      return;
    }
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if (!CampaignFragment.b(this.a))
    {
      paramWebView.loadUrl("file:///android_asset/empty.html");
      CampaignFragment.a(this.a, true);
    }
    p.a(this.a.getActivity(), new d(this), this.a.getResources().getString(2131625175)).a();
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.startsWith("wandoujia://"))
      this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
    do
      return true;
    while (paramString.startsWith("sinaweibo://"));
    if (paramString.startsWith("mailto:"))
    {
      Intent localIntent = new Intent("android.intent.action.SENDTO");
      localIntent.setData(Uri.parse(paramString));
      this.a.startActivity(localIntent);
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.c
 * JD-Core Version:    0.6.0
 */