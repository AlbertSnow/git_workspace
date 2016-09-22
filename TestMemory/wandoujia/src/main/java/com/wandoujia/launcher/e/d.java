package com.wandoujia.launcher.e;

import android.graphics.Bitmap;
import android.support.v4.app.b;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.game_launcher.lib.R.drawable;

final class d
  implements Runnable
{
  d(e parame)
  {
  }

  public final void run()
  {
    Bitmap localBitmap = b.a(GlobalConfig.getAppContext(), a.d(), R.drawable.ic_gl_no_games, R.drawable.launcher_icon_base);
    this.a.a(localBitmap);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.e.d
 * JD-Core Version:    0.6.0
 */