package android.support.v7.widget;

import android.content.Context;
import android.support.v7.appcompat.R.attr;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.v;
import android.view.View;

final class g extends v
{
  public g(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, i parami, View paramView)
  {
    super(paramContext, parami, paramView, true, R.attr.actionOverflowMenuStyle);
    a();
    a(paramActionMenuPresenter.e);
  }

  public final void onDismiss()
  {
    super.onDismiss();
    ActionMenuPresenter.c(this.c).close();
    ActionMenuPresenter.a(this.c, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.g
 * JD-Core Version:    0.6.0
 */