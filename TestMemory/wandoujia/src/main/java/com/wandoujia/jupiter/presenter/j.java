package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.view.View;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class j
  implements Runnable
{
  j(i parami)
  {
  }

  public final void run()
  {
    Model localModel = (Model)this.a.e().getTag(2131492933);
    if ((localModel == null) || (this.a.b(localModel)));
    label161: label175: 
    while (true)
    {
      return;
      com.wandoujia.ripple_framework.i.k().h().g(this.a.e());
      ArrayList localArrayList = new ArrayList();
      i.a(this.a.e(), localArrayList);
      Context localContext = this.a.e().getContext();
      BaseActivity localBaseActivity;
      label95: Iterator localIterator;
      if ((localContext instanceof BaseActivity))
      {
        localBaseActivity = (BaseActivity)localContext;
        if (localArrayList.isEmpty())
          break label161;
        this.a.c(localModel);
        localIterator = localArrayList.iterator();
      }
      while (true)
      {
        if (!localIterator.hasNext())
          break label175;
        View localView = (View)localIterator.next();
        if (localBaseActivity != null)
        {
          localBaseActivity.onLogCardShow(localView);
          continue;
          localBaseActivity = null;
          break label95;
          break;
        }
        com.wandoujia.ripple_framework.i.k().h().d(localView);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.j
 * JD-Core Version:    0.6.0
 */