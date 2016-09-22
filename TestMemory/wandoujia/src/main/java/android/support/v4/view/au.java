package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

final class au
  implements View.OnClickListener
{
  au(PagerTabStrip paramPagerTabStrip)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.a.setCurrentItem(-1 + this.a.a.getCurrentItem());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.au
 * JD-Core Version:    0.6.0
 */