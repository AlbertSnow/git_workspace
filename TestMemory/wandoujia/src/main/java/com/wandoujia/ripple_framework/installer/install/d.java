package com.wandoujia.ripple_framework.installer.install;

import android.os.Handler;
import android.support.v4.app.b;
import android.text.TextUtils;

final class d
  implements Runnable
{
  d(InstallManager paramInstallManager, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    String str = b.i(this.b, this.a);
    if (!TextUtils.isEmpty(str))
    {
      InstallManager.a(this.c, this.a);
      InstallManager.a(this.c, str, this.a);
      return;
    }
    InstallManager.b().post(new e(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.d
 * JD-Core Version:    0.6.0
 */