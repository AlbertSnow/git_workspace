package com.tencent.mm.sdk.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.f;
import com.tencent.mm.sdk.platformtools.b;
import java.util.HashMap;
import java.util.Map;

public final class MMessage$Receiver extends BroadcastReceiver
{
  private static Map<String, f> a = new HashMap();

  public MMessage$Receiver()
  {
    this(0);
  }

  private MMessage$Receiver(byte paramByte)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    new StringBuilder("receive intent=").append(paramIntent);
    b.c("MicroMsg.SDK.MMessage");
    if ((f)a.get(paramIntent.getAction()) != null)
      b.c("MicroMsg.SDK.MMessage");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.channel.MMessage.Receiver
 * JD-Core Version:    0.6.0
 */