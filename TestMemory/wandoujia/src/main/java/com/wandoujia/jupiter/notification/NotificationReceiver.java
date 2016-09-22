package com.wandoujia.jupiter.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.logv3.model.packages.CardPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.ResourcePackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

public class NotificationReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    TaskEvent.Builder localBuilder;
    ExtraPackage.Builder localBuilder1;
    ResourcePackage.Builder localBuilder2;
    if (NotificationActionHandler.a(paramContext, paramIntent))
    {
      String str1 = paramIntent.getStringExtra("notification_type");
      if (str1 != null)
      {
        NotificationController.NotificationType localNotificationType = NotificationController.NotificationType.valueOf(str1);
        localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.NOTIFICATION_CLICK).status(TaskEvent.Status.END);
        localBuilder.view_log_package(new ViewLogPackage.Builder().module(Logger.Module.NOTIFICATION.name().toLowerCase()).action(ViewLogPackage.Action.REDIRECT).element(ViewLogPackage.Element.NOTIFICATION).name(paramIntent.getAction()).build());
        localBuilder1 = new ExtraPackage.Builder();
        localBuilder1.content_package(new ContentPackage.Builder().identity(paramIntent.getStringExtra("id")).title(paramIntent.getStringExtra("title")).sub_type(str1.toLowerCase()).build());
        localBuilder1.card_package(new CardPackage.Builder().identity(paramIntent.getStringExtra("id")).type(paramIntent.getStringExtra("standard_view_type")).sub_type(paramIntent.getStringExtra("big_view_type")).status(paramIntent.getStringExtra("click_view_type")).sub_status(paramIntent.getStringExtra("click_view_text")).build());
        localBuilder2 = new ResourcePackage.Builder();
        switch (g.a[localNotificationType.ordinal()])
        {
        default:
        case 1:
        case 2:
        }
      }
    }
    while (true)
    {
      localBuilder1.resource_package(localBuilder2.build());
      i.k().h().a(localBuilder, localBuilder1);
      return;
      String str2 = paramIntent.getStringExtra("package_name");
      if (str2 == null)
        continue;
      localBuilder2.identity(str2);
      continue;
      localBuilder2.identity(paramIntent.getStringExtra("channel"));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.NotificationReceiver
 * JD-Core Version:    0.6.0
 */