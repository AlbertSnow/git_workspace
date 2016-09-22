package com.unionpay.mpay.widgets;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class ai
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  ai(UPPinWidget paramUPPinWidget)
  {
  }

  public final void onGlobalLayout()
  {
    int i = UPPinWidget.a(this.a).getRootView().getHeight() - UPPinWidget.a(this.a).getHeight();
    if ((i <= UPPinWidget.i()) && (i <= UPPinWidget.i()))
      this.a.h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.ai
 * JD-Core Version:    0.6.0
 */