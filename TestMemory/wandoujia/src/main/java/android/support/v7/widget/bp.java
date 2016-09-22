package android.support.v7.widget;

import android.widget.PopupWindow;

final class bp
  implements Runnable
{
  private bp(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void run()
  {
    if ((ListPopupWindow.a(this.a) != null) && (ListPopupWindow.a(this.a).getCount() > ListPopupWindow.a(this.a).getChildCount()) && (ListPopupWindow.a(this.a).getChildCount() <= this.a.b))
    {
      ListPopupWindow.b(this.a).setInputMethodMode(2);
      this.a.c();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bp
 * JD-Core Version:    0.6.0
 */