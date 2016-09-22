package com.wandoujia.p4.campaign;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.wandoujia.jupiter.presenter.aa;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import com.wandoujia.ripple_framework.model.Model;

public class CampaignFragment extends BaseFragment
{
  protected String a;
  private boolean b = true;
  private View c;
  private WebView d;
  private ProgressBar e;
  private LinearLayout f;
  private String g;
  private Model h;
  private Object i;
  private CookieSyncManager j;
  private Animation k;
  private boolean l = false;
  private boolean m = false;
  private boolean n = true;

  private void d()
  {
    if (this.d == null)
      return;
    new b();
  }

  private void e()
  {
    if (this.d == null)
      return;
    this.d.onPause();
  }

  private void f()
  {
    if (this.d == null)
      return;
    this.d.onResume();
  }

  protected void a()
  {
    StringBuilder localStringBuilder = new StringBuilder("wdj://web");
    localStringBuilder.append("?title=").append(this.g);
    localStringBuilder.append("&url=").append(this.a);
    v.b().a(getView(), new ak(localStringBuilder.toString())).a(getActivity());
  }

  public final boolean b()
  {
    if ((this.d != null) && (this.d.canGoBack()) && (!"file:///android_asset/empty.html".equals(this.d.getUrl())))
    {
      this.d.loadUrl("javascript:window.history.back();");
      return true;
    }
    return false;
  }

  public final void c()
  {
    if ((this.d == null) || (!this.b))
      return;
    String str;
    if (TextUtils.isEmpty(this.g))
      str = this.d.getTitle();
    while (true)
    {
      setTitle(str);
      return;
      if ((this.d.canGoBack()) && (!TextUtils.equals(this.d.getUrl(), "file:///android_asset/empty.html")));
      for (int i1 = 1; ; i1 = 0)
      {
        if ((i1 == 0) || (TextUtils.isEmpty(this.d.getTitle())))
          break label99;
        str = this.d.getTitle();
        break;
      }
      label99: str = this.g;
    }
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    a();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() != null)
    {
      getArguments().getString("phoenix.intent.extra.ACTION");
      this.a = getArguments().getString("phoenix.intent.extra.URL");
      this.g = getArguments().getString("phoenix.intent.extra.TITLE");
      this.b = getArguments().getBoolean("phoenix.intent.extra.SHOW_ACTION_BAR", true);
      getArguments().getBoolean("phoenix.intent.extra.SHOW_PROGRESS_BAR", true);
      this.n = getArguments().getBoolean("phoenix.intent.extra.SHOW_MORE_MENU", true);
      this.h = ((Model)getArguments().getParcelable("key_app_card_model"));
    }
    this.j = CookieSyncManager.createInstance(getActivity().getApplicationContext());
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FragmentActivity localFragmentActivity = getActivity();
    int i1;
    Model localModel;
    if ("http://www.wandoujia.com/game-vertical/video".equals(this.a))
    {
      i1 = 2130903052;
      this.c = com.wandoujia.p4.utils.c.a(localFragmentActivity, i1);
      this.d = ((WebView)this.c.findViewById(2131493134));
      this.e = ((ProgressBar)this.c.findViewById(2131493132));
      this.f = ((LinearLayout)this.c.findViewById(2131493133));
      localModel = this.h;
      if (localModel != null)
        break label174;
      this.f.setVisibility(8);
    }
    while (true)
    {
      this.k = AnimationUtils.loadAnimation(getActivity(), 2130968588);
      this.k.setInterpolator(new LinearInterpolator());
      this.i = new e(getActivity(), this.d);
      if (!TextUtils.isEmpty(this.a))
        break label212;
      d();
      return this.c;
      i1 = 2130903051;
      break;
      label174: ViewGroup localViewGroup = (ViewGroup)android.support.v4.app.b.a(this.f, 2130903373);
      aa.a(localViewGroup, null).a(localModel);
      this.f.addView(localViewGroup);
    }
    label212: Uri localUri = Uri.parse(this.a);
    if ((localUri == null) || (TextUtils.isEmpty(localUri.getHost())))
    {
      d();
      return this.c;
    }
    if ((!TextUtils.isEmpty(com.wandoujia.account.a.i())) && (localUri.getHost().contains("wandoujia.com")))
    {
      CookieManager.getInstance().setAcceptCookie(true);
      CookieManager.getInstance().setCookie(this.a, "wdj_auth=" + com.wandoujia.account.a.i() + ";Max-Age=36000;Domain=.wandoujia.com;Path = /");
      CookieSyncManager.getInstance().sync();
    }
    this.d.getSettings().setJavaScriptEnabled(true);
    this.d.getSettings().setSupportZoom(true);
    this.d.getSettings().setCacheMode(2);
    this.d.getSettings().setDatabasePath("/data/data/" + getActivity().getPackageName() + "/databases/");
    this.d.getSettings().setDomStorageEnabled(true);
    this.d.setWebViewClient(new c(this));
    this.d.setWebChromeClient(new CampaignFragment.MyWebChromeClient(this, null));
    if (localUri.getHost().endsWith("wandoujia.com"))
      this.d.addJavascriptInterface(this.i, "campaignPlugin");
    this.d.loadUrl(this.a);
    return this.c;
  }

  public void onDestroy()
  {
    if (this.d != null)
    {
      this.d.removeAllViews();
      this.d.destroy();
      this.d = null;
    }
    super.onDestroy();
  }

  @TargetApi(11)
  public void onPause()
  {
    this.j.stopSync();
    e();
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    f();
    this.j.startSync();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.toolbar.setOnMenuItemClickListener$486aeec7(new a(this));
    if (!this.n)
    {
      this.toolbar.getMenu().findItem(2131494123).setVisible(false);
      this.toolbar.getMenu().findItem(2131494124).setVisible(false);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.CampaignFragment
 * JD-Core Version:    0.6.0
 */