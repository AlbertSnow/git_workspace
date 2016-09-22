package com.tencent.mm.sdk.openapi;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.b;

public final class f extends a
{
  public String b;
  public String c;

  public final int a()
  {
    return 1;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    paramBundle.putString("_wxapi_sendauth_req_scope", this.b);
    paramBundle.putString("_wxapi_sendauth_req_state", this.c);
  }

  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    this.b = paramBundle.getString("_wxapi_sendauth_req_scope");
    this.c = paramBundle.getString("_wxapi_sendauth_req_state");
  }

  final boolean b()
  {
    if ((this.b == null) || (this.b.length() == 0) || (this.b.length() > 1024))
    {
      b.a("MicroMsg.SDK.SendAuth.Req");
      return false;
    }
    if ((this.c != null) && (this.c.length() > 1024))
    {
      b.a("MicroMsg.SDK.SendAuth.Req");
      return false;
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.f
 * JD-Core Version:    0.6.0
 */