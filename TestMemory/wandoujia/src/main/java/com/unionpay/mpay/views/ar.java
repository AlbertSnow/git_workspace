package com.unionpay.mpay.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.widgets.k;

final class ar
  implements View.OnClickListener
{
  ar(x paramx)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.l())
      return;
    x.a(this.a).d();
    com.unionpay.mpay_2.upview.c localc = x.a(this.a).c();
    if (!localc.a())
    {
      this.a.c(localc.a);
      return;
    }
    if ((x.b(this.a) != null) && (!x.b(this.a).e()))
    {
      this.a.c(x.b(this.a).b());
      return;
    }
    String str = localc.a;
    this.a.b.a(com.unionpay.mpay.b.c.ab.B);
    this.a.e.f(str);
    x.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.ar
 * JD-Core Version:    0.6.0
 */