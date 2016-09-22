package com.wandoujia.p4.views;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class c
  implements View.OnKeyListener
{
  c(CommonPopupView paramCommonPopupView)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0));
    try
    {
      this.a.b();
      label19: return true;
      return false;
    }
    catch (RuntimeException localRuntimeException)
    {
      break label19;
    }
    catch (NullPointerException localNullPointerException)
    {
      break label19;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.c
 * JD-Core Version:    0.6.0
 */