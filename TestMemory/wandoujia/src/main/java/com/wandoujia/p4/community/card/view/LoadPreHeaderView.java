package com.wandoujia.p4.community.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;

public class LoadPreHeaderView extends RelativeLayout
{
  private TextView a;
  private ProgressBar b;

  public LoadPreHeaderView(Context paramContext)
  {
    super(paramContext);
  }

  public LoadPreHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LoadPreHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static LoadPreHeaderView a(Context paramContext)
  {
    return (LoadPreHeaderView)c.a(paramContext, 2130903202);
  }

  public final void a()
  {
    this.b.setVisibility(8);
    this.a.setVisibility(8);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((ProgressBar)findViewById(2131493490));
    this.a = ((TextView)findViewById(2131493489));
  }

  public void setState(LoadPreHeaderView.State paramState)
  {
    switch (a.a[paramState.ordinal()])
    {
    default:
      this.b.setVisibility(4);
      this.a.setVisibility(0);
      return;
    case 1:
      this.b.setVisibility(4);
      this.a.setVisibility(0);
      return;
    case 2:
    }
    this.b.setVisibility(0);
    this.a.setVisibility(4);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.card.view.LoadPreHeaderView
 * JD-Core Version:    0.6.0
 */