package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.b;

public final class a
{
  private String a = "";
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";

  public a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramContext.getPackageName();
    this.e = b.c(paramContext, this.d);
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final String c()
  {
    return this.c;
  }

  public final String d()
  {
    return this.d;
  }

  public final String e()
  {
    return this.e;
  }

  public final Bundle f()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("appKey", this.a);
    localBundle.putString("redirectUri", this.b);
    localBundle.putString("scope", this.c);
    localBundle.putString("packagename", this.d);
    localBundle.putString("key_hash", this.e);
    return localBundle;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.auth.a
 * JD-Core Version:    0.6.0
 */