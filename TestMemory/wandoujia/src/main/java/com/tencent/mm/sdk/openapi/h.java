package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public final class h extends a
{
  public WXMediaMessage b;
  public int c;

  public final int a()
  {
    return 2;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    paramBundle.putAll(android.support.v4.app.b.a(this.b));
    paramBundle.putInt("_wxapi_sendmessagetowx_req_scene", this.c);
  }

  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    this.b = android.support.v4.app.b.a(paramBundle);
    this.c = paramBundle.getInt("_wxapi_sendmessagetowx_req_scene");
  }

  final boolean b()
  {
    if (this.b == null)
    {
      com.tencent.mm.sdk.platformtools.b.a("MicroMsg.SDK.SendMessageToWX.Req");
      return false;
    }
    return this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.h
 * JD-Core Version:    0.6.0
 */