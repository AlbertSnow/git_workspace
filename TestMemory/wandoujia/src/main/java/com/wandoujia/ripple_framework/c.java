package com.wandoujia.ripple_framework;

import android.content.SharedPreferences.Editor;
import com.wandoujia.base.utils.SharePrefSubmitor;
import java.util.Map;

final class c
  implements Runnable
{
  c(AppMd5Manager paramAppMd5Manager, String paramString, f paramf)
  {
  }

  public final void run()
  {
    AppMd5Manager.a(this.c);
    synchronized (AppMd5Manager.b(this.c))
    {
      AppMd5Manager.b(this.c).put(this.a, this.b);
      AppMd5Manager.c(this.c).putString(this.a, this.b.toString());
      SharePrefSubmitor.submit(AppMd5Manager.c(this.c));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c
 * JD-Core Version:    0.6.0
 */