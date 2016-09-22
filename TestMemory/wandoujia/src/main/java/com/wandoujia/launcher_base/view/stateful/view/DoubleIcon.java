package com.wandoujia.launcher_base.view.stateful.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.launcher_base.R.drawable;
import com.wandoujia.launcher_base.R.styleable;

public class DoubleIcon extends RelativeLayout
{
  private AsyncImageView a;
  private AsyncImageView b;

  public DoubleIcon(Context paramContext)
  {
    this(paramContext, null);
  }

  public DoubleIcon(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DoubleIcon(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.DoubleIconStyle);
    int i = localTypedArray.getDimensionPixelOffset(R.styleable.DoubleIconStyle_size_big, b.a(60.0F, getContext()));
    int j = localTypedArray.getDimensionPixelOffset(R.styleable.DoubleIconStyle_size_small, b.a(20.0F, getContext()));
    int k = localTypedArray.getDimensionPixelOffset(R.styleable.DoubleIconStyle_size_offset, b.a(4.0F, getContext()));
    localTypedArray.recycle();
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    localFrameLayout.setForeground(getResources().getDrawable(R.drawable.bg_icon_mask));
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(i, i);
    localLayoutParams1.leftMargin = k;
    localLayoutParams1.addRule(9);
    localLayoutParams1.addRule(10);
    addView(localFrameLayout, localLayoutParams1);
    this.a = new AsyncImageView(paramContext);
    this.b = new AsyncImageView(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    localFrameLayout.addView(this.a, localLayoutParams);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(j, j);
    localLayoutParams2.leftMargin = (i - j + k * 2);
    localLayoutParams2.topMargin = (k + (i - j));
    addView(this.b, localLayoutParams2);
  }

  public final void a(String paramString, int paramInt)
  {
    this.a.a(paramString, paramInt);
  }

  public final void b(String paramString, int paramInt)
  {
    this.a.b(paramString, paramInt);
  }

  public AsyncImageView getIconBig()
  {
    return this.a;
  }

  public void setIconBigByResource(int paramInt)
  {
    this.a.setImageResource(paramInt);
  }

  public final void setIconSmallByPackage$505cff1c(String paramString)
  {
    this.b.b(paramString, 0);
  }

  public void setIconSmallByResource(int paramInt)
  {
    this.b.setImageResource(paramInt);
  }

  public void setIconSmallVisible(boolean paramBoolean)
  {
    AsyncImageView localAsyncImageView = this.b;
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      localAsyncImageView.setVisibility(i);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.stateful.view.DoubleIcon
 * JD-Core Version:    0.6.0
 */