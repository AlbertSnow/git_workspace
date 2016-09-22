package com.wandoujia.account.fragment;

import android.os.CountDownTimer;
import android.widget.TextView;

final class cq extends CountDownTimer
{
  cq(AccountResetPasswordFragment paramAccountResetPasswordFragment)
  {
    super(61000L, 1000L);
  }

  public final void onFinish()
  {
    if (!this.a.isAdded())
      return;
    AccountResetPasswordFragment.o(this.a);
    AccountResetPasswordFragment.p(this.a);
  }

  public final void onTick(long paramLong)
  {
    TextView localTextView = AccountResetPasswordFragment.c(this.a);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong / 1000L);
    localTextView.setText(String.format("%ss", arrayOfObject));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.cq
 * JD-Core Version:    0.6.0
 */