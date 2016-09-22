package com.wandoujia.appmanager;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.Map;
import java.util.concurrent.Callable;

final class m
  implements Callable<Void>
{
  m(PackageInfo paramPackageInfo, Map paramMap)
  {
  }

  private Void a()
  {
    try
    {
      CharSequence localCharSequence = this.a.applicationInfo.loadLabel(AppManager.o().getPackageManager());
      synchronized (this.b)
      {
        this.b.put(this.a.packageName, localCharSequence.toString());
        return null;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.m
 * JD-Core Version:    0.6.0
 */