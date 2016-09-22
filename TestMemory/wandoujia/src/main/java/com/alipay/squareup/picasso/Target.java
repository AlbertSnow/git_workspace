package com.alipay.squareup.picasso;

import android.graphics.Bitmap;

public abstract interface Target
{
  public abstract void onError();

  public abstract void onSuccess(Bitmap paramBitmap);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.Target
 * JD-Core Version:    0.6.0
 */