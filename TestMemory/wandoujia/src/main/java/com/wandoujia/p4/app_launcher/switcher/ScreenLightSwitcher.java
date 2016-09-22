package com.wandoujia.p4.app_launcher.switcher;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;
import com.wandoujia.p4.app_launcher.g.a;

public final class ScreenLightSwitcher extends BaseSwitcher
{
  private boolean a = false;
  private boolean b = false;

  private static void a(Context paramContext, int paramInt)
  {
    if ((paramContext instanceof Activity))
    {
      Activity localActivity = (Activity)paramContext;
      WindowManager.LayoutParams localLayoutParams = localActivity.getWindow().getAttributes();
      localLayoutParams.screenBrightness = (0.003921569F * paramInt);
      localActivity.getWindow().setAttributes(localLayoutParams);
    }
    Uri localUri = Settings.System.getUriFor("screen_brightness");
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Settings.System.putInt(localContentResolver, "screen_brightness", paramInt);
    localContentResolver.notifyChange(localUri, null);
  }

  private static void a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      Settings.System.putInt(paramContext.getContentResolver(), "screen_brightness_mode", i);
      return;
    }
  }

  private void a(ScreenLightSwitcher.Mode paramMode)
  {
    switch (m.a[paramMode.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      if (this.b)
        d().b().setText(2131625482);
      return;
      d().a().setIconBigByResource(2130838720);
      d().b().setText(2131625479);
      continue;
      d().a().setIconBigByResource(2130838721);
      d().b().setText(2131625480);
      continue;
      d().a().setIconBigByResource(2130838723);
      d().b().setText(2131625483);
      continue;
      d().a().setIconBigByResource(2130838722);
      d().b().setText(2131625481);
    }
  }

  private static boolean a(Context paramContext)
  {
    try
    {
      int i = Settings.System.getInt(paramContext.getContentResolver(), "screen_brightness_mode");
      return i == 1;
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException)
    {
    }
    return false;
  }

  private static int b(Context paramContext)
  {
    try
    {
      int i = Settings.System.getInt(paramContext.getContentResolver(), "screen_brightness");
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  private ScreenLightSwitcher.Mode b()
  {
    int i = 1;
    Context localContext = GlobalConfig.getAppContext();
    if (a(localContext))
      return ScreenLightSwitcher.Mode.auto;
    int j = b(localContext);
    if (j > 170)
    {
      if (j != 255);
      while (true)
      {
        this.b = i;
        return ScreenLightSwitcher.Mode.high;
        i = 0;
      }
    }
    if (j <= 85)
    {
      if (j != i);
      while (true)
      {
        this.b = i;
        return ScreenLightSwitcher.Mode.low;
        i = 0;
      }
    }
    if (j != 127);
    while (true)
    {
      this.b = i;
      return ScreenLightSwitcher.Mode.normal;
      i = 0;
    }
  }

  public final BaseSwitcher.Type a()
  {
    return BaseSwitcher.Type.ScreenLight;
  }

  protected final void a(View paramView)
  {
    super.a(paramView);
    ScreenLightSwitcher.Mode localMode1 = b();
    int i = (1 + localMode1.ordinal()) % ScreenLightSwitcher.Mode.values().length;
    ScreenLightSwitcher.Mode localMode2 = ScreenLightSwitcher.Mode.values()[i];
    Context localContext = paramView.getContext();
    if (localMode1 == ScreenLightSwitcher.Mode.auto)
      a(localContext, false);
    switch (m.a[localMode2.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      this.b = false;
      a(localMode2);
      return;
      a(localContext, true);
      continue;
      a(localContext, 255);
      continue;
      a(localContext, 127);
      continue;
      a(localContext, 1);
    }
  }

  public final long e()
  {
    return b().getValue();
  }

  protected final void f()
  {
    if (!this.a)
    {
      this.a = true;
      l locall = new l(this, new Handler());
      Context localContext = GlobalConfig.getAppContext();
      Uri localUri1 = Settings.System.getUriFor("screen_brightness");
      localContext.getContentResolver().registerContentObserver(localUri1, false, locall);
      Uri localUri2 = Settings.System.getUriFor("screen_brightness_mode");
      localContext.getContentResolver().registerContentObserver(localUri2, false, locall);
    }
    a(b());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.ScreenLightSwitcher
 * JD-Core Version:    0.6.0
 */