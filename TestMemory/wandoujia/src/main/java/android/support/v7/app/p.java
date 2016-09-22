package android.support.v7.app;

import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

final class p extends o
{
  private boolean m = true;

  p(Context paramContext, Window paramWindow, k paramk)
  {
    super(paramContext, paramWindow, paramk);
  }

  final Window.Callback a(Window.Callback paramCallback)
  {
    return new q(this, paramCallback);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.p
 * JD-Core Version:    0.6.0
 */