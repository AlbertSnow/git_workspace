package com.wandoujia.account.f;

import android.support.v4.app.b;
import com.tencent.mm.sdk.openapi.d;
import com.tencent.mm.sdk.openapi.k;

public final class a
{
  private static String a = "1483181040";
  private String b;
  private String c;
  private d d;

  public a()
  {
    this(a, "wxed6dfca0ae67f7a3");
  }

  private a(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
    try
    {
      this.d = k.a(b.A(), paramString2, true);
      this.d.a(paramString2);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final String a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  public final d c()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.f.a
 * JD-Core Version:    0.6.0
 */