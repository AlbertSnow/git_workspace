package com.wandoujia.p4.app.upgrade;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.b;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.library.fragment.AppUpgradeFragment;
import com.wandoujia.jupiter.notification.e;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.util.UpgradeUtils;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;

public class UpgradeReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    while (true)
    {
      return;
      String str = paramIntent.getAction();
      if ("phoenix.intent.action.APP_CHECK_UPGRADE".equals(str))
      {
        a.a(false, false);
        return;
      }
      LocalAppInfo localLocalAppInfo3;
      Intent localIntent;
      if ("phoenix.intent.action.CLICK_IMPORTANT_NOTIFICATION".equals(str))
      {
        localLocalAppInfo3 = (LocalAppInfo)paramIntent.getSerializableExtra("upgrade_app_info");
        if ((localLocalAppInfo3 == null) || (localLocalAppInfo3.getPackageName() == null))
          continue;
        localIntent = null;
      }
      try
      {
        localIntent = Intent.parseUri("wdj://me/upgrade_apps", 1);
        localIntent.putExtra("upgrade_package_name", localLocalAppInfo3.getPackageName());
        label82: if (localIntent == null)
          continue;
        localIntent.putExtra("upgrade_app_info", localLocalAppInfo3);
        localIntent.putExtra("phoenix.intent.extra.STARTER_NAME", "ImportantUpgradeNotification");
        localIntent.putExtra("launch_keyword", "important_app_upgrade|" + localLocalAppInfo3.getPackageName());
        localIntent.putExtra("launch_from", "notification_app");
        localIntent.addFlags(268435456);
        paramContext.startActivity(localIntent);
        b.a("important_upgrade_notification", ViewLogPackage.Element.NOTIFICATION, ViewLogPackage.Action.OPEN, "important_click", localLocalAppInfo3.getPackageName());
        return;
        if ("phoenix.intent.action.UPGRADE_IMPORTANT_APP".equals(str))
        {
          LocalAppInfo localLocalAppInfo2 = (LocalAppInfo)paramIntent.getSerializableExtra("upgrade_app_info");
          int i = paramIntent.getIntExtra("notification_id", 0);
          e.a().a(i);
          if (localLocalAppInfo2 == null)
            continue;
          ((AppTaskManager)i.k().a("app_task")).a(AppUpgradeFragment.a(localLocalAppInfo2, TemplateTypeEnum.TemplateType.UPGRADE_APP), UpgradeUtils.a("wdj://notification/upgrade_important"));
          b.a("important_upgrade_notification", ViewLogPackage.Element.NOTIFICATION, ViewLogPackage.Action.OPEN, "important_upgrade", localLocalAppInfo2.getPackageName());
          return;
        }
        if ("phoenix.intent.action.UPGRADE_ALL".equals(str))
        {
          e.a().a(10203);
          e.a().a(10211);
          UpgradeUtils.c();
          HashMap localHashMap = a.a(paramIntent);
          localHashMap.put("event_time", com.wandoujia.p4.utils.a.a(new Date(System.currentTimeMillis()), "yyyyMMddHHmm"));
          if (NetworkUtil.isNetworkConnected(com.wandoujia.p4.a.a()))
            continue;
          localHashMap.put("notification_type", UpgradeNotifyCardGenerator.NotificationType.NO_NETWORK.toString());
          return;
        }
        if ("phoenix.intent.action.UPGRADE_NOTIFICATION_DELETED".equals(str))
        {
          a.a(paramIntent).put("event_time", com.wandoujia.p4.utils.a.a(new Date(System.currentTimeMillis()), "yyyyMMddHHmm"));
          return;
        }
        if ("phoenix.intent.action.NETWORK_DISCONNECT".equals(str))
        {
          UpgradeNotifyCardGenerator.c().d();
          return;
        }
        if (!"phoenix.intent.action.UPGRADE_APP".equals(str))
          continue;
        e.a().a(10203);
        LocalAppInfo localLocalAppInfo1 = (LocalAppInfo)paramIntent.getSerializableExtra("upgrade_app_info");
        if (localLocalAppInfo1 == null)
          continue;
        ((AppTaskManager)i.k().a("app_task")).a(AppUpgradeFragment.a(localLocalAppInfo1, TemplateTypeEnum.TemplateType.UPGRADE_APP), UpgradeUtils.a("wdj://notification/upgrade_one"));
        return;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        break label82;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.UpgradeReceiver
 * JD-Core Version:    0.6.0
 */