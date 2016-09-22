package com.wandoujia.account.fragment;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class ab
  implements CompoundButton.OnCheckedChangeListener
{
  ab(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.a.m != null))
      this.a.m.a(paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ab
 * JD-Core Version:    0.6.0
 */