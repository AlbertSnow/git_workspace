package android.support.v4.widget;

import android.support.v4.view.bg;
import android.view.View;
import java.util.ArrayList;

final class au
  implements Runnable
{
  private View a;

  au(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    this.a = paramView;
  }

  public final void run()
  {
    if (this.a.getParent() == this.b)
    {
      bg.a(this.a, 0, null);
      SlidingPaneLayout.a(this.b, this.a);
    }
    SlidingPaneLayout.g(this.b).remove(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.au
 * JD-Core Version:    0.6.0
 */