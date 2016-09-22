package com.wandoujia.p4.community.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.f;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.ripple_framework.view.slidingtab.e;

public class c extends e
{
  private View a;
  private TextView b;
  private TextView c;
  private CharSequence d;
  private int e;

  public c(String paramString, CharSequence paramCharSequence)
  {
    super(paramString, paramCharSequence);
    this.d = paramCharSequence;
  }

  public final View a(Context paramContext, int paramInt, ViewPager paramViewPager, f paramf)
  {
    if (this.a == null)
    {
      this.a = LayoutInflater.from(paramContext).inflate(2130903500, null);
      this.b = ((TextView)this.a.findViewById(2131493415));
      this.c = ((TextView)this.a.findViewById(2131493750));
    }
    this.b.setText(this.d);
    if (this.e > 0)
    {
      this.c.setVisibility(0);
      this.c.setText(String.valueOf(this.e));
    }
    while (true)
    {
      this.a.setOnClickListener(new d(paramViewPager, paramInt));
      return this.a;
      this.c.setVisibility(8);
    }
  }

  public final void a(int paramInt)
  {
    this.e = paramInt;
    if (this.c != null)
    {
      if (paramInt > 0)
      {
        this.c.setVisibility(0);
        this.c.setText(String.valueOf(paramInt));
      }
    }
    else
      return;
    this.c.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.c
 * JD-Core Version:    0.6.0
 */