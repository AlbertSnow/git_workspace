package com.wandoujia.jupiter.category.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class b
  implements View.OnTouchListener
{
  b(CategoryScrollView paramCategoryScrollView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (CategoryScrollView.b(this.a) == null);
    do
    {
      return false;
      if (paramMotionEvent.getAction() != 1)
        continue;
      CategoryScrollView.d(this.a);
      return false;
    }
    while ((paramMotionEvent.getAction() != 2) || (CategoryScrollView.e(this.a) == 1));
    CategoryScrollView.a(this.a, 1);
    CategoryScrollView.b(this.a).a(CategoryScrollView.e(this.a));
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.view.b
 * JD-Core Version:    0.6.0
 */