package com.wandoujia.jupiter.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.support.v4.view.ck;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextViewPagerIndicator extends TextView
  implements ck
{
  private ck a;
  private int b;
  private TextView c;
  private TextView d;

  public TextViewPagerIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt + 1);
    arrayOfObject[1] = Integer.valueOf(this.b);
    setText(String.format("%s / %s", arrayOfObject));
    if (this.c != null)
      this.c.setVisibility(8);
    if (this.d != null)
      this.d.setVisibility(8);
    if (this.a != null)
      this.a.a(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.a != null)
      this.a.a(paramInt1, paramFloat, paramInt2);
  }

  public final void b(int paramInt)
  {
    if (this.a != null)
      this.a.b(paramInt);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }

  public void setCurrentItem(int paramInt)
  {
    a(paramInt);
  }

  public void setListener(ck paramck)
  {
    this.a = paramck;
  }

  public void setSnippet(TextView paramTextView)
  {
    this.d = paramTextView;
  }

  public void setTitle(TextView paramTextView)
  {
    this.c = paramTextView;
  }

  public void setViewPager(ViewPager paramViewPager)
  {
    if (paramViewPager.getAdapter() == null)
      throw new IllegalStateException("ViewPager Adapter has not been bound.");
    this.b = paramViewPager.getAdapter().a();
    paramViewPager.setOnPageChangeListener(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.TextViewPagerIndicator
 * JD-Core Version:    0.6.0
 */