package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.wandoujia.account.widget.AccountEditText;

final class bz
  implements View.OnClickListener
{
  bz(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AccountRegisterFragment.a(this.a).setText("");
    AccountRegisterFragment.b(this.a).setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bz
 * JD-Core Version:    0.6.0
 */