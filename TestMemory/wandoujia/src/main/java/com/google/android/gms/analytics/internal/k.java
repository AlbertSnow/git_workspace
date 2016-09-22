package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.d;
import android.util.Pair;
import com.google.android.gms.internal.r;
import java.util.UUID;

public final class k
{
  private final String a;
  private final long b;

  private k(j paramj, String paramString, long paramLong)
  {
    d.i(paramString);
    if (paramLong > 0L);
    for (boolean bool = true; ; bool = false)
    {
      d.b(bool);
      this.a = paramString;
      this.b = paramLong;
      return;
    }
  }

  private void b()
  {
    long l = this.c.j().a();
    SharedPreferences.Editor localEditor = j.a(this.c).edit();
    localEditor.remove(e());
    localEditor.remove(f());
    localEditor.putLong(d(), l);
    localEditor.commit();
  }

  private long c()
  {
    return j.a(this.c).getLong(d(), 0L);
  }

  private String d()
  {
    return this.a + ":start";
  }

  private String e()
  {
    return this.a + ":count";
  }

  private String f()
  {
    return this.a + ":value";
  }

  public final Pair<String, Long> a()
  {
    long l1 = c();
    long l2;
    if (l1 == 0L)
      l2 = 0L;
    while (l2 < this.b)
    {
      return null;
      l2 = Math.abs(l1 - this.c.j().a());
    }
    if (l2 > 2L * this.b)
    {
      b();
      return null;
    }
    String str = j.a(this.c).getString(f(), null);
    long l3 = j.a(this.c).getLong(e(), 0L);
    b();
    if ((str == null) || (l3 <= 0L))
      return null;
    return new Pair(str, Long.valueOf(l3));
  }

  public final void a(String paramString)
  {
    if (c() == 0L)
      b();
    if (paramString == null)
      paramString = "";
    monitorenter;
    while (true)
    {
      try
      {
        long l = j.a(this.c).getLong(e(), 0L);
        if (l > 0L)
          continue;
        SharedPreferences.Editor localEditor1 = j.a(this.c).edit();
        localEditor1.putString(f(), paramString);
        localEditor1.putLong(e(), 1L);
        localEditor1.apply();
        return;
        if ((0xFFFFFFFF & UUID.randomUUID().getLeastSignificantBits()) < 9223372036854775807L / (l + 1L))
        {
          i = 1;
          SharedPreferences.Editor localEditor2 = j.a(this.c).edit();
          if (i == 0)
            continue;
          localEditor2.putString(f(), paramString);
          localEditor2.putLong(e(), l + 1L);
          localEditor2.apply();
          return;
        }
      }
      finally
      {
        monitorexit;
      }
      int i = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.k
 * JD-Core Version:    0.6.0
 */