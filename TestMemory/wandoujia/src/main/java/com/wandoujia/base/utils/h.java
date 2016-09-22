package com.wandoujia.base.utils;

import android.content.Context;
import android.content.Intent;

final class h
  implements Runnable
{
  h(Context paramContext, String paramString, int paramInt, Intent paramIntent, ShortcutUtils.ActionListener paramActionListener)
  {
  }

  public final void run()
  {
    ShortcutUtils.access$000(this.a, this.b, this.c, this.d);
    if (this.e != null)
      this.e.onSuccess();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.h
 * JD-Core Version:    0.6.0
 */