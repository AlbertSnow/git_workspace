package com.wandoujia.gamepacket;

import android.view.ViewGroup;

final class r
  implements Runnable
{
  r(q paramq)
  {
  }

  public final void run()
  {
    ViewGroup localViewGroup = (ViewGroup)this.a.a.getParent();
    if (localViewGroup != null)
      localViewGroup.removeView(this.a.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.r
 * JD-Core Version:    0.6.0
 */