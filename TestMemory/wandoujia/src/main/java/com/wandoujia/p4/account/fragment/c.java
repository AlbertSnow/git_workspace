package com.wandoujia.p4.account.fragment;

import android.app.ProgressDialog;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.a;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.view.p;

final class c
  implements a
{
  private c(AccountBaseFragment paramAccountBaseFragment)
  {
  }

  public final void a()
  {
    if (!this.a.isAdded());
    do
    {
      return;
      if (NetworkUtil.isNetworkConnected(this.a.getActivity()))
        continue;
      p.a(this.a.getActivity(), 2131625173, p.b).a();
    }
    while (this.a.a == null);
    this.a.a.dismiss();
  }

  public final void a(WandouResponse paramWandouResponse)
  {
    if (this.a.a != null)
      this.a.a.dismiss();
    this.a.a(paramWandouResponse);
  }

  public final void a(String paramString)
  {
    if (this.a.a != null)
      this.a.a.dismiss();
    this.a.a(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.c
 * JD-Core Version:    0.6.0
 */