package android.support.v7.internal.view.menu;

import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.bi;

final class b extends bi
{
  public b(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }

  public final ListPopupWindow a()
  {
    if (ActionMenuItemView.a(this.a) != null)
      return ActionMenuItemView.a(this.a).a();
    return null;
  }

  protected final boolean b()
  {
    k localk = ActionMenuItemView.b(this.a);
    int i = 0;
    if (localk != null)
    {
      boolean bool1 = ActionMenuItemView.b(this.a).a(ActionMenuItemView.c(this.a));
      i = 0;
      if (bool1)
      {
        ListPopupWindow localListPopupWindow = a();
        i = 0;
        if (localListPopupWindow != null)
        {
          boolean bool2 = localListPopupWindow.b();
          i = 0;
          if (bool2)
            i = 1;
        }
      }
    }
    return i;
  }

  protected final boolean c()
  {
    ListPopupWindow localListPopupWindow = a();
    if (localListPopupWindow != null)
    {
      localListPopupWindow.a();
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.b
 * JD-Core Version:    0.6.0
 */