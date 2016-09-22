package com.wandoujia.clean.a;

import android.content.Context;
import android.content.pm.IPackageDataObserver;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StatFs;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.clean.model.Garbage;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public final class b
  implements Runnable
{
  private final List<Garbage> a;
  private final boolean b;

  public static void a()
  {
    try
    {
      PackageManager localPackageManager = GlobalConfig.getAppContext().getPackageManager();
      Class localClass = localPackageManager.getClass();
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Long.TYPE;
      arrayOfClass[1] = IPackageDataObserver.class;
      Method localMethod = localClass.getMethod("freeStorageAndNotify", arrayOfClass);
      StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
      Long localLong = Long.valueOf(localStatFs.getBlockSize() * localStatFs.getBlockCount() - 1L);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localLong;
      arrayOfObject[1] = new c();
      localMethod.invoke(localPackageManager, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
  }

  public final void run()
  {
    if (CollectionUtils.isEmpty(this.a));
    do
    {
      return;
      this.a.size();
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        Garbage localGarbage = (Garbage)localIterator.next();
        switch (d.a[localGarbage.getGarbageType().ordinal()])
        {
        default:
          break;
        case 1:
          MemoryUtil.killProcess(GlobalConfig.getAppContext(), localGarbage.getRelativeFilePath());
        }
      }
    }
    while (!this.b);
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.a.b
 * JD-Core Version:    0.6.0
 */