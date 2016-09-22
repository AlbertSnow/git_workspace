package com.wandoujia.launcher.a;

import android.support.v7.widget.by;
import android.support.v7.widget.co;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

public abstract class a<T extends co> extends by<T>
{
  private SparseArray<View> a = new SparseArray();
  private SparseArray<View> b = new SparseArray();

  private int e()
  {
    if (this.a == null)
      return 0;
    return this.a.size();
  }

  public final int a()
  {
    int i = c() + e();
    if (this.b == null);
    for (int j = 0; ; j = this.b.size())
      return j + i;
  }

  public final int a(int paramInt)
  {
    if (paramInt < e())
      return this.a.keyAt(paramInt);
    int i = paramInt - e();
    if (i < c())
      return 0;
    return this.b.keyAt(i - c());
  }

  protected abstract T a(View paramView);

  public final T a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt == 0)
      return d();
    View localView1 = (View)this.a.get(paramInt);
    if (localView1 != null)
      return a(localView1);
    View localView2 = (View)this.b.get(paramInt);
    if (localView2 != null)
      return a(localView2);
    return null;
  }

  public final void a(T paramT, int paramInt)
  {
    int i = paramInt - e();
    if ((i >= 0) && (i < c()))
      c(paramT, i);
  }

  public final void b(View paramView)
  {
    this.a.put(2147483647 - this.a.size(), paramView);
    b();
  }

  protected abstract int c();

  protected abstract void c(T paramT, int paramInt);

  public final void c(View paramView)
  {
    this.b.put(-2147483647 + this.b.size(), paramView);
    b();
  }

  protected abstract T d();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.a.a
 * JD-Core Version:    0.6.0
 */