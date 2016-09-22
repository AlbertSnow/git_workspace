package com.wandoujia.account.fragment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v4.app.FragmentActivity;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.string;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.dto.WandouResponse;
import java.util.HashMap;

public final class m
  implements com.wandoujia.account.listener.b
{
  protected m(AccountBaseFragment paramAccountBaseFragment)
  {
  }

  public final void a()
  {
    AccountParamConstants.FinishType localFinishType = AccountParamConstants.FinishType.LOGIN;
    if (this.a.g != null)
    {
      if (!this.a.g.equals(Platform.SINA))
        break label109;
      localFinishType = AccountParamConstants.FinishType.SINA_LOGIN;
      HashMap localHashMap3 = new HashMap();
      localHashMap3.put("account_login_type", "account_sina_login");
      localHashMap3.put("account_login_status", "success");
      localHashMap3.put("account_login_src", this.a.c.m());
      this.a.getActivity();
      com.wandoujia.account.d.b.a();
    }
    while (true)
    {
      this.a.a(localFinishType);
      return;
      label109: if (this.a.g.equals(Platform.QQ))
      {
        localFinishType = AccountParamConstants.FinishType.QQ_LOGIN;
        HashMap localHashMap2 = new HashMap();
        localHashMap2.put("account_login_type", "account_qq_login");
        localHashMap2.put("account_login_status", "success");
        localHashMap2.put("account_login_src", this.a.c.m());
        this.a.getActivity();
        com.wandoujia.account.d.b.a();
        continue;
      }
      if (!this.a.g.equals(Platform.RENREN))
        continue;
      localFinishType = AccountParamConstants.FinishType.RENREN_LOGIN;
      HashMap localHashMap1 = new HashMap();
      localHashMap1.put("account_login_type", "account_renren_login");
      localHashMap1.put("account_login_status", "success");
      localHashMap1.put("account_login_src", this.a.c.m());
      this.a.getActivity();
      com.wandoujia.account.d.b.a();
    }
  }

  public final void a(WandouResponse paramWandouResponse)
  {
    if (this.a.e != null)
      this.a.e.dismiss();
    if (this.a.g.equals(Platform.SINA))
    {
      HashMap localHashMap1 = new HashMap();
      localHashMap1.put("account_login_type", "account_sina_login");
      localHashMap1.put("account_login_status", "failed");
      localHashMap1.put("account_login_src", this.a.c.m());
      this.a.getActivity();
      com.wandoujia.account.d.b.a();
    }
    while ((paramWandouResponse.getError() == AccountError.SUCCESS.getError()) || (paramWandouResponse.getError() == 1000010))
    {
      return;
      if (this.a.g.equals(Platform.QQ))
      {
        HashMap localHashMap2 = new HashMap();
        localHashMap2.put("account_login_type", "account_qq_login");
        localHashMap2.put("account_login_status", "failed");
        localHashMap2.put("account_login_src", this.a.c.m());
        this.a.getActivity();
        com.wandoujia.account.d.b.a();
        continue;
      }
      if (!this.a.g.equals(Platform.RENREN))
        continue;
      HashMap localHashMap3 = new HashMap();
      localHashMap3.put("account_login_type", "account_renren_login");
      localHashMap3.put("account_login_status", "failed");
      localHashMap3.put("account_login_src", this.a.c.m());
      this.a.getActivity();
      com.wandoujia.account.d.b.a();
    }
    this.a.a(paramWandouResponse);
  }

  public final void b()
  {
    if (this.a.e != null)
      this.a.e.dismiss();
    FragmentActivity localFragmentActivity = this.a.getActivity();
    if (localFragmentActivity != null)
    {
      this.a.e = ProgressDialog.show(localFragmentActivity, "", localFragmentActivity.getString(R.string.account_sdk_netop_submitting_login));
      this.a.e.show();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.m
 * JD-Core Version:    0.6.0
 */