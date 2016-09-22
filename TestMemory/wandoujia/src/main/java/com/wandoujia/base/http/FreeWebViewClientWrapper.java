package com.wandoujia.base.http;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.FreeHttpUtils;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class FreeWebViewClientWrapper extends WebViewClient
{
  private final String TAG = FreeWebViewClientWrapper.class.getName();
  private WebViewClient delegate;
  private String originHostName;

  private String buildFreeUrl(String paramString)
  {
    if (FreeHttpUtils.isProxyUrl(paramString))
      return paramString;
    if (("vip.wandoujia.com".equalsIgnoreCase(URI.create(paramString).getHost())) && (!FreeHttpUtils.isProxyUrl(paramString)))
      paramString = paramString.replace("vip.wandoujia.com", this.originHostName);
    return FreeHttpUtils.buildFreeURLIfNeed(paramString);
  }

  public static WebViewClient newInstance(WebViewClient paramWebViewClient, String paramString)
  {
    FreeWebViewClientWrapper localFreeWebViewClientWrapper = new FreeWebViewClientWrapper();
    localFreeWebViewClientWrapper.delegate = paramWebViewClient;
    localFreeWebViewClientWrapper.originHostName = paramString;
    return localFreeWebViewClientWrapper;
  }

  public void doUpdateVisitedHistory(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    this.delegate.doUpdateVisitedHistory(paramWebView, paramString, paramBoolean);
  }

  public void onFormResubmission(WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    this.delegate.onFormResubmission(paramWebView, paramMessage1, paramMessage2);
  }

  public void onLoadResource(WebView paramWebView, String paramString)
  {
    this.delegate.onLoadResource(paramWebView, paramString);
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    this.delegate.onPageFinished(paramWebView, paramString);
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    this.delegate.onPageStarted(paramWebView, paramString, paramBitmap);
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.delegate.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public void onReceivedHttpAuthRequest(WebView paramWebView, HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    this.delegate.onReceivedHttpAuthRequest(paramWebView, paramHttpAuthHandler, paramString1, paramString2);
  }

  @TargetApi(12)
  public void onReceivedLoginRequest(WebView paramWebView, String paramString1, String paramString2, String paramString3)
  {
    this.delegate.onReceivedLoginRequest(paramWebView, paramString1, paramString2, paramString3);
  }

  @TargetApi(8)
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    this.delegate.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
  }

  public void onScaleChanged(WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    this.delegate.onScaleChanged(paramWebView, paramFloat1, paramFloat2);
  }

  public void onTooManyRedirects(WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    this.delegate.onTooManyRedirects(paramWebView, paramMessage1, paramMessage2);
  }

  public void onUnhandledKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    this.delegate.onUnhandledKeyEvent(paramWebView, paramKeyEvent);
  }

  @TargetApi(11)
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    if (!FreeHttpUtils.isInFreeMode())
      return super.shouldInterceptRequest(paramWebView, paramString);
    String str1 = buildFreeUrl(paramString);
    String str2 = FreeHttpUtils.getMimeType(paramString);
    if (GlobalConfig.isDebug())
      new StringBuilder("Intercept [originUrl:").append(paramString).append("] [proxyUrl: ").append(str1).append("] [type:").append(str2).append("]");
    try
    {
      WebResourceResponse localWebResourceResponse = new WebResourceResponse(str2, null, new URL(str1).openStream());
      return localWebResourceResponse;
    }
    catch (IOException localIOException)
    {
    }
    return super.shouldInterceptRequest(paramWebView, paramString);
  }

  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    return this.delegate.shouldOverrideKeyEvent(paramWebView, paramKeyEvent);
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (!FreeHttpUtils.isInFreeMode())
      return this.delegate.shouldOverrideUrlLoading(paramWebView, paramString);
    String str = buildFreeUrl(paramString);
    if (GlobalConfig.isDebug())
      new StringBuilder("Override [originUrl:").append(paramString).append("] [proxyUrl: ").append(str).append("]");
    paramWebView.loadUrl(str);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.FreeWebViewClientWrapper
 * JD-Core Version:    0.6.0
 */