package com.wandoujia.jupiter.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.phoenix2.R.styleable;

public class RoundAsyncImageView extends AsyncImageView
{
  private int a = 0;
  private Paint b;
  private Matrix c;
  private RoundRectShape d;

  public RoundAsyncImageView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public RoundAsyncImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public RoundAsyncImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RoundAsyncImageView, 0, 0);
      this.a = localTypedArray.getDimensionPixelSize(0, 0);
      localTypedArray.recycle();
    }
    this.c = new Matrix();
    this.b = new Paint();
    this.b.setAntiAlias(true);
    float[] arrayOfFloat = new float[8];
    arrayOfFloat[0] = this.a;
    arrayOfFloat[1] = this.a;
    arrayOfFloat[2] = this.a;
    arrayOfFloat[3] = this.a;
    arrayOfFloat[4] = this.a;
    arrayOfFloat[5] = this.a;
    arrayOfFloat[6] = this.a;
    arrayOfFloat[7] = this.a;
    this.d = new RoundRectShape(arrayOfFloat, null, null);
  }

  public void onDraw(Canvas paramCanvas)
  {
    Drawable localDrawable = getDrawable();
    if ((localDrawable instanceof BitmapDrawable))
    {
      BitmapDrawable localBitmapDrawable = (BitmapDrawable)localDrawable;
      BitmapShader localBitmapShader = new BitmapShader(localBitmapDrawable.getBitmap(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
      float f = Math.max(getWidth() / localBitmapDrawable.getIntrinsicWidth(), getHeight() / localBitmapDrawable.getIntrinsicHeight());
      this.c.setScale(f, f);
      localBitmapShader.setLocalMatrix(this.c);
      this.b.setShader(localBitmapShader);
      this.d.resize(getWidth(), getHeight());
      this.d.draw(paramCanvas, this.b);
      return;
    }
    super.onDraw(paramCanvas);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.RoundAsyncImageView
 * JD-Core Version:    0.6.0
 */