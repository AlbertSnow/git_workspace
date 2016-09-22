package com.wandoujia.jupiter.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.jupiter.service.model.AppActiveDir;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class AppLaunchCheckService extends IntentService
{
  private static String a = Environment.getExternalStorageDirectory().getAbsolutePath();
  private d b;

  public AppLaunchCheckService()
  {
    super(AppLaunchCheckService.class.getName());
  }

  public void onCreate()
  {
    super.onCreate();
    this.b = new d(this);
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    if ((paramIntent == null) || (paramIntent.getAction() == null));
    label101: label121: String str2;
    boolean bool;
    label154: String str3;
    while (true)
    {
      return;
      if (!TextUtils.equals(paramIntent.getAction(), "phoenix.intent.action.START_APP_LAUNCH_CHECK_SERVICE"))
        break label249;
      Iterator localIterator1 = this.b.a().iterator();
      while (true)
        if (localIterator1.hasNext())
        {
          AppActiveDir localAppActiveDir2 = (AppActiveDir)localIterator1.next();
          if (System.currentTimeMillis() >= localAppActiveDir2.getExpired());
          for (int i = 1; ; i = 0)
          {
            if (i == 0)
              break label101;
            this.b.a(localAppActiveDir2.getPn());
            break;
          }
          if (localAppActiveDir2.getDirs() == null)
            continue;
          Iterator localIterator2 = localAppActiveDir2.getDirs().iterator();
          if (!localIterator2.hasNext())
            continue;
          str2 = (String)localIterator2.next();
          if (TextUtils.isEmpty(str2))
          {
            bool = false;
            if (!bool)
              break label222;
            b.a("app_launch_checker", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.REFRESH, str2, localAppActiveDir2.getPn());
            this.b.a(localAppActiveDir2.getPn());
            continue;
          }
        }
        else
        {
          break;
        }
      if (!str2.startsWith("/sdcard"))
        break label224;
      str3 = str2.replaceFirst("/sdcard", a);
    }
    while (true)
    {
      bool = FileUtil.exists(str3);
      break label154;
      label222: break label121;
      label224: if (str2.startsWith("/mnt/sdcard"))
      {
        str3 = str2.replaceFirst("/mnt/sdcard", a);
        continue;
        label249: if (TextUtils.equals(paramIntent.getAction(), "phoenix.intent.action.APP_INSTALLED"))
        {
          Serializable localSerializable = paramIntent.getSerializableExtra("app_active_dir");
          if (!(localSerializable instanceof AppActiveDir))
            break;
          AppActiveDir localAppActiveDir1 = (AppActiveDir)localSerializable;
          this.b.a(localAppActiveDir1);
          return;
        }
        if (!TextUtils.equals(paramIntent.getAction(), "phoenix.intent.action.APP_UNINSTALLED"))
          break;
        String str1 = paramIntent.getStringExtra("package_name");
        if (TextUtils.isEmpty(str1))
          break;
        this.b.a(str1);
        return;
      }
      str3 = str2;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.AppLaunchCheckService
 * JD-Core Version:    0.6.0
 */