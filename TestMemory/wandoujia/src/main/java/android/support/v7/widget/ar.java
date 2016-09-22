package android.support.v7.widget;

import android.support.v4.view.bx;
import android.view.View;

class ar
{
  private int a;
  private int b;
  private int c;

  private ar()
  {
    a();
  }

  protected int a(GridLayout paramGridLayout, View paramView, an paraman, int paramInt, boolean paramBoolean)
  {
    return this.a - paraman.a(paramView, paramInt, bx.b(paramGridLayout));
  }

  protected int a(boolean paramBoolean)
  {
    if ((!paramBoolean) && (GridLayout.a(this.c)))
      return 100000;
    return this.a + this.b;
  }

  protected void a()
  {
    this.a = -2147483648;
    this.b = -2147483648;
    this.c = 2;
  }

  protected void a(int paramInt1, int paramInt2)
  {
    this.a = Math.max(this.a, paramInt1);
    this.b = Math.max(this.b, paramInt2);
  }

  protected final void a(GridLayout paramGridLayout, View paramView, av paramav, ap paramap, int paramInt)
  {
    int i = this.c;
    if ((paramav.d == GridLayout.b) && (paramav.e == 0.0F));
    for (int j = 0; ; j = 2)
    {
      this.c = (j & i);
      int k = paramav.a(paramap.a).a(paramView, paramInt, bx.b(paramGridLayout));
      a(k, paramInt - k);
      return;
    }
  }

  public String toString()
  {
    return "Bounds{before=" + this.a + ", after=" + this.b + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ar
 * JD-Core Version:    0.6.0
 */