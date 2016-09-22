package com.wandoujia.jupiter.category.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class CategoryScrollView extends ScrollView
{
  private int a;
  private int b;
  private int c;
  private com.wandoujia.jupiter.homepage.b d;
  private Runnable e;

  public CategoryScrollView(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public CategoryScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public CategoryScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  private void a()
  {
    this.e = new a(this);
    setOnTouchListener(new b(this));
    setVerticalScrollBarEnabled(false);
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.d == null) || (paramInt2 == this.b))
      return;
    this.b = paramInt2;
    this.d.a(paramInt1 - paramInt3, paramInt2 - paramInt4);
  }

  public void setHomeOnScrollChangeListener(com.wandoujia.jupiter.homepage.b paramb)
  {
    this.d = paramb;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.view.CategoryScrollView
 * JD-Core Version:    0.6.0
 */