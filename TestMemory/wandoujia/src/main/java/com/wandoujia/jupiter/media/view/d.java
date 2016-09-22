package com.wandoujia.jupiter.media.view;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

final class d
  implements SurfaceHolder.Callback
{
  d(VideoSurfaceView paramVideoSurfaceView)
  {
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (paramSurfaceHolder.getSurface() == null)
      return;
    this.a.g();
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.a.f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.view.d
 * JD-Core Version:    0.6.0
 */