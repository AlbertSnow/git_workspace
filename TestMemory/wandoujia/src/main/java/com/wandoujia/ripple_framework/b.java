package com.wandoujia.ripple_framework;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.wandoujia.base.utils.SharePrefSubmitor;
import java.util.Map;

final class b
  implements Runnable
{
  b(AppMd5Manager paramAppMd5Manager, String paramString)
  {
  }

  public final void run()
  {
    AppMd5Manager.a(this.b);
    if (!TextUtils.isEmpty(this.a));
    synchronized (AppMd5Manager.b(this.b))
    {
      AppMd5Manager.b(this.b).remove(this.a);
      AppMd5Manager.c(this.b).remove(this.a);
      SharePrefSubmitor.submit(AppMd5Manager.c(this.b));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.b
 * JD-Core Version:    0.6.0
 */