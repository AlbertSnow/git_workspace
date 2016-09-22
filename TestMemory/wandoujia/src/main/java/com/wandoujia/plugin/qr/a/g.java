package com.wandoujia.plugin.qr.a;

import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.os.Message;

final class g
  implements Camera.PreviewCallback
{
  private final c a;
  private Handler b;
  private int c;

  static
  {
    g.class.getSimpleName();
  }

  g(c paramc)
  {
    this.a = paramc;
  }

  final void a(Handler paramHandler, int paramInt)
  {
    this.b = paramHandler;
    this.c = paramInt;
  }

  public final void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    Point localPoint = this.a.a();
    Handler localHandler = this.b;
    if ((localPoint != null) && (localHandler != null))
    {
      localHandler.obtainMessage(this.c, localPoint.x, localPoint.y, paramArrayOfByte).sendToTarget();
      this.b = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.plugin.qr.a.g
 * JD-Core Version:    0.6.0
 */