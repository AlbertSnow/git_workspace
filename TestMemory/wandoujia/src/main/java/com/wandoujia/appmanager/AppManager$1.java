package com.wandoujia.appmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppManager$1 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(str1))
    {
      Bundle localBundle = paramIntent.getExtras();
      if (localBundle != null)
      {
        String[] arrayOfString = localBundle.getStringArray("android.intent.extra.changed_package_list");
        if (arrayOfString != null)
          AppManager.a(this.a, str1, Arrays.asList(arrayOfString));
      }
    }
    ArrayList localArrayList;
    do
    {
      String str2;
      do
      {
        return;
        str2 = paramIntent.getData().getSchemeSpecificPart();
      }
      while (str2 == null);
      localArrayList = new ArrayList();
      localArrayList.add(str2);
      if (!"android.intent.action.PACKAGE_REMOVED".equalsIgnoreCase(str1))
        break;
    }
    while (paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false));
    while (true)
    {
      AppManager.a(this.a, str1, localArrayList);
      return;
      if (!"android.intent.action.PACKAGE_ADDED".equalsIgnoreCase(str1))
        continue;
      if (paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false))
        break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.AppManager.1
 * JD-Core Version:    0.6.0
 */