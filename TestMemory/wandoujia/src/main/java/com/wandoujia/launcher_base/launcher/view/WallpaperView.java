package com.wandoujia.launcher_base.launcher.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.wandoujia.launcher_base.R.styleable;

public class WallpaperView extends ImageView
{
  private Rect a;
  private Paint b;
  private Handler c = new Handler();

  public WallpaperView(Context paramContext)
  {
    this(paramContext, null);
  }

  public WallpaperView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public WallpaperView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWillNotDraw(false);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.WallpaperView);
    int i = localTypedArray.getColor(R.styleable.WallpaperView_mask_color, 16777215);
    localTypedArray.recycle();
    this.b = new Paint();
    this.b.setStyle(Paint.Style.FILL);
    this.b.setColor(i);
  }

  public final void a()
  {
    new c(this).execute(new Void[0]);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(300L);
    setAnimation(localAlphaAnimation);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a != null)
      paramCanvas.drawRect(this.a, this.b);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.a == null)
      this.a = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
  }

  public void setMaskColor(int paramInt)
  {
    this.b.setColor(paramInt);
    postInvalidate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.view.WallpaperView
 * JD-Core Version:    0.6.0
 */