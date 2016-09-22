package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.sina.weibo.sdk.a.f;
import com.sina.weibo.sdk.auth.c;

public final class m extends d
{
  private c d;
  private String e;
  private n f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private String n;
  private String o;

  public m(Context paramContext)
  {
    super(paramContext);
    this.c = BrowserLauncher.WIDGET;
  }

  public final void a()
  {
    this.l = null;
  }

  public final void a(Activity paramActivity)
  {
    WeiboSdkBrowser.a(paramActivity, this.e, this.g);
  }

  protected final void a(Bundle paramBundle)
  {
    this.j = paramBundle.getString("source");
    this.h = paramBundle.getString("packagename");
    this.k = paramBundle.getString("key_hash");
    this.i = paramBundle.getString("access_token");
    this.l = paramBundle.getString("fuid");
    this.n = paramBundle.getString("q");
    this.m = paramBundle.getString("content");
    this.o = paramBundle.getString("category");
    this.e = paramBundle.getString("key_listener");
    if (!TextUtils.isEmpty(this.e))
      this.d = h.a().a(this.e);
    this.g = paramBundle.getString("key_widget_callback");
    if (!TextUtils.isEmpty(this.g))
      this.f = h.a().c(this.g);
    Uri.Builder localBuilder = Uri.parse(this.b).buildUpon();
    localBuilder.appendQueryParameter("version", "0030105000");
    if (!TextUtils.isEmpty(this.j))
      localBuilder.appendQueryParameter("source", this.j);
    if (!TextUtils.isEmpty(this.i))
      localBuilder.appendQueryParameter("access_token", this.i);
    String str = b.d(this.a, this.j);
    if (!TextUtils.isEmpty(str))
      localBuilder.appendQueryParameter("aid", str);
    if (!TextUtils.isEmpty(this.h))
      localBuilder.appendQueryParameter("packagename", this.h);
    if (!TextUtils.isEmpty(this.k))
      localBuilder.appendQueryParameter("key_hash", this.k);
    if (!TextUtils.isEmpty(this.l))
      localBuilder.appendQueryParameter("fuid", this.l);
    if (!TextUtils.isEmpty(this.n))
      localBuilder.appendQueryParameter("q", this.n);
    if (!TextUtils.isEmpty(this.m))
      localBuilder.appendQueryParameter("content", this.m);
    if (!TextUtils.isEmpty(this.o))
      localBuilder.appendQueryParameter("category", this.o);
    this.b = localBuilder.build().toString();
  }

  public final void a(n paramn)
  {
    this.f = paramn;
  }

  public final void b()
  {
    this.m = null;
  }

  public final void b(Bundle paramBundle)
  {
    this.h = this.a.getPackageName();
    if (!TextUtils.isEmpty(this.h))
      this.k = f.a(b.c(this.a, this.h));
    paramBundle.putString("access_token", this.i);
    paramBundle.putString("source", this.j);
    paramBundle.putString("packagename", this.h);
    paramBundle.putString("key_hash", this.k);
    paramBundle.putString("fuid", this.l);
    paramBundle.putString("q", this.n);
    paramBundle.putString("content", this.m);
    paramBundle.putString("category", this.o);
    h localh = h.a();
    if (this.d != null)
    {
      this.e = String.valueOf(System.currentTimeMillis());
      localh.a(this.e, this.d);
      paramBundle.putString("key_listener", this.e);
    }
    if (this.f != null)
    {
      this.g = String.valueOf(System.currentTimeMillis());
      localh.a(this.g, this.f);
      paramBundle.putString("key_widget_callback", this.g);
    }
  }

  public final void c()
  {
    this.n = null;
  }

  public final void c(String paramString)
  {
    this.o = paramString;
  }

  public final void h()
  {
    this.i = null;
  }

  public final void i()
  {
    this.j = null;
  }

  public final c j()
  {
    return this.d;
  }

  public final String k()
  {
    return this.e;
  }

  public final void l()
  {
    this.d = null;
  }

  public final n m()
  {
    return this.f;
  }

  public final String n()
  {
    return this.g;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.m
 * JD-Core Version:    0.6.0
 */