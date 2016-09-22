package com.wandoujia.p4.connection.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.d;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.p4.views.a.f;

final class n
  implements View.OnClickListener
{
  n(ConnectionFragment paramConnectionFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (ConnectionFragment.f(this.a) == 3)
    {
      ConnectionFragment.g(this.a).setText(ConnectionFragment.c(this.a).getString(2131624565));
      ConnectionFragment.c(this.a).startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }
    do
    {
      return;
      if (ConnectionFragment.f(this.a) != 2)
        continue;
      ConnectionFragment.g(this.a).setEnabled(false);
      ConnectionFragment.g(this.a).setText(ConnectionFragment.c(this.a).getString(2131624357));
      ConnectionFragment.d(this.a).dismiss();
      ConnectionFragment.a(this.a, NetworkUtil.isWifiConnected(ConnectionFragment.c(this.a)));
      ConnectionFragment.a();
      ConnectionFragment.c(this.a);
      d.e(false);
      return;
    }
    while (ConnectionFragment.f(this.a) != 1);
    ConnectionFragment.g(this.a).setEnabled(false);
    ConnectionFragment.g(this.a).setText(ConnectionFragment.c(this.a).getString(2131625436));
    ConnectionFragment.d(this.a).dismiss();
    ConnectionFragment.b();
    ConnectionFragment.c(this.a);
    d.e(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.ui.n
 * JD-Core Version:    0.6.0
 */