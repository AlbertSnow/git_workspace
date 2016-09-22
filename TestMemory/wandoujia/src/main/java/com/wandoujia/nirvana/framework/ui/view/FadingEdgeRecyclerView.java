package com.wandoujia.nirvana.framework.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import com.wandoujia.logv3.toolkit.cardshow.CardShowRecyclerView;

public class FadingEdgeRecyclerView extends CardShowRecyclerView
{
  private Paint h;
  private Matrix i;
  private Shader j;

  public FadingEdgeRecyclerView(Context paramContext)
  {
    super(paramContext);
    j();
  }

  public FadingEdgeRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    j();
  }

  public FadingEdgeRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    j();
  }

  private void j()
  {
    this.h = new Paint();
    this.i = new Matrix();
    this.j = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, -16777216, 0, Shader.TileMode.CLAMP);
    this.h.setShader(this.j);
    this.h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    boolean bool1 = isHorizontalFadingEdgeEnabled();
    boolean bool2 = isVerticalFadingEdgeEnabled();
    if ((!bool2) && (!bool1))
    {
      super.dispatchDraw(paramCanvas);
      return;
    }
    int k = Math.max(getHorizontalFadingEdgeLength(), getVerticalFadingEdgeLength());
    int m = 0 + getMeasuredHeight();
    int n = 0 + getMeasuredWidth();
    if ((bool2) && (k + 0 > m - k))
      k = (m + 0) / 2;
    if ((bool1) && (k + 0 > n - k));
    for (int i1 = (n + 0) / 2; ; i1 = k)
    {
      int i9;
      int i10;
      label161: float f1;
      float f2;
      int i2;
      if (bool2)
      {
        float f7 = Math.max(0.0F, Math.min(1.0F, getTopFadingEdgeStrength()));
        if (f7 * i1 > 1.0F)
        {
          i9 = 1;
          float f8 = Math.max(0.0F, Math.min(1.0F, getBottomFadingEdgeStrength()));
          if (f8 * i1 <= 1.0F)
            break label643;
          i10 = 1;
          f1 = f8;
          f2 = f7;
          i2 = i10;
        }
      }
      for (int i3 = i9; ; i3 = 0)
      {
        int i7;
        label209: int i8;
        label237: float f3;
        float f4;
        int i4;
        if (bool1)
        {
          float f5 = Math.max(0.0F, Math.min(1.0F, getLeftFadingEdgeStrength()));
          if (f5 * i1 > 1.0F)
          {
            i7 = 1;
            float f6 = Math.max(0.0F, Math.min(1.0F, getRightFadingEdgeStrength()));
            if (f6 * i1 <= 1.0F)
              break label655;
            i8 = 1;
            f3 = f6;
            f4 = f5;
            i4 = i8;
          }
        }
        for (int i5 = i7; ; i5 = 0)
        {
          int i6 = paramCanvas.getSaveCount();
          if (i3 != 0)
            paramCanvas.saveLayer(0.0F, 0.0F, n, i1 + 0, null, 4);
          if (i2 != 0)
            paramCanvas.saveLayer(0.0F, m - i1, n, m, null, 4);
          if (i5 != 0)
            paramCanvas.saveLayer(0.0F, 0.0F, i1 + 0, m, null, 4);
          if (i4 != 0)
            paramCanvas.saveLayer(n - i1, 0.0F, n, m, null, 4);
          super.dispatchDraw(paramCanvas);
          if (i3 != 0)
          {
            this.i.setScale(1.0F, f2 * i1);
            this.i.postTranslate(0.0F, 0.0F);
            this.j.setLocalMatrix(this.i);
            paramCanvas.drawRect(0.0F, 0.0F, n, i1 + 0, this.h);
          }
          if (i2 != 0)
          {
            this.i.setScale(1.0F, f1 * i1);
            this.i.postRotate(180.0F);
            this.i.postTranslate(0.0F, m);
            this.j.setLocalMatrix(this.i);
            paramCanvas.drawRect(0.0F, m - i1, n, m, this.h);
          }
          if (i5 != 0)
          {
            this.i.setScale(1.0F, f4 * i1);
            this.i.postRotate(-90.0F);
            this.i.postTranslate(0.0F, 0.0F);
            this.j.setLocalMatrix(this.i);
            paramCanvas.drawRect(0.0F, 0.0F, i1 + 0, m, this.h);
          }
          if (i4 != 0)
          {
            this.i.setScale(1.0F, f3 * i1);
            this.i.postRotate(90.0F);
            this.i.postTranslate(n, 0.0F);
            this.j.setLocalMatrix(this.i);
            paramCanvas.drawRect(n - i1, 0.0F, n, m, this.h);
          }
          paramCanvas.restoreToCount(i6);
          return;
          i9 = 0;
          break;
          label643: i10 = 0;
          break label161;
          i7 = 0;
          break label209;
          label655: i8 = 0;
          break label237;
          f3 = 0.0F;
          f4 = 0.0F;
          i4 = 0;
        }
        f1 = 0.0F;
        f2 = 0.0F;
        i2 = 0;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.view.FadingEdgeRecyclerView
 * JD-Core Version:    0.6.0
 */