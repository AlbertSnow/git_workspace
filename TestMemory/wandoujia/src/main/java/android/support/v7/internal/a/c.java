package android.support.v7.internal.a;

import android.support.v4.view.bg;
import android.support.v4.view.di;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

final class c extends di
{
  c(b paramb)
  {
  }

  public final void b(View paramView)
  {
    if ((b.a(this.a)) && (b.b(this.a) != null))
    {
      bg.b(b.b(this.a), 0.0F);
      bg.b(b.c(this.a), 0.0F);
    }
    if (b.d(this.a) != null)
      b.h();
    b.c(this.a).setVisibility(8);
    b.c(this.a).setTransitioning(false);
    b.e(this.a);
    b localb = this.a;
    if (localb.c != null)
    {
      localb.c.a(localb.b);
      localb.b = null;
      localb.c = null;
    }
    if (b.f(this.a) != null)
      bg.w(b.f(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.a.c
 * JD-Core Version:    0.6.0
 */