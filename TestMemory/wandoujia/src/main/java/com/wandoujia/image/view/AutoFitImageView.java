package com.wandoujia.image.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;

public class AutoFitImageView extends AsyncImageView
{
  private boolean a = true;

  public AutoFitImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void b(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((getMeasuredWidth() > 0) && (getDrawable() != null) && (this.a))
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() * getDrawable().getIntrinsicHeight() / getDrawable().getIntrinsicWidth(), 1073741824));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.view.AutoFitImageView
 * JD-Core Version:    0.6.0
 */