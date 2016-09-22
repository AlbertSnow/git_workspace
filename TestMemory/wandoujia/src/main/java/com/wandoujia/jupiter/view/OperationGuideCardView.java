package com.wandoujia.jupiter.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.wandoujia.p4.utils.c;
import com.wandoujia.ripple_framework.view.StatefulButton;

public class OperationGuideCardView extends RelativeLayout
{
  private ImageView a;
  private StatefulButton b;
  private l c;

  public OperationGuideCardView(Context paramContext)
  {
    super(paramContext);
  }

  public OperationGuideCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public OperationGuideCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  @TargetApi(21)
  public OperationGuideCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }

  public static OperationGuideCardView a(ViewGroup paramViewGroup)
  {
    return (OperationGuideCardView)c.a(paramViewGroup, 2130903479);
  }

  public ImageView getDeleteView()
  {
    return this.a;
  }

  public StatefulButton getSettingButton()
  {
    return this.b;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ImageView)findViewById(2131493412));
    this.b = ((StatefulButton)findViewById(2131492866));
    this.a.setOnClickListener(new j(this));
    this.b.setOnClickListener(new k(this));
  }

  public void setListener(l paraml)
  {
    this.c = paraml;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.OperationGuideCardView
 * JD-Core Version:    0.6.0
 */