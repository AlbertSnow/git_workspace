package com.wandoujia.jupiter.util;

import android.widget.Toast;
import com.wandoujia.base.config.GlobalConfig;

final class r
  implements Runnable
{
  r(String paramString)
  {
  }

  public final void run()
  {
    Toast.makeText(GlobalConfig.getAppContext(), this.a, 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.r
 * JD-Core Version:    0.6.0
 */