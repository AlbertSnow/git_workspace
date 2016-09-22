package com.wandoujia.launcher;

import android.app.ActivityManager;
import android.content.Context;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.image.a;
import java.io.File;

final class g
  implements a
{
  public final Context a()
  {
    return GlobalConfig.getAppContext();
  }

  public final String b()
  {
    boolean bool = SystemUtil.isExternalSDCardMounted();
    File localFile = null;
    if (bool)
      localFile = SystemUtil.getDeviceExternalCacheDir();
    if (localFile == null)
      localFile = GlobalConfig.getAppContext().getCacheDir();
    return localFile.getPath() + "/ImageCache";
  }

  public final int c()
  {
    return 67108864;
  }

  public final int d()
  {
    int i = ((ActivityManager)GlobalConfig.getAppContext().getSystemService("activity")).getMemoryClass();
    if (i <= 64)
      return Math.round(0.05F * (float)(1048576L * i));
    return Math.round(0.1F * (float)(1048576L * i));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.g
 * JD-Core Version:    0.6.0
 */