package com.wandoujia.p4.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.wandoujia.phoenix2.R.styleable;

public class ExpandablePanelIcon extends ImageView
{
  private int a;
  private int b;

  public ExpandablePanelIcon(Context paramContext)
  {
    super(paramContext);
  }

  public ExpandablePanelIcon(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ExpandablePanelIcon(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ExpandablePanel, 0, 0);
    this.a = localTypedArray.getResourceId(3, 0);
    if (this.a == 0)
      throw new IllegalArgumentException("The expandedIconSrc attribute is required and must refer to a valid drawable.");
    this.b = localTypedArray.getResourceId(4, 0);
    if (this.b == 0)
      throw new IllegalArgumentException("The collapsedIconSrc attribute is required and must refer to a valid drawable.");
    b();
    localTypedArray.recycle();
  }

  public final void a()
  {
    setImageResource(this.a);
  }

  public final void b()
  {
    setImageResource(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.ExpandablePanelIcon
 * JD-Core Version:    0.6.0
 */