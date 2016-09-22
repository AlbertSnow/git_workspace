package com.wandoujia.base.utils;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Window;

public class ScreenUtils
{
  public static void setActivityLandscape(Activity paramActivity)
  {
    if (paramActivity.getResources().getConfiguration().orientation == 1)
    {
      paramActivity.setRequestedOrientation(0);
      paramActivity.getWindow().setFlags(1024, 1024);
    }
  }

  public static void setActivityPortrait(Activity paramActivity)
  {
    if (paramActivity.getResources().getConfiguration().orientation == 2)
      paramActivity.setRequestedOrientation(1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ScreenUtils
 * JD-Core Version:    0.6.0
 */