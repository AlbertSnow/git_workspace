package com.wandoujia.launcher.launcher.activity;

import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.app.d;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.launcher.launcher.b.c;
import java.util.List;

final class a
  implements Runnable
{
  a(GameLauncherActivity paramGameLauncherActivity)
  {
  }

  public final void run()
  {
    List localList = c.a().b();
    if ((CollectionUtils.isEmpty(localList)) && (!d.l()))
    {
      c.a().h();
      localList = c.a().b();
    }
    if (localList.size() > 0)
    {
      Bitmap localBitmap = com.wandoujia.launcher.e.a.c();
      com.wandoujia.launcher_base.b.a.e().post(new b(this, localBitmap));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.a
 * JD-Core Version:    0.6.0
 */