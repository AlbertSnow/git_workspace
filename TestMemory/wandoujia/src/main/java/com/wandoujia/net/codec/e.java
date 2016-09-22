package com.wandoujia.net.codec;

import com.wandoujia.net.HttpException;
import com.wandoujia.net.HttpException.Type;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class e
  implements b
{
  private long a;
  private long b;
  private c c;

  public e(c paramc, long paramLong1, long paramLong2)
  {
    this.c = paramc;
    this.b = paramLong1;
    this.a = paramLong2;
  }

  public final void a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.remaining();
    int j = (int)Math.min(this.a - this.b, i);
    if (i > j)
      paramByteBuffer.limit(j + paramByteBuffer.position());
    try
    {
      this.c.a(paramByteBuffer);
      this.b += j;
      return;
    }
    catch (IOException localIOException)
    {
    }
    throw new HttpException(HttpException.Type.DOWNLOAD_IO_ERROR, localIOException);
  }

  public final boolean a()
  {
    return this.b == this.a;
  }

  public final long b()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.codec.e
 * JD-Core Version:    0.6.0
 */