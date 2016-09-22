package com.wandoujia.base.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NonLeakingWebView$NonLeakingWebViewClient extends WebViewClient
{
  protected NonLeakingWebView$NonLeakingWebViewClient(NonLeakingWebView paramNonLeakingWebView)
  {
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (this.this$0.shouldJumpToBrowser(paramString));
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      localIntent.addFlags(268435456);
      this.this$0.getContext().startActivity(localIntent);
      label43: return true;
      return false;
    }
    catch (RuntimeException localRuntimeException)
    {
      break label43;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      break label43;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.view.NonLeakingWebView.NonLeakingWebViewClient
 * JD-Core Version:    0.6.0
 */