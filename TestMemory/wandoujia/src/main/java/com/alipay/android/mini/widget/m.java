package com.alipay.android.mini.widget;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

final class m
  implements View.OnClickListener
{
  m(i parami)
  {
  }

  public final void onClick(View paramView)
  {
    Message localMessage1 = (Message)paramView.getTag();
    if (localMessage1 == null)
    {
      this.a.dismiss();
      return;
    }
    Message localMessage2 = Message.obtain(localMessage1);
    if (localMessage2 != null)
      localMessage2.sendToTarget();
    i.a(this.a).obtainMessage(1, i.b(this.a)).sendToTarget();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.m
 * JD-Core Version:    0.6.0
 */