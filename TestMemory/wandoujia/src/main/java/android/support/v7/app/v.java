package android.support.v7.app;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.view.Window;
import android.view.Window.Callback;

final class v
  implements y
{
  private v(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7)
  {
  }

  public final void a(i parami, boolean paramBoolean)
  {
    AppCompatDelegateImplV7.a(this.a, parami);
  }

  public final boolean a(i parami)
  {
    Window.Callback localCallback = this.a.b.getCallback();
    if (localCallback != null)
      localCallback.onMenuOpened(8, parami);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.v
 * JD-Core Version:    0.6.0
 */