package com.wandoujia.account.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.constants.AccountParamConstants.FragmentType;
import com.wandoujia.account.dto.WandouResponse;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public class WebViewFragment extends AccountBaseFragment
{
  private String q;
  private WebView r;
  private String s;
  private ProgressBar t;

  public static final WebViewFragment a(AccountParams paramAccountParams, String paramString1, String paramString2, String paramString3)
  {
    WebViewFragment localWebViewFragment = new WebViewFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("extra_url", paramString2);
    localBundle.putString("extra_title", paramString3);
    localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", paramString1);
    localBundle.putParcelable("account.intent.extra.ACCOUNT_PARAMS", paramAccountParams);
    localWebViewFragment.setArguments(localBundle);
    return localWebViewFragment;
  }

  private String h()
  {
    try
    {
      if (this.q.contains("%s"))
      {
        String str2 = this.q;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = ("&callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close", "utf-8"));
        return String.format(str2, arrayOfObject);
      }
      if (TextUtils.isEmpty(new URI(this.q).getQuery()))
        return this.q + "?callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close", "utf-8");
      String str1 = this.q + "&callback=" + URLEncoder.encode("https://account.wandoujia.com/sdk/close", "utf-8");
      return str1;
    }
    catch (Exception localException)
    {
      return this.q;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      label147: break label147;
    }
  }

  final void a(WandouResponse paramWandouResponse)
  {
  }

  protected final String b()
  {
    return "wdj://account/webview";
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
  }

  protected final void c()
  {
    super.c();
    this.r = ((WebView)this.a.findViewById(R.id.account_sdk_web));
    this.t = ((ProgressBar)this.a.findViewById(R.id.account_sdk_web_loading_progress));
    this.t.setVisibility(4);
    this.r.setVerticalScrollBarEnabled(true);
    this.r.setHorizontalScrollBarEnabled(true);
    this.r.setWebViewClient(new ct(this, 0));
    this.r.getSettings().setJavaScriptEnabled(true);
    this.r.getSettings().setBuiltInZoomControls(true);
    CookieSyncManager.createInstance(getActivity());
    CookieSyncManager.getInstance().startSync();
    CookieManager.getInstance().removeSessionCookie();
    CookieManager.getInstance().removeAllCookie();
    this.r.clearCache(true);
    this.r.clearHistory();
    a(this.s);
    this.r.loadUrl(h());
    if ((this.c != null) && (this.c.r()))
    {
      ViewGroup.LayoutParams localLayoutParams = this.a.getLayoutParams();
      localLayoutParams.height = -1;
      this.a.setLayoutParams(localLayoutParams);
    }
  }

  protected final void d(String paramString)
  {
  }

  protected final void f()
  {
  }

  public final WebView g()
  {
    return this.r;
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_webview, paramViewGroup, false);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.q = localBundle.getString("extra_url");
      this.s = localBundle.getString("extra_title");
      this.d = localBundle.getString("account.intent.extra.ACCOUNT_MANAGER_KEY");
    }
    c();
    if (this.o != null)
      this.o.a(this.r);
    if (this.j != null)
    {
      if (!this.q.startsWith("http://www.wandoujia.com/terms"))
        break label118;
      this.j.a(AccountParamConstants.FragmentType.USER_LEGAL);
    }
    while (true)
    {
      return this.a;
      label118: this.j.a(AccountParamConstants.FragmentType.FORGET_PASSWORD);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.WebViewFragment
 * JD-Core Version:    0.6.0
 */