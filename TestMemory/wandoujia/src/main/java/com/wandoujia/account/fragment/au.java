package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.wandoujia.account.widget.AccountEditText;

final class au
  implements View.OnClickListener
{
  au(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AccountLoginFragment.e(this.a).setVisibility(8);
    AccountLoginFragment.f(this.a).setText("");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.au
 * JD-Core Version:    0.6.0
 */