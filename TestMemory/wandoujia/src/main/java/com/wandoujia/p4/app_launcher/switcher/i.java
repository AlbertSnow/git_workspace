package com.wandoujia.p4.app_launcher.switcher;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;
import com.wandoujia.p4.app_launcher.g.a;
import java.lang.reflect.Method;

public final class i extends StateSwitcher
{
  private ConnectivityManager a;

  public final BaseSwitcher.Type a()
  {
    return BaseSwitcher.Type.MobileData;
  }

  protected final void a(View paramView, boolean paramBoolean)
  {
    try
    {
      Class localClass = this.a.getClass();
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      Method localMethod = localClass.getDeclaredMethod("setMobileDataEnabled", arrayOfClass);
      ConnectivityManager localConnectivityManager = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(paramBoolean);
      localMethod.invoke(localConnectivityManager, arrayOfObject);
      b(StateSwitcher.State.wait);
      g();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected final void a(StateSwitcher.State paramState)
  {
    switch (j.a[paramState.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      d().b().setText(2131625475);
      return;
      d().a().setIconBigByResource(2130838715);
      continue;
      d().a().setIconBigByResource(2130838714);
      continue;
      d().a().setIconBigByResource(2130838716);
    }
  }

  protected final boolean b()
  {
    if (this.a == null)
    {
      this.a = ((ConnectivityManager)GlobalConfig.getAppContext().getSystemService("connectivity"));
      IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      MobileDataSwitcher.1 local1 = new MobileDataSwitcher.1(this);
      GlobalConfig.getAppContext().registerReceiver(local1, localIntentFilter);
    }
    if (this.a != null)
      try
      {
        boolean bool = ((Boolean)this.a.getClass().getMethod("getMobileDataEnabled", null).invoke(this.a, null)).booleanValue();
        return bool;
      }
      catch (Exception localException)
      {
      }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.i
 * JD-Core Version:    0.6.0
 */