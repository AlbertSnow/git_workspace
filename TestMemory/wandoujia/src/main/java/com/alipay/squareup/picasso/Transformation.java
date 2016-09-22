package com.alipay.squareup.picasso;

import android.graphics.Bitmap;

public abstract interface Transformation
{
  public abstract String key();

  public abstract Bitmap transform(Bitmap paramBitmap);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.Transformation
 * JD-Core Version:    0.6.0
 */