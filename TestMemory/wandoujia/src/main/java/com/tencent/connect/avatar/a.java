package com.tencent.connect.avatar;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;

final class a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  a(ImageActivity paramImageActivity)
  {
  }

  public final void onGlobalLayout()
  {
    this.a.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    ImageActivity.a(this.a, ImageActivity.a(this.a).a());
    ImageActivity.c(this.a).a(ImageActivity.b(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.a
 * JD-Core Version:    0.6.0
 */