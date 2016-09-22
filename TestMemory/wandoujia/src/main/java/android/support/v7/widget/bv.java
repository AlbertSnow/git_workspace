package android.support.v7.widget;

import android.support.v4.c.a;

final class bv
  implements Runnable
{
  bv(RecyclerView paramRecyclerView)
  {
  }

  public final void run()
  {
    if (!RecyclerView.a(this.a));
    do
    {
      return;
      if (!RecyclerView.b(this.a))
        continue;
      a.a("RV FullInvalidate");
      this.a.c();
      a.a();
      return;
    }
    while (!this.a.b.d());
    a.a("RV PartialInvalidate");
    this.a.b();
    this.a.b.b();
    if (!RecyclerView.c(this.a))
      this.a.d();
    this.a.a(true);
    a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bv
 * JD-Core Version:    0.6.0
 */