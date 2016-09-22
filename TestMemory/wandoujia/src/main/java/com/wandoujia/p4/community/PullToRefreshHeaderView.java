package com.wandoujia.p4.community;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;

public class PullToRefreshHeaderView extends RelativeLayout
{
  private TextView a;
  private ImageView b;
  private ProgressBar c;
  private RotateAnimation d;
  private PullToRefreshHeaderView.PullToRefreshState e = PullToRefreshHeaderView.PullToRefreshState.PULLING;

  public PullToRefreshHeaderView(Context paramContext)
  {
    super(paramContext);
  }

  public PullToRefreshHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public PullToRefreshHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static PullToRefreshHeaderView a(Context paramContext)
  {
    return (PullToRefreshHeaderView)c.a(paramContext, 2130903512);
  }

  public final void a()
  {
    this.a.setVisibility(8);
    this.b.setVisibility(8);
    this.c.setVisibility(8);
    a(1);
  }

  public final void a(int paramInt)
  {
    AbsListView.LayoutParams localLayoutParams = (AbsListView.LayoutParams)getLayoutParams();
    if (localLayoutParams != null)
    {
      localLayoutParams.height = paramInt;
      setLayoutParams(localLayoutParams);
    }
  }

  public final void a(PullToRefreshHeaderView.PullToRefreshState paramPullToRefreshState)
  {
    switch (f.a[paramPullToRefreshState.ordinal()])
    {
    default:
      if (((this.e != PullToRefreshHeaderView.PullToRefreshState.PULLING) || (paramPullToRefreshState != PullToRefreshHeaderView.PullToRefreshState.RELEASE)) && ((this.e != PullToRefreshHeaderView.PullToRefreshState.RELEASE) || (paramPullToRefreshState != PullToRefreshHeaderView.PullToRefreshState.PULLING)))
        break;
      this.b.startAnimation(this.d);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.e = paramPullToRefreshState;
      return;
      this.a.setText(2131625289);
      this.b.setVisibility(0);
      this.c.setVisibility(8);
      this.b.setImageResource(2130838656);
      break;
      this.a.setText(2131625290);
      this.b.setVisibility(0);
      this.b.setImageResource(2130838657);
      this.c.setVisibility(8);
      break;
      this.b.clearAnimation();
      this.a.setText(2131625288);
      this.b.setVisibility(8);
      this.c.setVisibility(0);
      break;
      if (this.e != PullToRefreshHeaderView.PullToRefreshState.LOADING)
        continue;
      this.b.setImageResource(2130838656);
    }
  }

  public final void b()
  {
    this.a.setVisibility(0);
    this.b.setVisibility(0);
    this.c.setVisibility(0);
    a(1);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((ProgressBar)findViewById(2131493947));
    this.b = ((ImageView)findViewById(2131493948));
    this.a = ((TextView)findViewById(2131493946));
    this.d = new RotateAnimation(180.0F, 360.0F, 1, 0.5F, 1, 0.5F);
    this.d.setDuration(400L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.PullToRefreshHeaderView
 * JD-Core Version:    0.6.0
 */