package android.support.v7.app;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.view.Window;
import android.view.Window.Callback;

final class z
  implements y
{
  private z(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7)
  {
  }

  public final void a(i parami, boolean paramBoolean)
  {
    i locali = parami.o();
    if (locali != parami);
    AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState;
    for (int i = 1; ; i = 0)
    {
      AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = this.a;
      if (i != 0)
        parami = locali;
      localPanelFeatureState = AppCompatDelegateImplV7.a(localAppCompatDelegateImplV7, parami);
      if (localPanelFeatureState != null)
      {
        if (i == 0)
          break;
        AppCompatDelegateImplV7.a(this.a, localPanelFeatureState.a, localPanelFeatureState, locali);
        AppCompatDelegateImplV7.a(this.a, localPanelFeatureState, true);
      }
      return;
    }
    AppCompatDelegateImplV7.a(this.a, localPanelFeatureState, paramBoolean);
  }

  public final boolean a(i parami)
  {
    if ((parami == null) && (this.a.d))
    {
      Window.Callback localCallback = this.a.b.getCallback();
      if ((localCallback != null) && (!this.a.n()))
        localCallback.onMenuOpened(8, parami);
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.z
 * JD-Core Version:    0.6.0
 */