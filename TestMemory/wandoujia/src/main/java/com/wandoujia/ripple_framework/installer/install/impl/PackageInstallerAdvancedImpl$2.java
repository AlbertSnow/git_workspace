package com.wandoujia.ripple_framework.installer.install.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.ripple_framework.installer.install.n;

class PackageInstallerAdvancedImpl$2 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    null.unregisterReceiver(this);
    d.a(paramIntent, this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.PackageInstallerAdvancedImpl.2
 * JD-Core Version:    0.6.0
 */