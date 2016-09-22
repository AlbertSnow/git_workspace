package com.wandoujia.ripple_framework.c;

import android.widget.LinearLayout;
import com.wandoujia.logv3.toolkit.cardshow.CardShowHorizontalScrollView;
import com.wandoujia.logv3.toolkit.cardshow.CardShowHorizontalScrollView.ScrollType;
import com.wandoujia.logv3.toolkit.cardshow.e;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;

final class an
  implements e
{
  an(Model paramModel, CardShowHorizontalScrollView paramCardShowHorizontalScrollView, LinearLayout paramLinearLayout)
  {
  }

  public final void a(CardShowHorizontalScrollView.ScrollType paramScrollType)
  {
    if (paramScrollType == CardShowHorizontalScrollView.ScrollType.IDLE)
    {
      am.a(this.a, this.b, this.c);
      this.a.a(R.id.scroll_pos_x, Integer.valueOf(this.b.getScrollX()));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.an
 * JD-Core Version:    0.6.0
 */