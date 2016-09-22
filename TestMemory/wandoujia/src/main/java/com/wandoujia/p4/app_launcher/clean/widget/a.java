package com.wandoujia.p4.app_launcher.clean.widget;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;

public final class a
{
  private final CircleProgressBar a;
  private final TextView b;
  private final ImageView c;

  public a(CircleProgressBar paramCircleProgressBar, TextView paramTextView, ImageView paramImageView)
  {
    this.a = paramCircleProgressBar;
    this.b = paramTextView;
    this.c = paramImageView;
  }

  public static int b(int paramInt)
  {
    if (paramInt < 30)
      return 0;
    if (paramInt < 80)
      return 1;
    return 2;
  }

  public final void a(int paramInt)
  {
    Resources localResources = GlobalConfig.getAppContext().getResources();
    switch (paramInt)
    {
    default:
      return;
    case 0:
      this.a.setProgress(0);
      this.a.setSecondColor(localResources.getColor(2131361895));
      this.b.setTextColor(localResources.getColor(2131361896));
      this.b.setVisibility(0);
      this.c.setVisibility(4);
      return;
    case 1:
      this.a.setProgress(0);
      this.a.setSecondColor(localResources.getColor(2131361897));
      this.b.setTextColor(localResources.getColor(2131361898));
      this.b.setVisibility(0);
      this.c.setVisibility(4);
      return;
    case 2:
      this.a.setProgress(0);
      this.a.setSecondColor(localResources.getColor(2131361892));
      this.b.setTextColor(localResources.getColor(2131361893));
      this.b.setVisibility(0);
      this.c.setVisibility(4);
      return;
    case 3:
      this.a.setPrimaryColor(localResources.getColor(2131361896));
      this.a.setSecondColor(localResources.getColor(2131361894));
      this.b.setVisibility(4);
      this.c.setVisibility(0);
      this.c.setImageResource(2130838255);
      return;
    case 4:
    }
    this.a.setPrimaryColor(localResources.getColor(2131361895));
    this.a.setSecondColor(localResources.getColor(2131361894));
    this.b.setVisibility(4);
    this.c.setVisibility(0);
    this.c.setImageResource(2130838256);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.widget.a
 * JD-Core Version:    0.6.0
 */