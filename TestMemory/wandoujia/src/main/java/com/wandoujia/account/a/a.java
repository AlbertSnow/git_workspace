package com.wandoujia.account.a;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class a extends AsyncTask<Void, Integer, Bitmap>
{
  private final WeakReference<ImageView> a;

  public a(ImageView paramImageView)
  {
    this.a = new WeakReference(paramImageView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.a.a
 * JD-Core Version:    0.6.0
 */