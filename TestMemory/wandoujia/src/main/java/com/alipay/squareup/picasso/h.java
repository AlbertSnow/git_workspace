package com.alipay.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.widget.ImageView;

final class h extends Drawable
{
  private static final Paint a = new Paint();
  private final Context b;
  private final boolean c;
  private final float d;
  private Drawable e;
  private BitmapDrawable f;
  private Request.LoadedFrom g;
  private int h;
  private long i;
  private boolean j;

  private h(Context paramContext, Bitmap paramBitmap, Request.LoadedFrom paramLoadedFrom, boolean paramBoolean)
  {
    Resources localResources = paramContext.getResources();
    this.b = paramContext.getApplicationContext();
    this.g = paramLoadedFrom;
    this.d = localResources.getDisplayMetrics().density;
    this.f = new BitmapDrawable(localResources, paramBitmap);
    this.c = false;
    if (paramLoadedFrom != Request.LoadedFrom.MEMORY)
    {
      this.i = 0L;
      this.j = true;
    }
  }

  private void a(Drawable paramDrawable)
  {
    Rect localRect = getBounds();
    int k = localRect.width();
    int m = localRect.height();
    float f1 = k / m;
    int n = paramDrawable.getIntrinsicWidth();
    int i1 = paramDrawable.getIntrinsicHeight();
    if (n / i1 < f1)
    {
      int i5 = (int)(m / i1 * n);
      int i6 = localRect.left - (i5 - k) / 2;
      int i7 = i5 + i6;
      paramDrawable.setBounds(i6, localRect.top, i7, localRect.bottom);
      return;
    }
    int i2 = (int)(k / n * i1);
    int i3 = localRect.top - (i2 - m) / 2;
    int i4 = i2 + i3;
    paramDrawable.setBounds(localRect.left, i3, localRect.right, i4);
  }

  static void a(ImageView paramImageView, Context paramContext, Bitmap paramBitmap, Request.LoadedFrom paramLoadedFrom)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    h localh;
    if ((localDrawable instanceof h))
    {
      localh = (h)localDrawable;
      if (localh == null)
        break label127;
      if (paramLoadedFrom == Request.LoadedFrom.MEMORY)
        break label121;
    }
    label121: for (boolean bool = true; ; bool = false)
    {
      if ((localh.f != null) && (bool))
        localh.e = localh.f;
      localh.f = new BitmapDrawable(localh.b.getResources(), paramBitmap);
      localh.a(localh.f);
      localh.g = paramLoadedFrom;
      localh.i = 0L;
      localh.j = bool;
      localh.invalidateSelf();
      return;
      localh = null;
      break;
    }
    label127: paramImageView.setImageDrawable(new h(paramContext, paramBitmap, paramLoadedFrom, false));
  }

  public final void draw(Canvas paramCanvas)
  {
    int k = 1;
    if (this.f == null)
    {
      this.e.draw(paramCanvas);
      return;
    }
    if (this.j)
    {
      if (this.i == 0L)
      {
        this.i = SystemClock.uptimeMillis();
        this.h = 0;
        k = 0;
      }
    }
    else
    {
      if (k == 0)
        break label101;
      this.f.draw(paramCanvas);
      return;
    }
    float f1 = (float)(SystemClock.uptimeMillis() - this.i) / 200.0F;
    if (f1 >= 1.0F);
    while (true)
    {
      this.h = (int)(255.0F * Math.min(f1, 1.0F));
      break;
      k = 0;
    }
    label101: if (this.e != null)
      this.e.draw(paramCanvas);
    if (this.h > 0)
    {
      this.f.setAlpha(this.h);
      this.f.draw(paramCanvas);
      this.f.setAlpha(255);
    }
    invalidateSelf();
  }

  public final int getIntrinsicHeight()
  {
    if (this.f != null)
      return this.f.getIntrinsicHeight();
    return -1;
  }

  public final int getIntrinsicWidth()
  {
    if (this.f != null)
      return this.f.getIntrinsicWidth();
    return -1;
  }

  public final int getOpacity()
  {
    return -1;
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    if (this.f != null)
      a(this.f);
    if (this.e != null)
      this.e.setBounds(getBounds());
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.h
 * JD-Core Version:    0.6.0
 */