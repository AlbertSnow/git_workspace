package com.wandoujia.ripple_framework.view;

import android.support.v4.app.b;
import android.support.v4.view.bg;
import android.view.View;
import com.wandoujia.base.log.Log;
import com.wandoujia.nirvana.framework.ui.recycler.NirvanaRecyclerView;
import com.wandoujia.nirvana.framework.ui.recycler.g;
import com.wandoujia.ripple_framework.R.id;

final class x
  implements Runnable
{
  x(RecyclerViewAutoLoadingLayout paramRecyclerViewAutoLoadingLayout)
  {
  }

  public final void run()
  {
    int i = this.a.c.getChildCount();
    if ((i <= 0) || (this.a.e.b()));
    int j;
    int k;
    while (true)
    {
      do
        return;
      while (((bg.b(this.a.c, 1)) || (bg.b(this.a.c, -1))) && ((this.a.d == null) || (!this.a.d.a())));
      View localView = this.a.c.getChildAt(i - 1);
      if (localView.getId() == R.id.footer_fullscreen_placeholder)
      {
        if (i < 2)
          continue;
        localView = this.a.c.getChildAt(i - 2);
      }
      j = localView.getBottom();
      k = b.y(this.a.getContext());
      int m = this.a.c.getMeasuredHeight();
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(j);
      arrayOfObject[1] = Integer.valueOf(k);
      arrayOfObject[2] = Integer.valueOf(m);
      Log.d("RecyclerViewAutoLoadingLayout", "child bottom is %d, screen %d, parent %d", arrayOfObject);
      if (j < m)
        break;
      if (this.a.d == null)
        continue;
      this.a.d.a(false);
      return;
    }
    int n = k - j;
    if (this.a.d == null)
    {
      this.a.d = new y();
      ((com.wandoujia.nirvana.framework.ui.recycler.a)this.a.c.getAdapter()).b(this.a.d);
    }
    this.a.d.a(true);
    this.a.d.a(Integer.valueOf(n));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.x
 * JD-Core Version:    0.6.0
 */