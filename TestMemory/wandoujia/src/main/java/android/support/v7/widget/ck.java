package android.support.v7.widget;

import android.view.View;

public abstract class ck
{
  private int a = -1;
  private RecyclerView b;
  private ce c;
  private boolean d;
  private boolean e;
  private View f;
  private final cl g = new cl();

  protected abstract void a();

  protected abstract void a(int paramInt1, int paramInt2, cl paramcl);

  final void a(RecyclerView paramRecyclerView, ce paramce)
  {
    this.b = paramRecyclerView;
    this.c = paramce;
    if (this.a == -1)
      throw new IllegalArgumentException("Invalid target position");
    cm.c(this.b.e, this.a);
    this.e = true;
    this.d = true;
    int i = this.a;
    this.f = RecyclerView.e(this.b).b(i);
    RecyclerView.w(this.b).a();
  }

  protected final void a(View paramView)
  {
    if (RecyclerView.d(paramView) == this.a)
      this.f = paramView;
  }

  protected abstract void a(View paramView, cl paramcl);

  public final ce b()
  {
    return this.c;
  }

  public final void b(int paramInt)
  {
    this.a = paramInt;
  }

  protected final void c()
  {
    if (!this.e)
      return;
    a();
    cm.c(this.b.e, -1);
    this.f = null;
    this.a = -1;
    this.d = false;
    this.e = false;
    ce.a(this.c, this);
    this.c = null;
    this.b = null;
  }

  public final void c(int paramInt)
  {
    this.b.a(paramInt);
  }

  public final boolean d()
  {
    return this.d;
  }

  public final boolean e()
  {
    return this.e;
  }

  public final int f()
  {
    return this.a;
  }

  public final int g()
  {
    return RecyclerView.e(this.b).p();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.ck
 * JD-Core Version:    0.6.0
 */