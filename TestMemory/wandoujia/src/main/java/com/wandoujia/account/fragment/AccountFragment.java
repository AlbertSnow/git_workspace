package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.AccountParams.Type;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.dto.WandouResponse;
import java.util.HashMap;

public class AccountFragment extends AccountBaseFragment
{
  private ProgressDialog q;
  private AccountParams r;
  private String s;
  private final com.wandoujia.account.listener.a t = new b(this);

  private void g()
  {
    AccountParams.Page localPage;
    if (this.r != null)
    {
      localPage = this.r.p();
      if ((AccountParams.Page.EMAIL_REGISTER != localPage) && (AccountParams.Page.TEL_REGISTER != localPage))
        break label34;
      k();
    }
    label34: 
    do
    {
      return;
      if (AccountParams.Page.LOG_IN != localPage)
        continue;
      j();
      return;
    }
    while (AccountParams.Page.FORGET_PASSWORD != localPage);
    WebViewFragment localWebViewFragment = WebViewFragment.a(this.r, this.s, "http://www.wandoujia.com/account/?source=p3%s#find", getString(R.string.account_sdk_forget_password_title));
    ac localac = getActivity().getSupportFragmentManager().a();
    localac.b(R.id.account_fragment_layout, localWebViewFragment, "forgetPasswordWebView");
    localac.a();
  }

  private void h()
  {
    this.f.a(com.wandoujia.account.a.i());
    this.f.a("", this.t);
  }

  private void i()
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (!com.wandoujia.account.a.z())
          continue;
        if (this.f == null)
          continue;
        h();
        return;
        l();
        this.f = AccountBaseFragment.c(this.d);
        if (this.f == null)
          continue;
        HashMap localHashMap = new HashMap();
        localHashMap.put("account_sso_result", "unknown");
        localHashMap.put("account_sso_operation", "account_sso_unlogin");
        getActivity();
        com.wandoujia.account.d.b.a();
        Bundle localBundle = getArguments();
        if (localBundle == null)
          break label136;
        AccountParams localAccountParams = (AccountParams)localBundle.getParcelable("account.intent.extra.ACCOUNT_PARAMS");
        if ((localAccountParams != null) && (localAccountParams.p() == AccountParams.Page.LOG_IN))
        {
          j();
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      k();
      continue;
      label136: k();
    }
  }

  private void j()
  {
    Bundle localBundle = getArguments();
    AccountLoginFragment localAccountLoginFragment;
    if (d() != null)
      localAccountLoginFragment = (AccountLoginFragment)d().a("login");
    try
    {
      if (d().e() > 0)
        d().d();
      label43: if (localAccountLoginFragment == null)
        localAccountLoginFragment = AccountLoginFragment.a(localBundle);
      if (!localAccountLoginFragment.isAdded())
      {
        ac localac = d().a();
        localac.b(R.id.account_fragment_layout, localAccountLoginFragment, "login");
        localac.b();
      }
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label43;
    }
  }

  private void k()
  {
    Bundle localBundle = getArguments();
    ac localac;
    AccountRegisterFragment localAccountRegisterFragment;
    if (d() != null)
    {
      localac = d().a();
      if (localBundle == null)
        break label85;
      AccountParams localAccountParams = (AccountParams)localBundle.getParcelable("account.intent.extra.ACCOUNT_PARAMS");
      if ((localAccountParams == null) || (localAccountParams.b() == null))
        break label77;
      localAccountRegisterFragment = AccountRegisterFragment.b(localBundle);
    }
    while (true)
    {
      if (!localAccountRegisterFragment.isAdded())
      {
        localac.b(R.id.account_fragment_layout, localAccountRegisterFragment, "register");
        localac.b();
      }
      return;
      label77: localAccountRegisterFragment = AccountRegisterFragment.a(localBundle);
      continue;
      label85: localAccountRegisterFragment = AccountRegisterFragment.a(localBundle);
    }
  }

  private void l()
  {
    if (this.q != null)
      this.q.dismiss();
  }

  final void a(WandouResponse paramWandouResponse)
  {
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
    l();
    if (this.f == null)
      this.f = AccountBaseFragment.c(this.d);
    if (this.f != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("account_sso_result", "failed");
      localHashMap.put("account_sso_operation", "account_sso_completed");
      getActivity();
      com.wandoujia.account.d.b.a();
    }
    if (paramWandouResponse != null)
    {
      com.wandoujia.account.h.a.a(getActivity(), paramWandouResponse.getMsg(), getString(R.string.account_sdk_login_failure), new y()).show();
      return;
    }
    com.wandoujia.account.h.a.a(getActivity(), getString(R.string.account_sdk_netop_server_error), getString(R.string.account_sdk_login_failure), new z()).show();
  }

  public final void c()
  {
  }

  protected final void d(String paramString)
  {
    this.a.setVisibility(0);
    l();
    if (this.p != null)
      this.p.a(getActivity(), AccountParamConstants.FinishType.LOGIN, this.r);
    if (this.f == null)
      this.f = AccountBaseFragment.c(this.d);
    if (this.f != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("account_sso_result", "success");
      localHashMap.put("account_sso_operation", "account_sso_completed");
      getActivity();
      com.wandoujia.account.d.b.a();
    }
  }

  protected final void f()
  {
    l();
    if (this.f == null)
      this.f = AccountBaseFragment.c(this.d);
    if (this.p != null)
      this.p.a(getActivity(), AccountParamConstants.FinishType.CANCEL, this.r);
    if (this.f != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("account_sso_result", "cancel");
      localHashMap.put("account_sso_operation", "account_sso_completed");
      getActivity();
      com.wandoujia.account.d.b.a();
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    setHasOptionsMenu(true);
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_main_activity, paramViewGroup, false);
    Bundle localBundle1 = getArguments();
    if (localBundle1 != null)
    {
      this.r = ((AccountParams)localBundle1.getParcelable("account.intent.extra.ACCOUNT_PARAMS"));
      this.s = localBundle1.getString("account.intent.extra.ACCOUNT_MANAGER_KEY");
      if (this.r != null)
        if (this.r.q() == AccountParams.Type.PHOENIX)
          g();
    }
    while (true)
    {
      return this.a;
      if (getActivity() == null)
        continue;
      if (android.support.v4.app.b.p(getActivity()))
      {
        if (this.q != null)
        {
          this.q.dismiss();
          this.q = null;
        }
        this.q = ProgressDialog.show(getActivity(), "", getString(R.string.account_sdk_netop_submitting_login));
        this.q.show();
        com.wandoujia.account.a.a(new aa(this));
        continue;
      }
      if (this.f == null)
        this.f = AccountBaseFragment.c(this.d);
      if (this.f != null)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("account_sso_result", "unknown");
        localHashMap.put("account_sso_operation", "account_sso_not_support");
        getActivity();
        com.wandoujia.account.d.b.a();
      }
      if (TextUtils.isEmpty(com.wandoujia.account.a.i()))
      {
        Bundle localBundle2 = getArguments();
        if (localBundle2 != null)
        {
          this.r = ((AccountParams)localBundle2.getParcelable("account.intent.extra.ACCOUNT_PARAMS"));
          g();
          continue;
        }
        k();
        continue;
      }
      h();
      continue;
      k();
      continue;
      k();
    }
  }

  public void onDestroy()
  {
    if (this.q != null)
      this.q.dismiss();
    super.onDestroy();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountFragment
 * JD-Core Version:    0.6.0
 */