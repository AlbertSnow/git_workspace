package com.alipay.android.mini.widget;

import android.os.Handler;
import android.view.View;
import android.view.View.OnLongClickListener;

final class u
  implements View.OnLongClickListener
{
  u(YearMonthPicker paramYearMonthPicker, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    boolean bool1 = true;
    YearMonthPicker.a(this.a, this.b);
    YearMonthPicker localYearMonthPicker1 = this.a;
    if (this.b);
    for (boolean bool2 = false; ; bool2 = bool1)
    {
      YearMonthPicker.b(localYearMonthPicker1, bool2);
      YearMonthPicker.c(this.a, this.c);
      YearMonthPicker localYearMonthPicker2 = this.a;
      if (this.c)
        bool1 = false;
      YearMonthPicker.d(localYearMonthPicker2, bool1);
      this.a.a.post(new a(this.a));
      return false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.u
 * JD-Core Version:    0.6.0
 */