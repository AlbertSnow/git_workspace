package com.wandoujia.p4.views;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import com.wandoujia.jupiter.util.n;

final class d
  implements Runnable
{
  d(CommonPopupView paramCommonPopupView)
  {
  }

  public final void run()
  {
    ((ViewGroup)CommonPopupView.a(this.a).getWindow().getDecorView()).removeView(this.a);
    if (CommonPopupView.b(this.a) != null)
      CommonPopupView.b(this.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.d
 * JD-Core Version:    0.6.0
 */