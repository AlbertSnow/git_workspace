package com.wandoujia.base.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class e
  implements Runnable
{
  e(View paramView)
  {
  }

  @TargetApi(3)
  public final void run()
  {
    ((InputMethodManager)this.a.getContext().getSystemService("input_method")).showSoftInput(this.a, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.e
 * JD-Core Version:    0.6.0
 */