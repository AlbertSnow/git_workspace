package com.tencent.mm.sdk.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

public class MMPluginOAuth$Receiver extends BroadcastReceiver
{
  private static final Map<String, android.support.v4.app.b> a = new HashMap();

  public MMPluginOAuth$Receiver()
  {
    this(0);
  }

  private MMPluginOAuth$Receiver(byte paramByte)
  {
  }

  public static void a()
  {
    a.remove(null);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.b.c("MicroMsg.SDK.MMPluginOAuth");
    String str1 = paramIntent.getStringExtra("com.tencent.mm.sdk.plugin.Intent.REQUEST_TOKEN");
    String str2 = paramIntent.getStringExtra("com.tencent.mm.sdk.plugin.Intent.ACCESS_TOKEN");
    if ((android.support.v4.app.b)a.get(str1) == null)
    {
      new StringBuilder("oauth unregistered, request token = ").append(str1);
      com.tencent.mm.sdk.platformtools.b.a("MicroMsg.SDK.MMPluginOAuth");
      return;
    }
    a();
    new Handler().post(new a(str2));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.plugin.MMPluginOAuth.Receiver
 * JD-Core Version:    0.6.0
 */