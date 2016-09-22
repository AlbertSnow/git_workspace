package com.wandoujia.net.a;

import java.nio.ByteBuffer;

public final class a
{
  private final String a;
  private final String b;
  private String c = "text/plain";
  private ByteBuffer d;

  public a(String paramString)
  {
    this(paramString, "UTF-8");
  }

  private a(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  private void d()
  {
    if (this.d != null)
      return;
    byte[] arrayOfByte = this.a.getBytes(this.b);
    this.d = ByteBuffer.allocate(arrayOfByte.length);
    this.d.put(arrayOfByte);
    this.d.flip();
  }

  public final long a()
  {
    d();
    return this.d.limit();
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final String b()
  {
    return this.c;
  }

  public final ByteBuffer c()
  {
    d();
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.a.a
 * JD-Core Version:    0.6.0
 */