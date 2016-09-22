package com.wandoujia.phoenix2.videoplayer;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class b
  implements SeekBar.OnSeekBarChangeListener
{
  b(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if ((BasePlayerFragment.j(this.a) == null) || (!paramBoolean))
      return;
    int i = this.a.j();
    int j = i * paramInt / 100;
    BasePlayerFragment.q();
    this.a.a(j);
    BasePlayerFragment.a(this.a, j, i);
  }

  public final void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    BasePlayerFragment.a(this.a, true);
    this.a.i();
    BasePlayerFragment.q();
    this.a.a();
    this.a.a.removeMessages(2);
    BasePlayerFragment.a(this.a).c();
  }

  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    BasePlayerFragment.a(this.a, false);
    int i = this.a.i();
    BasePlayerFragment.q();
    this.a.k();
    this.a.a.sendEmptyMessageDelayed(2, 1000L);
    this.a.c();
    BasePlayerFragment.a(this.a, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.b
 * JD-Core Version:    0.6.0
 */