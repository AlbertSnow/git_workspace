package com.wandoujia.account.b;

import android.os.Bundle;
import android.os.Handler;
import com.sina.weibo.sdk.auth.b;
import com.sina.weibo.sdk.auth.c;
import com.sina.weibo.sdk.exception.WeiboException;
import com.wandoujia.account.dto.DeviceBean;

final class j
  implements c
{
  private String b;
  private DeviceBean c;

  public j(a parama, String paramString, DeviceBean paramDeviceBean)
  {
    this.b = paramString;
    this.c = paramDeviceBean;
  }

  public final void a()
  {
    a.g(this.a).post(new k(this));
  }

  public final void a(Bundle paramBundle)
  {
    a.b(this.a, paramBundle.getString("access_token"));
    a.c(this.a, paramBundle.getString("expires_in"));
    a.a(this.a, new b(a.h(this.a), a.i(this.a)));
    if (a.j(this.a).a())
    {
      new l(this).start();
      a.g(this.a).post(new p(this));
      return;
    }
    a.g(this.a).post(new q(this));
  }

  public final void a(WeiboException paramWeiboException)
  {
    a.g(this.a).post(new r(this, paramWeiboException));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.j
 * JD-Core Version:    0.6.0
 */