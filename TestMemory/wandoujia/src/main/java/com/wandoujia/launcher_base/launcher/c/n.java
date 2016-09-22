package com.wandoujia.launcher_base.launcher.c;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.launcher_base.R.id;
import com.wandoujia.launcher_base.R.layout;
import com.wandoujia.launcher_base.launcher.view.LauncherGridView;
import com.wandoujia.launcher_base.utils.h;

public final class n
{
  public static final int a = R.id.launcher_page_key;
  private static int b = 0;
  private final int c;
  private int d;
  private b e;
  private View f;
  private LauncherGridView g;

  public n()
  {
    b = 1 + b;
    this.c = b;
  }

  private void f()
  {
    ViewGroup localViewGroup;
    if ((this.g == null) && (this.f != null) && (this.e != null))
    {
      localViewGroup = (ViewGroup)this.f;
      if (!this.e.a())
        break label87;
    }
    label87: for (int i = R.layout.launcher_grid_scroll; ; i = R.layout.launcher_grid)
    {
      this.g = ((LauncherGridView)h.a(localViewGroup, i).findViewById(R.id.launcher_grid));
      if (this.e != null)
      {
        this.g.setAdapter(this.e);
        this.g.a();
      }
      return;
    }
  }

  public final int a()
  {
    return this.c;
  }

  protected final View a(ViewGroup paramViewGroup)
  {
    if (this.f == null)
    {
      this.f = h.b(paramViewGroup, R.layout.launcher_page);
      this.f.setTag(a, Integer.valueOf(this.c));
      f();
    }
    return this.f;
  }

  protected final void a(int paramInt)
  {
    this.d = paramInt;
  }

  public final void a(b paramb)
  {
    paramb.a(this.c);
    this.e = paramb;
    if (this.g != null)
    {
      this.g.setAdapter(this.e);
      this.g.a();
      return;
    }
    f();
  }

  public final int b()
  {
    return this.d;
  }

  protected final void c()
  {
    for (int i = 0; i < this.e.b(); i++)
      this.e.b(i).a();
  }

  protected final void d()
  {
    for (int i = 0; i < this.e.b(); i++)
      this.e.b(i).b();
  }

  protected final void e()
  {
    for (int i = 0; i < this.e.b(); i++)
      this.e.b(i).d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.c.n
 * JD-Core Version:    0.6.0
 */