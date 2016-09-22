package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.ripple_framework.R.styleable;

public class ForegroundImageView extends AsyncImageView
{
  private Drawable a;

  public ForegroundImageView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ForegroundImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ForegroundImageView);
    Drawable localDrawable = localTypedArray.getDrawable(R.styleable.ForegroundImageView_android_foreground);
    if (localDrawable != null)
      setForeground(localDrawable);
    localTypedArray.recycle();
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.a != null)
      this.a.draw(paramCanvas);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.a != null) && (this.a.isStateful()))
      this.a.setState(getDrawableState());
  }

  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.a != null)
      this.a.jumpToCurrentState();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.a != null)
    {
      this.a.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      invalidate();
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null)
    {
      this.a.setBounds(0, 0, paramInt1, paramInt2);
      invalidate();
    }
  }

  public void setForeground(Drawable paramDrawable)
  {
    if (this.a == paramDrawable)
      return;
    if (this.a != null)
    {
      this.a.setCallback(null);
      unscheduleDrawable(this.a);
    }
    this.a = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (paramDrawable.isStateful())
        paramDrawable.setState(getDrawableState());
    }
    requestLayout();
    invalidate();
  }

  public void setForegroundResource(int paramInt)
  {
    setForeground(getContext().getResources().getDrawable(paramInt));
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ForegroundImageView
 * JD-Core Version:    0.6.0
 */