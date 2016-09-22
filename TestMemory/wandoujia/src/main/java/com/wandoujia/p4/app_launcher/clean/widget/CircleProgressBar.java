package com.wandoujia.p4.app_launcher.clean.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import com.wandoujia.phoenix2.R.styleable;

public class CircleProgressBar extends View
{
  private int a = 10;
  private int b = -90;
  private int c;
  private int d;
  private int e;
  private int f;
  private Paint g = new Paint(1);
  private Paint h = new Paint(1);
  private Paint i = new Paint(1);
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;

  public CircleProgressBar(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public CircleProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CircleProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  @TargetApi(21)
  public CircleProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CircleProgressBar);
    this.a = localTypedArray.getDimensionPixelSize(5, 0);
    this.b = localTypedArray.getInt(2, -90);
    this.c = localTypedArray.getColor(0, -1);
    this.d = localTypedArray.getColor(1, -1);
    this.e = localTypedArray.getColor(3, 0);
    this.f = localTypedArray.getInt(4, 0);
    localTypedArray.recycle();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.g.setColor(this.c);
    this.g.setStyle(Paint.Style.STROKE);
    this.g.setStrokeWidth(this.a);
    this.h.setColor(this.d);
    this.h.setStyle(Paint.Style.STROKE);
    this.h.setStrokeWidth(this.a);
    this.i.setColor(this.e);
    this.i.setStyle(Paint.Style.FILL);
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    int i3 = Math.min(i1, i2);
    this.j = (i1 / 2);
    this.k = (i2 / 2);
    this.l = (i3 / 2 - this.a / 2);
    this.m = (this.j - this.l);
    this.n = (this.j + this.l);
    this.o = (this.k - this.l);
    this.p = (this.k + this.l);
    paramCanvas.drawCircle(this.j, this.k, this.l - this.a / 2, this.i);
    float f1 = 3.6F * this.f;
    if (Build.VERSION.SDK_INT < 21)
    {
      RectF localRectF = new RectF(this.m, this.o, this.n, this.p);
      paramCanvas.drawArc(localRectF, this.b, f1, false, this.g);
      paramCanvas.drawArc(localRectF, f1 + this.b, 360.0F - f1, false, this.h);
      return;
    }
    paramCanvas.drawArc(this.m, this.o, this.n, this.p, this.b, f1, false, this.g);
    paramCanvas.drawArc(this.m, this.o, this.n, this.p, f1 + this.b, 360.0F - f1, false, this.h);
  }

  public void setBgColor(int paramInt)
  {
    this.e = paramInt;
    invalidate();
  }

  public void setEdgeCircleSize(int paramInt)
  {
    this.a = paramInt;
    invalidate();
  }

  public void setOriginDegree(int paramInt)
  {
    this.b = paramInt;
    invalidate();
  }

  public void setPrimaryColor(int paramInt)
  {
    this.c = paramInt;
    invalidate();
  }

  public void setProgress(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 100))
      throw new IllegalArgumentException("progress must between 0 and 100");
    this.f = paramInt;
    invalidate();
  }

  public void setSecondColor(int paramInt)
  {
    this.d = paramInt;
    invalidate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.widget.CircleProgressBar
 * JD-Core Version:    0.6.0
 */