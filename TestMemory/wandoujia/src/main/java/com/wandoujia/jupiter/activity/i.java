package com.wandoujia.jupiter.activity;

import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.multidex.MultiDex;

final class i
  implements Runnable
{
  i(NoDexLaunchActivity paramNoDexLaunchActivity)
  {
  }

  public final void run()
  {
    try
    {
      MultiDex.install(this.a.getApplication());
      this.a.getApplication();
      JupiterApplication.a(this.a.getApplication());
      this.a.finish();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.i
 * JD-Core Version:    0.6.0
 */