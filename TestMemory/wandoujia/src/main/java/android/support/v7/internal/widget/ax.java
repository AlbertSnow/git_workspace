package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.a;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

final class ax
  implements View.OnClickListener
{
  private a a = new a(aw.a(this.b).getContext(), aw.b(this.b));

  ax(aw paramaw)
  {
  }

  public final void onClick(View paramView)
  {
    if ((aw.c(this.b) != null) && (aw.d(this.b)))
      aw.c(this.b).onMenuItemSelected(0, this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ax
 * JD-Core Version:    0.6.0
 */