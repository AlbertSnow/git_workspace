package com.wandoujia.jupiter.e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.notification.e;
import com.wandoujia.logv3.model.packages.ContentPackage;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Type;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.ReceiverMonitor.AppActionType;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.l;
import com.wandoujia.ripple_framework.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  implements l
{
  private static final int a = a.class.getSimpleName().hashCode();
  private static final String[][] b = { { "one.hh.oneclient", "com.brixd.niceapp", "com.zhihu.daily.android", "com.bdatu.geography", "com.douban.daily", "com.ifanr.activitys", "com.rakutec.android.iweekly", "com.lofter.android", "com.zhan_dui.animetaste", "com.wandoujia.eyepetizer", "com.qdaily.ui", "com.douban.frodo", "com.douban.movie", "com.dada.ditto", "com.vsco.cam", "cn.com.modernmedia.ideat", "com.yinyuetai.ui", "com.mtime", "cn.com.mm.ui", "com.zhihu.android", "com.mci.worldscreen.phone", "com.movier.magicbox", "com.fivehundredpx.viewer", "vmovier.com.activity", "com.sankuai.movie", "com.yahoo.mobile.client.android.flickr", "com.mrocker.cheese", "com.tenge.smart", "com.sanlian", "com.funinput.digit", "viva.reader", "com.xiaomi.xy.sportscamera", "cn.com.modernmedia.tanc", "com.duitang.main", "com.zhongduomei.rrmj.society", "cn.com.modernmedia.modernlady", "cn.onewaystreet.weread" }, { "com.wzm.moviepic", "com.instagram.android", "com.infzm.daily.know", "com.by.butter.camera", "nfpeople.phone.com.mediapad", "com.mzread.dayan", "com.xinli.yixinli", "com.guokr.android", "com.sspai.client", "com.behance.behance", "com.gopro.smarty", "com.pinterest", "com.baidu.tieba", "com.yahoo.mobile.client.android.atom", "org.wikipedia", "com.xiachufang", "com.smzdm.client.android", "com.liangcang", "com.wandoujia.sonic", "com.Qunar", "com.mappn.gfan", "com.evernote", "com.ted.android", "com.netease.vopen", "com.ballistiq.artstation", "com.microsoft.bing", "ctrip.android.view", "com.imdb.mobile", "org.goodev.droidddle", "com.mm.goodlife", "cn.fotomen.reader", "com.liwushuo.gifttalk", "com.ricebook.highgarden", "com.danielstudio.app.wowtu", "com.zcool.community", "com.xiangqu.app", "com.mfw.roadbook", "com.jzyd.BanTang", "com.shanbay.news", "com.thefancy.app", "com.deviantart.android.damobile", "com.baidu.iknow", "org.idaxiang.android", "com.breadtrip", "com.pianke.client", "com.chanyouji.android" }, { "com.huofar", "com.guoku", "bbc.mobile.news.ww", "qsbk.app", "cn.com.modernmedia.lohas", "com.condenast.gq24", "com.to8to.assistant.activity", "com.kuaikan.comic", "com.meitu.meipaimv", "com.insthub.voguemini", "com.hujiang.news", "cc.huochaihe.app", "com.medium.reader", "com.xiaomi.market", "com.jiecao.news.jiecaonews", "com.douban.dongxi", "com.wumii.android.SITE.app_2q3ySOY", "com.nice.main", "com.baidu.baike", "com.ninegag.android.app", "com.myzaker.ZAKER_Phone", "gov.nasa", "com.android36kr.app", "com.qihoo.appstore", "com.wallstreetcn.news", "com.caijing", "com.kingnez.umasou.app", "com.taguxdesign.yixi", "com.ruanmei.ithome", "com.baidu.appsearch", "com.cubic.autohome", "com.huxiu", "com.technode.yiwen", "com.android.xymens", "me.topit.TopAndroid2", "com.ft", "cn.com.modernmedia.businessweek" } };

  private static int a(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return -1;
      for (int i = 0; i < 3; i++)
      {
        String[] arrayOfString = b[i];
        int j = arrayOfString.length;
        for (int k = 0; k < j; k++)
          if (arrayOfString[k].equals(paramString))
            return i;
      }
    }
  }

  private static void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    ContentPackage localContentPackage = new ContentPackage.Builder().type(ContentPackage.Type.APP).identity(paramString1).build();
    ExtraPackage.Builder localBuilder = new ExtraPackage.Builder().content_package(localContentPackage);
    if (paramBoolean);
    for (String str = "notification_ripple_app_uninstall"; ; str = "notification_ripple_app_install")
    {
      TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().action(TaskEvent.Action.PUSH).status(TaskEvent.Status.READY).result(TaskEvent.Result.SUCCESS).result_info(str);
      i.k().h().a(localBuilder1, localBuilder);
      Context localContext = GlobalConfig.getAppContext();
      Intent localIntent = ((NavigationManager)i.k().a("navigation")).b(localContext, String.format("wdj://apps/%s", new Object[] { "com.wandoujia" }), null);
      localIntent.putExtra("launch_from", "notification_push");
      localIntent.putExtra("launch_keyword", str);
      localIntent.setFlags(268468224);
      PendingIntent localPendingIntent = PendingIntent.getActivity(GlobalConfig.getAppContext(), 0, localIntent, 134217728);
      e.a().a(a, paramString2, paramString2, paramString3, localPendingIntent);
      return;
    }
  }

  public final void a(ReceiverMonitor.AppActionType paramAppActionType, List<String> paramList)
  {
    label8: if (!SystemUtil.aboveApiLevel(14))
    {
      break label8;
      break label8;
      break label8;
      break label8;
    }
    label479: label500: label508: 
    while (true)
    {
      return;
      if (((paramAppActionType != ReceiverMonitor.AppActionType.REMOVED) && (paramAppActionType != ReceiverMonitor.AppActionType.ADDED)) || (CollectionUtils.isEmpty(paramList)))
        continue;
      if (paramAppActionType == ReceiverMonitor.AppActionType.REMOVED);
      long l1;
      long l2;
      for (boolean bool1 = true; ; bool1 = false)
      {
        l1 = Config.ae();
        l2 = System.currentTimeMillis();
        if (l2 - l1 >= 0L)
          break;
        Config.k(l2);
        return;
      }
      int i = Config.af();
      if (i >= 3)
        break;
      AppManager localAppManager = (AppManager)i.k().a("app");
      if (localAppManager.h("com.wandoujia"))
        break;
      int j = -1;
      Iterator localIterator1 = paramList.iterator();
      boolean bool2 = localIterator1.hasNext();
      Object localObject1 = null;
      int i2;
      int k;
      boolean bool3;
      Object localObject2;
      if (bool2)
      {
        String str2 = (String)localIterator1.next();
        if ("com.wandoujia".equals(str2))
        {
          Config.f(3);
          return;
        }
        i2 = a(str2);
        if (i2 >= 0)
        {
          localObject1 = str2;
          j = i2;
        }
      }
      else
      {
        if ((localObject1 != null) && (j >= 0))
          break label500;
        List localList = Config.ag();
        if (CollectionUtils.isEmpty(localList))
          break;
        Iterator localIterator2 = localList.iterator();
        k = j;
        while (localIterator2.hasNext())
        {
          String str1 = (String)localIterator2.next();
          if (localAppManager.h(str1))
            continue;
          k = a(str1);
          if (k < 0)
            continue;
          int i1 = k;
          bool3 = true;
          localObject2 = str1;
          j = i1;
        }
      }
      while (true)
      {
        if ((localObject2 == null) || (j < 0))
          break label508;
        if (!bool3)
        {
          Object localObject3 = Config.ag();
          if (localObject3 == null)
            localObject3 = new ArrayList();
          if (((List)localObject3).size() >= 3)
            ((List)localObject3).remove(0);
          ((List)localObject3).add(localObject2);
          Config.b((List)localObject3);
          if (((List)localObject3).size() < 3)
            break;
        }
        if (l2 - l1 < 86400000L)
          break;
        Config.k(l2);
        Config.f(i + 1);
        Resources localResources = GlobalConfig.getAppContext().getResources();
        int m;
        if (bool3)
        {
          m = localResources.getStringArray(2131230760).length;
          if (j < m)
            break label479;
        }
        for (int n = m - 1; ; n = j)
        {
          a((String)localObject2, localResources.getStringArray(2131230760)[n], localResources.getStringArray(2131230759)[n], bool3);
          return;
          j = i2;
          break;
          a((String)localObject2, localResources.getString(2131625330), localResources.getString(2131625329), bool3);
          return;
        }
        j = k;
        bool3 = bool1;
        localObject2 = localObject1;
        continue;
        bool3 = bool1;
        localObject2 = localObject1;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.e.a
 * JD-Core Version:    0.6.0
 */