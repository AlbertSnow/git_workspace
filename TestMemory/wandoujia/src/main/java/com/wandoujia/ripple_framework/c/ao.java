package com.wandoujia.ripple_framework.c;

import android.widget.LinearLayout;
import com.wandoujia.logv3.toolkit.cardshow.CardShowHorizontalScrollView;
import com.wandoujia.logv3.toolkit.cardshow.m;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class ao
  implements m
{
  ao(Model paramModel, CardShowHorizontalScrollView paramCardShowHorizontalScrollView, LinearLayout paramLinearLayout)
  {
  }

  public final void a()
  {
    if (this.a.B() != null)
    {
      Iterator localIterator = this.a.B().iterator();
      while (localIterator.hasNext())
        ((Model)localIterator.next()).b(R.id.card_show_was_shown);
    }
    am.a(this.a, this.b, this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ao
 * JD-Core Version:    0.6.0
 */