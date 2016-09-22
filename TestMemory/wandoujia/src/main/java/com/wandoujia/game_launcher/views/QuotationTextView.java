package com.wandoujia.game_launcher.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.wandoujia.game_launcher.lib.R.dimen;

public class QuotationTextView extends TextView
{
  private Layout a;
  private Rect b;
  private int c;
  private int d;
  private int e;

  public QuotationTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public QuotationTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public QuotationTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWillNotDraw(false);
    this.b = new Rect();
    this.a = getLayout();
    this.d = paramContext.getResources().getDimensionPixelSize(R.dimen.margin_xsmall);
    this.e = paramContext.getResources().getDimensionPixelSize(R.dimen.margin_medium);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    this.a = getLayout();
    if ((this.a != null) && (!TextUtils.isEmpty(getText())))
    {
      float f = getPaint().measureText(getText(), 0, this.a.getLineEnd(0));
      getLineBounds(0, this.b);
      paramCanvas.translate((this.c - f) / 2.0F - this.e, this.b.top + this.d);
      paramCanvas.restore();
      paramCanvas.translate((f + this.c) / 2.0F + this.e, this.b.top + this.d);
      paramCanvas.restore();
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.c = getMeasuredWidth();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.QuotationTextView
 * JD-Core Version:    0.6.0
 */