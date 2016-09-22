package com.wandoujia.p4.app_launcher.switcher;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;
import com.wandoujia.p4.app_launcher.g.a;

public final class e extends StateSwitcher
{
  private BluetoothAdapter a;

  public final BaseSwitcher.Type a()
  {
    return BaseSwitcher.Type.Bluetooth;
  }

  protected final void a(View paramView, boolean paramBoolean)
  {
    if (this.a == null)
      return;
    if (paramBoolean)
      this.a.enable();
    while (true)
    {
      b(StateSwitcher.State.wait);
      g();
      return;
      this.a.disable();
    }
  }

  protected final void a(StateSwitcher.State paramState)
  {
    switch (f.a[paramState.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      d().b().setText(2131625473);
      return;
      d().a().setIconBigByResource(2130838710);
      continue;
      d().a().setIconBigByResource(2130838709);
      continue;
      d().a().setIconBigByResource(2130838711);
    }
  }

  protected final boolean b()
  {
    if (this.a == null)
    {
      this.a = BluetoothAdapter.getDefaultAdapter();
      IntentFilter localIntentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
      BluetoothSwitcher.1 local1 = new BluetoothSwitcher.1(this);
      GlobalConfig.getAppContext().registerReceiver(local1, localIntentFilter);
    }
    if (this.a == null)
      return false;
    switch (this.a.getState())
    {
    case 10:
    case 13:
    default:
      return false;
    case 11:
      return true;
    case 12:
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.e
 * JD-Core Version:    0.6.0
 */