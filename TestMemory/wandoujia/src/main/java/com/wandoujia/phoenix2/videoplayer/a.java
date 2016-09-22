package com.wandoujia.phoenix2.videoplayer;

import android.view.View;
import android.view.View.OnClickListener;

final class a
  implements View.OnClickListener
{
  a(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (BasePlayerFragment.a(this.a).b())
    {
      this.a.d();
      return;
    }
    this.a.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.a
 * JD-Core Version:    0.6.0
 */