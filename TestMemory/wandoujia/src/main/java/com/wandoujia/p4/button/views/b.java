package com.wandoujia.p4.button.views;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.button.a.a;
import java.util.Iterator;
import java.util.List;

final class b
  implements View.OnClickListener
{
  b(StatefulButton paramStatefulButton, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.b.a)
      this.b.setEnabled(false);
    if (!CollectionUtils.isEmpty(this.a.d()))
    {
      Iterator localIterator = this.a.d().iterator();
      while (localIterator.hasNext())
        ((Action)localIterator.next()).execute();
    }
    if (this.a.c() != null)
      this.a.c().execute();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.views.b
 * JD-Core Version:    0.6.0
 */