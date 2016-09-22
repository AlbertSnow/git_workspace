package com.wandoujia.ripple_framework.html.style;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Parcel;
import android.text.Layout;
import android.text.style.QuoteSpan;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.i;

public class RippleQuoteSpan extends QuoteSpan
{
  private float a = i.k().g().getApplicationContext().getResources().getDimension(R.dimen.detail_quote_margin);

  public int describeContents()
  {
    return 0;
  }

  public void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    Paint.Style localStyle = paramPaint.getStyle();
    int i = paramPaint.getColor();
    paramPaint.setStyle(Paint.Style.FILL);
    paramPaint.setColor(-4144960);
    paramCanvas.drawRect(paramInt1 + this.a, paramInt3, 10.0F + (paramInt1 + this.a), paramInt5, paramPaint);
    paramPaint.setStyle(localStyle);
    paramPaint.setColor(i);
  }

  public int getColor()
  {
    return -4144960;
  }

  public int getLeadingMargin(boolean paramBoolean)
  {
    return 10 + 2 * (int)this.a;
  }

  public int getSpanTypeId()
  {
    return 9;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(-4144960);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.html.style.RippleQuoteSpan
 * JD-Core Version:    0.6.0
 */