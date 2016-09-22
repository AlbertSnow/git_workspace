package com.alipay.android.mini.window.sdk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.alipay.wandoujia.am;
import com.alipay.wandoujia.cv;
import com.alipay.wandoujia.ra;

final class z
  implements View.OnClickListener
{
  z(q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == q.j(this.a).getId())
      this.a.a(getClass(), new am(ra.a$65b37f89(q.k(this.a))));
    do
    {
      return;
      if (i != q.l(this.a).getId())
        continue;
      cv.a(paramView.getContext(), 0, null, q.m(this.a), q.n(this.a));
      return;
    }
    while (i != q.o(this.a).getId());
    cv.a(paramView.getContext(), 1, q.p(this.a), q.b(this.a), q.e(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.z
 * JD-Core Version:    0.6.0
 */