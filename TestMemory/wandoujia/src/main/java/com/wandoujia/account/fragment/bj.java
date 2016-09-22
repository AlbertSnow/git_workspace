package com.wandoujia.account.fragment;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class bj
  implements CompoundButton.OnCheckedChangeListener
{
  bj(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.a.m != null))
      this.a.m.a(paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bj
 * JD-Core Version:    0.6.0
 */