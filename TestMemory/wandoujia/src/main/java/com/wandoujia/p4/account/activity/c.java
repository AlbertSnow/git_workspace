package com.wandoujia.p4.account.activity;

import android.app.ProgressDialog;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.listener.a;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.view.p;

final class c
  implements a
{
  private c(AccountBaseActivity paramAccountBaseActivity)
  {
  }

  public final void a()
  {
    if (this.a.isFinishing());
    do
    {
      return;
      if (NetworkUtil.isNetworkConnected(this.a))
        continue;
      p.a(this.a, 2131625173, p.b).a();
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
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.c
 * JD-Core Version:    0.6.0
 */