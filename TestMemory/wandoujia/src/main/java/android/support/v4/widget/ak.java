package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

public final class ak
{
  private static am a;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new al();
      return;
    }
    a = new am();
  }

  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ak
 * JD-Core Version:    0.6.0
 */