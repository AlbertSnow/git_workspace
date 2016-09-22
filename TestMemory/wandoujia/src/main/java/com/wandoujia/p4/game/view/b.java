package com.wandoujia.p4.game.view;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class b
{
  private final List<View> a = new ArrayList();
  private final LayoutConfiguration b;
  private final int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h = 0;
  private int i = 0;

  public b(int paramInt, LayoutConfiguration paramLayoutConfiguration)
  {
    this.c = paramInt;
    this.b = paramLayoutConfiguration;
  }

  public final int a()
  {
    return this.h;
  }

  public final void a(int paramInt)
  {
    int j = this.g - this.e;
    this.g = paramInt;
    this.e = (paramInt - j);
  }

  public final void a(int paramInt, View paramView)
  {
    FlowLayout.LayoutParams localLayoutParams = (FlowLayout.LayoutParams)paramView.getLayoutParams();
    this.a.add(paramInt, paramView);
    this.d = (this.f + localLayoutParams.b());
    this.f = (this.d + localLayoutParams.e());
    this.g = Math.max(this.g, localLayoutParams.c() + localLayoutParams.f());
    this.e = Math.max(this.e, localLayoutParams.c());
  }

  public final void a(View paramView)
  {
    a(this.a.size(), paramView);
  }

  public final int b()
  {
    return this.g;
  }

  public final void b(int paramInt)
  {
    int j = this.f - this.d;
    this.d = paramInt;
    this.f = (j + paramInt);
  }

  public final boolean b(View paramView)
  {
    FlowLayout.LayoutParams localLayoutParams = (FlowLayout.LayoutParams)paramView.getLayoutParams();
    if (localLayoutParams != null);
    for (int j = localLayoutParams.e(); ; j = 0)
    {
      if (this.b.a() == 0);
      for (int k = j + paramView.getMeasuredWidth(); ; k = j + paramView.getMeasuredHeight())
      {
        int m = k + this.f;
        int n = this.c;
        int i1 = 0;
        if (m <= n)
          i1 = 1;
        return i1;
      }
    }
  }

  public final int c()
  {
    return this.d;
  }

  public final void c(int paramInt)
  {
    this.h = (paramInt + this.h);
  }

  public final int d()
  {
    return this.i;
  }

  public final void d(int paramInt)
  {
    this.i = (paramInt + this.i);
  }

  public final List<View> e()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.view.b
 * JD-Core Version:    0.6.0
 */