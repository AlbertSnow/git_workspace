package com.wandoujia.ripple_framework.download;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.aw;
import android.text.TextUtils;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.ripple_framework.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class m
{
  private final Context a;
  private final NotificationManager b;
  private final Map<Integer, Long> c;
  private final Map<String, String> d;
  private List<DownloadInfo> e;
  private List<DownloadInfo> f;
  private List<DownloadInfo> g;
  private List<DownloadInfo> h;
  private int i = 1000;
  private int j = 1 + this.i;
  private int k = 2 + this.i;
  private int l = 3 + this.i;
  private final LocalAppChangedListener m = new n(this);

  protected m(Context paramContext, AppManager paramAppManager)
  {
    this.a = paramContext.getApplicationContext();
    this.b = ((NotificationManager)paramContext.getSystemService("notification"));
    this.c = new HashMap();
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.g = new ArrayList();
    this.h = new ArrayList();
    this.d = new HashMap();
    paramAppManager.a(this.m);
  }

  private void a()
  {
    if (this.e.isEmpty())
    {
      this.b.cancel(this.i);
      this.c.remove(Integer.valueOf(this.i));
      return;
    }
    if (this.e.size() == 1)
    {
      a(((DownloadInfo)this.e.get(0)).f + this.a.getString(R.string.download_notification_downloading), this.a.getString(R.string.download_notification_look), this.i, 1, true, ((DownloadInfo)this.e.get(0)).a, h());
      return;
    }
    e();
  }

  private void a(String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean, String paramString3, Intent paramIntent)
  {
    aw localaw = new aw(this.a);
    localaw.a(17301634);
    localaw.a(paramString1);
    localaw.b(paramInt2);
    localaw.b(paramString2);
    localaw.a(PendingIntent.getBroadcast(this.a, paramString3.hashCode(), paramIntent, 0));
    if (this.c.get(Integer.valueOf(paramInt1)) != null)
      localaw.a(((Long)this.c.get(Integer.valueOf(paramInt1))).longValue());
    try
    {
      while (true)
      {
        Notification localNotification = localaw.b();
        if (paramBoolean)
          localNotification.flags = 2;
        this.b.notify(paramInt1, localNotification);
        return;
        this.c.put(Integer.valueOf(paramInt1), Long.valueOf(System.currentTimeMillis()));
      }
    }
    catch (Exception localException)
    {
    }
  }

  private void a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    a(paramString1, paramString2, paramInt, 0, false, paramString3, h());
  }

  private static boolean a(String paramString, List<DownloadInfo> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      if (!localDownloadInfo.a.equals(paramString))
        continue;
      paramList.remove(localDownloadInfo);
      return true;
    }
    return false;
  }

  private void b()
  {
    if (this.h.isEmpty())
    {
      this.b.cancel(this.l);
      this.c.remove(Integer.valueOf(this.l));
      return;
    }
    if (this.h.size() == 1)
    {
      a(((DownloadInfo)this.h.get(0)).f + this.a.getString(R.string.download_notification_failed_one), this.a.getString(R.string.download_notification_look), this.l, ((DownloadInfo)this.h.get(0)).a);
      return;
    }
    f();
  }

  private void c()
  {
    if (this.g.isEmpty())
    {
      this.b.cancel(this.k);
      this.c.remove(Integer.valueOf(this.k));
      return;
    }
    if (this.g.size() == 1)
    {
      a(((DownloadInfo)this.g.get(0)).f + this.a.getString(R.string.download_notification_wait_one), this.a.getString(R.string.download_notification_wait_wifi), this.k, ((DownloadInfo)this.g.get(0)).a);
      return;
    }
    a(this.g.size() + this.a.getString(R.string.download_notification_waiting), this.a.getString(R.string.download_notification_wait_wifi), this.k, ((DownloadInfo)this.g.get(0)).a);
  }

  private void d()
  {
    if (this.f.isEmpty())
    {
      this.b.cancel(this.j);
      this.c.remove(Integer.valueOf(this.j));
      return;
    }
    if (this.f.size() == 1)
    {
      a(((DownloadInfo)this.f.get(0)).f + this.a.getString(R.string.download_notification_pausing_one), this.a.getString(R.string.download_notification_look), this.j, ((DownloadInfo)this.f.get(0)).a);
      return;
    }
    g();
  }

  private void e()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int n = -1 + this.e.size(); n > 0; n--)
      localStringBuilder.append(((DownloadInfo)this.e.get(n)).f).append(this.a.getString(R.string.common_string_dot));
    localStringBuilder.append(((DownloadInfo)this.e.get(0)).f);
    a(this.e.size() + this.a.getString(R.string.download_notification_running), localStringBuilder.toString(), this.i, 1, true, ((DownloadInfo)this.e.get(0)).a, h());
  }

  private void f()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int n = -1 + this.h.size(); n > 0; n--)
      localStringBuilder.append(((DownloadInfo)this.h.get(n)).f).append(this.a.getString(R.string.common_string_dot));
    localStringBuilder.append(((DownloadInfo)this.h.get(0)).f).append(this.a.getString(R.string.common_string_comma));
    localStringBuilder.append(this.a.getString(R.string.download_notification_look));
    a(this.h.size() + this.a.getString(R.string.download_notification_failed), localStringBuilder.toString(), this.l, ((DownloadInfo)this.h.get(0)).a);
  }

  private void g()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int n = -1 + this.f.size(); n > 0; n--)
      localStringBuilder.append(((DownloadInfo)this.f.get(n)).f).append(this.a.getString(R.string.common_string_dot));
    localStringBuilder.append(((DownloadInfo)this.f.get(0)).f).append(this.a.getString(R.string.common_string_comma));
    localStringBuilder.append(this.a.getString(R.string.download_notification_look));
    a(this.f.size() + this.a.getString(R.string.download_notification_pausing), localStringBuilder.toString(), this.j, ((DownloadInfo)this.f.get(0)).a);
  }

  private static Intent h()
  {
    Intent localIntent = new Intent("ripple_framework.intent.action.ACTION_REDIRECT");
    localIntent.setPackage(GlobalConfig.getAppContext().getPackageName());
    return localIntent;
  }

  public final void a(DownloadInfo paramDownloadInfo)
  {
    int n = 1;
    if ((paramDownloadInfo == null) || (!b.b(paramDownloadInfo)));
    label64: label68: label81: label110: label114: label127: v localv;
    label156: label160: label190: label218: label222: label615: label621: label752: 
    do
    {
      do
      {
        int i1;
        int i2;
        int i3;
        Map localMap;
        String str5;
        String str6;
        String str7;
        while (true)
        {
          return;
          if ((paramDownloadInfo.c != DownloadInfo.Status.DOWNLOADING) && (paramDownloadInfo.c != DownloadInfo.Status.CREATED))
            break;
          i1 = n;
          if (i1 == 0)
            break label555;
          if (!this.e.contains(paramDownloadInfo))
          {
            this.e.add(paramDownloadInfo);
            a();
          }
          if (paramDownloadInfo.c != DownloadInfo.Status.FAILED)
            break label582;
          i2 = n;
          if (i2 == 0)
            break label588;
          if (!this.h.contains(paramDownloadInfo))
          {
            this.h.add(paramDownloadInfo);
            b();
          }
          if (paramDownloadInfo.c != DownloadInfo.Status.PAUSED_BY_NETWORK)
            break label615;
          i3 = n;
          if (i3 == 0)
            break label621;
          if (!this.g.contains(paramDownloadInfo))
          {
            this.g.add(paramDownloadInfo);
            c();
          }
          if ((paramDownloadInfo.c != DownloadInfo.Status.PAUSED_BY_APP) && (paramDownloadInfo.c != DownloadInfo.Status.PAUSED_BY_MEDIA) && (paramDownloadInfo.c != DownloadInfo.Status.PAUSED_BY_OTHERS))
            break label648;
          if (n == 0)
            break label653;
          if (!this.f.contains(paramDownloadInfo))
          {
            this.f.add(paramDownloadInfo);
            d();
          }
          if (paramDownloadInfo.c != DownloadInfo.Status.SUCCESS)
            continue;
          if ((paramDownloadInfo.e != ContentTypeEnum.ContentType.APP) && (paramDownloadInfo.e != ContentTypeEnum.ContentType.PATCH))
            break label680;
          String str1 = paramDownloadInfo.f + this.a.getString(R.string.download_notification_success);
          String str2 = this.a.getString(R.string.download_notification_install);
          int i4 = paramDownloadInfo.a.hashCode();
          String str3 = paramDownloadInfo.a;
          String str4 = paramDownloadInfo.b;
          Intent localIntent = new Intent("ripple_framework.intent.action.ACTION_OPEN");
          localIntent.setPackage(GlobalConfig.getAppContext().getPackageName());
          localIntent.putExtra("ripple_framework.intent.extra.DOWNLOAD_IDENTITY", str4);
          a(str1, str2, i4, 0, false, str3, localIntent);
          this.d.put(paramDownloadInfo.m, paramDownloadInfo.a);
          if (!FileUtil.exists(paramDownloadInfo.d.a.e))
            continue;
          localv = ((DownloadManager)i.k().a("download")).b();
          switch (o.a[paramDownloadInfo.e.ordinal()])
          {
          default:
            return;
          case 1:
            if (!"game_packet".equals(paramDownloadInfo.p))
              break label752;
            localMap = com.wandoujia.gamepacket.b.c(paramDownloadInfo.q);
            if (localv == null)
              continue;
            str5 = paramDownloadInfo.m;
            str6 = paramDownloadInfo.d.a.e;
            if (localMap == null)
              break label738;
            str7 = (String)localMap.get("src_path");
            if (localMap == null)
              break label745;
          case 2:
          }
        }
        for (String str8 = (String)localMap.get("dst_path"); ; str8 = "")
        {
          v.a(str5, str6, str7, str8);
          return;
          i1 = 0;
          break;
          if (!this.e.contains(paramDownloadInfo))
            break label68;
          this.e.remove(paramDownloadInfo);
          break label64;
          i2 = 0;
          break label81;
          if (!this.h.contains(paramDownloadInfo))
            break label114;
          this.h.remove(paramDownloadInfo);
          break label110;
          i3 = 0;
          break label127;
          if (!this.g.contains(paramDownloadInfo))
            break label160;
          this.g.remove(paramDownloadInfo);
          break label156;
          n = 0;
          break label190;
          if (!this.f.contains(paramDownloadInfo))
            break label222;
          this.f.remove(paramDownloadInfo);
          break label218;
          a(paramDownloadInfo.f + this.a.getString(R.string.download_notification_success), this.a.getString(R.string.download_notification_look), paramDownloadInfo.a.hashCode(), paramDownloadInfo.a);
          break label386;
          str7 = "";
          break label518;
        }
      }
      while ((paramDownloadInfo.l) || (localv == null));
      v.a(paramDownloadInfo.d.a.e, paramDownloadInfo.m);
      return;
    }
    while (localv == null);
    label386: label518: label555: label582: label588: label738: label745: v.b(paramDownloadInfo.d.a.e, paramDownloadInfo.m);
    label648: label653: label680: return;
  }

  public final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.b.cancel(paramString.hashCode());
      if (a(paramString, this.e))
        a();
      if (a(paramString, this.h))
        b();
      if (a(paramString, this.g))
        c();
      if (a(paramString, this.f))
        d();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.m
 * JD-Core Version:    0.6.0
 */