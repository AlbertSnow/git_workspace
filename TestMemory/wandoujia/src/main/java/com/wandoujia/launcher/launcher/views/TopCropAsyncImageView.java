package com.wandoujia.launcher.launcher.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.wandoujia.game_launcher.lib.R.styleable;
import com.wandoujia.image.view.AsyncImageView;

public class TopCropAsyncImageView extends AsyncImageView
{
  private float a = 0.0F;
  private float b = 0.0F;
  private int c = 0;
  private int d = 0;
  private float e = 1.0F;

  public TopCropAsyncImageView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TopCropAsyncImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public TopCropAsyncImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setScaleType(ImageView.ScaleType.MATRIX);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.TopCropAsyncImageView);
    this.a = localTypedArray.getFloat(R.styleable.TopCropAsyncImageView_topRadius, this.a);
    this.b = localTypedArray.getFloat(R.styleable.TopCropAsyncImageView_bottomRadius, this.b);
    this.c = localTypedArray.getDimensionPixelSize(R.styleable.TopCropAsyncImageView_maxHeight, this.c);
    this.d = localTypedArray.getDimensionPixelSize(R.styleable.TopCropAsyncImageView_minHeight, this.d);
    localTypedArray.recycle();
  }

  private void c()
  {
    Matrix localMatrix;
    float f1;
    float f2;
    float f3;
    if (getDrawable() != null)
    {
      int i = getDrawable().getIntrinsicWidth();
      int j = getHeight();
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      localMatrix = getImageMatrix();
      f1 = getWidth() / i;
      f2 = localLayoutParams.height / j;
      if (f1 <= f2)
        break label111;
      f3 = f1 * this.e;
      Drawable localDrawable = getDrawable();
      if (localDrawable == null)
        break label118;
      localMatrix.setScale(f3, f3, localDrawable.getIntrinsicWidth() / 2, localDrawable.getIntrinsicHeight() / 2);
    }
    while (true)
    {
      setImageMatrix(localMatrix);
      return;
      label111: f1 = f2;
      break;
      label118: localMatrix.setScale(f3, f3, 0.0F, 0.0F);
    }
  }

  private void setImageViewSize(Bitmap paramBitmap)
  {
    int i = paramBitmap.getHeight() * getWidth() / paramBitmap.getWidth();
    if (i > this.c)
      i = this.c;
    if (i < this.d)
      i = this.d;
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    localLayoutParams.height = i;
    setLayoutParams(localLayoutParams);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    c();
  }

  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c();
    return super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    setImageViewSize(paramBitmap);
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    ViewGroup.LayoutParams localLayoutParams1 = getLayoutParams();
    Matrix localMatrix = getImageMatrix();
    float f1 = getWidth() / i;
    float f2 = localLayoutParams1.height / j;
    if (f1 > f2);
    while (true)
    {
      localMatrix.setScale(f1, f1, 0.0F, 0.0F);
      setImageMatrix(localMatrix);
      this.e = 1.0F;
      ViewGroup.LayoutParams localLayoutParams2 = getLayoutParams();
      Bitmap localBitmap = Bitmap.createBitmap(getWidth(), localLayoutParams2.height, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      BitmapShader localBitmapShader = new BitmapShader(paramBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
      localBitmapShader.setLocalMatrix(localMatrix);
      Paint localPaint = new Paint();
      localPaint.setShader(localBitmapShader);
      localPaint.setAntiAlias(true);
      RectF localRectF1 = new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), localLayoutParams2.height - getPaddingBottom());
      RectF localRectF2 = new RectF(localRectF1.left, localRectF1.top, localRectF1.right, localRectF1.bottom - this.b);
      RectF localRectF3 = new RectF(localRectF1.left, localRectF1.top + this.a, localRectF1.right, localRectF1.bottom);
      Path localPath = new Path();
      localPath.addRoundRect(localRectF2, this.a, this.a, Path.Direction.CW);
      localPath.addRoundRect(localRectF3, this.b, this.b, Path.Direction.CW);
      localCanvas.drawPath(localPath, localPaint);
      super.setImageBitmap(localBitmap);
      return;
      f1 = f2;
    }
  }

  public void setScale(float paramFloat)
  {
    this.e = paramFloat;
    requestLayout();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.views.TopCropAsyncImageView
 * JD-Core Version:    0.6.0
 */