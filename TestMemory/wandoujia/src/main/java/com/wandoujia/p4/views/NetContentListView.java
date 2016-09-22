package com.wandoujia.p4.views;

import android.content.Context;
import android.util.AttributeSet;

public class NetContentListView extends ContentListView
{
  private String a;

  public NetContentListView(Context paramContext)
  {
    super(paramContext);
  }

  public NetContentListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public NetContentListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public String getSource()
  {
    return this.a;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }

  public void setSource(String paramString)
  {
    this.a = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.NetContentListView
 * JD-Core Version:    0.6.0
 */