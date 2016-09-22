package com.wandoujia.p4.app_launcher.b;

import android.support.v4.app.d;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.app_launcher.model.a;

final class b
  implements View.OnClickListener
{
  b(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    this.a.c().execute();
    d.a(paramView, this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.b
 * JD-Core Version:    0.6.0
 */