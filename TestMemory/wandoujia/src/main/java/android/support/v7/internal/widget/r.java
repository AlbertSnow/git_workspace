package android.support.v7.internal.widget;

import android.support.v4.view.j;
import android.support.v7.widget.ListPopupWindow;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class r
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  r(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onGlobalLayout()
  {
    if (this.a.c())
    {
      if (this.a.isShown())
        break label31;
      ActivityChooserView.b(this.a).a();
    }
    label31: 
    do
    {
      return;
      ActivityChooserView.b(this.a).c();
    }
    while (this.a.a == null);
    this.a.a.a(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.r
 * JD-Core Version:    0.6.0
 */