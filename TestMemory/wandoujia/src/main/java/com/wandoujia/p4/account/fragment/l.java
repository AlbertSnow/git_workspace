package com.wandoujia.p4.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.widget.a;

final class l
  implements View.OnClickListener
{
  l(AccountProfileFragment paramAccountProfileFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (AccountProfileFragment.i(this.a) != null)
      AccountProfileFragment.i(this.a).dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.l
 * JD-Core Version:    0.6.0
 */