package com.wandoujia.phoenix2.av.view;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

final class c
  implements View.OnClickListener
{
  c(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    a.b(this.a).removeMessages(0);
    a.c(this.a);
    if (a.d(this.a) >= a.e(this.a))
    {
      a.a(this.a);
      if (a.f(this.a) != null)
        a.f(this.a).a();
      return;
    }
    a.b(this.a).sendEmptyMessageDelayed(0, 1000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.view.c
 * JD-Core Version:    0.6.0
 */