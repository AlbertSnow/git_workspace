package com.wandoujia.p4.community.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class CommunityBallotProgressView extends View
{
  private Paint a;
  private Paint b;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private String f;
  private String g;
  private String h;
  private int i = 0;
  private int j = 0;
  private int k = 0;
  private int l = -12867036;

  public CommunityBallotProgressView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public CommunityBallotProgressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  public CommunityBallotProgressView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    this.a = new Paint();
    this.b = new Paint();
    this.b.setTextAlign(Paint.Align.CENTER);
    this.b.setTextSize(paramContext.getResources().getDimension(2131427920));
    this.c = (int)paramContext.getResources().getDimension(2131427554);
    this.d = (int)paramContext.getResources().getDimension(2131427551);
    this.e = (int)paramContext.getResources().getDimension(2131427552);
    this.f = paramContext.getString(2131624430);
    this.g = paramContext.getString(2131624426);
    this.h = paramContext.getString(2131624428);
  }

  private void a(Canvas paramCanvas, int paramInt1, String paramString, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    this.b.setColor(paramInt2);
    paramCanvas.drawText(paramString, paramInt1, this.k / 2, this.b);
  }

  public final void a()
  {
    this.l = -11625242;
    postInvalidate();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.a.setColor(this.l);
    paramCanvas.drawRect(0.0F, this.k, this.i, this.k + this.c, this.a);
    this.a.setColor(-8487039);
    paramCanvas.drawRect(this.i / 2, this.k, this.i, this.k + this.c, this.a);
    this.a.setFlags(1);
    this.a.setColor(this.l);
    this.a.setStyle(Paint.Style.FILL);
    paramCanvas.drawCircle(this.i / 5, this.k + this.c / 2, this.e, this.a);
    a(paramCanvas, this.i / 5, this.h, this.l);
    this.a.setColor(-1);
    this.a.setStyle(Paint.Style.FILL);
    paramCanvas.drawCircle(this.i / 2, this.k + this.c / 2, this.d, this.a);
    this.a.setColor(this.l);
    this.a.setStyle(Paint.Style.STROKE);
    paramCanvas.drawCircle(this.i / 2, this.k + this.c / 2, this.d, this.a);
    a(paramCanvas, this.i / 2, this.g, this.l);
    this.a.setColor(-1);
    this.a.setStyle(Paint.Style.FILL);
    paramCanvas.drawCircle(4 * (this.i / 5), this.k + this.c / 2, this.e, this.a);
    this.a.setStyle(Paint.Style.STROKE);
    this.a.setColor(-8487039);
    paramCanvas.drawCircle(4 * (this.i / 5), this.k + this.c / 2, this.e, this.a);
    a(paramCanvas, 4 * (this.i / 5), this.f, -2004975743);
    this.a.reset();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.i = getMeasuredWidth();
    this.j = getMeasuredHeight();
    this.k = (2 * this.j / 3);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityBallotProgressView
 * JD-Core Version:    0.6.0
 */