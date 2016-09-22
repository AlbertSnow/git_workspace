package com.wandoujia.ripple_framework.c;

import android.view.View;
import android.widget.LinearLayout;
import com.wandoujia.logv3.toolkit.cardshow.CardShowHorizontalScrollView;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;

public final class am extends c
{
  protected final void a(Model paramModel)
  {
    CardShowHorizontalScrollView localCardShowHorizontalScrollView = (CardShowHorizontalScrollView)e();
    LinearLayout localLinearLayout = (LinearLayout)e().findViewById(R.id.container);
    localCardShowHorizontalScrollView.setOnScrollListener(new an(paramModel, localCardShowHorizontalScrollView, localLinearLayout));
    localCardShowHorizontalScrollView.setOnCardShowListener(new ao(paramModel, localCardShowHorizontalScrollView, localLinearLayout));
    if (paramModel.a(R.id.scroll_pos_x) != null)
    {
      localCardShowHorizontalScrollView.scrollTo(((Integer)paramModel.a(R.id.scroll_pos_x)).intValue(), 0);
      return;
    }
    localCardShowHorizontalScrollView.scrollTo(0, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.am
 * JD-Core Version:    0.6.0
 */