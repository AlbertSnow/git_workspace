package com.wandoujia.jupiter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.wandoujia.ripple_framework.view.StatefulButton;

public class AutoInstallCardView extends RelativeLayout
{
  private ImageView a;
  private StatefulButton b;
  private e c;

  public AutoInstallCardView(Context paramContext)
  {
    super(paramContext);
  }

  public AutoInstallCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AutoInstallCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static AutoInstallCardView a(ViewGroup paramViewGroup)
  {
    return (AutoInstallCardView)com.wandoujia.p4.utils.c.a(paramViewGroup, 2130903164);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ImageView)findViewById(2131493412));
    this.b = ((StatefulButton)findViewById(2131492866));
    this.a.setOnClickListener(new c(this));
    this.b.setOnClickListener(new d(this));
  }

  public void setIsFromCard(boolean paramBoolean)
  {
  }

  public void setListener(e parame)
  {
    this.c = parame;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.AutoInstallCardView
 * JD-Core Version:    0.6.0
 */