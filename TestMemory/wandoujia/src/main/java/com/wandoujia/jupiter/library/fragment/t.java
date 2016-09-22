package com.wandoujia.jupiter.library.fragment;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;

final class t
  implements Runnable
{
  t(AppUpgradeFragment paramAppUpgradeFragment)
  {
  }

  public final void run()
  {
    AppUpgradeFragment.d(this.a).setOnClickListener(new u(this));
    Rect localRect = new Rect();
    AppUpgradeFragment.d(this.a).getHitRect(localRect);
    int i = (int)TypedValue.applyDimension(1, 10.0F, AppUpgradeFragment.e(this.a).getResources().getDisplayMetrics());
    localRect.top -= i;
    localRect.bottom = (i + localRect.bottom);
    localRect.left -= i;
    localRect.right = (i + localRect.right);
    TouchDelegate localTouchDelegate = new TouchDelegate(localRect, AppUpgradeFragment.d(this.a));
    ((View)AppUpgradeFragment.d(this.a).getParent()).setTouchDelegate(localTouchDelegate);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.t
 * JD-Core Version:    0.6.0
 */