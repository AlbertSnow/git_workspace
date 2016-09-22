package com.wandoujia.jupiter.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.jupiter.homepage.a.a;
import com.wandoujia.jupiter.homepage.b;
import com.wandoujia.jupiter.homepage.splashwindow.k;
import com.wandoujia.p4.campaign.e;
import com.wandoujia.ripple_framework.fragment.BaseFragment;

public class WebViewFragment extends BaseFragment
  implements a
{
  private String a;
  private WebView b;
  private View c;

  public final void a(int paramInt)
  {
    this.c.setVisibility(8);
  }

  public final void a(b paramb)
  {
  }

  public final void a_()
  {
  }

  public final int b_()
  {
    this.c.setVisibility(0);
    return 0;
  }

  public final View c_()
  {
    return getView();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getArguments().getString("page_api_url");
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130903421, paramViewGroup, false);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.c = paramView.findViewById(2131493770);
    if (k.j())
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.c.getLayoutParams();
      localLayoutParams.height = (int)this.c.getResources().getDimension(2131427648);
      this.c.setLayoutParams(localLayoutParams);
    }
    this.b = ((WebView)paramView.findViewById(2131493134));
    this.b.getSettings().setJavaScriptEnabled(true);
    this.b.addJavascriptInterface(new e(getActivity(), this.b), "campaignPlugin");
    this.b.setWebViewClient(new WebViewClient());
    this.b.setWebChromeClient(new WebChromeClient());
    this.b.loadUrl(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.WebViewFragment
 * JD-Core Version:    0.6.0
 */