package android.support.v4.widget;

import android.support.v4.view.bg;

final class c
  implements Runnable
{
  private c(a parama)
  {
  }

  public final void run()
  {
    if (!a.a(this.a))
      return;
    if (a.b(this.a))
    {
      a.c(this.a);
      a.d(this.a).c();
    }
    b localb = a.d(this.a);
    if ((localb.e()) || (!a.e(this.a)))
    {
      a.f(this.a);
      return;
    }
    if (a.g(this.a))
    {
      a.h(this.a);
      a.i(this.a);
    }
    localb.f();
    int i = localb.i();
    this.a.a(i);
    bg.a(a.j(this.a), this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.c
 * JD-Core Version:    0.6.0
 */