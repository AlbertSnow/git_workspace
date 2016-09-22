package com.wandoujia.ripple_framework.installer.install.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.PackageChangeEvent;
import com.wandoujia.ripple_framework.installer.install.PackageChangeEvent.EventType;
import de.greenrobot.event.c;

public class PackageChangeReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (paramIntent.getAction() == null) || (paramIntent.getData() == null));
    while (true)
    {
      return;
      String str1 = paramIntent.getAction();
      String str2 = paramIntent.getData().getSchemeSpecificPart();
      if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str1)))
        continue;
      boolean bool = paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false);
      PackageChangeEvent localPackageChangeEvent;
      if ((str1.equalsIgnoreCase("android.intent.action.PACKAGE_REMOVED")) && (!bool))
        localPackageChangeEvent = new PackageChangeEvent(str2, PackageChangeEvent.EventType.REMOVE);
      while (localPackageChangeEvent != null)
      {
        ((c)i.k().a("event_bus")).d(localPackageChangeEvent);
        return;
        if ((str1.equalsIgnoreCase("android.intent.action.PACKAGE_ADDED")) && (!bool))
        {
          localPackageChangeEvent = new PackageChangeEvent(str2, PackageChangeEvent.EventType.ADD);
          continue;
        }
        if (str1.equalsIgnoreCase("android.intent.action.PACKAGE_REPLACED"))
        {
          localPackageChangeEvent = new PackageChangeEvent(str2, PackageChangeEvent.EventType.REPLACE);
          continue;
        }
        if (str1.equalsIgnoreCase("android.intent.action.PACKAGE_CHANGED"))
        {
          localPackageChangeEvent = new PackageChangeEvent(str2, PackageChangeEvent.EventType.CHANGE);
          continue;
        }
        localPackageChangeEvent = null;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.PackageChangeReceiver
 * JD-Core Version:    0.6.0
 */