package android.support.v7.widget;

import android.view.View;

final class f extends bi
{
  f(e parame, View paramView)
  {
    super(paramView);
  }

  public final ListPopupWindow a()
  {
    if (ActionMenuPresenter.a(this.a.a) == null)
      return null;
    return ActionMenuPresenter.a(this.a.a).d();
  }

  public final boolean b()
  {
    this.a.a.f();
    return true;
  }

  public final boolean c()
  {
    if (ActionMenuPresenter.b(this.a.a) != null)
      return false;
    this.a.a.g();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.f
 * JD-Core Version:    0.6.0
 */