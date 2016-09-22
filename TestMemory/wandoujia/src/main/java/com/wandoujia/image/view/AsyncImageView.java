package com.wandoujia.image.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask.Status;
import android.support.v7.app.f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.wandoujia.image.r;

public class AsyncImageView extends ImageView
{
  private static i a;
  private final AlphaAnimation b = new AlphaAnimation(0.4F, 1.0F);
  private r c;
  private int d;
  private String e;
  private AsyncImageView.ImageRequestType f;
  private int g;
  private AsyncTask.Status h;
  private j i;
  private boolean j;

  public AsyncImageView(Context paramContext)
  {
    super(paramContext);
    this.b.setDuration(200L);
    this.j = true;
  }

  public AsyncImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b.setDuration(200L);
    this.j = true;
  }

  public AsyncImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b.setDuration(200L);
    this.j = true;
  }

  private void c()
  {
    this.e = null;
    this.f = null;
    this.g = 0;
    if (this.c != null)
    {
      this.c.e();
      this.c = null;
    }
    setStatus(null);
  }

  public static void setImageManagerHolder(i parami)
  {
    a = parami;
  }

  private void setStatus(AsyncTask.Status paramStatus)
  {
    if (this.h == paramStatus)
      return;
    this.h = paramStatus;
  }

  public final void a()
  {
    if ((this.h == null) || (this.h == AsyncTask.Status.FINISHED))
      return;
    if (this.c != null)
    {
      this.c.e();
      this.c = null;
    }
    setStatus(AsyncTask.Status.PENDING);
  }

  protected final void a(Bitmap paramBitmap, long paramLong)
  {
    if (System.currentTimeMillis() - paramLong > 100L)
    {
      startAnimation(this.b);
      setImageBitmap(paramBitmap);
    }
    while (true)
    {
      if (this.i != null)
        this.i.a(paramBitmap);
      return;
      setImageBitmap(paramBitmap);
    }
  }

  public final void a(String paramString, int paramInt)
  {
    this.d = paramInt;
    this.e = paramString;
    this.f = AsyncImageView.ImageRequestType.NETWORK;
    setStatus(AsyncTask.Status.PENDING);
    a(false);
  }

  public final void a(String paramString, int paramInt1, int paramInt2)
  {
    this.d = paramInt2;
    this.g = paramInt1;
    this.e = paramString;
    this.f = AsyncImageView.ImageRequestType.LOCAL_IMAGE;
    setStatus(AsyncTask.Status.PENDING);
    a(false);
  }

  protected final void a(boolean paramBoolean)
  {
    if (this.h != AsyncTask.Status.PENDING);
    while (true)
    {
      return;
      int k = getWidth();
      int m = getHeight();
      if ((k == 0) && (m == 0))
        continue;
      if ((TextUtils.isEmpty(this.e)) || (this.f == null))
      {
        setImageResource(this.d);
        return;
      }
      if ((this.c == null) || (this.c.c() == null))
        break;
      if (this.c.c().equals(this.e))
        continue;
      this.c.e();
      if (!this.j)
        break;
      setImageResource(this.d);
    }
    setStatus(AsyncTask.Status.RUNNING);
    switch (h.a[this.f.ordinal()])
    {
    default:
      return;
    case 1:
      a locala = new a(this, paramBoolean, System.currentTimeMillis());
      this.c = a.a().a(this.e, locala, getWidth(), getHeight());
      return;
    case 2:
      long l4 = System.currentTimeMillis();
      this.c = a.a().b(this.e, new b(this, paramBoolean, l4));
      return;
    case 3:
      long l3 = System.currentTimeMillis();
      this.c = a.a().d(this.e, new c(this, paramBoolean, l3));
      return;
    case 4:
      long l2 = System.currentTimeMillis();
      this.c = a.a().c(this.e, new e(this, paramBoolean, l2));
      return;
    case 5:
    }
    long l1 = System.currentTimeMillis();
    this.c = a.a().b(this.e, new d(this, paramBoolean, l1), getWidth(), getHeight());
  }

  public final void b()
  {
    a(false);
  }

  public final void b(String paramString, int paramInt)
  {
    this.d = paramInt;
    this.e = paramString;
    this.f = AsyncImageView.ImageRequestType.APP_ICON;
    setStatus(AsyncTask.Status.PENDING);
    a(false);
  }

  public final void c(String paramString, int paramInt)
  {
    this.d = paramInt;
    this.e = paramString;
    this.f = AsyncImageView.ImageRequestType.APK_ICON;
    setStatus(AsyncTask.Status.PENDING);
    a(false);
  }

  public final void d(String paramString, int paramInt)
  {
    this.d = paramInt;
    this.e = paramString;
    this.f = AsyncImageView.ImageRequestType.VIDEO_THUMBNAIL;
    setStatus(AsyncTask.Status.PENDING);
    a(false);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }

  public final void e(String paramString, int paramInt)
  {
    a(paramString, 0, paramInt);
  }

  public AsyncTask.Status getStatus()
  {
    return this.h;
  }

  protected void onAttachedToWindow()
  {
    a(false);
    super.onAttachedToWindow();
  }

  protected void onDetachedFromWindow()
  {
    a();
    super.onDetachedFromWindow();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a(true);
  }

  public void setDefaultImmediately(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public void setImageLoadedListener(j paramj)
  {
    this.i = paramj;
  }

  public void setImageResource(int paramInt)
  {
    Bitmap localBitmap = a.a().a(getContext(), paramInt);
    if (localBitmap != null)
    {
      setImageBitmap(localBitmap);
      return;
    }
    super.setImageResource(paramInt);
  }

  public void setOnStatusChangedListener$31c3d980(f paramf)
  {
  }

  public void setStaticImageBitmap(Bitmap paramBitmap)
  {
    c();
    setImageBitmap(paramBitmap);
  }

  public void setStaticImageResource(int paramInt)
  {
    c();
    setImageResource(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.view.AsyncImageView
 * JD-Core Version:    0.6.0
 */