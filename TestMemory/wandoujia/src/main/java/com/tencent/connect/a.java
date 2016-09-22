package com.tencent.connect;

import android.os.Bundle;

public final class a extends com.tencent.connect.common.b
{
  public a(com.tencent.connect.b.c paramc)
  {
    super(paramc, 0);
  }

  public final void a(com.tencent.tauth.b paramb)
  {
    Bundle localBundle = a();
    com.tencent.connect.common.c localc = new com.tencent.connect.common.c(paramb);
    com.tencent.open.utils.a.a(this.a, android.support.v4.app.b.t(), "user/get_simple_userinfo", localBundle, "GET", localc);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.a
 * JD-Core Version:    0.6.0
 */