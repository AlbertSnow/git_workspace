package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public final class g extends b
{
  public String c;
  public String d;

  public g()
  {
  }

  public g(Bundle paramBundle)
  {
    a(paramBundle);
  }

  public final int a()
  {
    return 1;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    paramBundle.getString("_wxapi_sendauth_resp_userName");
    this.c = paramBundle.getString("_wxapi_sendauth_resp_token");
    paramBundle.getInt("_wxapi_sendauth_resp_expireDate", 0);
    this.d = paramBundle.getString("_wxapi_sendauth_resp_state");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.g
 * JD-Core Version:    0.6.0
 */