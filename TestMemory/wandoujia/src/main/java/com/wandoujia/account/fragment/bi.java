package com.wandoujia.account.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class bi
  implements View.OnTouchListener
{
  bi(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.a.i != null)
      this.a.i.onViewWidgetClicked(paramView);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bi
 * JD-Core Version:    0.6.0
 */