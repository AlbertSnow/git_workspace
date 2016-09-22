package android.support.v7.internal.widget;

import android.support.v4.view.cu;
import android.support.v4.view.dh;
import android.support.v7.widget.ActionMenuView;
import android.view.View;

public final class b
  implements dh
{
  int a;
  private boolean b = false;

  protected b(a parama)
  {
  }

  public final b a(cu paramcu, int paramInt)
  {
    this.c.g = paramcu;
    this.a = paramInt;
    return this;
  }

  public final void a(View paramView)
  {
    this.c.setVisibility(0);
    this.b = false;
  }

  public final void b(View paramView)
  {
    if (this.b);
    do
    {
      return;
      this.c.g = null;
      this.c.setVisibility(this.a);
    }
    while ((this.c.d == null) || (this.c.b == null));
    this.c.b.setVisibility(this.a);
  }

  public final void c(View paramView)
  {
    this.b = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.b
 * JD-Core Version:    0.6.0
 */