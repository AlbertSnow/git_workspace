package com.wandoujia.p4.connection.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.views.a.f;

final class i
  implements View.OnClickListener
{
  i(ConnectionFragment paramConnectionFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (com.wandoujia.p4.connection.a.a.b(ConnectionFragment.c(this.a)))
    {
      ConnectionFragment.d(this.a).show();
      return;
    }
    new com.wandoujia.p4.app.view.a.a(ConnectionFragment.c(this.a), false).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.ui.i
 * JD-Core Version:    0.6.0
 */