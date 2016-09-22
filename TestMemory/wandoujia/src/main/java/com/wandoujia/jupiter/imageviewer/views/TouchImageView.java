package com.wandoujia.jupiter.imageviewer.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import com.wandoujia.image.view.AsyncImageView;
import java.util.Timer;

public class TouchImageView extends AsyncImageView
{
  private float A = 0.0F;
  private long B = 0L;
  private long C = 0L;
  private boolean D = false;
  private Context E;
  private Timer F;
  private View.OnClickListener G;
  private Object H;
  private Handler I = null;
  public boolean a = false;
  public boolean b = false;
  private int c = 0;
  private Matrix d = new Matrix();
  private Matrix e = new Matrix();
  private float f;
  private float g;
  private float h;
  private float i;
  private float j;
  private float k;
  private float l;
  private float m;
  private float n;
  private float o;
  private PointF p = new PointF();
  private PointF q = new PointF();
  private PointF r = new PointF();
  private float[] s;
  private float t;
  private float u;
  private float v = 1.0F;
  private float w = 1.0F;
  private float x = 3.0F;
  private float y = 1.0F;
  private PointF z = new PointF(0.0F, 0.0F);

  public TouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setClickable(true);
    this.E = paramContext;
    this.I = new e(this);
    this.d.setTranslate(1.0F, 1.0F);
    this.s = new float[9];
    setImageMatrix(this.d);
    setScaleType(ImageView.ScaleType.MATRIX);
    if (Build.VERSION.SDK_INT >= 8)
      this.H = new ScaleGestureDetector(this.E, new c(this, 0));
  }

  private static float a(f paramf)
  {
    float f1 = paramf.a(0) - paramf.a(1);
    float f2 = paramf.b(0) - paramf.b(1);
    return FloatMath.sqrt(f1 * f1 + f2 * f2);
  }

  private void a(float paramFloat1, float paramFloat2)
  {
    float f1 = Math.round(this.j * this.v);
    float f2 = Math.round(this.k * this.v);
    g();
    if (f1 < this.n)
      if (paramFloat2 + this.u > 0.0F)
      {
        paramFloat2 = -this.u;
        paramFloat1 = 0.0F;
      }
    while (true)
    {
      this.d.postTranslate(paramFloat1, paramFloat2);
      e();
      return;
      if (paramFloat2 + this.u < -this.i)
      {
        paramFloat2 = -(this.u + this.i);
        paramFloat1 = 0.0F;
        continue;
        if (f2 < this.o)
        {
          if (paramFloat1 + this.t > 0.0F)
          {
            paramFloat1 = -this.t;
            paramFloat2 = 0.0F;
            continue;
          }
          if (paramFloat1 + this.t < -this.h)
          {
            paramFloat1 = -(this.t + this.h);
            paramFloat2 = 0.0F;
            continue;
          }
        }
        else
        {
          if (paramFloat1 + this.t > 0.0F)
            paramFloat1 = -this.t;
          while (true)
          {
            if (paramFloat2 + this.u <= 0.0F)
              break label236;
            paramFloat2 = -this.u;
            break;
            if (paramFloat1 + this.t >= -this.h)
              continue;
            paramFloat1 = -(this.t + this.h);
          }
          label236: if (paramFloat2 + this.u >= -this.i)
            continue;
          paramFloat2 = -(this.u + this.i);
          continue;
        }
        paramFloat2 = 0.0F;
        continue;
      }
      paramFloat1 = 0.0F;
    }
  }

  private void b(float paramFloat1, float paramFloat2)
  {
    float f1 = Math.min(paramFloat1 / this.l, paramFloat2 / this.m);
    this.d.setScale(f1, f1);
    setImageMatrix(this.d);
    this.v = 1.0F;
    this.g = (paramFloat2 - f1 * this.m);
    this.f = (paramFloat1 - f1 * this.l);
    this.g /= 2.0F;
    this.f /= 2.0F;
    this.d.postTranslate(this.f, this.g);
    this.j = (paramFloat1 - 2.0F * this.f);
    this.k = (paramFloat2 - 2.0F * this.g);
    f();
    setImageMatrix(this.d);
  }

  private void e()
  {
    g();
    float f1 = Math.round(this.j * this.v);
    float f2 = Math.round(this.k * this.v);
    this.b = false;
    this.a = false;
    Drawable localDrawable = getDrawable();
    if ((localDrawable == null) || (!(localDrawable instanceof BitmapDrawable)))
    {
      this.b = true;
      this.a = true;
      return;
    }
    if (-this.t < 10.0F)
      this.a = true;
    if (((f1 >= this.n) && (f1 + this.t - this.n < 10.0F)) || ((f1 <= this.n) && (f1 + -this.t <= this.n)))
      this.b = true;
    Math.abs(-this.u + this.o - f2);
  }

  private void f()
  {
    this.h = (this.n * this.v - this.n - 2.0F * this.f * this.v);
    this.i = (this.o * this.v - this.o - 2.0F * this.g * this.v);
  }

  private void g()
  {
    this.d.getValues(this.s);
    this.t = this.s[2];
    this.u = this.s[5];
  }

  private void h()
  {
    if (Math.abs(this.t + this.h / 2.0F) > 0.5F)
      this.d.postTranslate(-(this.t + this.h / 2.0F), 0.0F);
    if (Math.abs(this.u + this.i / 2.0F) > 0.5F)
      this.d.postTranslate(0.0F, -(this.u + this.i / 2.0F));
  }

  public final void c()
  {
    g();
    this.d.postScale(this.w / this.v, this.w / this.v, this.n / 2.0F, this.o / 2.0F);
    this.v = this.w;
    f();
    a(0.0F, 0.0F);
    h();
    setImageMatrix(this.d);
    invalidate();
  }

  public final boolean d()
  {
    if (this.c != 0);
    do
      return false;
    while (this.v != this.w);
    return true;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.D);
    float f1;
    float f2;
    do
    {
      do
      {
        return;
        f1 = this.z.x * this.A;
        f2 = this.z.y * this.A;
      }
      while ((f1 > this.n) || (f2 > this.o));
      this.A = (0.9F * this.A);
    }
    while ((Math.abs(f1) < 0.1D) && (Math.abs(f2) < 0.1D));
    a(f1, f2);
    setImageMatrix(this.d);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.n = View.MeasureSpec.getSize(paramInt1);
    this.o = View.MeasureSpec.getSize(paramInt2);
    b(this.n, this.o);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    f localf = f.a(paramMotionEvent);
    if (this.H != null)
      ((ScaleGestureDetector)this.H).onTouchEvent(paramMotionEvent);
    g();
    PointF localPointF1 = new PointF(localf.b(), localf.c());
    switch (0xFF & localf.a())
    {
    case 3:
    case 4:
    default:
    case 0:
    case 5:
    case 1:
    case 6:
    case 2:
    }
    label389: float f1;
    do
    {
      do
        while (true)
        {
          setImageMatrix(this.d);
          invalidate();
          return true;
          this.D = false;
          this.e.set(this.d);
          this.p.set(localf.b(), localf.c());
          this.r.set(this.p);
          this.c = 1;
          continue;
          this.y = a(localf);
          if (this.y <= 10.0F)
            continue;
          this.e.set(this.d);
          PointF localPointF4 = this.q;
          float f9 = localf.a(0) + localf.a(1);
          float f10 = localf.b(0) + localf.b(1);
          localPointF4.set(f9 / 2.0F, f10 / 2.0F);
          this.c = 2;
          continue;
          this.D = true;
          this.c = 0;
          int i1 = (int)Math.abs(localf.b() - this.r.x);
          int i2 = (int)Math.abs(localf.c() - this.r.y);
          if ((i1 >= 10) || (i2 >= 10))
            continue;
          long l2 = System.currentTimeMillis();
          if (l2 - this.B <= 600L)
          {
            if (this.F != null)
              this.F.cancel();
            if (this.v == 1.0F)
            {
              float f8 = this.x / this.v;
              this.d.postScale(f8, f8, this.r.x, this.r.y);
              this.v = this.x;
              f();
              a(0.0F, 0.0F);
              this.B = 0L;
            }
          }
          while (this.v == this.w)
          {
            h();
            break;
            this.d.postScale(this.w / this.v, this.w / this.v, this.n / 2.0F, this.o / 2.0F);
            this.v = this.w;
            break label389;
            this.B = l2;
            this.F = new Timer();
            this.F.schedule(new d(this, 0), 300L);
          }
          this.c = 0;
          this.A = 0.0F;
          this.e.set(this.d);
          this.y = a(localf);
          continue;
          this.D = false;
          if (this.c != 1)
            break;
          float f6 = localPointF1.x - this.p.x;
          float f7 = localPointF1.y - this.p.y;
          long l1 = System.currentTimeMillis();
          PointF localPointF3 = this.p;
          this.A = (0.9F * ((float)Math.sqrt(Math.pow(localPointF1.x - localPointF3.x, 2.0D) + Math.pow(localPointF1.y - localPointF3.y, 2.0D)) / (float)(l1 - this.C)));
          this.C = l1;
          a(f6, f7);
          this.z.set(f6, f7);
          this.p.set(localPointF1.x, localPointF1.y);
        }
      while ((this.H != null) || (this.c != 2));
      f1 = a(localf);
    }
    while ((paramMotionEvent.getPointerCount() < 2) || (10.0F > Math.abs(this.y - f1)) || (Math.abs(this.y - f1) > 50.0F));
    float f2 = f1 / this.y;
    this.y = f1;
    float f3 = this.v;
    this.v = (f2 * this.v);
    if (this.v > this.x)
    {
      this.v = this.x;
      f2 = this.x / f3;
      label816: f();
      if ((this.j * this.v > this.n) && (this.k * this.v > this.o))
        break label939;
      this.d.postScale(f2, f2, this.n / 2.0F, this.o / 2.0F);
      if (f2 < 1.0F)
      {
        g();
        if (f2 < 1.0F)
          h();
      }
    }
    while (true)
    {
      e();
      break;
      if (this.v >= this.w)
        break label816;
      this.v = this.w;
      f2 = this.w / f3;
      break label816;
      label939: float f4 = localf.a(0) + localf.a(1);
      float f5 = localf.b(0) + localf.b(1);
      PointF localPointF2 = new PointF(f4 / 2.0F, f5 / 2.0F);
      this.d.postScale(f2, f2, localPointF2.x, localPointF2.y);
      g();
      if (f2 >= 1.0F)
        continue;
      if (this.t < -this.h)
        this.d.postTranslate(-(this.t + this.h), 0.0F);
      while (true)
      {
        if (this.u >= -this.i)
          break label1108;
        this.d.postTranslate(0.0F, -(this.u + this.i));
        break;
        if (this.t <= 0.0F)
          continue;
        this.d.postTranslate(-this.t, 0.0F);
      }
      label1108: if (this.u <= 0.0F)
        continue;
      this.d.postTranslate(0.0F, -this.u);
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    this.l = paramBitmap.getWidth();
    this.m = paramBitmap.getHeight();
    b(getMeasuredWidth(), getMeasuredHeight());
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.G = paramOnClickListener;
  }

  public void setZoomToOriginalSize(boolean paramBoolean)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.views.TouchImageView
 * JD-Core Version:    0.6.0
 */