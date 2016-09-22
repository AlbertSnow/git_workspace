package com.wandoujia.launcher_base.utils;

import android.support.v7.app.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class ZipManager
{
  private static ZipManager b;
  private final Set<WeakReference<k>> a = new HashSet();

  private ZipManager()
  {
    new HashMap();
    new HashMap();
    new HashMap();
    new HashMap();
  }

  public static ZipManager a()
  {
    monitorenter;
    try
    {
      if (b == null)
        b = new ZipManager();
      ZipManager localZipManager = b;
      return localZipManager;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(k paramk)
  {
    synchronized (this.a)
    {
      this.a.add(new WeakReference(paramk));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.utils.ZipManager
 * JD-Core Version:    0.6.0
 */