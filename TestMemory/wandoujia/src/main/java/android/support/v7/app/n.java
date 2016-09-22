package android.support.v7.app;

import android.support.v7.internal.view.j;
import android.support.v7.internal.view.menu.i;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

class n extends j
{
  n(m paramm, Window.Callback paramCallback)
  {
    super(paramCallback);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (super.dispatchKeyEvent(paramKeyEvent))
      return true;
    return this.a.a(paramKeyEvent);
  }

  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    m localm = this.a;
    paramKeyEvent.getKeyCode();
    if (localm.b(paramKeyEvent))
      return true;
    return super.dispatchKeyShortcutEvent(paramKeyEvent);
  }

  public void onContentChanged()
  {
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if ((paramInt == 0) && (!(paramMenu instanceof i)))
      return false;
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    if (this.a.c(paramInt))
      return true;
    return super.onMenuOpened(paramInt, paramMenu);
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    if (this.a.b(paramInt))
      return;
    super.onPanelClosed(paramInt, paramMenu);
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    i locali;
    boolean bool;
    if ((paramMenu instanceof i))
    {
      locali = (i)paramMenu;
      if ((paramInt != 0) || (locali != null))
        break label34;
      bool = false;
    }
    label34: 
    do
    {
      return bool;
      locali = null;
      break;
      if (locali != null)
        locali.c(true);
      bool = super.onPreparePanel(paramInt, paramView, paramMenu);
    }
    while (locali == null);
    locali.c(false);
    return bool;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.n
 * JD-Core Version:    0.6.0
 */