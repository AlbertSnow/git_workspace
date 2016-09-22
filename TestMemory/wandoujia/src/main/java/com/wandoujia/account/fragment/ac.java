package com.wandoujia.account.fragment;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class ac
  implements TextView.OnEditorActionListener
{
  ac(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66)) || (paramInt == 6))
      AccountLoginFragment.a(this.a);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ac
 * JD-Core Version:    0.6.0
 */