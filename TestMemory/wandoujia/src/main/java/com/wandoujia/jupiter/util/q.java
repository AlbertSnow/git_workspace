package com.wandoujia.jupiter.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.Base64;
import com.wandoujia.entities.app.IAppDetailInfo;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.model.suffix.AppDownload;
import com.wandoujia.p4.model.suffix.SuffixContentModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class q
{
  private static final String a = q.class.getSimpleName();

  public static boolean a(Context paramContext)
  {
    Log.d(a, "resolveSuffix", new Object[0]);
    List localList = android.support.v4.app.b.z(paramContext);
    if (localList.isEmpty())
      return false;
    Iterator localIterator = localList.iterator();
    com.wandoujia.a.b localb;
    do
    {
      if (!localIterator.hasNext())
        break;
      localb = (com.wandoujia.a.b)localIterator.next();
    }
    while (!"Wdj".equals(localb.a().a()));
    while (true)
    {
      if (localb == null)
        return false;
      com.wandoujia.a.a locala = localb.a();
      Log.d(a, "headerModel:" + locala, new Object[0]);
      if (locala == null)
        return false;
      if ('J' == locala.b())
        return a(localb.b());
      if ('B' == locala.b())
      {
        String str = localb.b().replace("_", "/").replace("-", "+");
        int i = 4 - str.length() % 4;
        if (i == 1)
          str = str + "=";
        while (true)
        {
          return a(new String(Base64.decode(str.getBytes(), 0)));
          if (i != 2)
            continue;
          str = str + "==";
        }
      }
      return false;
      localb = null;
    }
  }

  private static boolean a(String paramString)
  {
    Log.d(a, "jsonContent:" + paramString, new Object[0]);
    if (TextUtils.isEmpty(paramString))
      return false;
    com.wandoujia.gson.c localc = new com.wandoujia.gson.c();
    AppDownload localAppDownload;
    try
    {
      localSuffixContentModel = (SuffixContentModel)localc.a(paramString, SuffixContentModel.class);
      if (localSuffixContentModel == null)
        return false;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
      SuffixContentModel localSuffixContentModel;
      while (true)
        localSuffixContentModel = null;
      Log.d(a, "SuffixContentModel:" + localSuffixContentModel, new Object[0]);
      localAppDownload = localSuffixContentModel.appDownload;
      if (localAppDownload == null)
        return false;
      if (!"download_by_url".equalsIgnoreCase(localAppDownload.downloadType))
        break label192;
    }
    Log.d(a, "download_by_url", new Object[0]);
    String str2 = localAppDownload.packageName;
    String str3 = localAppDownload.downloadUrl;
    String str4 = localAppDownload.iconUrl;
    String str5 = localAppDownload.title;
    if (a(str2, str5))
      JupiterApplication.a().post(new s(str2, str3, str5, str4));
    while (true)
    {
      return true;
      label192: if (!"download_by_package_name".equalsIgnoreCase(localAppDownload.downloadType))
        continue;
      Log.d(a, "download_by_package_name", new Object[0]);
      String str1 = localAppDownload.packageName;
      com.wandoujia.p4.http.b.c localc1 = new com.wandoujia.p4.http.b.c();
      ((com.wandoujia.p4.http.request.b)localc1.getRequestBuilder()).a(str1);
      try
      {
        localIAppDetailInfo = (IAppDetailInfo)com.wandoujia.p4.a.b().execute(localc1);
        if ((localIAppDetailInfo == null) || (!a(str1, localIAppDetailInfo.getAppDetailTitle())))
          continue;
        JupiterApplication.a().post(new t(str1, localIAppDetailInfo));
      }
      catch (ExecutionException localExecutionException)
      {
        while (true)
          IAppDetailInfo localIAppDetailInfo = null;
      }
    }
  }

  private static boolean a(String paramString1, String paramString2)
  {
    if (AppManager.a().h(paramString1))
    {
      if (AppManager.a().g(paramString1))
      {
        b(GlobalConfig.getAppContext().getString(2131624925));
        return true;
      }
      b(String.format(GlobalConfig.getAppContext().getString(2131625777), new Object[] { paramString2 }));
      return false;
    }
    b(GlobalConfig.getAppContext().getString(2131624925));
    return true;
  }

  private static void b(String paramString)
  {
    com.wandoujia.p4.a.d().post(new r(paramString));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.q
 * JD-Core Version:    0.6.0
 */