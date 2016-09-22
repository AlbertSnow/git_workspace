package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;

public class CheckedImageView extends ImageView
  implements Checkable
{
  private static final int[] b = { 16842912 };
  private boolean a;

  public CheckedImageView(Context paramContext)
  {
    super(paramContext);
  }

  public CheckedImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean isChecked()
  {
    return this.a;
  }

  public int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      mergeDrawableStates(arrayOfInt, b);
    return arrayOfInt;
  }

  public void setChecked(boolean paramBoolean)
  {
    if (this.a == paramBoolean)
      return;
    this.a = paramBoolean;
    refreshDrawableState();
  }

  public void toggle()
  {
    if (!this.a);
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.CheckedImageView
 * JD-Core Version:    0.6.0
 */