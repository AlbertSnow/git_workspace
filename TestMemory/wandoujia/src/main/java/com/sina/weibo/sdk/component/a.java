package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.c;

public final class a extends d
{
  private com.sina.weibo.sdk.auth.a d;
  private c e;
  private String f;

  public a(Context paramContext)
  {
    super(paramContext);
    this.c = BrowserLauncher.AUTH;
  }

  public final com.sina.weibo.sdk.auth.a a()
  {
    return this.d;
  }

  public final void a(Activity paramActivity)
  {
    if (this.e != null)
      this.e.a();
    WeiboSdkBrowser.a(paramActivity, this.f, null);
  }

  protected final void a(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle.getBundle("key_authinfo");
    if (localBundle != null)
      this.d = new com.sina.weibo.sdk.auth.a(this.a, localBundle.getString("appKey"), localBundle.getString("redirectUri"), localBundle.getString("scope"));
    this.f = paramBundle.getString("key_listener");
    if (!TextUtils.isEmpty(this.f))
      this.e = h.a().a(this.f);
  }

  public final void a(com.sina.weibo.sdk.auth.a parama)
  {
    this.d = parama;
  }

  public final void a(c paramc)
  {
    this.e = paramc;
  }

  public final c b()
  {
    return this.e;
  }

  public final void b(Bundle paramBundle)
  {
    if (this.d != null)
      paramBundle.putBundle("key_authinfo", this.d.f());
    if (this.e != null)
    {
      h localh = h.a();
      this.f = String.valueOf(System.currentTimeMillis());
      localh.a(this.f, this.e);
      paramBundle.putString("key_listener", this.f);
    }
  }

  public final String c()
  {
    return this.f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.a
 * JD-Core Version:    0.6.0
 */