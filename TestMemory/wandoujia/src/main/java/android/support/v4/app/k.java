package android.support.v4.app;

import android.view.View;

final class k
  implements p
{
  k(Fragment paramFragment)
  {
  }

  public final View a(int paramInt)
  {
    if (this.a.mView == null)
      throw new IllegalStateException("Fragment does not have a view");
    return this.a.mView.findViewById(paramInt);
  }

  public final boolean a()
  {
    return this.a.mView != null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.k
 * JD-Core Version:    0.6.0
 */