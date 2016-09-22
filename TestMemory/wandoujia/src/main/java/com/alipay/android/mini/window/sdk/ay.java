package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.support.v4.app.b;
import android.view.ViewGroup;
import com.alipay.android.app.exception.AppErrorException;

final class ay
  implements Runnable
{
  ay(au paramau, String paramString, Activity paramActivity, ViewGroup paramViewGroup)
  {
  }

  public final void run()
  {
    try
    {
      au.a(this.a, this.a.b(this.b));
      au.b(this.a).a(this.c, this.d);
      return;
    }
    catch (AppErrorException localAppErrorException)
    {
      b.b(localAppErrorException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.ay
 * JD-Core Version:    0.6.0
 */