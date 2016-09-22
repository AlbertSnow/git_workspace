package com.wandoujia.jupiter.search.view;

import android.widget.Filter;
import android.widget.Filterable;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.jupiter.a.i;

final class l extends i
  implements Filterable
{
  public l(d paramd)
  {
    super(paramd);
  }

  public final Filter getFilter()
  {
    return new m(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.l
 * JD-Core Version:    0.6.0
 */