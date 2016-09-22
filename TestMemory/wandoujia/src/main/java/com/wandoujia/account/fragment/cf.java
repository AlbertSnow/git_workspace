package com.wandoujia.account.fragment;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.wandoujia.account.R.string;

final class cf extends CountDownTimer
{
  cf(AccountResetEmailFragment paramAccountResetEmailFragment)
  {
    super(61000L, 1000L);
  }

  public final void onFinish()
  {
    if (!this.a.isAdded())
      return;
    AccountResetEmailFragment.h(this.a);
    AccountResetEmailFragment.i(this.a);
  }

  public final void onTick(long paramLong)
  {
    TextView localTextView = AccountResetEmailFragment.e(this.a);
    String str = AccountResetEmailFragment.e(this.a).getContext().getString(R.string.account_sdk_email_countdownload_timer);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong / 1000L);
    localTextView.setText(String.format(str, arrayOfObject));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.cf
 * JD-Core Version:    0.6.0
 */