package com.wandoujia.gamepacket;

import android.opengl.GLSurfaceView.Renderer;
import android.os.Handler;
import android.os.Looper;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class q
  implements GLSurfaceView.Renderer
{
  public q(GpuDetectUtils.GpuInfoFetcherView paramGpuInfoFetcherView)
  {
  }

  public final void onDrawFrame(GL10 paramGL10)
  {
  }

  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
  }

  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    GpuDetectUtils.a(paramGL10);
    new Handler(Looper.getMainLooper()).post(new r(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.q
 * JD-Core Version:    0.6.0
 */