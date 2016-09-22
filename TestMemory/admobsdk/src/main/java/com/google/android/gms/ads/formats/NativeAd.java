package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public abstract class NativeAd
{
  protected abstract Object zzaH();

  public static abstract class Image
  {
    public abstract Drawable getDrawable();

    public abstract Uri getUri();

    public abstract double getScale();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAd
 * JD-Core Version:    0.6.0
 */