package com.sina.weibo.sdk.component;

import android.text.TextUtils;
import com.sina.weibo.sdk.exception.WeiboException;

final class i
  implements com.sina.weibo.sdk.net.f
{
  i(WeiboSdkBrowser paramWeiboSdkBrowser, e parame)
  {
  }

  public final void a(WeiboException paramWeiboException)
  {
    WeiboSdkBrowser.c();
    new StringBuilder("post onWeiboException ").append(paramWeiboException.getMessage());
    e.a(this.a, paramWeiboException.getMessage());
    this.a.finish();
  }

  public final void a(String paramString)
  {
    WeiboSdkBrowser.c();
    f localf = f.a(paramString);
    if ((localf != null) && (localf.a() == 1) && (!TextUtils.isEmpty(localf.b())))
    {
      WeiboSdkBrowser.b(this.a, this.b.c(localf.b()));
      return;
    }
    e.a(this.a, "upload pic faild");
    this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.i
 * JD-Core Version:    0.6.0
 */