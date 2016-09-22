package com.wandoujia.ripple_framework.view;

import android.support.v4.app.b;
import android.view.ViewGroup;
import com.wandoujia.nirvana.framework.ui.a;
import com.wandoujia.nirvana.framework.ui.recycler.g;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;

final class v extends g
{
  private a a;
  private ViewGroup b;

  public final a a(ViewGroup paramViewGroup)
  {
    if (this.a != null)
      this.a.a();
    this.b = ((ViewGroup)b.a(paramViewGroup, R.layout.rip_loading_view));
    this.a = new a(this.b).a(R.id.loading, new w());
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.v
 * JD-Core Version:    0.6.0
 */