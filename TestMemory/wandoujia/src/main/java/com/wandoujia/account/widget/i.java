package com.wandoujia.account.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class i extends Handler
{
  private AccountEditText a;

  public i(Looper paramLooper, AccountEditText paramAccountEditText)
  {
    super(paramLooper);
    this.a = paramAccountEditText;
  }

  final void a()
  {
    this.a = null;
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
    case 0:
    }
    do
      return;
    while (this.a == null);
    AccountEditText.e(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.widget.i
 * JD-Core Version:    0.6.0
 */