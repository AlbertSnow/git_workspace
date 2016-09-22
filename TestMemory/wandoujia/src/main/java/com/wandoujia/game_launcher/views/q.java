package com.wandoujia.game_launcher.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;

final class q
{
  private final RectF a = new RectF();
  private final Paint b = new Paint();
  private final Paint c = new Paint();
  private final Drawable.Callback d;
  private float e = 0.0F;
  private float f = 0.0F;
  private float g = 0.0F;
  private float h = 5.0F;
  private float i = 2.5F;
  private int[] j;
  private int k;
  private float l;
  private float m;
  private float n;
  private boolean o;
  private Path p;
  private double q;
  private int r;
  private int s;
  private int t;
  private final Paint u = new Paint();
  private int v;

  public q(Drawable.Callback paramCallback)
  {
    this.d = paramCallback;
    this.b.setStrokeCap(Paint.Cap.SQUARE);
    this.b.setAntiAlias(true);
    this.b.setStyle(Paint.Style.STROKE);
    this.c.setStyle(Paint.Style.FILL);
    this.c.setAntiAlias(true);
  }

  private void m()
  {
    this.d.invalidateDrawable(null);
  }

  public final void a()
  {
    this.k = 0;
  }

  public final void a(double paramDouble)
  {
    this.q = paramDouble;
  }

  public final void a(float paramFloat)
  {
    this.h = paramFloat;
    this.b.setStrokeWidth(paramFloat);
    m();
  }

  public final void a(float paramFloat1, float paramFloat2)
  {
    this.r = (int)paramFloat1;
    this.s = (int)paramFloat2;
  }

  public final void a(int paramInt)
  {
    this.v = paramInt;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    float f1 = Math.min(paramInt1, paramInt2);
    float f2;
    if ((this.q <= 0.0D) || (f1 < 0.0F))
      f2 = (float)Math.ceil(this.h / 2.0F);
    while (true)
    {
      this.i = f2;
      return;
      f2 = (float)(f1 / 2.0F - this.q);
    }
  }

  public final void a(Canvas paramCanvas, Rect paramRect)
  {
    RectF localRectF = this.a;
    localRectF.set(paramRect);
    localRectF.inset(this.i, this.i);
    float f1 = 360.0F * (this.e + this.g);
    float f2 = 360.0F * (this.f + this.g) - f1;
    this.b.setColor(this.j[this.k]);
    paramCanvas.drawArc(localRectF, f1, f2, false, this.b);
    if (this.o)
    {
      if (this.p != null)
        break label342;
      this.p = new Path();
      this.p.setFillType(Path.FillType.EVEN_ODD);
    }
    while (true)
    {
      float f3 = 0.0F * ((int)this.i / 2);
      float f4 = (float)(this.q * Math.cos(0.0D) + paramRect.exactCenterX());
      float f5 = (float)(this.q * Math.sin(0.0D) + paramRect.exactCenterY());
      this.p.moveTo(0.0F, 0.0F);
      this.p.lineTo(0.0F * this.r, 0.0F);
      this.p.lineTo(0.0F * this.r / 2.0F, 0.0F * this.s);
      this.p.offset(f4 - f3, f5);
      this.p.close();
      this.c.setColor(this.j[this.k]);
      paramCanvas.rotate(f1 + f2 - 5.0F, paramRect.exactCenterX(), paramRect.exactCenterY());
      paramCanvas.drawPath(this.p, this.c);
      if (this.t < 255)
      {
        this.u.setColor(this.v);
        this.u.setAlpha(255 - this.t);
        paramCanvas.drawCircle(paramRect.exactCenterX(), paramRect.exactCenterY(), paramRect.width() / 2, this.u);
      }
      return;
      label342: this.p.reset();
    }
  }

  public final void a(ColorFilter paramColorFilter)
  {
    this.b.setColorFilter(paramColorFilter);
    m();
  }

  public final void a(boolean paramBoolean)
  {
    if (this.o != paramBoolean)
    {
      this.o = paramBoolean;
      m();
    }
  }

  public final void a(int[] paramArrayOfInt)
  {
    this.j = paramArrayOfInt;
    this.k = 0;
  }

  public final void b()
  {
    this.k = ((1 + this.k) % this.j.length);
  }

  public final void b(float paramFloat)
  {
    this.e = paramFloat;
    m();
  }

  public final void b(int paramInt)
  {
    this.t = paramInt;
  }

  public final int c()
  {
    return this.t;
  }

  public final void c(float paramFloat)
  {
    this.f = paramFloat;
    m();
  }

  public final float d()
  {
    return this.h;
  }

  public final void d(float paramFloat)
  {
    this.g = paramFloat;
    m();
  }

  public final float e()
  {
    return this.e;
  }

  public final float f()
  {
    return this.l;
  }

  public final float g()
  {
    return this.m;
  }

  public final float h()
  {
    return this.f;
  }

  public final double i()
  {
    return this.q;
  }

  public final float j()
  {
    return this.n;
  }

  public final void k()
  {
    this.l = this.e;
    this.m = this.f;
    this.n = this.g;
  }

  public final void l()
  {
    this.l = 0.0F;
    this.m = 0.0F;
    this.n = 0.0F;
    b(0.0F);
    c(0.0F);
    d(0.0F);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.q
 * JD-Core Version:    0.6.0
 */