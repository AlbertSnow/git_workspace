package com.wandoujia.jupiter.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

public final class i extends ImageSpan
{
  public i(Context paramContext)
  {
    super(paramContext, 2130838117, 0);
  }

  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    Drawable localDrawable = getDrawable();
    Paint.FontMetricsInt localFontMetricsInt = paramPaint.getFontMetricsInt();
    paramCanvas.save();
    paramCanvas.translate(paramFloat, paramInt3 + localFontMetricsInt.ascent - localFontMetricsInt.top + (localFontMetricsInt.descent - localFontMetricsInt.ascent - localDrawable.getIntrinsicHeight()));
    localDrawable.draw(paramCanvas);
    paramCanvas.restore();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.i
 * JD-Core Version:    0.6.0
 */