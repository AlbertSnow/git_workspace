package com.wandoujia.jupiter.view;

import android.content.Context;
import android.util.AttributeSet;
import com.wandoujia.ripple_framework.view.CustomFontTextView;

public class NoOverlappingRenderTextView extends CustomFontTextView
{
  public NoOverlappingRenderTextView(Context paramContext)
  {
    super(paramContext);
  }

  public NoOverlappingRenderTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public NoOverlappingRenderTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public NoOverlappingRenderTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }

  public boolean hasOverlappingRendering()
  {
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.NoOverlappingRenderTextView
 * JD-Core Version:    0.6.0
 */