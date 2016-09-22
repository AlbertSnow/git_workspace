package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public abstract class d
{
  final e a;

  final void a()
  {
    b();
  }

  final void a(Context paramContext, Bitmap paramBitmap)
  {
    if (paramBitmap == null)
      throw new IllegalArgumentException("null reference");
    new BitmapDrawable(paramContext.getResources(), paramBitmap);
    b();
  }

  protected abstract void b();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.images.d
 * JD-Core Version:    0.6.0
 */