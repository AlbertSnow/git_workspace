package android.support.v7.widget;

final class cb
{
  private cb(RecyclerView paramRecyclerView)
  {
  }

  public final void a(co paramco)
  {
    paramco.a(true);
    if ((!RecyclerView.c(this.a, paramco.a)) && (paramco.q()))
      this.a.removeDetachedView(paramco.a, false);
  }

  public final void b(co paramco)
  {
    paramco.a(true);
    if (!co.c(paramco))
      RecyclerView.c(this.a, paramco.a);
  }

  public final void c(co paramco)
  {
    paramco.a(true);
    if (!co.c(paramco))
      RecyclerView.c(this.a, paramco.a);
  }

  public final void d(co paramco)
  {
    paramco.a(true);
    if ((paramco.f != null) && (paramco.g == null))
    {
      paramco.f = null;
      paramco.a(-65, co.d(paramco));
    }
    paramco.g = null;
    if (!co.c(paramco))
      RecyclerView.c(this.a, paramco.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cb
 * JD-Core Version:    0.6.0
 */