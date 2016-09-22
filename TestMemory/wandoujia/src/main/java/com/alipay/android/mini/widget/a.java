package com.alipay.android.mini.widget;

import android.os.Handler;

final class a
  implements Runnable
{
  a(YearMonthPicker paramYearMonthPicker)
  {
  }

  public final void run()
  {
    if (YearMonthPicker.a(this.a))
    {
      if (YearMonthPicker.b(this.a))
        this.a.e();
      if (YearMonthPicker.c(this.a))
        this.a.f();
      this.a.a.postDelayed(new a(this.a), 100L);
    }
    if (YearMonthPicker.d(this.a))
    {
      if (YearMonthPicker.b(this.a))
        this.a.g();
      if (YearMonthPicker.c(this.a))
        this.a.h();
      this.a.a.postDelayed(new a(this.a), 100L);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.a
 * JD-Core Version:    0.6.0
 */