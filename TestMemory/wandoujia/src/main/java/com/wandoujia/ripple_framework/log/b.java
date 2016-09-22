package com.wandoujia.ripple_framework.log;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.analytics.f;
import com.google.android.gms.analytics.g;
import com.google.android.gms.analytics.j;
import com.google.android.gms.analytics.l;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.logv3.model.packages.AccountPackage;
import com.wandoujia.logv3.model.packages.CardPackage;
import com.wandoujia.logv3.model.packages.ClickEvent;
import com.wandoujia.logv3.model.packages.ClientPackage;
import com.wandoujia.logv3.model.packages.CommonPackage;
import com.wandoujia.logv3.model.packages.ContentPackage;
import com.wandoujia.logv3.model.packages.EventPackage;
import com.wandoujia.logv3.model.packages.ExtraPackage;
import com.wandoujia.logv3.model.packages.IdPackage;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage;
import com.wandoujia.logv3.model.packages.LaunchSourcePackage.Source;
import com.wandoujia.logv3.model.packages.LogReportEvent.Builder;
import com.wandoujia.logv3.model.packages.ShowEvent;
import com.wandoujia.logv3.model.packages.TaskEvent;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.UrlPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.Config;

public final class b
  implements com.wandoujia.logv3.i
{
  private String a;
  private String b;
  private String c;
  private l d;

  public b(Context paramContext, String paramString1, String paramString2)
  {
    f localf = f.a(paramContext);
    this.c = paramString2;
    this.d = localf.a(paramString1);
    this.d.b();
  }

  private String a(String paramString)
  {
    if (paramString.startsWith(this.c))
      paramString = paramString.substring(this.c.length());
    return paramString;
  }

  private void a(ViewLogPackage paramViewLogPackage, ExtraPackage paramExtraPackage)
  {
    if ((paramViewLogPackage == null) || (paramViewLogPackage.module == null) || (paramViewLogPackage.action == null));
    do
      return;
    while (paramViewLogPackage.action == ViewLogPackage.Action.REDIRECT);
    if (paramViewLogPackage.action == ViewLogPackage.Action.SHARE)
    {
      j localj = new j();
      localj.a("&sn", paramViewLogPackage.name);
      localj.a("&sa", "share");
      if ((paramExtraPackage != null) && (paramExtraPackage.content_package != null) && (paramExtraPackage.content_package.identity != null))
        localj.a("&st", paramExtraPackage.content_package.identity);
      this.d.a(localj.a());
      return;
    }
    g localg = new g().a(paramViewLogPackage.module.toLowerCase()).b(paramViewLogPackage.action.name().toLowerCase());
    if (paramViewLogPackage.name != null)
      localg.c(paramViewLogPackage.name);
    if (paramViewLogPackage.value != null)
      localg.a(paramViewLogPackage.value.longValue());
    if ((paramViewLogPackage.url_package != null) && (paramViewLogPackage.url_package.normalized_url != null))
      this.d.a(a(paramViewLogPackage.url_package.normalized_url));
    this.d.a(localg.a());
  }

  public final void onEvent(LogReportEvent.Builder paramBuilder)
  {
    EventPackage localEventPackage = paramBuilder.event_package;
    if (localEventPackage == null);
    label242: TaskEvent localTaskEvent;
    label343: 
    do
    {
      do
      {
        do
        {
          while (true)
          {
            return;
            CommonPackage localCommonPackage1 = paramBuilder.common_package;
            Object localObject;
            if (localCommonPackage1 == null)
            {
              localObject = null;
              if (((this.a != null) && (!this.a.equals(localObject))) || ((this.a == null) && (localObject != null)))
              {
                this.a = ((String)localObject);
                this.d.a("&uid", this.a);
              }
              if ((localCommonPackage1 != null) && (localCommonPackage1.id_package != null) && (localCommonPackage1.id_package.identity != null))
                this.d.b(localCommonPackage1.id_package.identity);
              if (localEventPackage.show_event == null)
                break;
            }
            else
            {
              switch (c.a[localEventPackage.show_event.type.ordinal()])
              {
              default:
                return;
              case 1:
                String str1 = localEventPackage.show_event.view.url_package.normalized_url;
                CommonPackage localCommonPackage2 = paramBuilder.common_package;
                this.d.a(a(str1));
                com.google.android.gms.analytics.i locali = new com.google.android.gms.analytics.i();
                if ((localCommonPackage2 != null) && (localCommonPackage2.client_package != null) && (localCommonPackage2.client_package.last_source != null))
                  locali.e(localCommonPackage2.client_package.last_source);
                LaunchSourcePackage localLaunchSourcePackage;
                String str2;
                if (localCommonPackage2 == null)
                {
                  localLaunchSourcePackage = null;
                  str2 = null;
                  if (localLaunchSourcePackage != null)
                    break label343;
                }
                while (true)
                {
                  if ((str2 != null) || (this.b != null))
                  {
                    if ((str2 != null) && (!str2.equals(this.b)))
                      this.b = str2;
                    locali.d(this.b);
                  }
                  this.d.a(locali.a());
                  return;
                  if (localCommonPackage1.account_package == null)
                  {
                    localObject = null;
                    break;
                  }
                  localObject = localCommonPackage1.account_package.uid;
                  break;
                  localLaunchSourcePackage = localCommonPackage2.launch_source_package;
                  break label242;
                  Uri.Builder localBuilder = new Uri.Builder();
                  localBuilder.scheme("wdj").authority("com.wandoujia").appendQueryParameter("utm_source", Config.f());
                  if (localLaunchSourcePackage.source != null)
                    localBuilder.appendQueryParameter("utm_medium", localLaunchSourcePackage.source.name().toLowerCase());
                  if (localLaunchSourcePackage.keyword != null)
                    localBuilder.appendQueryParameter("utm_campaign", localLaunchSourcePackage.keyword);
                  str2 = localBuilder.build().toString();
                }
              case 2:
              }
              ViewLogPackage localViewLogPackage = localEventPackage.show_event.view;
              ExtraPackage localExtraPackage = paramBuilder.extra_package;
              if ((localViewLogPackage == null) || (localExtraPackage == null) || (localExtraPackage.card_package == null) || (localExtraPackage.card_package.sub_status == null))
                continue;
              ThreadPool.execute(new d(localExtraPackage.card_package.sub_status + "#" + System.currentTimeMillis()));
              return;
            }
          }
          if (localEventPackage.click_event == null)
            continue;
          a(localEventPackage.click_event.click, paramBuilder.extra_package);
          return;
        }
        while (localEventPackage.task_event == null);
        localTaskEvent = localEventPackage.task_event;
      }
      while (((localTaskEvent.status != null) && (localTaskEvent.status == TaskEvent.Status.START)) || (localTaskEvent.view_log_package == null) || (localTaskEvent.view_log_package.module == null));
      if (localTaskEvent.action != TaskEvent.Action.VIEW_EVENT)
        continue;
      a(localTaskEvent.view_log_package, null);
      return;
    }
    while ((localTaskEvent.action != TaskEvent.Action.SSO) && (localTaskEvent.action != TaskEvent.Action.LOGIN_IN) && (localTaskEvent.action != TaskEvent.Action.SIGN_UP) && (localTaskEvent.action != TaskEvent.Action.NOTIFICATION_CLICK));
    g localg = new g();
    localg.a(localTaskEvent.view_log_package.module.toLowerCase());
    if (localTaskEvent.action == TaskEvent.Action.LOGIN_IN)
    {
      localg.b("signin");
      if (localTaskEvent.action != TaskEvent.Action.SSO)
        break label821;
      if (localTaskEvent.result_info != null)
        localg.c(localTaskEvent.result_info.toLowerCase());
    }
    while (true)
    {
      if (localTaskEvent.effect_num != null)
        localg.a(localTaskEvent.effect_num.longValue());
      this.d.a(localg.a());
      return;
      if (localTaskEvent.action == TaskEvent.Action.SIGN_UP)
      {
        localg.b("signup");
        break;
      }
      localg.b(localTaskEvent.action.name().toLowerCase());
      break;
      label821: if (localTaskEvent.action == TaskEvent.Action.LOGIN_IN)
      {
        if (localTaskEvent.result == null)
          continue;
        localg.c(localTaskEvent.result.name().toLowerCase());
        continue;
      }
      if (localTaskEvent.action == TaskEvent.Action.SIGN_UP)
      {
        if (localTaskEvent.result == null)
          continue;
        localg.c(localTaskEvent.result.name().toLowerCase());
        continue;
      }
      if (localTaskEvent.result != null)
      {
        localg.c(localTaskEvent.result.name().toLowerCase());
        continue;
      }
      if (localTaskEvent.result_info == null)
        continue;
      localg.c(localTaskEvent.result_info.toLowerCase());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.log.b
 * JD-Core Version:    0.6.0
 */