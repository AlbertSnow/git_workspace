package com.wandoujia.base.utils;

import android.content.Context;
import android.content.Intent;

final class i
  implements Runnable
{
  i(Context paramContext, String paramString, Intent paramIntent, ShortcutUtils.ActionListener paramActionListener)
  {
  }

  public final void run()
  {
    ShortcutUtils.access$100(this.a, this.b, this.c);
    if (this.d != null)
      this.d.onSuccess();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.i
 * JD-Core Version:    0.6.0
 */