package com.tencent.open.yyb;

import com.tencent.connect.b.c;
import com.tencent.open.a.f;
import com.tencent.tauth.d;

final class b
  implements com.tencent.tauth.b
{
  b(AppbarActivity paramAppbarActivity, c paramc)
  {
  }

  public final void a(d paramd)
  {
    f.b("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)shareToQQ onError" + paramd.b);
    AppbarActivity.b(this.b).b(1);
  }

  public final void a(Object paramObject)
  {
    f.b("openSDK_LOG.AppbarActivity", "-->(AppbarActivity)shareToQQ onComplete");
    AppbarActivity.b(this.b).a(1);
    a.a(this.a.b(), "400", "SDK.APPBAR.HOME.SHARE.QQ");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.yyb.b
 * JD-Core Version:    0.6.0
 */