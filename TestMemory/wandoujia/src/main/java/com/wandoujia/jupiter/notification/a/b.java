package com.wandoujia.jupiter.notification.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.base.log.Log;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.notification.NotificationActionHandler;
import com.wandoujia.p4.campaign.CampaignActivity;
import com.wandoujia.push2.g;
import com.wandoujia.push2.protocol.Download;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.r;

public class b
  implements com.wandoujia.push2.i
{
  private static final String a = b.class.getSimpleName();

  public final void a(Intent paramIntent)
  {
    String str1 = paramIntent.getStringExtra("push2_id");
    if (!paramIntent.hasExtra("launch_from"))
      paramIntent.putExtra("launch_from", "notification_push");
    paramIntent.putExtra("launch_keyword", str1);
    if ((!NotificationActionHandler.a(g.a().b(), paramIntent)) && ("phoenix.intent.action.NAVIGATE_TO_PAGE".equals(paramIntent.getAction())))
    {
      String str2 = paramIntent.getDataString();
      String str3 = paramIntent.getStringExtra("title");
      Intent localIntent = new Intent(JupiterApplication.e(), CampaignActivity.class);
      localIntent.putExtras(paramIntent.getExtras());
      localIntent.putExtra("phoenix.intent.extra.URL", str2);
      localIntent.putExtra("phoenix.intent.extra.TITLE", str3);
      localIntent.addFlags(268435456);
      JupiterApplication.e().startActivity(localIntent);
    }
  }

  public final void a(Download paramDownload)
  {
    if ((TextUtils.isEmpty(paramDownload.getType())) || (TextUtils.isEmpty(paramDownload.getUrl())))
    {
      Log.w(a, "download type or url is empty", new Object[0]);
      return;
    }
    DownloadManager localDownloadManager = (DownloadManager)com.wandoujia.ripple_framework.i.k().a("download");
    r localr1 = new r();
    localr1.b(paramDownload.getUrl()).f(paramDownload.getTitle()).g(paramDownload.getIcon()).b(paramDownload.isPreDownload()).a(paramDownload.allowInMobile()).l("wdj://download/notification");
    String str = paramDownload.getType();
    int i = -1;
    switch (str.hashCode())
    {
    default:
    case 96801:
    }
    while (true)
      switch (i)
      {
      default:
        Log.w(a, "download type " + paramDownload.getType() + " is not support", new Object[0]);
        return;
        if (!str.equals("app"))
          continue;
        i = 0;
      case 0:
      }
    if (paramDownload.getPackageName() == null)
    {
      Log.w(a, "download package name is null, type: " + paramDownload.getType(), new Object[0]);
      return;
    }
    r localr2 = localr1.a(ContentTypeEnum.ContentType.APP).a(DownloadRequestParam.Type.APP).h(paramDownload.getPackageName()).e(paramDownload.getPackageName());
    boolean bool1 = paramDownload.autoInstall();
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    localr2.c(bool2);
    localDownloadManager.a(localr1.b());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.a.b
 * JD-Core Version:    0.6.0
 */