package com.wandoujia.net;

import android.os.SystemClock;
import com.wandoujia.net.codec.d;
import java.nio.ByteBuffer;

final class u
  implements p
{
  u(HttpTransaction paramHttpTransaction)
  {
  }

  public final void a()
  {
    HttpTransaction.a(this.a, SystemClock.uptimeMillis());
    this.a.c.a(3, new Object[] { this });
    HttpTransaction.a(this.a);
  }

  public final void a(HttpException paramHttpException)
  {
    this.a.a(paramHttpException);
  }

  public final void a(ByteBuffer paramByteBuffer)
  {
    HttpTransaction.a(this.a, SystemClock.uptimeMillis());
    paramByteBuffer.flip();
    HttpTransaction.a(this.a, paramByteBuffer);
    paramByteBuffer.compact();
  }

  public final void b()
  {
    if ((this.a.f != null) && ((this.a.f instanceof d)))
    {
      HttpTransaction.a(this.a, ByteBuffer.allocate(0));
      return;
    }
    a(new HttpException(HttpException.Type.SOCKET_IO_ERROR, "socket disconnect"));
  }

  public final void c()
  {
    HttpTransaction.a(this.a, SystemClock.uptimeMillis());
    HttpTransaction.b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.u
 * JD-Core Version:    0.6.0
 */