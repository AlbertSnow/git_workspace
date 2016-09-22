package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.b;

final class e
  implements IAlixPayCallback
{
  e(PayTask paramPayTask)
  {
  }

  public final IBinder asBinder()
  {
    return null;
  }

  public final void startActivity(String paramString1, String paramString2, int paramInt, Bundle paramBundle)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN", null);
    if (paramBundle == null)
      paramBundle = new Bundle();
    try
    {
      paramBundle.putInt("CallingPid", paramInt);
      localIntent.putExtras(paramBundle);
      localIntent.setClassName(paramString1, paramString2);
      if (PayTask.a(this.a) != null)
        PayTask.a(this.a).startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        b.b(localException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.e
 * JD-Core Version:    0.6.0
 */