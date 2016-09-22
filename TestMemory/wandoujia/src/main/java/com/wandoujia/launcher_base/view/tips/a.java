package com.wandoujia.launcher_base.view.tips;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.wandoujia.launcher_base.utils.h;

public final class a
{
  private View a;

  public a(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, 0);
  }

  private a(Context paramContext, int paramInt, byte paramByte)
  {
    this(h.b(new FrameLayout(paramContext), paramInt), 0);
  }

  public a(View paramView)
  {
    this(paramView, 0);
  }

  private a(View paramView, byte paramByte)
  {
    this.a = paramView;
    this.a.setTag(this);
    if (!(paramView.getLayoutParams() instanceof FrameLayout.LayoutParams))
      new FrameLayout.LayoutParams(-1, -1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.tips.a
 * JD-Core Version:    0.6.0
 */