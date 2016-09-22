package com.wandoujia.phoenix2.videoplayer;

import android.view.View.OnSystemUiVisibilityChangeListener;

final class d
  implements View.OnSystemUiVisibilityChangeListener
{
  d(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void onSystemUiVisibilityChange(int paramInt)
  {
    if ((paramInt == 0) && (!BasePlayerFragment.a(this.a).b()))
      this.a.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.d
 * JD-Core Version:    0.6.0
 */