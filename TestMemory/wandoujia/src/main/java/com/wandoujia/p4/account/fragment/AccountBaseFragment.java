package com.wandoujia.p4.account.fragment;

import android.app.ProgressDialog;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.ripple_framework.fragment.BaseFragment;

public abstract class AccountBaseFragment extends BaseFragment
{
  protected ProgressDialog a;
  protected c b = new c(this, 0);

  abstract void a(WandouResponse paramWandouResponse);

  abstract void a(String paramString);

  protected final void a(String paramString, WandouResponse paramWandouResponse)
  {
    if (paramWandouResponse != null);
    try
    {
      String str = paramWandouResponse.getMsg();
      if (TextUtils.isEmpty(str))
        str = getString(2131625173);
      com.wandoujia.account.h.a.a(getActivity(), str, paramString, new a()).show();
      return;
      com.wandoujia.account.h.a.a(getActivity(), getString(2131625173), paramString, new b()).show();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected final void b(String paramString)
  {
    if (this.a != null)
      this.a.dismiss();
    this.a = ProgressDialog.show(getActivity(), "", paramString);
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.AccountBaseFragment
 * JD-Core Version:    0.6.0
 */