package com.wandoujia.jupiter.library.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.v4.view.ViewPager;
import android.support.v7.app.f;
import android.view.View;
import com.nineoldandroids.animation.ArgbEvaluator;
import com.wandoujia.ripple_framework.TypefaceManager.FONT;
import com.wandoujia.ripple_framework.view.CustomFontTextView;
import com.wandoujia.ripple_framework.view.slidingtab.e;

public final class a extends e
  implements TransitionTab
{
  private CustomFontTextView b;
  private CharSequence c;
  private int d;
  private int e;

  public a(String paramString, CharSequence paramCharSequence)
  {
    super(paramString, paramCharSequence);
    this.c = paramCharSequence;
  }

  public final View a(Context paramContext, int paramInt, ViewPager paramViewPager, f paramf)
  {
    if (this.b == null)
    {
      this.b = new CustomFontTextView(paramContext);
      this.b.setFont(TypefaceManager.FONT.BOLD);
      this.b.setText(this.c);
      this.b.setFocusable(true);
      this.b.setGravity(17);
      this.b.setSingleLine();
      this.b.setTextSize(0, paramContext.getResources().getDimension(2131427932));
      this.b.setTextColor(paramContext.getResources().getColorStateList(2131362264));
    }
    this.b.setOnClickListener(new b(paramViewPager, paramInt));
    return this.b;
  }

  public final void a(TransitionTab.State paramState)
  {
    if (this.b == null)
      return;
    this.d = this.b.getCurrentTextColor();
    if (this.b.isSelected());
    for (int i = paramState.getTitleColorList().getColorForState(new int[] { 16842913 }, this.d); ; i = paramState.getTitleColorList().getDefaultColor())
    {
      this.e = i;
      return;
    }
  }

  public final void a(TransitionTab.State paramState, float paramFloat)
  {
    if (this.b == null)
      return;
    this.b.setTextColor(((Integer)a.evaluate(paramFloat, Integer.valueOf(this.d), Integer.valueOf(this.e))).intValue());
  }

  public final void b(TransitionTab.State paramState)
  {
    if (this.b == null)
      return;
    this.b.setTextColor(paramState.getTitleColorList());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.view.a
 * JD-Core Version:    0.6.0
 */