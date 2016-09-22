package android.support.v7.widget;

import android.support.v4.view.bg;
import com.wandoujia.jupiter.paid.a.c;

final class ci extends c
{
  private ci(RecyclerView paramRecyclerView)
  {
  }

  private void b()
  {
    if ((RecyclerView.n(this.a)) && (RecyclerView.o(this.a)) && (RecyclerView.p(this.a)))
    {
      bg.a(this.a, RecyclerView.q(this.a));
      return;
    }
    RecyclerView.r(this.a);
    this.a.requestLayout();
  }

  public final void a()
  {
    this.a.a(null);
    RecyclerView.g(this.a);
    cm.a(this.a.e, true);
    RecyclerView.m(this.a);
    if (!this.a.b.d())
      this.a.requestLayout();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.b.a(paramInt1, paramInt2))
      b();
  }

  public final void b(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.b.b(paramInt1, paramInt2))
      b();
  }

  public final void c(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.b.c(paramInt1, paramInt2))
      b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ci
 * JD-Core Version:    0.6.0
 */