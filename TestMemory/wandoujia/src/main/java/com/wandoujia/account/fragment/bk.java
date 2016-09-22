package com.wandoujia.account.fragment;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class bk
  implements TextView.OnEditorActionListener
{
  bk(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66)) || (paramInt == 6))
      AccountRegisterFragment.c(this.a);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bk
 * JD-Core Version:    0.6.0
 */