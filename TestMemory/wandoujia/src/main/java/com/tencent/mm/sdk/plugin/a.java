package com.tencent.mm.sdk.plugin;

import com.tencent.mm.sdk.platformtools.b;

final class a
  implements Runnable
{
  a(String paramString)
  {
  }

  public final void run()
  {
    String str = this.a;
    MMPluginOAuth.Receiver.a();
    new StringBuilder("access token: ").append(str);
    b.b("MicroMsg.SDK.MMPluginOAuth");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.plugin.a
 * JD-Core Version:    0.6.0
 */