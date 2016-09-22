package com.wandoujia.jupiter.media.controller;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.jupiter.media.view.VideoPlayView;

final class j
  implements View.OnClickListener
{
  j(h paramh)
  {
  }

  public final void onClick(View paramView)
  {
    h.b(this.a);
    if (this.a.b.j())
    {
      this.a.b.i();
      return;
    }
    this.a.b.h();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.j
 * JD-Core Version:    0.6.0
 */