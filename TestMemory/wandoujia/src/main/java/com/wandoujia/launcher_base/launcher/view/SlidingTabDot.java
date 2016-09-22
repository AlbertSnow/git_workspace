package com.wandoujia.launcher_base.launcher.view;

import android.content.Context;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.launcher_base.R.drawable;

public class SlidingTabDot extends RelativeLayout
{
  private int a = 0;

  public SlidingTabDot(Context paramContext)
  {
    this(paramContext, null);
  }

  public SlidingTabDot(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SlidingTabDot(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private ImageView b(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getChildCount()))
    {
      View localView = getChildAt(paramInt);
      if ((localView instanceof ImageView))
        return (ImageView)localView;
    }
    return null;
  }

  public final void a(int paramInt)
  {
    removeAllViews();
    if (paramInt <= 1)
      return;
    int i = b.a(5.0F, getContext());
    int j = 0;
    label22: ImageView localImageView;
    if (j < paramInt)
    {
      localImageView = new ImageView(getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      if (j > 0)
        localLayoutParams.addRule(1, -1 + (j + 100));
      localLayoutParams.addRule(15);
      localImageView.setLayoutParams(localLayoutParams);
      localImageView.setPadding(i, 0, i, 0);
      localImageView.setId(j + 100);
      if (j != this.a)
        break label129;
      localImageView.setImageResource(R.drawable.launcher_tab_dot);
    }
    while (true)
    {
      addView(localImageView);
      j++;
      break label22;
      break;
      label129: localImageView.setImageResource(R.drawable.launcher_tab_dot_s);
    }
  }

  public void setSelect(int paramInt)
  {
    ImageView localImageView1 = b(this.a);
    if (localImageView1 != null)
      localImageView1.setImageResource(R.drawable.launcher_tab_dot_s);
    ImageView localImageView2 = b(paramInt);
    if (localImageView2 != null)
    {
      localImageView2.setImageResource(R.drawable.launcher_tab_dot);
      this.a = paramInt;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.view.SlidingTabDot
 * JD-Core Version:    0.6.0
 */