package com.wandoujia.plugin.bridge;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;

public abstract class BasePluginActivity extends FragmentActivity
{
  private Resources a;

  public Resources getResources()
  {
    if ((this.a != null) && (this.a.getConfiguration() == super.getResources().getConfiguration()))
      return this.a;
    Resources localResources = a.c().b();
    this.a = new Resources(localResources.getAssets(), localResources.getDisplayMetrics(), super.getResources().getConfiguration());
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.plugin.bridge.BasePluginActivity
 * JD-Core Version:    0.6.0
 */