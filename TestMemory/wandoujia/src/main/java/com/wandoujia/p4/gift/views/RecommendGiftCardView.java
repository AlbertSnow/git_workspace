package com.wandoujia.p4.gift.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.wandoujia.p4.card.views.ContentCardView;
import com.wandoujia.p4.utils.c;

public class RecommendGiftCardView extends ContentCardView
{
  private LinearLayout i;

  public RecommendGiftCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static RecommendGiftCardView a(ViewGroup paramViewGroup)
  {
    return (RecommendGiftCardView)c.a(paramViewGroup, 2130903186);
  }

  public LinearLayout getCardContainer()
  {
    return this.i;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((LinearLayout)findViewById(2131493459));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.views.RecommendGiftCardView
 * JD-Core Version:    0.6.0
 */