package com.wandoujia.p4.tips;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.p4.account.manager.AccountUtil;

final class b
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    AccountParams localAccountParams = new AccountParams("community", 0);
    AccountUtil.a(paramView.getContext(), localAccountParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.tips.b
 * JD-Core Version:    0.6.0
 */