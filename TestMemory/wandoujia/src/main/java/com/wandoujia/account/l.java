package com.wandoujia.account;

import android.content.res.Resources.NotFoundException;
import android.support.v4.app.b;
import android.widget.Toast;

final class l
  implements Runnable
{
  l(j paramj)
  {
  }

  public final void run()
  {
    try
    {
      Toast.makeText(j.a(this.a), b.l(R.string.account_sdk_no_network), 0).show();
      return;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.l
 * JD-Core Version:    0.6.0
 */