package com.wandoujia.net.codec;

import com.wandoujia.net.HttpException;
import com.wandoujia.net.HttpException.Type;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class ChunkDecoder
  implements b
{
  private c a;
  private StringBuilder b;
  private ChunkDecoder.State c;
  private int d;
  private int e;
  private long f;

  public ChunkDecoder(c paramc)
  {
    this.a = paramc;
    this.b = new StringBuilder();
    this.c = ChunkDecoder.State.CHUNK_LEN;
  }

  public final void a(ByteBuffer paramByteBuffer)
  {
    while (paramByteBuffer.hasRemaining())
    {
      switch (a.a[this.c.ordinal()])
      {
      default:
        break;
      case 1:
        int m = paramByteBuffer.get();
        if (m == 13)
        {
          this.c = ChunkDecoder.State.CHUNK_LEN_CR;
          continue;
        }
        this.b.append((char)m);
        break;
      case 2:
        if (paramByteBuffer.get() == 10)
        {
          this.c = ChunkDecoder.State.CHUNK;
          try
          {
            this.d = Integer.parseInt(this.b.toString(), 16);
            this.e = this.d;
            this.b = new StringBuilder();
          }
          catch (NumberFormatException localNumberFormatException)
          {
            throw new HttpException(HttpException.Type.CHUNK_ERROR, localNumberFormatException.getMessage());
          }
        }
        throw new HttpException(HttpException.Type.CHUNK_ERROR, new IOException("chunk need lf"));
      case 3:
        int i = paramByteBuffer.remaining();
        int j = Math.min(this.e, i);
        this.e -= j;
        if (this.e == 0)
          this.c = ChunkDecoder.State.CHUNK_CR;
        if (j == 0)
          continue;
        int k = paramByteBuffer.limit();
        if (i > j)
          paramByteBuffer.limit(j + paramByteBuffer.position());
        try
        {
          this.a.a(paramByteBuffer);
          if (i > j)
            paramByteBuffer.limit(k);
          this.f += j;
        }
        catch (IOException localIOException)
        {
          throw new HttpException(HttpException.Type.DOWNLOAD_IO_ERROR, localIOException);
        }
      case 4:
        if (paramByteBuffer.get() == 13)
        {
          this.c = ChunkDecoder.State.CHUNK_CRLF;
          continue;
        }
        throw new HttpException(HttpException.Type.CHUNK_ERROR, new IOException("chunk need cr"));
      case 5:
      }
      if (paramByteBuffer.get() != 10)
        break label377;
      if (this.d > 0)
      {
        this.c = ChunkDecoder.State.CHUNK_LEN;
        this.d = 0;
        continue;
      }
      this.c = ChunkDecoder.State.COMPLETE;
    }
    return;
    label377: throw new HttpException(HttpException.Type.CHUNK_ERROR, new IOException("chunk need lf"));
  }

  public final boolean a()
  {
    return this.c == ChunkDecoder.State.COMPLETE;
  }

  public final long b()
  {
    return this.f;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.codec.ChunkDecoder
 * JD-Core Version:    0.6.0
 */