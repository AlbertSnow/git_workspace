package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.dto.Platform;
import java.util.HashMap;

final class as
  implements View.OnClickListener
{
  as(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.g = Platform.QQ;
    if ((this.a.f == null) || (this.a.getActivity() == null))
      return;
    this.a.f.b(Platform.QQ, this.a.getActivity(), this.a.h, this.a.c.m());
    HashMap localHashMap = new HashMap();
    localHashMap.put("account_button_click_type", "account_qq_login");
    String str = "unknown";
    if (this.a.c != null)
      str = this.a.c.m();
    localHashMap.put("account_source", str);
    this.a.getActivity();
    com.wandoujia.account.d.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.as
 * JD-Core Version:    0.6.0
 */