package com.wandoujia.ripple_framework.installer.install.impl;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.SystemUtil.InstallOption;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.m;
import com.wandoujia.ripple_framework.installer.install.n;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.rootkit.exceptions.RootDeniedException;
import com.wandoujia.rootkit.exceptions.RootKitException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public final class l extends m
{
  private a b = new a();

  public l(m paramm)
  {
    super(paramm);
  }

  public final void a(String paramString)
  {
    ((AppManager)i.k().a("app")).b(paramString, true);
  }

  public final void a(String paramString, n paramn)
  {
    a(paramString, android.support.v4.app.b.M(paramString), paramn);
  }

  public final void a(String paramString1, String paramString2, n paramn)
  {
    a locala1 = this.b;
    if (!TextUtils.isEmpty(paramString2))
    {
      if (!((de.greenrobot.event.c)i.k().a("event_bus")).b(locala1))
        ((de.greenrobot.event.c)i.k().a("event_bus")).a(locala1);
      new Handler(Looper.getMainLooper()).post(new b(locala1, paramString2, paramn));
    }
    if ((BadgeUtil.b(i.k().g())) && (com.wandoujia.rootkit.b.a().c()))
    {
      SystemUtil.InstallOption localInstallOption = com.wandoujia.appmanager.a.a().a();
      if (!SystemUtil.checkSpaceEnough(paramString1, localInstallOption))
        localInstallOption = SystemUtil.InstallOption.AUTO;
      com.wandoujia.rootkit.a.b localb1 = new com.wandoujia.rootkit.a.b();
      try
      {
        com.wandoujia.rootkit.a.b localb3 = com.wandoujia.rootkit.b.a().a(paramString1, localInstallOption.name());
        localb2 = localb3;
        i = 0;
        if (localb2.a())
        {
          paramn.b(paramString2);
          return;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
        {
          localb1.d();
          i = 1004;
          localb2 = localb1;
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          localb1.e();
          i = 1001;
          localb2 = localb1;
        }
      }
      catch (TimeoutException localTimeoutException)
      {
        while (true)
        {
          localb1.c();
          i = 1003;
          localb2 = localb1;
        }
      }
      catch (RootDeniedException localRootDeniedException)
      {
        while (true)
        {
          localb1.f();
          i = 1002;
          localb2 = localb1;
        }
      }
      catch (RootKitException localRootKitException)
      {
        com.wandoujia.rootkit.a.b localb2;
        int i;
        while (true)
        {
          localb1.g();
          i = 1002;
          localb2 = localb1;
        }
        if ((i == 0) && (!localb2.a()))
          i = 1000;
        if (i != 0)
        {
          localb2.b();
          paramn.c(paramString2);
        }
      }
    }
    a locala2 = this.b;
    new Handler(Looper.getMainLooper()).post(new c(locala2, paramString2));
    this.a.a(paramString1, paramn);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.l
 * JD-Core Version:    0.6.0
 */