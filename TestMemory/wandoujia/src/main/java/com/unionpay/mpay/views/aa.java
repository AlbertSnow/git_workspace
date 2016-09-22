package com.unionpay.mpay.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.widgets.k;
import com.unionpay.uppay.b;

final class aa
  implements View.OnClickListener
{
  aa(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.l())
      return;
    e.a(this.a).d();
    com.unionpay.mpay_2.upview.c localc = e.a(this.a).c();
    if (!localc.a())
    {
      this.a.c(localc.a);
      return;
    }
    if ((e.b(this.a) != null) && (!e.b(this.a).e()))
    {
      this.a.c(e.b(this.a).b());
      return;
    }
    this.a.b.a(com.unionpay.mpay.b.c.ab.B);
    if (!e.c(this.a))
    {
      String str = com.unionpay.mpay.utils.e.a(this.a.a.r, "action");
      this.a.e.b(str, localc.a);
      e.a(this.a, 102);
      return;
    }
    e.d(this.a);
    e.a(this.a, 104);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.aa
 * JD-Core Version:    0.6.0
 */