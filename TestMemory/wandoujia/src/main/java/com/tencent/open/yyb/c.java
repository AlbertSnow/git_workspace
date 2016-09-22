package com.tencent.open.yyb;

import com.tencent.open.a.f;
import com.tencent.tauth.b;
import com.tencent.tauth.d;

final class c
  implements b
{
  c(AppbarActivity paramAppbarActivity, com.tencent.connect.b.c paramc)
  {
  }

  public final void a(d paramd)
  {
    f.b("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)shareToQzone onError" + paramd.b);
    AppbarActivity.b(this.b).b(2);
  }

  public final void a(Object paramObject)
  {
    f.b("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)shareToQzone onComplete");
    AppbarActivity.b(this.b).a(2);
    a.a(this.a.b(), "400", "SDK.APPBAR.HOME.SHARE.QZ");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.c
 * JD-Core Version:    0.6.0
 */