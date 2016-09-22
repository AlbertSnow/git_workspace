package com.alipay.squareup.picasso;

import android.graphics.Bitmap;

public abstract interface Cache
{
  public static final Cache NONE = new a();

  public abstract Bitmap get(String paramString);

  public abstract int maxSize();

  public abstract void set(String paramString, Bitmap paramBitmap);

  public abstract int size();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.Cache
 * JD-Core Version:    0.6.0
 */