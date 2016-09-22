package com.wandoujia.ripple_framework.installer.install.impl;

import com.wandoujia.ripple_framework.installer.install.PackageChangeEvent;
import com.wandoujia.ripple_framework.installer.install.PackageChangeEvent.EventType;
import com.wandoujia.ripple_framework.installer.install.n;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private Map<String, n> a = new HashMap();

  public final void onEventMainThread(PackageChangeEvent paramPackageChangeEvent)
  {
    if ((paramPackageChangeEvent.b() == PackageChangeEvent.EventType.ADD) || (paramPackageChangeEvent.b() == PackageChangeEvent.EventType.REPLACE))
    {
      String str = paramPackageChangeEvent.a();
      n localn = (n)this.a.get(str);
      if (localn != null)
      {
        localn.b(str);
        this.a.remove(str);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.a
 * JD-Core Version:    0.6.0
 */