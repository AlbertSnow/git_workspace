package com.wandoujia.launcher_base.view.button.view;

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
import android.util.AttributeSet;
import com.google.android.gms.common.api.a;
import com.wandoujia.base.utils.ImageUtil;
import com.wandoujia.launcher_base.R.color;
import com.wandoujia.launcher_base.R.dimen;
import com.wandoujia.launcher_base.utils.h;

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
  private Runnable j = new c(this);

  public StatefulProgressButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public StatefulProgressButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = paramContext.getResources().getColor(R.color.explore_home_color_normal);
    this.f = getBackground();
    this.g = paramContext.getResources().getDimensionPixelOffset(R.dimen.round_button_radius);
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
    if (paramFloat == 0.0F)
    {
      removeCallbacks(this.j);
      h.a(this, this.f);
      return;
    }
    int k = getWidth();
    int m = getHeight();
    if ((k > 0) && (m > 0))
      if ((paramFloat < this.i) || (paramFloat == 0.0F) || (this.e == null))
      {
        this.e = a(k, m);
        this.h = true;
        Canvas localCanvas = new Canvas(this.e);
        if (this.c == null)
        {
          this.c = new Paint();
          this.c.setAntiAlias(true);
          this.c.setColor(this.b);
        }
        localCanvas.drawRoundRect(new RectF(0.0F, 0.0F, paramFloat * k, m), this.g, this.g, this.c);
        Bitmap localBitmap = this.e;
        h.a(this, new BitmapDrawable(getContext().getResources(), localBitmap));
      }
    while (true)
    {
      this.i = paramFloat;
      return;
      if ((paramFloat * k <= 2 * this.g) || (!this.h))
        break;
      this.e = a(k, m);
      this.h = false;
      break;
      post(this.j);
    }
  }

  public void setState$7f941726(a parama)
  {
    h.a(this, this.f);
    super.setState$7f941726(parama);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.button.view.StatefulProgressButton
 * JD-Core Version:    0.6.0
 */