package com.wandoujia.image;

import android.graphics.Bitmap;
import android.os.Handler;

final class d
  implements Runnable
{
  d(b paramb, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    if (b.b(this.c))
    {
      b.c(this.c).postDelayed(this, 200L);
      return;
    }
    b.a(this.c, this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.d
 * JD-Core Version:    0.6.0
 */