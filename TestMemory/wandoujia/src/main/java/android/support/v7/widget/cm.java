package android.support.v7.widget;

import android.support.v4.e.a;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class cm
{
  a<co, cd> a = new a();
  a<co, cd> b = new a();
  a<Long, co> c = new a();
  final List<View> d = new ArrayList();
  int e = 0;
  private int f = -1;
  private int g = 0;
  private int h = 0;
  private boolean i = false;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;

  final void a(co paramco)
  {
    this.a.remove(paramco);
    this.b.remove(paramco);
    a locala;
    if (this.c != null)
      locala = this.c;
    for (int m = -1 + locala.size(); ; m--)
    {
      if (m >= 0)
      {
        if (paramco != locala.c(m))
          continue;
        locala.d(m);
      }
      this.d.remove(paramco.a);
      return;
    }
  }

  final void a(View paramView)
  {
    this.d.remove(paramView);
  }

  public final boolean a()
  {
    return this.j;
  }

  final void b(View paramView)
  {
    if (!this.d.contains(paramView))
      this.d.add(paramView);
  }

  public final boolean b()
  {
    return this.l;
  }

  public final int c()
  {
    return this.f;
  }

  public final boolean d()
  {
    return this.f != -1;
  }

  public final int e()
  {
    if (this.j)
      return this.g - this.h;
    return this.e;
  }

  public final String toString()
  {
    return "State{mTargetPosition=" + this.f + ", mPreLayoutHolderMap=" + this.a + ", mPostLayoutHolderMap=" + this.b + ", mData=" + null + ", mItemCount=" + this.e + ", mPreviousLayoutItemCount=" + this.g + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.h + ", mStructureChanged=" + this.i + ", mInPreLayout=" + this.j + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cm
 * JD-Core Version:    0.6.0
 */