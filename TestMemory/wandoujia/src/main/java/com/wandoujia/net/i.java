package com.wandoujia.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

public final class i
  implements o
{
  protected final p a;
  private SocketChannel b;
  private SelectionKey c;
  private ByteBuffer d;
  private ByteBuffer e;
  private boolean f;

  public i(p paramp)
  {
    this.a = paramp;
    this.d = ByteBuffer.allocate(65536);
  }

  public final void a()
  {
    this.f = false;
    if (this.c == null)
      return;
    this.c.cancel();
    try
    {
      this.b.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final void a(InetSocketAddress paramInetSocketAddress)
  {
    try
    {
      this.b = SocketChannel.open();
      this.b.configureBlocking(false);
      this.c = this.b.register(ac.a().b(), 8);
      this.c.attach(this);
      this.b.connect(paramInetSocketAddress);
      return;
    }
    catch (IOException localIOException)
    {
      this.a.a(new HttpException(HttpException.Type.CONNECT_ERROR, localIOException));
    }
  }

  public final void a(ByteBuffer paramByteBuffer)
  {
    this.e = paramByteBuffer;
    d();
  }

  public final boolean b()
  {
    return (this.b != null) && (this.b.isConnected());
  }

  final void c()
  {
    if (!this.f)
    {
      this.a.a(new HttpException(HttpException.Type.SOCKET_IO_ERROR, "NOT READY TO READ"));
      return;
    }
    try
    {
      int i = this.b.read(this.d);
      if (i < 0)
      {
        a();
        this.a.b();
        return;
      }
    }
    catch (IOException localIOException)
    {
      this.a.a(new HttpException(HttpException.Type.SOCKET_IO_ERROR, localIOException));
      return;
    }
    this.a.a(this.d);
  }

  final void d()
  {
    if (!this.f)
    {
      this.a.a(new HttpException(HttpException.Type.SOCKET_IO_ERROR, "NOT READY TO WRITE"));
      return;
    }
    try
    {
      this.b.write(this.e);
      if (this.e.hasRemaining())
      {
        this.c.interestOps(0x4 | this.c.interestOps());
        return;
      }
    }
    catch (IOException localIOException)
    {
      this.a.a(new HttpException(HttpException.Type.SOCKET_IO_ERROR, localIOException));
      return;
      this.c.interestOps(0xFFFFFFFB & this.c.interestOps());
      ac.a().a(new j(this));
      return;
    }
    catch (CancelledKeyException localCancelledKeyException)
    {
      this.a.a(new HttpException(HttpException.Type.SOCKET_IO_ERROR, localCancelledKeyException));
    }
  }

  final void e()
  {
    try
    {
      this.b.finishConnect();
      this.c.interestOps(1);
      this.f = true;
      this.a.a();
      return;
    }
    catch (Exception localException)
    {
      this.a.a(new HttpException(HttpException.Type.CONNECT_ERROR, localException));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.i
 * JD-Core Version:    0.6.0
 */