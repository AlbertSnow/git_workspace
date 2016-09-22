package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;

final class bx
  implements View.OnClickListener
{
  bx(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AccountRegisterFragment.d(this.a);
    if (this.a.i != null)
      this.a.i.onViewWidgetClicked(paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bx
 * JD-Core Version:    0.6.0
 */