package com.wandoujia.p4.app_launcher.switcher;

import android.os.Handler;
import android.view.View;
import com.wandoujia.launcher_base.b.a;

public abstract class StateSwitcher extends BaseSwitcher
{
  private StateSwitcher.State a;

  protected final void a(View paramView)
  {
    super.a(paramView);
    switch (r.a[this.a.ordinal()])
    {
    default:
      return;
    case 1:
      a(paramView, false);
      return;
    case 2:
    }
    a(paramView, true);
  }

  abstract void a(View paramView, boolean paramBoolean);

  abstract void a(StateSwitcher.State paramState);

  protected final void b(StateSwitcher.State paramState)
  {
    if (this.a != paramState)
    {
      this.a = paramState;
      a(paramState);
    }
  }

  abstract boolean b();

  public final long e()
  {
    return this.a.getValue();
  }

  protected final void f()
  {
    if (b());
    for (StateSwitcher.State localState = StateSwitcher.State.open; ; localState = StateSwitcher.State.close)
    {
      b(localState);
      return;
    }
  }

  protected final void g()
  {
    a.e().postDelayed(new q(this), 3000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.StateSwitcher
 * JD-Core Version:    0.6.0
 */