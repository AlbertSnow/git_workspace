package com.wandoujia.p4.app_launcher.switcher;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;
import com.wandoujia.p4.app_launcher.g.a;

public final class n extends StateSwitcher
{
  private boolean a = false;

  public final BaseSwitcher.Type a()
  {
    return BaseSwitcher.Type.ScreenRotation;
  }

  protected final void a(View paramView, boolean paramBoolean)
  {
    Context localContext = paramView.getContext();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      Uri localUri = Settings.System.getUriFor("accelerometer_rotation");
      Settings.System.putInt(localContext.getContentResolver(), "accelerometer_rotation", i);
      localContext.getContentResolver().notifyChange(localUri, null);
      b(StateSwitcher.State.wait);
      g();
      return;
    }
  }

  protected final void a(StateSwitcher.State paramState)
  {
    switch (p.a[paramState.ordinal()])
    {
    default:
      return;
    case 1:
      d().a().setIconBigByResource(2130838726);
      d().b().setText(2131625485);
      return;
    case 2:
      d().a().setIconBigByResource(2130838725);
      d().b().setText(2131625486);
      return;
    case 3:
    }
    d().a().setIconBigByResource(2130838727);
    d().b().setText(2131625487);
  }

  protected final boolean b()
  {
    if (!this.a)
    {
      this.a = true;
      Uri localUri = Settings.System.getUriFor("accelerometer_rotation");
      o localo = new o(this, new Handler());
      GlobalConfig.getAppContext().getContentResolver().registerContentObserver(localUri, false, localo);
    }
    try
    {
      int j = Settings.System.getInt(GlobalConfig.getAppContext().getContentResolver(), "accelerometer_rotation");
      i = j;
      if (i != 0)
        return true;
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException)
    {
      while (true)
        int i = 0;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.n
 * JD-Core Version:    0.6.0
 */