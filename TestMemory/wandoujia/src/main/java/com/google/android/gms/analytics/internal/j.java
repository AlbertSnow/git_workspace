package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.internal.r;

public final class j extends u
{
  private SharedPreferences a;
  private long b;
  private long c = -1L;
  private final k d = new k(this, "monitoring", ((Long)az.D.a()).longValue(), 0);

  protected j(w paramw)
  {
    super(paramw);
  }

  protected final void a()
  {
    this.a = k().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
  }

  public final void a(String paramString)
  {
    w.r();
    z();
    SharedPreferences.Editor localEditor = this.a.edit();
    if (TextUtils.isEmpty(paramString))
      localEditor.remove("installation_campaign");
    while (true)
    {
      if (!localEditor.commit())
        f("Failed to commit campaign data");
      return;
      localEditor.putString("installation_campaign", paramString);
    }
  }

  public final long b()
  {
    w.r();
    z();
    long l1;
    if (this.b == 0L)
    {
      l1 = this.a.getLong("first_run", 0L);
      if (l1 == 0L)
        break label45;
    }
    label45: long l2;
    for (this.b = l1; ; this.b = l2)
    {
      return this.b;
      l2 = j().a();
      SharedPreferences.Editor localEditor = this.a.edit();
      localEditor.putLong("first_run", l2);
      if (localEditor.commit())
        continue;
      f("Failed to commit first run time");
    }
  }

  public final l c()
  {
    return new l(j(), b());
  }

  public final long d()
  {
    w.r();
    z();
    if (this.c == -1L)
      this.c = this.a.getLong("last_dispatch", 0L);
    return this.c;
  }

  public final void e()
  {
    w.r();
    z();
    long l = j().a();
    SharedPreferences.Editor localEditor = this.a.edit();
    localEditor.putLong("last_dispatch", l);
    localEditor.apply();
    this.c = l;
  }

  public final String f()
  {
    w.r();
    z();
    String str = this.a.getString("installation_campaign", null);
    if (TextUtils.isEmpty(str))
      return null;
    return str;
  }

  public final k g()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.j
 * JD-Core Version:    0.6.0
 */