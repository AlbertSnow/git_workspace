package android.support.v7.widget;

import android.view.View;

final class al extends ar
{
  private int a;

  al()
  {
    super(0);
  }

  protected final int a(GridLayout paramGridLayout, View paramView, an paraman, int paramInt, boolean paramBoolean)
  {
    return Math.max(0, super.a(paramGridLayout, paramView, paraman, paramInt, paramBoolean));
  }

  protected final int a(boolean paramBoolean)
  {
    return Math.max(super.a(paramBoolean), this.a);
  }

  protected final void a()
  {
    super.a();
    this.a = -2147483648;
  }

  protected final void a(int paramInt1, int paramInt2)
  {
    super.a(paramInt1, paramInt2);
    this.a = Math.max(this.a, paramInt1 + paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.al
 * JD-Core Version:    0.6.0
 */