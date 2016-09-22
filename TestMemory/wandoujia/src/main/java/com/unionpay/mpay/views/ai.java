package com.unionpay.mpay.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.mpay.widgets.k;
import com.unionpay.mpay_2.upview.a;

final class ai
  implements View.OnClickListener
{
  ai(n paramn)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.l())
      return;
    n.a(this.a).d();
    com.unionpay.mpay_2.upview.c localc = n.a(this.a).c();
    if (!localc.a())
    {
      this.a.c(localc.a);
      return;
    }
    if ((n.b(this.a) != null) && (!n.b(this.a).a()))
    {
      this.a.c(com.unionpay.mpay.b.c.ab.R);
      return;
    }
    this.a.b.a(com.unionpay.mpay.b.c.ab.B);
    n.a(this.a, localc.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.ai
 * JD-Core Version:    0.6.0
 */