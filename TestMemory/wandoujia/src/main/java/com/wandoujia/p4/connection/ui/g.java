package com.wandoujia.p4.connection.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.plugin.bridge.a;

final class g extends a
{
  public final SharedPreferences a()
  {
    return Config.a();
  }

  public final Resources b()
  {
    return GlobalConfig.getAppContext().getResources();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.ui.g
 * JD-Core Version:    0.6.0
 */