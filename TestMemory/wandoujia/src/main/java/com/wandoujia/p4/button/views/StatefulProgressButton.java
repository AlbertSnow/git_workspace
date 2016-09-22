package com.wandoujia.p4.button.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.app.b;
import android.util.AttributeSet;
import com.wandoujia.base.utils.ImageUtil;
import com.wandoujia.p4.button.a.a;

public class StatefulProgressButton extends StatefulButton
{
  private int b;
  private Paint c;
  private Paint d;
  private Bitmap e;
  private Drawable f;
  private int g;
  private boolean h;
  private float i;
  private Runnable j = new d(this);

  public StatefulProgressButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public StatefulProgressButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = paramContext.getResources().getColor(2131361951);
    this.f = getBackground();
    this.g = paramContext.getResources().getDimensionPixelOffset(2131427832);
  }

  private Bitmap a(int paramInt1, int paramInt2)
  {
    if ((this.e == null) || (this.h))
    {
      if (this.e != null)
        this.e.recycle();
      this.e = ImageUtil.creatBitmapSafty(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    }
    Canvas localCanvas = new Canvas(this.e);
    if (this.d == null)
    {
      LinearGradient localLinearGradient = new LinearGradient(0.0F, 0.0F, 0.0F, paramInt2, Color.parseColor("#EEEEEE"), Color.parseColor("#EEEEEE"), Shader.TileMode.CLAMP);
      this.d = new Paint();
      this.d.setColor(Color.parseColor("#EEEEEE"));
      this.d.setShader(localLinearGradient);
      this.d.setAntiAlias(true);
    }
    localCanvas.drawRoundRect(new RectF(0.0F, 0.0F, paramInt1, paramInt2), this.g, this.g, this.d);
    return this.e;
  }

  public void setProgress(float paramFloat)
  {
    this.i = paramFloat;
    if (paramFloat == 0.0F)
    {
      removeCallbacks(this.j);
      b.a(this, this.f);
      return;
    }
    int k = getWidth();
    int m = getHeight();
    if ((k > 0) && (m > 0))
    {
      if ((paramFloat < paramFloat) || (paramFloat == 0.0F) || (this.e == null))
        this.e = a(k, m);
      for (this.h = true; ; this.h = false)
      {
        do
        {
          Canvas localCanvas = new Canvas(this.e);
          if (this.c == null)
          {
            this.c = new Paint();
            this.c.setAntiAlias(true);
            this.c.setColor(this.b);
          }
          localCanvas.drawRoundRect(new RectF(0.0F, 0.0F, paramFloat * k, m), this.g, this.g, this.c);
          Bitmap localBitmap = this.e;
          b.a(this, new BitmapDrawable(getContext().getResources(), localBitmap));
          return;
        }
        while ((paramFloat * k <= 2 * this.g) || (!this.h));
        this.e = a(k, m);
      }
    }
    post(this.j);
  }

  public void setState(a parama)
  {
    b.a(this, this.f);
    super.setState(parama);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.views.StatefulProgressButton
 * JD-Core Version:    0.6.0
 */