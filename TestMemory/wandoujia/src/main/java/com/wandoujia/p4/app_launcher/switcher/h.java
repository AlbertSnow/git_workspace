package com.wandoujia.p4.app_launcher.switcher;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

final class h extends SurfaceView
  implements SurfaceHolder.Callback
{
  private SurfaceHolder a = getHolder();

  public h(g paramg, Context paramContext)
  {
    super(paramContext);
    this.a.addCallback(this);
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    g.a(this.b, paramSurfaceHolder);
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    g.a(this.b, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.h
 * JD-Core Version:    0.6.0
 */