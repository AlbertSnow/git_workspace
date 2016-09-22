package com.wandoujia.jupiter.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.settings.MainSettingActivity;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class d extends h
{
  d(AutoInstallCardView paramAutoInstallCardView)
  {
  }

  public final boolean a(View paramView)
  {
    AutoInstallCardView.a(this.a);
    Config.G();
    try
    {
      Intent localIntent = new Intent(paramView.getContext(), MainSettingActivity.class);
      paramView.getContext().startActivity(localIntent);
      label32: a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, "system://settings/auto_install");
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      break label32;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.d
 * JD-Core Version:    0.6.0
 */