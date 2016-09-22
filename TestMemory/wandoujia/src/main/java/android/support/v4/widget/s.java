package android.support.v4.widget;

import android.view.View;

final class s extends bl
{
  private final int a;
  private bi b;
  private final Runnable c = new t(this);

  public s(DrawerLayout paramDrawerLayout, int paramInt)
  {
    this.a = paramInt;
  }

  private void c()
  {
    int i = 3;
    if (this.a == i)
      i = 5;
    View localView = this.d.a(i);
    if (localView != null)
      this.d.e(localView);
  }

  public final void a()
  {
    this.d.removeCallbacks(this.c);
  }

  public final void a(int paramInt)
  {
    this.d.a(paramInt, this.b.c());
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0x1) == 1);
    for (View localView = this.d.a(3); ; localView = this.d.a(5))
    {
      if ((localView != null) && (this.d.a(localView) == 0))
        this.b.a(localView, paramInt2);
      return;
    }
  }

  public final void a(bi parambi)
  {
    this.b = parambi;
  }

  public final void a(View paramView, float paramFloat)
  {
    float f = DrawerLayout.b(paramView);
    int i = paramView.getWidth();
    int j;
    if (this.d.a(paramView, 3))
      if ((paramFloat > 0.0F) || ((paramFloat == 0.0F) && (f > 0.5F)))
        j = 0;
    while (true)
    {
      this.b.a(j, paramView.getTop());
      this.d.invalidate();
      return;
      j = -i;
      continue;
      j = this.d.getWidth();
      if ((paramFloat >= 0.0F) && ((paramFloat != 0.0F) || (f <= 0.5F)))
        continue;
      j -= i;
    }
  }

  public final void a(View paramView, int paramInt)
  {
    int i = paramView.getWidth();
    float f;
    if (this.d.a(paramView, 3))
    {
      f = (i + paramInt) / i;
      DrawerLayout.a(paramView, f);
      if (f != 0.0F)
        break label74;
    }
    label74: for (int j = 4; ; j = 0)
    {
      paramView.setVisibility(j);
      this.d.invalidate();
      return;
      f = (this.d.getWidth() - paramInt) / i;
      break;
    }
  }

  public final boolean a(View paramView)
  {
    return (DrawerLayout.d(paramView)) && (this.d.a(paramView, this.a)) && (this.d.a(paramView) == 0);
  }

  public final int b(View paramView, int paramInt)
  {
    if (this.d.a(paramView, 3))
      return Math.max(-paramView.getWidth(), Math.min(paramInt, 0));
    int i = this.d.getWidth();
    return Math.max(i - paramView.getWidth(), Math.min(paramInt, i));
  }

  public final void b()
  {
    this.d.postDelayed(this.c, 160L);
  }

  public final void b(View paramView)
  {
    ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).c = false;
    c();
  }

  public final int c(View paramView)
  {
    if (DrawerLayout.d(paramView))
      return paramView.getWidth();
    return 0;
  }

  public final int d(View paramView)
  {
    return paramView.getTop();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.s
 * JD-Core Version:    0.6.0
 */