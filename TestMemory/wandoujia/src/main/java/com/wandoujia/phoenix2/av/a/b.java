package com.wandoujia.phoenix2.av.a;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.wandoujia.ripple_framework.i;

public final class b
{
  private final com.wandoujia.image.b a = (com.wandoujia.image.b)i.k().a("image");
  private final AbsListView.OnScrollListener b = new c(this);

  public final void a(AbsListView paramAbsListView)
  {
    android.support.v4.app.b.a(paramAbsListView);
    paramAbsListView.setOnScrollListener(this.b);
  }

  public final void a(d paramd)
  {
    android.support.v4.app.b.a(null);
    this.a.e();
    if (paramd != null)
      paramd.a(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.a.b
 * JD-Core Version:    0.6.0
 */