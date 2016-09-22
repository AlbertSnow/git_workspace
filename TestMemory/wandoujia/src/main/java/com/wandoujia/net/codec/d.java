package com.wandoujia.net.codec;

import com.wandoujia.net.HttpException;
import com.wandoujia.net.HttpException.Type;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class d
  implements b
{
  private long a;
  private boolean b;

  public final void a(ByteBuffer paramByteBuffer)
  {
    try
    {
      if (!paramByteBuffer.hasRemaining())
      {
        this.b = true;
        return;
      }
      null.a(paramByteBuffer);
      this.a += paramByteBuffer.remaining();
      return;
    }
    catch (IOException localIOException)
    {
    }
    throw new HttpException(HttpException.Type.DOWNLOAD_IO_ERROR, localIOException);
  }

  public final boolean a()
  {
    return this.b;
  }

  public final long b()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.codec.d
 * JD-Core Version:    0.6.0
 */