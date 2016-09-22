package com.wandoujia.ripple_framework.html.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.StyleSpan;

public class QuoteTextSpan extends StyleSpan
{
  public QuoteTextSpan()
  {
    super(1);
  }

  private static void a(Paint paramPaint, int paramInt)
  {
    Typeface localTypeface1 = paramPaint.getTypeface();
    int i;
    int j;
    if (localTypeface1 == null)
    {
      i = 0;
      j = i | paramInt;
      if (localTypeface1 != null)
        break label86;
    }
    label86: for (Typeface localTypeface2 = Typeface.defaultFromStyle(j); ; localTypeface2 = Typeface.create(localTypeface1, j))
    {
      int k = j & (0xFFFFFFFF ^ localTypeface2.getStyle());
      if ((k & 0x1) != 0)
        paramPaint.setFakeBoldText(true);
      if ((k & 0x2) != 0)
        paramPaint.setTextSkewX(-0.25F);
      paramPaint.setColor(-6513508);
      paramPaint.setTypeface(localTypeface2);
      return;
      i = localTypeface1.getStyle();
      break;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public int getSpanTypeId()
  {
    return 7;
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    a(paramTextPaint, getStyle());
  }

  public void updateMeasureState(TextPaint paramTextPaint)
  {
    a(paramTextPaint, getStyle());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.html.style.QuoteTextSpan
 * JD-Core Version:    0.6.0
 */