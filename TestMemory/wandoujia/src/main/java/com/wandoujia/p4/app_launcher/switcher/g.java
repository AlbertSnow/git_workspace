package com.wandoujia.p4.app_launcher.switcher;

import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;
import com.wandoujia.p4.app_launcher.g.a;
import com.wandoujia.p4.app_launcher.manager.m;

public final class g extends BaseSwitcher
{
  private boolean a = false;
  private SurfaceHolder b;
  private m c;
  private boolean d = false;

  private void b()
  {
    this.d = false;
    if (this.c != null)
    {
      this.c.c();
      this.c.a();
      this.c = null;
    }
  }

  private void g()
  {
    if (!this.a)
    {
      ViewGroup localViewGroup = (ViewGroup)d().getView();
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(1, 1);
      localViewGroup.addView(new h(this, localViewGroup.getContext()), localLayoutParams);
      this.a = true;
    }
  }

  public final BaseSwitcher.Type a()
  {
    return BaseSwitcher.Type.FlashLight;
  }

  protected final void a(View paramView)
  {
    super.a(paramView);
    if (this.d)
      b();
    while (true)
    {
      f();
      return;
      this.c = new m();
      this.c.a(this.b);
      this.d = this.c.b();
      if (this.d)
        continue;
      b();
    }
  }

  public final void c()
  {
    super.c();
    b();
  }

  public final long e()
  {
    g();
    if (this.d)
      return 1L;
    return 0L;
  }

  protected final void f()
  {
    g();
    if (this.d)
      d().a().setIconBigByResource(2130838713);
    while (true)
    {
      d().b().setText(2131625474);
      return;
      d().a().setIconBigByResource(2130838712);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.g
 * JD-Core Version:    0.6.0
 */