package com.wandoujia.net;

import java.io.IOException;
import java.nio.ByteBuffer;

final class m
  implements p
{
  m(k paramk)
  {
  }

  public final void a()
  {
    k.a(this.a);
  }

  public final void a(HttpException paramHttpException)
  {
    k.b(this.a).a(paramHttpException);
  }

  public final void a(ByteBuffer paramByteBuffer)
  {
    if (k.c(this.a))
    {
      k.a(this.a, paramByteBuffer);
      return;
    }
    try
    {
      k.b(this.a, paramByteBuffer);
      k.e(this.a);
      return;
    }
    catch (IOException localIOException)
    {
      k.b(this.a).a(new HttpException(HttpException.Type.HTTPS_ERROR, localIOException));
    }
  }

  public final void b()
  {
    k.b(this.a).b();
  }

  public final void c()
  {
    if (k.c(this.a))
    {
      if (k.d(this.a).hasRemaining())
      {
        this.a.a(k.d(this.a));
        return;
      }
      k.b(this.a).c();
      return;
    }
    try
    {
      k.e(this.a);
      return;
    }
    catch (IOException localIOException)
    {
      k.b(this.a).a(new HttpException(HttpException.Type.HTTPS_ERROR, localIOException));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.m
 * JD-Core Version:    0.6.0
 */