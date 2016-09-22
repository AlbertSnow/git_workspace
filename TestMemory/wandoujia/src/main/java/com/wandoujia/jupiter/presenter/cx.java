package com.wandoujia.jupiter.presenter;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.wandoujia.jupiter.library.activity.LibActivity;

final class cx
  implements View.OnTouchListener
{
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramView.getContext() instanceof LibActivity))
      return ((LibActivity)paramView.getContext()).a();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cx
 * JD-Core Version:    0.6.0
 */