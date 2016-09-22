package com.nispok.snackbar;

final class m
  implements Runnable
{
  m(l paraml)
  {
  }

  public final void run()
  {
    Snackbar.d(this.a.a, System.currentTimeMillis());
    if (Snackbar.l(this.a.a) == -1L)
      Snackbar.e(this.a.a, this.a.a.getDuration());
    if (Snackbar.n(this.a.a))
      Snackbar.o(this.a.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.m
 * JD-Core Version:    0.6.0
 */