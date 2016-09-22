package com.alipay.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;

final class k
{
  final Handler a;
  long b;
  long c;
  long d;
  long e;
  int f;
  int g;

  k()
  {
    HandlerThread localHandlerThread = new HandlerThread("Picasso-Stats", 10);
    localHandlerThread.start();
    this.a = new l(this, localHandlerThread.getLooper());
  }

  private void a(Bitmap paramBitmap, int paramInt)
  {
    int i = p.a(paramBitmap);
    this.a.sendMessage(this.a.obtainMessage(paramInt, i, 0));
  }

  final void a()
  {
    this.a.sendEmptyMessage(1);
  }

  final void a(Bitmap paramBitmap)
  {
    a(paramBitmap, 3);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.k
 * JD-Core Version:    0.6.0
 */