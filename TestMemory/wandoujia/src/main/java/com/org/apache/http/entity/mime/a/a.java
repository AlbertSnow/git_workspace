package com.org.apache.http.entity.mime.a;

import java.io.OutputStream;

public abstract class a
{
  private final String a;

  public a(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("MIME type may not be null");
    this.a = paramString;
    int i = paramString.indexOf('/');
    if (i != -1)
    {
      paramString.substring(0, i);
      paramString.substring(i + 1);
    }
  }

  public final String a()
  {
    return this.a;
  }

  public abstract void a(OutputStream paramOutputStream);

  public abstract String b();

  public abstract String c();

  public abstract long d();

  public abstract String e();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.org.apache.http.entity.mime.a.a
 * JD-Core Version:    0.6.0
 */