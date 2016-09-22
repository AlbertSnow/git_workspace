package com.sina.weibo.sdk.auth.sso;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.c;
import com.sina.weibo.sdk.component.WeiboSdkBrowser;
import com.sina.weibo.sdk.net.g;

class b
{
  private Context a;
  private com.sina.weibo.sdk.auth.a b;

  static
  {
    b.class.getName();
  }

  public b(Context paramContext, com.sina.weibo.sdk.auth.a parama)
  {
    this.a = paramContext;
    this.b = parama;
  }

  public final com.sina.weibo.sdk.auth.a a()
  {
    return this.b;
  }

  public final void a(c paramc)
  {
    String str2;
    if (paramc != null)
    {
      g localg = new g(this.b.a());
      localg.a("client_id", this.b.a());
      localg.a("redirect_uri", this.b.b());
      localg.a("scope", this.b.c());
      localg.a("response_type", "code");
      localg.a("version", "0030105000");
      String str1 = android.support.v4.app.b.d(this.a, this.b.a());
      if (!TextUtils.isEmpty(str1))
        localg.a("aid", str1);
      localg.a("packagename", this.b.d());
      localg.a("key_hash", this.b.e());
      str2 = "https://open.weibo.cn/oauth2/authorize?" + localg.c();
      if (android.support.v4.app.b.e(this.a))
        break label189;
      android.support.v4.app.b.c(this.a, "Error", "Application requires permission to access the Internet");
    }
    while (true)
    {
      com.sina.weibo.sdk.b.a(this.a, this.b.a()).a();
      return;
      label189: com.sina.weibo.sdk.component.a locala = new com.sina.weibo.sdk.component.a(this.a);
      locala.a(this.b);
      locala.a(paramc);
      locala.a(str2);
      locala.b("微博登录");
      Bundle localBundle = locala.d();
      Intent localIntent = new Intent(this.a, WeiboSdkBrowser.class);
      localIntent.putExtras(localBundle);
      this.a.startActivity(localIntent);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.auth.sso.b
 * JD-Core Version:    0.6.0
 */