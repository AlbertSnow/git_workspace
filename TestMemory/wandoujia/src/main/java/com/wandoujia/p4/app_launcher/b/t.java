package com.wandoujia.p4.app_launcher.b;

import android.widget.TextView;
import com.wandoujia.p4.app_launcher.clean.b;
import com.wandoujia.p4.app_launcher.clean.widget.CleanWidget;
import com.wandoujia.ripple_framework.i;
import de.greenrobot.event.c;

final class t
  implements b
{
  t(o paramo, CleanWidget paramCleanWidget, int paramInt)
  {
  }

  public final void a()
  {
    int i = com.wandoujia.p4.app_launcher.clean.widget.a.b(this.b);
    o.b(this.c).a(i);
    this.a.getProgressText().setText(this.b + "%");
    this.a.getStatusText().setText(2131624349);
    this.a.setEnabled(true);
    ((c)i.k().a("event_bus")).d(new com.wandoujia.p4.app_launcher.d.a(i));
  }

  public final void a(int paramInt)
  {
    int i = com.wandoujia.p4.app_launcher.clean.widget.a.b(paramInt);
    o.b(this.c).a(i);
    TextView localTextView = this.a.getProgressText();
    if (paramInt < 10);
    for (String str = "0" + paramInt + "%"; ; str = paramInt + "%")
    {
      localTextView.setText(str);
      ((c)i.k().a("event_bus")).d(new com.wandoujia.p4.app_launcher.d.a(i));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.t
 * JD-Core Version:    0.6.0
 */