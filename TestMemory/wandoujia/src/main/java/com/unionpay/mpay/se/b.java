package com.unionpay.mpay.se;

import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.mpay.widgets.k;
import java.util.List;

final class b
  implements View.OnClickListener
{
  b(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    if (a.a(this.a))
      return;
    a.b(this.a).d();
    com.unionpay.mpay_2.upview.c localc = a.b(this.a).b();
    if (!localc.a())
    {
      a.a(this.a, localc.a);
      return;
    }
    if ((a.c(this.a) != null) && (!a.c(this.a).e()))
    {
      a.b(this.a, a.c(this.a).b());
      return;
    }
    if ((a.d(this.a) != null) && (!a.d(this.a).e()))
    {
      a.c(this.a, a.d(this.a).b());
      return;
    }
    a.e(this.a).a(com.unionpay.mpay.b.c.ab.B);
    a.b(this.a).a(false);
    a.a(this.a, (com.unionpay.pboctransaction.model.b)a.g(this.a).h.get(a.f(this.a).B), a.b(this.a).b().a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.se.b
 * JD-Core Version:    0.6.0
 */