package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

final class cw
  implements Runnable
{
  private WeakReference<View> a;
  private cu b;

  private cw(cv paramcv, cu paramcu, View paramView)
  {
    this.a = new WeakReference(paramView);
    this.b = paramcu;
  }

  public final void run()
  {
    View localView = (View)this.a.get();
    if (localView != null)
      cv.a(this.c, localView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.cw
 * JD-Core Version:    0.6.0
 */