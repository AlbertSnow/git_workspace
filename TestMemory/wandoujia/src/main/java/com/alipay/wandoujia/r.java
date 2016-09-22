package com.alipay.wandoujia;

import android.support.v4.app.b;
import com.alipay.android.app.d;
import com.wandoujia.image.c.a;

public final class r
{
  private String a;
  private String b;
  private String c;
  private String d;

  public final String a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    boolean bool = a.a().c().l();
    b.d();
    if (bool)
    {
      int i = paramString.indexOf(".");
      if (i > 0)
      {
        String str = paramString.substring(0, i);
        if (!str.endsWith("pre"))
          paramString = str + "pre" + paramString.substring(i);
      }
    }
    this.a = paramString;
  }

  public final String b()
  {
    return this.b;
  }

  public final void b(String paramString)
  {
    this.b = paramString;
  }

  public final String c()
  {
    return this.c;
  }

  public final void c(String paramString)
  {
    this.c = paramString;
  }

  public final String d()
  {
    return this.d;
  }

  public final void d(String paramString)
  {
    this.d = paramString;
  }

  public final String toString()
  {
    return "requestUrl = " + this.a + ", namespace = " + this.b + ", apiName = " + this.c + ", apiVersion = " + this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.r
 * JD-Core Version:    0.6.0
 */