package com.wandoujia.p4.campaign;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

class CampaignFragment$MyWebChromeClient extends WebChromeClient
{
  private WebChromeClient.CustomViewCallback customCallback;
  private Bitmap defaultVideoPoster;

  private CampaignFragment$MyWebChromeClient(CampaignFragment paramCampaignFragment)
  {
  }

  public Bitmap getDefaultVideoPoster()
  {
    if (this.defaultVideoPoster == null)
      this.defaultVideoPoster = BitmapFactory.decodeResource(this.this$0.getResources(), 2130838033);
    return this.defaultVideoPoster;
  }

  public View getVideoLoadingProgressView()
  {
    View localView;
    if (CampaignFragment.g(this.this$0))
      localView = null;
    do
    {
      return localView;
      localView = super.getVideoLoadingProgressView();
    }
    while (localView != null);
    return new FrameLayout(this.this$0.getActivity());
  }

  public void onHideCustomView()
  {
    super.onHideCustomView();
    if (CampaignFragment.a(this.this$0) != null)
    {
      CampaignFragment.f(this.this$0);
      CampaignFragment.a(this.this$0).setVisibility(0);
    }
  }

  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    if (paramInt == 100)
      CampaignFragment.c(this.this$0).setVisibility(8);
    while (true)
    {
      super.onProgressChanged(paramWebView, paramInt);
      return;
      if (CampaignFragment.c(this.this$0).getVisibility() == 8)
        CampaignFragment.c(this.this$0).setVisibility(0);
      CampaignFragment.c(this.this$0).setProgress(paramInt);
    }
  }

  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    this.this$0.c();
  }

  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    if (CampaignFragment.a(this.this$0) == null);
    do
    {
      return;
      this.customCallback = paramCustomViewCallback;
    }
    while (!(paramView instanceof FrameLayout));
    CampaignFragment.d(this.this$0);
    onHideCustomView();
    this.customCallback.onCustomViewHidden();
    CampaignFragment.e(this.this$0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.CampaignFragment.MyWebChromeClient
 * JD-Core Version:    0.6.0
 */