package com.wandoujia.p4.app_launcher.switcher;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;

public final class a extends StateSwitcher
{
  private boolean a = false;

  public final BaseSwitcher.Type a()
  {
    return BaseSwitcher.Type.AirplaneMode;
  }

  protected final void a(View paramView, boolean paramBoolean)
  {
    Context localContext = paramView.getContext();
    int i;
    if (paramBoolean)
      i = 1;
    while (true)
    {
      if (Build.VERSION.SDK_INT > 16);
      try
      {
        Intent localIntent2 = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
        localIntent2.addFlags(268435456);
        localContext.startActivity(localIntent2);
        while (true)
        {
          label45: b(StateSwitcher.State.wait);
          g();
          return;
          i = 0;
          break;
          Settings.System.putInt(localContext.getContentResolver(), "airplane_mode_on", i);
          Intent localIntent1 = new Intent("android.intent.action.AIRPLANE_MODE");
          localIntent1.putExtra("state", paramBoolean);
          localContext.sendBroadcast(localIntent1);
        }
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        break label45;
      }
    }
  }

  protected final void a(StateSwitcher.State paramState)
  {
    switch (b.a[paramState.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      d().b().setText(2131625472);
      return;
      d().a().setIconBigByResource(2130838707);
      continue;
      d().a().setIconBigByResource(2130838706);
      continue;
      d().a().setIconBigByResource(2130838708);
    }
  }

  protected final boolean b()
  {
    if (!this.a)
    {
      this.a = true;
      IntentFilter localIntentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
      AirplaneModeSwitcher.1 local1 = new AirplaneModeSwitcher.1(this);
      GlobalConfig.getAppContext().registerReceiver(local1, localIntentFilter);
    }
    return Settings.System.getInt(GlobalConfig.getAppContext().getContentResolver(), "airplane_mode_on", 0) != 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.a
 * JD-Core Version:    0.6.0
 */