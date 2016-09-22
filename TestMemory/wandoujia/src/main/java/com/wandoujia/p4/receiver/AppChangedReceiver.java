package com.wandoujia.p4.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.wandoujia.base.services.AlarmService;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.ReceiverMonitor.AppActionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppChangedReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AlarmService.scheduleAlarm(paramContext, "APP_CHANGE_ACTION", AlarmService.class);
    if ((paramIntent != null) && ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(paramIntent.getAction())))
    {
      Bundle localBundle = paramIntent.getExtras();
      if (localBundle != null)
      {
        String[] arrayOfString = localBundle.getStringArray("android.intent.extra.changed_package_list");
        if (arrayOfString != null)
        {
          List localList = Arrays.asList(arrayOfString);
          ReceiverMonitor.a().a(ReceiverMonitor.AppActionType.READY, localList);
        }
      }
    }
    label67: ArrayList localArrayList;
    do
    {
      while (true)
      {
        break label67;
        break label67;
        do
          return;
        while ((paramIntent == null) || (paramIntent.getData() == null));
        String str = paramIntent.getData().getSchemeSpecificPart();
        if (str == null)
          continue;
        localArrayList = new ArrayList();
        localArrayList.add(str);
        if (paramIntent.getAction().equalsIgnoreCase("android.intent.action.PACKAGE_REMOVED"))
        {
          if (paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false))
            continue;
          ReceiverMonitor.a().a(ReceiverMonitor.AppActionType.REMOVED, localArrayList);
          return;
        }
        if (!paramIntent.getAction().equalsIgnoreCase("android.intent.action.PACKAGE_ADDED"))
          break;
        if (paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false))
          continue;
        ReceiverMonitor.a().a(ReceiverMonitor.AppActionType.ADDED, localArrayList);
        return;
      }
      if (!paramIntent.getAction().equalsIgnoreCase("android.intent.action.PACKAGE_REPLACED"))
        continue;
      ReceiverMonitor.a().a(ReceiverMonitor.AppActionType.REPLACED, localArrayList);
      return;
    }
    while (!paramIntent.getAction().equalsIgnoreCase("android.intent.action.PACKAGE_CHANGED"));
    ReceiverMonitor.a().a(ReceiverMonitor.AppActionType.CHANGED, localArrayList);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.receiver.AppChangedReceiver
 * JD-Core Version:    0.6.0
 */