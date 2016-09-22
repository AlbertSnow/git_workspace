package com.unionpay.mpay.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.View;

public final class g extends View
{
  private Paint a = new Paint();
  private int b;

  public g(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, 0);
  }

  public g(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.a.setStyle(Paint.Style.STROKE);
    this.a.setStrokeWidth(4.0F);
    this.a.setColor(paramInt1);
    this.a.setPathEffect(null);
    this.b = paramInt2;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.b == 0)
    {
      float f2 = getHeight() >> 1;
      paramCanvas.drawLine(0.0F, f2, getWidth(), f2, this.a);
    }
    do
      return;
    while (1 != this.b);
    float f1 = getWidth() >> 1;
    paramCanvas.drawLine(f1, 0.0F, f1, getHeight(), this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.g
 * JD-Core Version:    0.6.0
 */