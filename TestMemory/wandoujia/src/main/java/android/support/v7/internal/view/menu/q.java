package android.support.v7.internal.view.menu;

import android.support.v7.b.c;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class q extends FrameLayout
  implements c
{
  final CollapsibleActionView a;

  q(View paramView)
  {
    super(paramView.getContext());
    this.a = ((CollapsibleActionView)paramView);
    addView(paramView);
  }

  public final void a()
  {
    this.a.onActionViewExpanded();
  }

  public final void b()
  {
    this.a.onActionViewCollapsed();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.q
 * JD-Core Version:    0.6.0
 */