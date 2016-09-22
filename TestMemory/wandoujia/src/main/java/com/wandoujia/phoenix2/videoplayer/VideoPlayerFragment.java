package com.wandoujia.phoenix2.videoplayer;

import android.view.View;

public abstract class VideoPlayerFragment extends BasePlayerFragment
{
  public final void a(long paramLong, int paramInt)
  {
    super.a(paramLong, paramInt);
    new PlayerLogBuilder().a(PlayerLogBuilder.Action.READY).a(paramLong).b(paramInt);
  }

  public final void b(int paramInt)
  {
    super.b(paramInt);
    new PlayerLogBuilder().a(PlayerLogBuilder.Action.PAUSE).a(paramInt);
  }

  public final void b(String paramString)
  {
    super.b(paramString);
    new PlayerLogBuilder().a(PlayerLogBuilder.Action.ERROR).a(paramString);
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public final void n()
  {
    super.n();
    new PlayerLogBuilder().a(PlayerLogBuilder.Action.ENTER);
  }

  public final void o()
  {
    super.o();
    new PlayerLogBuilder().a(PlayerLogBuilder.Action.PLAY);
  }

  public void onStop()
  {
    super.onStop();
    new PlayerLogBuilder().a(PlayerLogBuilder.Action.STOP);
  }

  public final void r()
  {
    super.r();
    new PlayerLogBuilder().a(PlayerLogBuilder.Action.EXIT);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.VideoPlayerFragment
 * JD-Core Version:    0.6.0
 */