package android.support.v7.widget;

import android.content.Context;
import android.support.v7.appcompat.R.attr;
import android.support.v7.internal.view.menu.ac;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.v;
import android.view.MenuItem;
import android.view.View;

final class b extends v
{
  public b(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, ac paramac)
  {
    super(paramContext, paramac, null, false, R.attr.actionOverflowMenuStyle);
    View localView;
    int i;
    if (!((m)paramac.getItem()).h())
    {
      if (ActionMenuPresenter.d(paramActionMenuPresenter) == null)
      {
        localView = (View)ActionMenuPresenter.e(paramActionMenuPresenter);
        a(localView);
      }
    }
    else
    {
      a(paramActionMenuPresenter.e);
      i = paramac.size();
    }
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        MenuItem localMenuItem = paramac.getItem(j);
        if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null))
          continue;
        bool = true;
      }
      a(bool);
      return;
      localView = ActionMenuPresenter.d(paramActionMenuPresenter);
      break;
    }
  }

  public final void onDismiss()
  {
    super.onDismiss();
    ActionMenuPresenter.f(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.b
 * JD-Core Version:    0.6.0
 */