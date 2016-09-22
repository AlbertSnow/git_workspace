package com.wandoujia.ripple_framework.c;

import android.support.v4.app.b;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;

final class k extends c
{
  protected final void a(Model paramModel)
  {
    View localView;
    FrameLayout.LayoutParams localLayoutParams;
    if ((paramModel.a(R.id.large_margin) != null) && ((paramModel.a(R.id.large_margin) instanceof Boolean)))
    {
      boolean bool = ((Boolean)paramModel.a(R.id.large_margin)).booleanValue();
      localView = h().a(R.id.description).a();
      if ((localView.getLayoutParams() instanceof FrameLayout.LayoutParams))
      {
        localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        if (!bool)
          break label96;
      }
    }
    label96: for (localLayoutParams.topMargin = (int)b.c(f(), 16.0F); ; localLayoutParams.topMargin = 0)
    {
      localView.setLayoutParams(localLayoutParams);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.k
 * JD-Core Version:    0.6.0
 */