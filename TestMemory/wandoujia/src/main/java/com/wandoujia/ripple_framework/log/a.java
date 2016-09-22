package com.wandoujia.ripple_framework.log;

import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.AppManager.AppState;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.log.Log;
import com.wandoujia.logv3.ActiveTrackingReceiver;
import com.wandoujia.logv3.model.packages.AppStatusPackage;
import com.wandoujia.logv3.model.packages.AppStatusPackage.Builder;
import com.wandoujia.logv3.model.packages.AppStatusPackage.Pattern;
import com.wandoujia.logv3.model.packages.ConsumptionEvent;
import com.wandoujia.logv3.model.packages.ConsumptionEvent.Builder;
import com.wandoujia.logv3.model.packages.ConsumptionEvent.Type;
import com.wandoujia.logv3.model.packages.ContentPackage;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Type;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.ripple_framework.i;
import java.util.Arrays;
import java.util.List;

public class a
{
  private static final String a = a.class.getSimpleName();
  private static final String[] b = { "com.wandoujia" };

  private static void a(ConsumptionEvent.Type paramType, String paramString1, String paramString2, boolean paramBoolean, ViewLogPackage paramViewLogPackage)
  {
    AppStatusPackage.Builder localBuilder = new AppStatusPackage.Builder();
    LocalAppInfo localLocalAppInfo;
    Integer localInteger;
    if (AppManager.a().i(paramString1) == AppManager.AppState.INSTALLED)
    {
      localBuilder.is_installed(Boolean.valueOf(true));
      localLocalAppInfo = AppManager.a().f(paramString1);
      if (localLocalAppInfo == null)
      {
        localInteger = null;
        localBuilder.app_version_code(localInteger);
      }
    }
    AppStatusPackage localAppStatusPackage;
    ConsumptionEvent localConsumptionEvent;
    ContentPackage localContentPackage;
    while (true)
    {
      if ((paramType == ConsumptionEvent.Type.DOWNLOAD) || (paramType == ConsumptionEvent.Type.INSTALL))
        localBuilder.is_predownload(Boolean.valueOf(paramBoolean));
      localBuilder.pattern(AppStatusPackage.Pattern.MANUAL);
      localAppStatusPackage = new AppStatusPackage.Builder(localBuilder.build()).build();
      ContentPackage.Type localType = ContentPackage.Type.APP;
      localConsumptionEvent = new ConsumptionEvent.Builder().type(paramType).source(paramString2).build();
      localContentPackage = new ContentPackage.Builder().type(localType).identity(paramString1).build();
      if (paramViewLogPackage != null)
        break label200;
      i.k().h().a(localConsumptionEvent, localContentPackage, localAppStatusPackage);
      return;
      localInteger = Integer.valueOf(localLocalAppInfo.getVersionCode());
      break;
      localBuilder.is_installed(Boolean.valueOf(false));
    }
    label200: i.k().h().a(localConsumptionEvent, localContentPackage, localAppStatusPackage, paramViewLogPackage);
  }

  public static void a(String paramString1, ViewLogPackage paramViewLogPackage, String paramString2)
  {
    a(ConsumptionEvent.Type.INSTALL, paramString1, paramString2, false, paramViewLogPackage);
    if (Arrays.asList(b).contains(paramString1))
      ActiveTrackingReceiver.a(i.k().g(), paramString1);
  }

  public static void a(String paramString1, String paramString2)
  {
    Log.i(a, "log uninstall " + paramString1 + ", " + paramString2, new Object[0]);
    a(ConsumptionEvent.Type.UNINSTALL, paramString1, paramString2, false, null);
  }

  public static void a(String paramString1, String paramString2, boolean paramBoolean, ViewLogPackage paramViewLogPackage)
  {
    Log.i(a, "log download " + paramString1, new Object[0]);
    a(ConsumptionEvent.Type.DOWNLOAD, paramString1, paramString2, paramBoolean, paramViewLogPackage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.log.a
 * JD-Core Version:    0.6.0
 */