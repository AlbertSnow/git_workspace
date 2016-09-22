package com.wandoujia.jupiter.shortcut;

import android.text.TextUtils;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.LauncherUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.network.e;
import com.wandoujia.ripple_framework.ReceiverMonitor.AppActionType;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
  implements l
{
  public final void a(ReceiverMonitor.AppActionType paramAppActionType, List<String> paramList)
  {
    if ((paramAppActionType == ReceiverMonitor.AppActionType.ADDED) && (!CollectionUtils.isEmpty(paramList)))
    {
      String str1 = LauncherUtil.getDefaultLauncher(JupiterApplication.e());
      DownloadManager localDownloadManager = (DownloadManager)com.wandoujia.ripple_framework.i.k().a("download");
      if (localDownloadManager != null)
      {
        com.wandoujia.nirvana.framework.network.a locala = (com.wandoujia.nirvana.framework.network.a)com.wandoujia.ripple_framework.i.k().a("api_context");
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          if ((localDownloadManager.a(str2) == null) || (TextUtils.isEmpty(str2)))
            continue;
          String str3 = String.format("http://apis.wandoujia.com/five/v2/apps/%1$s/shortcuts", new Object[] { str2 });
          HashMap localHashMap = new HashMap();
          if (str1 == null);
          for (String str4 = ""; ; str4 = str1)
          {
            localHashMap.put("launcherPackage", str4);
            e locale = new e(str3, localHashMap, locala, new b(), new c(str2), new d());
            locale.a("Accept", "application/json");
            locala.a().a(locale);
            break;
          }
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.shortcut.a
 * JD-Core Version:    0.6.0
 */