package com.wandoujia.p4.app_launcher.switcher;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;
import com.wandoujia.p4.app_launcher.g.a;

public final class s extends StateSwitcher
{
  private WifiManager a;

  public final BaseSwitcher.Type a()
  {
    return BaseSwitcher.Type.Wifi;
  }

  protected final void a(View paramView, boolean paramBoolean)
  {
    this.a.setWifiEnabled(paramBoolean);
    b(StateSwitcher.State.wait);
    g();
  }

  protected final void a(StateSwitcher.State paramState)
  {
    switch (t.a[paramState.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      d().b().setText(2131625488);
      return;
      d().a().setIconBigByResource(2130838729);
      continue;
      d().a().setIconBigByResource(2130838728);
      continue;
      d().a().setIconBigByResource(2130838730);
    }
  }

  protected final boolean b()
  {
    if (this.a == null)
    {
      this.a = ((WifiManager)GlobalConfig.getAppContext().getSystemService("wifi"));
      IntentFilter localIntentFilter = new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED");
      WifiSwitcher.1 local1 = new WifiSwitcher.1(this);
      GlobalConfig.getAppContext().registerReceiver(local1, localIntentFilter);
    }
    return this.a.isWifiEnabled();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.s
 * JD-Core Version:    0.6.0
 */