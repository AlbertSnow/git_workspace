package com.wandoujia.jupiter.presenter;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class bn extends c
{
  protected final void a(Model paramModel)
  {
    View localView1 = h().b(2131493304).a();
    View localView2 = h().b(2131493951).a();
    View localView3 = h().b(2131493952).a();
    View localView4 = h().b(2131493001).a();
    if (localView1 != null)
      localView1.setVisibility(8);
    if (localView2 != null)
      localView2.setVisibility(8);
    if (localView3 != null)
      localView3.setVisibility(8);
    if (localView4 != null)
    {
      ViewGroup.LayoutParams localLayoutParams = localView4.getLayoutParams();
      localLayoutParams.height = 1;
      localView4.setLayoutParams(localLayoutParams);
      localView4.setBackgroundColor(e().getResources().getColor(2131362005));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bn
 * JD-Core Version:    0.6.0
 */