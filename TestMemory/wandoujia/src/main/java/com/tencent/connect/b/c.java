package com.tencent.connect.b;

public final class c
{
  private String a;
  private String b;
  private String c;
  private long d = -1L;

  public c(String paramString)
  {
    this.a = paramString;
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final void a(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.d = 0L;
    if (paramString2 != null)
      this.d = (System.currentTimeMillis() + 1000L * Long.parseLong(paramString2));
  }

  public final boolean a()
  {
    return (this.b != null) && (System.currentTimeMillis() < this.d);
  }

  public final String b()
  {
    return this.a;
  }

  public final String c()
  {
    return this.b;
  }

  public final String d()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.b.c
 * JD-Core Version:    0.6.0
 */