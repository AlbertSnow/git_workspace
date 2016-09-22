package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class c extends ImageView
{
  public boolean a = false;
  private Matrix b = new Matrix();
  private Matrix c = new Matrix();
  private int d = 0;
  private float e = 1.0F;
  private float f = 1.0F;
  private Bitmap g;
  private boolean h = false;
  private float i;
  private float j;
  private PointF k = new PointF();
  private PointF l = new PointF();
  private float m = 1.0F;
  private float n = 0.0F;
  private Rect o = new Rect();

  public c(Context paramContext)
  {
    super(paramContext);
    getDrawingRect(this.o);
  }

  private static float a(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() < 2)
      return 0.0F;
    float f1 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
    float f2 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
    return FloatMath.sqrt(f1 * f1 + f2 * f2);
  }

  private void a()
  {
    if (this.g == null);
    while (true)
    {
      return;
      float f1 = this.o.width();
      float f2 = this.o.height();
      float[] arrayOfFloat = new float[9];
      this.b.getValues(arrayOfFloat);
      float f3 = arrayOfFloat[2];
      float f4 = arrayOfFloat[5];
      float f5 = arrayOfFloat[0];
      Object localObject;
      if (f5 > this.e)
      {
        this.n = (this.e / f5);
        this.b.postScale(this.n, this.n, this.l.x, this.l.y);
        setImageMatrix(this.b);
        localObject = new ScaleAnimation(1.0F / this.n, 1.0F, 1.0F / this.n, 1.0F, this.l.x, this.l.y);
      }
      while (localObject != null)
      {
        this.h = true;
        ((Animation)localObject).setDuration(300L);
        startAnimation((Animation)localObject);
        new Thread(new m(this)).start();
        return;
        if (f5 < this.f)
        {
          this.n = (this.f / f5);
          this.b.postScale(this.n, this.n, this.l.x, this.l.y);
          localObject = new ScaleAnimation(1.0F, this.n, 1.0F, this.n, this.l.x, this.l.y);
          continue;
        }
        float f6 = f5 * this.g.getWidth();
        float f7 = f5 * this.g.getHeight();
        float f8 = this.o.left - f3;
        float f9 = this.o.top - f4;
        boolean bool = f8 < 0.0F;
        int i1 = 0;
        if (bool)
        {
          f3 = this.o.left;
          i1 = 1;
        }
        if (f9 < 0.0F)
        {
          f4 = this.o.top;
          i1 = 1;
        }
        float f10 = f6 - f8;
        float f11 = f7 - f9;
        if (f10 < f1)
        {
          float f15 = f6 - f1;
          f3 = this.o.left - f15;
          i1 = 1;
        }
        if (f11 < f2)
        {
          float f14 = f7 - f2;
          f4 = this.o.top - f14;
          i1 = 1;
        }
        if (i1 != 0)
        {
          float f12 = arrayOfFloat[2] - f3;
          float f13 = arrayOfFloat[5] - f4;
          arrayOfFloat[2] = f3;
          arrayOfFloat[5] = f4;
          this.b.setValues(arrayOfFloat);
          setImageMatrix(this.b);
          localObject = new TranslateAnimation(f12, 0.0F, f13, 0.0F);
          continue;
        }
        setImageMatrix(this.b);
        localObject = null;
      }
    }
  }

  public final void a(Rect paramRect)
  {
    this.o = paramRect;
    if ((this.g != null) && (this.g != null))
    {
      float[] arrayOfFloat = new float[9];
      this.b.getValues(arrayOfFloat);
      float f1 = Math.max(this.o.width() / this.g.getWidth(), this.o.height() / this.g.getHeight());
      this.i = (this.o.left - (f1 * this.g.getWidth() - this.o.width()) / 2.0F);
      this.j = (this.o.top - (f1 * this.g.getHeight() - this.o.height()) / 2.0F);
      arrayOfFloat[2] = this.i;
      arrayOfFloat[5] = this.j;
      arrayOfFloat[4] = f1;
      arrayOfFloat[0] = f1;
      this.b.setValues(arrayOfFloat);
      this.e = Math.min(2048.0F / this.g.getWidth(), 2048.0F / this.g.getHeight());
      this.f = f1;
      if (this.e < this.f)
        this.e = this.f;
      setImageMatrix(this.b);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 1.0F;
    if (this.h)
      return true;
    PointF localPointF;
    float f16;
    float f17;
    float f18;
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 3:
    case 4:
    default:
    case 0:
    case 5:
      do
      {
        while (true)
        {
          this.a = true;
          return true;
          this.b.set(getImageMatrix());
          this.c.set(this.b);
          this.k.set(paramMotionEvent.getX(), paramMotionEvent.getY());
          this.d = 1;
        }
        this.m = a(paramMotionEvent);
      }
      while (this.m <= 10.0F);
      this.c.set(this.b);
      localPointF = this.l;
      if (this.g == null)
        break;
      float[] arrayOfFloat = new float[9];
      this.b.getValues(arrayOfFloat);
      float f6 = arrayOfFloat[2];
      float f7 = arrayOfFloat[5];
      float f8 = arrayOfFloat[0];
      float f9 = this.g.getWidth();
      float f10 = this.g.getHeight();
      float f11 = f9 * f8;
      float f12 = f10 * f8;
      float f13 = this.o.left - f6;
      if (f13 <= f1)
        f13 = f1;
      float f14 = f6 + f11 - this.o.right;
      if (f14 <= f1)
        f14 = f1;
      float f15 = f14 + f13;
      f16 = f13 * this.o.width() / f15 + this.o.left;
      f17 = this.o.top - f7;
      f18 = f7 + f12 - this.o.bottom;
      if (f17 <= f1)
        f17 = f1;
      if (f18 > f1);
    case 1:
    case 6:
    case 2:
    }
    while (true)
    {
      float f19 = f17 + f1;
      localPointF.set(f16, f17 * this.o.height() / f19 + this.o.top);
      this.d = 2;
      break;
      a();
      this.d = 0;
      break;
      if (this.d == 1)
      {
        this.b.set(this.c);
        float f4 = paramMotionEvent.getX() - this.k.x;
        float f5 = paramMotionEvent.getY() - this.k.y;
        this.b.postTranslate(f4, f5);
      }
      while (true)
      {
        setImageMatrix(this.b);
        break;
        if (this.d != 2)
          break;
        this.b.set(this.b);
        float f2 = a(paramMotionEvent);
        if (f2 <= 10.0F)
          continue;
        this.b.set(this.c);
        float f3 = f2 / this.m;
        this.b.postScale(f3, f3, this.l.x, this.l.y);
      }
      f1 = f18;
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    this.g = paramBitmap;
    if (paramBitmap != null)
      this.g = paramBitmap;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.c
 * JD-Core Version:    0.6.0
 */