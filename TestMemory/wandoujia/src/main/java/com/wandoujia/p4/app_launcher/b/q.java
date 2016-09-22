package com.wandoujia.p4.app_launcher.b;

import android.widget.TextView;
import com.wandoujia.p4.app_launcher.clean.widget.CleanWidget;
import com.wandoujia.ripple_framework.i;
import de.greenrobot.event.c;

final class q
  implements Runnable
{
  q(p paramp, int paramInt)
  {
  }

  public final void run()
  {
    int i = com.wandoujia.p4.app_launcher.clean.widget.a.b(this.a);
    this.b.a.setEnabled(true);
    o.b(this.b.b).a(i);
    this.b.a.getProgressText().setText(this.a + "%");
    this.b.a.getStatusText().setText(2131624349);
    ((c)i.k().a("event_bus")).d(new com.wandoujia.p4.app_launcher.d.a(i));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.q
 * JD-Core Version:    0.6.0
 */