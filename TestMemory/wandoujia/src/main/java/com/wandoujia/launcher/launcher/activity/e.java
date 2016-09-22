package com.wandoujia.launcher.launcher.activity;

import android.graphics.Bitmap;
import com.wandoujia.launcher.p;
import de.greenrobot.event.c;

final class e
  implements Runnable
{
  e(d paramd, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    GameLauncherActivity.a(this.b.a, this.a);
    c.a().d(new p("hide_bottom_label"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.e
 * JD-Core Version:    0.6.0
 */