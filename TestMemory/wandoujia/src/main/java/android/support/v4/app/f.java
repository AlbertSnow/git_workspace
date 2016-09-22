package android.support.v4.app;

import android.support.v4.e.a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

final class f
  implements ViewTreeObserver.OnPreDrawListener
{
  f(e parame, View paramView, Object paramObject, ArrayList paramArrayList, i parami, boolean paramBoolean, Fragment paramFragment1, Fragment paramFragment2)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
    {
      b.a(this.b, this.c);
      this.c.clear();
      a locala = e.a(this.h, this.d, this.e, this.f);
      this.c.add(this.d.d);
      this.c.addAll(locala.values());
      b.b(this.b, this.c);
      e.a(this.h, locala, this.d);
      e.a(this.f, this.g, this.e, locala);
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.f
 * JD-Core Version:    0.6.0
 */