package android.support.v7.app;

import android.support.v7.b.a;
import android.support.v7.internal.view.c;
import android.support.v7.internal.view.d;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window.Callback;

final class q extends n
{
  q(p paramp, Window.Callback paramCallback)
  {
    super(paramp, paramCallback);
  }

  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    if (p.a(this.a))
    {
      d locald = new d(this.a.a, paramCallback);
      p localp = this.a;
      if (localp.i != null)
        localp.i.c();
      w localw = new w(localp, locald);
      ActionBar localActionBar = localp.a();
      if (localActionBar != null)
        localp.i = localActionBar.a(localw);
      if (localp.i == null)
        localp.i = localp.a(localw);
      a locala = localp.i;
      if (locala != null)
      {
        c localc = new c(this.a.a, locala);
        locald.a(localc);
        return localc;
      }
      return null;
    }
    return super.onWindowStartingActionMode(paramCallback);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.q
 * JD-Core Version:    0.6.0
 */