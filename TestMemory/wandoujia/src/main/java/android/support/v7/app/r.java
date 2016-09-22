package android.support.v7.app;

final class r
  implements Runnable
{
  r(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7)
  {
  }

  public final void run()
  {
    if ((0x1 & AppCompatDelegateImplV7.a(this.a)) != 0)
      AppCompatDelegateImplV7.a(this.a, 0);
    if ((0x100 & AppCompatDelegateImplV7.a(this.a)) != 0)
      AppCompatDelegateImplV7.a(this.a, 8);
    AppCompatDelegateImplV7.b(this.a);
    AppCompatDelegateImplV7.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.r
 * JD-Core Version:    0.6.0
 */