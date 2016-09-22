package android.support.v7.internal.view;

import android.support.v4.view.dh;
import android.support.v4.view.di;
import android.view.View;
import java.util.ArrayList;

final class i extends di
{
  private boolean a = false;
  private int b = 0;

  i(h paramh)
  {
  }

  public final void a(View paramView)
  {
    if (this.a);
    do
    {
      return;
      this.a = true;
    }
    while (h.a(this.c) == null);
    h.a(this.c).a(null);
  }

  public final void b(View paramView)
  {
    int i = 1 + this.b;
    this.b = i;
    if (i == h.c(this.c).size())
    {
      if (h.a(this.c) != null)
        h.a(this.c).b(null);
      this.b = 0;
      this.a = false;
      h.b(this.c);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.i
 * JD-Core Version:    0.6.0
 */