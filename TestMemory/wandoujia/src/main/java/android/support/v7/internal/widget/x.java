package android.support.v7.internal.widget;

final class x
  implements Runnable
{
  private x(AdapterViewCompat paramAdapterViewCompat)
  {
  }

  public final void run()
  {
    if (this.a.m)
    {
      if (this.a.getAdapter() != null)
        this.a.post(this);
      return;
    }
    AdapterViewCompat.b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.x
 * JD-Core Version:    0.6.0
 */