package com.wandoujia.ripple_framework.view;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bb
  implements View.OnClickListener
{
  bb(StatefulButton paramStatefulButton)
  {
  }

  public final void onClick(View paramView)
  {
    Iterator localIterator = new ArrayList(StatefulButton.a(this.a)).iterator();
    while (localIterator.hasNext())
    {
      View.OnClickListener localOnClickListener = (View.OnClickListener)localIterator.next();
      if (localOnClickListener == null)
        continue;
      localOnClickListener.onClick(paramView);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.bb
 * JD-Core Version:    0.6.0
 */