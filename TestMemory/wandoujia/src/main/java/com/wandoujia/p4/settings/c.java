package com.wandoujia.p4.settings;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class c
  implements View.OnTouchListener
{
  c(FollowUsTipsTransparentActivity paramFollowUsTipsTransparentActivity)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    switch (paramMotionEvent.getAction())
    {
    case 1:
    default:
    case 0:
      while (true)
      {
        return false;
        FollowUsTipsTransparentActivity.a(this.a, paramMotionEvent.getRawY());
      }
    case 2:
    }
    float f2 = paramMotionEvent.getRawY() - FollowUsTipsTransparentActivity.a(this.a);
    float f3 = f2 + paramView.getTop();
    float f4 = f2 + paramView.getBottom();
    float f5;
    if (f3 < 0.0F)
      f5 = 0.0F + paramView.getHeight();
    while (true)
    {
      float f6 = -50 + this.a.getResources().getDisplayMetrics().heightPixels;
      if (f5 > f6)
      {
        f1 = f6 - paramView.getHeight();
        f5 = f6;
      }
      paramView.layout(paramView.getLeft(), (int)f1, paramView.getRight(), (int)f5);
      FollowUsTipsTransparentActivity.a(this.a, paramMotionEvent.getRawY());
      break;
      f1 = f3;
      f5 = f4;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.c
 * JD-Core Version:    0.6.0
 */