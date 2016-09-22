package com.wandoujia.push2;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class PushReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((!g.a().d()) || (paramIntent == null))
      label13: return;
    String str;
    label26: label56: int i;
    if (paramIntent.getAction() != null)
    {
      str = paramIntent.getAction();
      switch (str.hashCode())
      {
      default:
        i = -1;
      case 1884426810:
      case -1172645946:
      }
    }
    while (true)
      switch (i)
      {
      default:
        return;
      case 0:
        Bundle localBundle = getResultExtras(true);
        if (g.a().e())
          localBundle.putBoolean("push_center", true);
        long l1 = localBundle.getLong("last_push_id", 0L);
        long l2 = LogHelper.a(paramContext);
        if (l1 >= l2)
          break label13;
        localBundle.putLong("last_push_id", l2);
        return;
        str = "";
        break label26;
        if (!str.equals("com.wandoujia.push2.ARE_YOU_PUSH_CENTER"))
          break label56;
        i = 0;
        continue;
        if (!str.equals("android.net.conn.CONNECTIVITY_CHANGE"))
          break label56;
        i = 1;
      case 1:
      }
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramContext, PushService.class));
    paramContext.startService(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.PushReceiver
 * JD-Core Version:    0.6.0
 */