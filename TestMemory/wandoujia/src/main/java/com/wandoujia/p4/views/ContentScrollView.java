package com.wandoujia.p4.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.ScrollView;
import com.wandoujia.phoenix2.av.view.ScrollDownLayout;

public class ContentScrollView extends ScrollView
{
  private h a;

  public ContentScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ContentScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    for (ViewParent localViewParent = getParent(); ; localViewParent = localViewParent.getParent())
    {
      if (localViewParent != null)
      {
        if (!(localViewParent instanceof ScrollDownLayout))
          continue;
        ((ScrollDownLayout)localViewParent).setAssociatedScrollView(this);
      }
      return;
    }
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null)
      this.a.a();
  }

  public void setOnScrollChangeListener(h paramh)
  {
    this.a = paramh;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.ContentScrollView
 * JD-Core Version:    0.6.0
 */