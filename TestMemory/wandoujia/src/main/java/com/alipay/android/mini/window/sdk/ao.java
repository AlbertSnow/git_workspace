package com.alipay.android.mini.window.sdk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import com.alipay.wandoujia.ra;
import com.wandoujia.jupiter.d.a;

final class ao
  implements View.OnClickListener
{
  private a a;

  ao(am paramam)
  {
  }

  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    a locala1;
    if ((am.c(this.b) != null) && (i == am.c(this.b).getId()))
    {
      this.a = am.d(this.b);
      a locala2 = am.e(this.b);
      locala1 = null;
      if (locala2 != null)
        locala1 = am.e(this.b);
    }
    while ((locala1 != null) && (ra.a$65b37f89(this.a) == ra.a))
    {
      if (this.b.a(ra.a$65b37f89(this.a)))
        this.b.a(paramView, new ap(this, ra.a$65b37f89(locala1)));
      return;
      if ((am.f(this.b) != null) && (i == am.f(this.b).getId()))
      {
        this.a = am.g(this.b);
        locala1 = null;
        continue;
      }
      if ((am.b(this.b) != null) && (i == am.b(this.b).getId()))
      {
        this.a = am.h(this.b);
        locala1 = null;
        continue;
      }
      Button localButton = am.i(this.b);
      locala1 = null;
      if (localButton == null)
        continue;
      int j = am.i(this.b).getId();
      locala1 = null;
      if (i != j)
        continue;
      this.a = am.j(this.b);
      locala1 = null;
    }
    this.b.a(paramView, new com.alipay.wandoujia.am(ra.a$65b37f89(this.a)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.ao
 * JD-Core Version:    0.6.0
 */