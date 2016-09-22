package com.wandoujia.jupiter.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

public class PageDotIndicator extends View
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private Paint g;
  private Paint h;

  public PageDotIndicator(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public PageDotIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  private static Paint a(int paramInt)
  {
    Paint localPaint = new Paint();
    localPaint.setColor(paramInt);
    localPaint.setAntiAlias(true);
    localPaint.setStyle(Paint.Style.FILL);
    return localPaint;
  }

  private void a()
  {
    this.g = a(getContext().getResources().getColor(2131361929));
    this.h = a(getContext().getResources().getColor(2131361930));
    this.e = getResources().getDimensionPixelSize(2131427791);
    this.f = getResources().getDimensionPixelSize(2131427790);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.a > 0) && (this.b >= 0) && (this.b < this.a))
    {
      float f1 = (this.c - 2 * this.e * this.a - (-1 + this.a) * this.f) / 2;
      int i = 0;
      if (i < this.a)
      {
        if (i == this.b);
        for (Paint localPaint = this.h; ; localPaint = this.g)
        {
          paramCanvas.drawCircle(f1 + i * (this.f + 2 * this.e) + this.e, this.d / 2, this.e, localPaint);
          i++;
          break;
        }
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.c = getMeasuredWidth();
    this.d = getMeasuredHeight();
  }

  public void setCurrentPage(int paramInt)
  {
    this.b = paramInt;
    postInvalidate();
  }

  public void setPageCount(int paramInt)
  {
    this.a = paramInt;
    postInvalidate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.PageDotIndicator
 * JD-Core Version:    0.6.0
 */