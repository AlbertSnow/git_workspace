package com.wandoujia.jupiter.homepage;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.f;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class d extends com.wandoujia.ripple_framework.view.slidingtab.e
{
  private View b;
  private TextView c;
  private ImageView d;

  d(c paramc, String paramString)
  {
    super(paramString);
  }

  public final View a(Context paramContext, int paramInt, ViewPager paramViewPager, f paramf)
  {
    if (this.b == null)
    {
      this.b = com.wandoujia.p4.utils.c.a(paramContext, 2130903312);
      this.d = ((ImageView)this.b.findViewById(2131493689));
      this.c = ((TextView)this.b.findViewById(2131492998));
    }
    this.b.setOnClickListener(new e(this, paramViewPager, paramInt));
    this.c.setText(this.a.a(paramInt));
    ImageView localImageView = this.d;
    if (c.a(this.a, paramInt));
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      return this.b;
    }
  }

  public final void a()
  {
    this.d.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.d
 * JD-Core Version:    0.6.0
 */