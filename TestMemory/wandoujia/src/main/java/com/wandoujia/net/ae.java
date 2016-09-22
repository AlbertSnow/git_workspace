package com.wandoujia.net;

import java.lang.reflect.Field;

final class ae
{
  Field a;
  Field b;
  Field c;
  Field d;

  public ae(Class paramClass)
  {
    try
    {
      this.a = paramClass.getSuperclass().getDeclaredField("peerHost");
      this.a.setAccessible(true);
      this.b = paramClass.getSuperclass().getDeclaredField("peerPort");
      this.b.setAccessible(true);
      this.c = paramClass.getDeclaredField("sslParameters");
      this.c.setAccessible(true);
      this.d = this.c.getType().getDeclaredField("useSni");
      this.d.setAccessible(true);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.ae
 * JD-Core Version:    0.6.0
 */