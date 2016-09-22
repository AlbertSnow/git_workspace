package android.support.v7.app;

import android.support.v4.view.as;
import android.support.v4.view.bg;
import android.support.v4.view.dk;
import android.view.View;

final class s
  implements as
{
  s(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7)
  {
  }

  public final dk a(View paramView, dk paramdk)
  {
    int i = paramdk.b();
    int j = AppCompatDelegateImplV7.b(this.a, i);
    if (i != j)
      paramdk = paramdk.a(paramdk.a(), j, paramdk.c(), paramdk.d());
    return bg.a(paramView, paramdk);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.s
 * JD-Core Version:    0.6.0
 */