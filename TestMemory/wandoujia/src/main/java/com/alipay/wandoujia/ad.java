package com.alipay.wandoujia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.alipay.squareup.picasso.Target;
import com.wandoujia.image.c.a;

public abstract class ad
  implements Target
{
  public abstract void a(int paramInt);

  public abstract void a(Drawable paramDrawable);

  public final void onSuccess(Bitmap paramBitmap)
  {
    a(new BitmapDrawable(a.a().b().getResources(), paramBitmap));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ad
 * JD-Core Version:    0.6.0
 */