package com.alipay.android.mini.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class v
  implements View.OnTouchListener
{
  v(YearMonthPicker paramYearMonthPicker)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
    {
      if (YearMonthPicker.a(this.a))
        YearMonthPicker.c(this.a, false);
      if (YearMonthPicker.d(this.a))
        YearMonthPicker.d(this.a, false);
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.v
 * JD-Core Version:    0.6.0
 */