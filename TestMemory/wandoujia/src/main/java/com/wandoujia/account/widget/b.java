package com.wandoujia.account.widget;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

final class b
  implements View.OnClickListener
{
  b(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    Message localMessage1;
    if ((paramView == a.a(this.a)) && (a.b(this.a) != null))
      localMessage1 = Message.obtain(a.b(this.a));
    while (true)
    {
      if (localMessage1 != null)
        localMessage1.sendToTarget();
      a.g(this.a).obtainMessage(1, this.a).sendToTarget();
      return;
      if ((paramView == a.c(this.a)) && (a.d(this.a) != null))
      {
        localMessage1 = Message.obtain(a.d(this.a));
        continue;
      }
      Button localButton = a.e(this.a);
      localMessage1 = null;
      if (paramView != localButton)
        continue;
      Message localMessage2 = a.f(this.a);
      localMessage1 = null;
      if (localMessage2 == null)
        continue;
      localMessage1 = Message.obtain(a.f(this.a));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.widget.b
 * JD-Core Version:    0.6.0
 */