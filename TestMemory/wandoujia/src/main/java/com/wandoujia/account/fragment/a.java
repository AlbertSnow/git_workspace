package com.wandoujia.account.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.wandoujia.base.utils.KeyboardUtils;

final class a
  implements View.OnTouchListener
{
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    KeyboardUtils.hideSoftInput(paramView);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.a
 * JD-Core Version:    0.6.0
 */