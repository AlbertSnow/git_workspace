package com.wandoujia.jupiter.media.view;

import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;

final class e
  implements TextureView.SurfaceTextureListener
{
  e(VideoTextureView paramVideoTextureView)
  {
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this.a.g();
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    this.a.f();
    return true;
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.view.e
 * JD-Core Version:    0.6.0
 */