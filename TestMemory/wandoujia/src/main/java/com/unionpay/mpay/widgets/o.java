package com.unionpay.mpay.widgets;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;

final class o extends Dialog
{
  o(Context paramContext)
  {
    super(paramContext);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
      return true;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.o
 * JD-Core Version:    0.6.0
 */