package com.unionpay.mpay.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.mpay.widgets.k;
import com.unionpay.uppay.b;

final class m
  implements View.OnClickListener
{
  m(aj paramaj)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.l())
      return;
    aj.a(this.a).d();
    com.unionpay.mpay_2.upview.c localc = aj.a(this.a).c();
    if (!localc.a())
    {
      this.a.c(localc.a);
      return;
    }
    if ((aj.b(this.a) != null) && (!aj.b(this.a).e()))
    {
      this.a.c(aj.b(this.a).b());
      return;
    }
    if ((aj.c(this.a) != null) && (!aj.c(this.a).e()))
    {
      this.a.c(aj.c(this.a).b());
      return;
    }
    String str = localc.a;
    this.a.b.a(com.unionpay.mpay.b.c.ab.B);
    if ((this.a.a.t != null) && (this.a.a.t.length() > 0))
    {
      aj.a(this.a, aj.d(this.a), str);
      return;
    }
    aj.a(this.a, str);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.views.m
 * JD-Core Version:    0.6.0
 */