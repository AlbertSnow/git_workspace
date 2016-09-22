package com.wandoujia.launcher_base.view.stateful.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.view.View;
import com.wandoujia.launcher_base.R.color;
import com.wandoujia.launcher_base.R.drawable;
import com.wandoujia.launcher_base.R.styleable;

public class StatefulIcon extends View
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private Paint g;
  private Paint h;
  private Paint i;
  private Bitmap j;
  private Bitmap k;
  private StatefulIcon.IconState l = StatefulIcon.IconState.DOWNLOADING;

  public StatefulIcon(Context paramContext)
  {
    this(paramContext, null);
  }

  public StatefulIcon(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public StatefulIcon(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.StatefulIconStyle);
    this.a = localTypedArray.getDimensionPixelSize(R.styleable.StatefulIconStyle_outer_radius, b.a(18.0F, getContext()));
    this.b = localTypedArray.getDimensionPixelSize(R.styleable.StatefulIconStyle_inner_radius, b.a(12.0F, getContext()));
    this.d = localTypedArray.getColor(R.styleable.StatefulIconStyle_outer_color, getResources().getColor(R.color.green_progress));
    this.e = localTypedArray.getColor(R.styleable.StatefulIconStyle_inner_color, getResources().getColor(R.color.green_primary));
    this.f = localTypedArray.getColor(R.styleable.StatefulIconStyle_background_color, getResources().getColor(R.color.pure_white));
    this.c = localTypedArray.getInteger(R.styleable.StatefulIconStyle_angle, 0);
    localTypedArray.recycle();
    this.j = BitmapFactory.decodeResource(getResources(), R.drawable.stateful_icon_start);
    this.k = BitmapFactory.decodeResource(getResources(), R.drawable.stateful_icon_pause);
    this.g = new Paint(1);
    this.g.setColor(this.d);
    this.h = new Paint(1);
    this.h.setColor(this.e);
    this.i = new Paint(1);
    this.i.setColor(this.f);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int m = getWidth() / 2;
    int n = getHeight() / 2;
    paramCanvas.drawCircle(m, n, this.a, this.i);
    paramCanvas.drawArc(new RectF(m - this.a, n - this.a, m + this.a, n + this.a), -90.0F, this.c, true, this.g);
    paramCanvas.drawCircle(m, n, this.b, this.h);
    if (this.l == StatefulIcon.IconState.PAUSING)
    {
      paramCanvas.drawBitmap(this.j, m - this.j.getWidth() / 2, n - this.j.getHeight() / 2, null);
      return;
    }
    paramCanvas.drawBitmap(this.k, m - this.k.getWidth() / 2, n - this.k.getHeight() / 2, null);
  }

  public void setIconState(StatefulIcon.IconState paramIconState)
  {
    this.l = paramIconState;
    invalidate();
  }

  public void setProgress(int paramInt)
  {
    this.c = (paramInt * 360 / 100);
    invalidate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.stateful.view.StatefulIcon
 * JD-Core Version:    0.6.0
 */