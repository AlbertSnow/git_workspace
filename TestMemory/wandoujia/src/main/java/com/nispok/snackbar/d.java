package com.nispok.snackbar;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.Display;

@TargetApi(17)
final class d extends b
{
  final void a(Display paramDisplay, Point paramPoint)
  {
    paramDisplay.getSize(paramPoint);
  }

  final void b(Display paramDisplay, Point paramPoint)
  {
    paramDisplay.getRealSize(paramPoint);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.d
 * JD-Core Version:    0.6.0
 */