package com.wandoujia.image.view;

import android.graphics.Bitmap;
import android.os.AsyncTask.Status;
import com.wandoujia.image.ae;

final class d
  implements ae
{
  d(AsyncImageView paramAsyncImageView, boolean paramBoolean, long paramLong)
  {
  }

  public final void a(Bitmap paramBitmap, boolean paramBoolean)
  {
    AsyncImageView.a(this.c, AsyncTask.Status.FINISHED);
    AsyncImageView.a(this.c, paramBitmap, paramBoolean, this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.view.d
 * JD-Core Version:    0.6.0
 */