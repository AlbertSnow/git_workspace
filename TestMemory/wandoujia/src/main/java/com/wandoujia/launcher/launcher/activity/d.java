package com.wandoujia.launcher.launcher.activity;

import android.graphics.Bitmap;
import android.os.Handler;
import com.wandoujia.launcher_base.b.a;

final class d
  implements com.wandoujia.launcher.e.e
{
  d(GameLauncherActivity paramGameLauncherActivity)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    if (GameLauncherActivity.a(this.a))
      return;
    a.e().post(new e(this, paramBitmap));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.d
 * JD-Core Version:    0.6.0
 */