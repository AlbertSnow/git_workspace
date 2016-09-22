package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public abstract class d
{
  protected Context a;
  protected String b;
  protected BrowserLauncher c;
  private String d;

  public d(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }

  public abstract void a(Activity paramActivity);

  protected abstract void a(Bundle paramBundle);

  public final void a(String paramString)
  {
    this.b = paramString;
  }

  protected abstract void b(Bundle paramBundle);

  public final void b(String paramString)
  {
    this.d = paramString;
  }

  public final void c(Bundle paramBundle)
  {
    this.b = paramBundle.getString("key_url");
    this.c = ((BrowserLauncher)paramBundle.getSerializable("key_launcher"));
    this.d = paramBundle.getString("key_specify_title");
    a(paramBundle);
  }

  public final Bundle d()
  {
    Bundle localBundle = new Bundle();
    if (!TextUtils.isEmpty(this.b))
      localBundle.putString("key_url", this.b);
    if (this.c != null)
      localBundle.putSerializable("key_launcher", this.c);
    if (!TextUtils.isEmpty(this.d))
      localBundle.putString("key_specify_title", this.d);
    b(localBundle);
    return localBundle;
  }

  public final String e()
  {
    return this.b;
  }

  public final BrowserLauncher f()
  {
    return this.c;
  }

  public final String g()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.d
 * JD-Core Version:    0.6.0
 */