package com.wandoujia.p4.app_launcher.switcher;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.launcher_base.view.stateful.view.DoubleIcon;

public final class RingerModeSwitcher extends BaseSwitcher
{
  private AudioManager a;
  private boolean b = false;

  private void a(RingerModeSwitcher.Mode paramMode)
  {
    switch (k.a[paramMode.ordinal()])
    {
    default:
      return;
    case 1:
      d().a().setIconBigByResource(2130838717);
      d().b().setText(2131625476);
      return;
    case 2:
      d().a().setIconBigByResource(2130838718);
      d().b().setText(2131625477);
      return;
    case 3:
    }
    d().a().setIconBigByResource(2130838719);
    d().b().setText(2131625478);
  }

  private RingerModeSwitcher.Mode b()
  {
    if (this.a == null)
    {
      Context localContext = GlobalConfig.getAppContext();
      this.a = ((AudioManager)localContext.getSystemService("audio"));
      IntentFilter localIntentFilter = new IntentFilter("android.media.RINGER_MODE_CHANGED");
      localContext.registerReceiver(new RingerModeSwitcher.1(this), localIntentFilter);
      this.b = SystemUtil.isMIUI();
    }
    GlobalConfig.getAppContext();
    switch (this.a.getRingerMode())
    {
    default:
      return RingerModeSwitcher.Mode.normal;
    case 0:
      return RingerModeSwitcher.Mode.silent;
    case 2:
      return RingerModeSwitcher.Mode.normal;
    case 1:
    }
    return RingerModeSwitcher.Mode.vibrate;
  }

  private void g()
  {
    if (this.b)
      Toast.makeText(com.wandoujia.p4.a.a(), 2131624284, 0).show();
  }

  public final BaseSwitcher.Type a()
  {
    return BaseSwitcher.Type.RingerMode;
  }

  protected final void a(View paramView)
  {
    super.a(paramView);
    RingerModeSwitcher.Mode localMode;
    for (Object localObject = b(); ; localObject = localMode)
    {
      int i = (1 + ((RingerModeSwitcher.Mode)localObject).ordinal()) % RingerModeSwitcher.Mode.values().length;
      localMode = RingerModeSwitcher.Mode.values()[i];
      int j;
      if (localMode == RingerModeSwitcher.Mode.vibrate)
      {
        if (SystemUtil.aboveApiLevel(11))
        {
          Vibrator localVibrator = (Vibrator)GlobalConfig.getAppContext().getSystemService("vibrator");
          if ((localVibrator == null) || (!localVibrator.hasVibrator()))
          {
            j = 0;
            if (j == 0)
              continue;
          }
        }
      }
      else
        switch (k.a[localMode.ordinal()])
        {
        default:
        case 1:
        case 2:
        case 3:
        }
      while (true)
      {
        a(localMode);
        return;
        j = 1;
        break;
        this.a.setRingerMode(2);
        continue;
        this.a.setRingerMode(0);
        g();
        continue;
        this.a.setRingerMode(1);
        g();
      }
    }
  }

  public final long e()
  {
    return b().getValue();
  }

  public final void f()
  {
    a(b());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.RingerModeSwitcher
 * JD-Core Version:    0.6.0
 */