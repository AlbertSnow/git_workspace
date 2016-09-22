package android.support.v7.widget;

import android.support.v7.internal.view.menu.i;
import android.view.View;

final class d
  implements Runnable
{
  private g a;

  public d(ActionMenuPresenter paramActionMenuPresenter, g paramg)
  {
    this.a = paramg;
  }

  public final void run()
  {
    ActionMenuPresenter.g(this.b).f();
    View localView = (View)ActionMenuPresenter.h(this.b);
    if ((localView != null) && (localView.getWindowToken() != null) && (this.a.e()))
      ActionMenuPresenter.a(this.b, this.a);
    ActionMenuPresenter.i(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.d
 * JD-Core Version:    0.6.0
 */