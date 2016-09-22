package com.alipay.android.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.alipay.android.app.pay.c;
import com.alipay.wandoujia.i;

public class SmsSendReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((!TextUtils.equals("com.alipay.receiver.sms.sent", paramIntent.getAction())) && (!TextUtils.equals("com.alipay.receiver.sms.successed", paramIntent.getAction())))
      return;
    long l = System.currentTimeMillis() - paramIntent.getLongExtra("time_start", 0L);
    String str;
    if (TextUtils.equals("com.alipay.receiver.sms.sent", paramIntent.getAction()))
      str = "send sms delayed " + l;
    while (true)
    {
      if (c.d)
        b.a(paramContext, str);
      i.a().b(l, str);
      return;
      boolean bool = TextUtils.equals("com.alipay.receiver.sms.successed", paramIntent.getAction());
      str = null;
      if (!bool)
        continue;
      str = " receive sms delayed " + l;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.SmsSendReceiver
 * JD-Core Version:    0.6.0
 */