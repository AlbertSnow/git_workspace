package com.wandoujia.ripple_framework.fragment;

import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.nirvana.framework.network.page.g;

final class i
  implements DataLoadListener
{
  i(CommonTabListFragment paramCommonTabListFragment, String paramString)
  {
  }

  public final void a(DataLoadListener.Op paramOp)
  {
    this.b.f();
  }

  public final void a(DataLoadListener.Op paramOp, g paramg)
  {
    this.b.a.b(this);
    this.b.g();
    this.b.a(this.b.a.c(), this.a);
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    this.b.g();
    this.b.a(paramOp, paramException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.fragment.i
 * JD-Core Version:    0.6.0
 */